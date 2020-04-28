package com.rajesh.stateofartandroid.di

import com.rajesh.stateofartandroid.ui.main.viewmodel.ListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class,PrefModule::class,ApplicationModule::class])
interface ViewModelServiceComponent {

    fun injectInViewModel(serviceForViewModel: ListViewModel)
}