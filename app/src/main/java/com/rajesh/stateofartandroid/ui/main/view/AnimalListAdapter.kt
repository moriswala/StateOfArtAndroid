package com. rajesh.stateofartandroid.ui.main.view

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.rajesh.stateofartandroid.data.model.Animal
import com.rajesh.stateofartandroid.databinding.ItemAnimalBinding


class AnimalListAdapter(private val animalList: ArrayList<Animal>) :
    RecyclerView.Adapter<AnimalListAdapter.AnimalViewHolder>() ,View.OnClickListener{

    class AnimalViewHolder : ViewHolder {

        internal var binding: ItemAnimalBinding

        constructor(itemAnimalBinding: ItemAnimalBinding) : super(itemAnimalBinding.root) {
            this.binding = itemAnimalBinding;
        }

        fun bind(animal: Animal?) {
            binding.animalListItem = animal
        }

    }

    fun updateAnimalList(newAnimalList: List<Animal>) {
        animalList.clear()
        animalList.addAll(newAnimalList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val animalItemBinding = ItemAnimalBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return AnimalViewHolder(animalItemBinding)
    }

    override fun getItemCount() = animalList.size

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind(animalList[position])
        holder.binding.listener = this
    }

    override fun onClick(view: View?) {
       for (animal in animalList){
           if (view?.tag == animal.name){
               val animalAction = ListFragmentDirections.actionDetail(animal)
               if (view != null) {
                   Navigation.findNavController(view).navigate(animalAction)
               }
           }
       }
    }

}
