package `in`.mayank.githubUser.di

import `in`.mayank.githubUser.viewModel.RepoViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import `in`.mayank.githubUser.viewModel.MainViewModel


//koin module
val myModule = module {

    viewModel { MainViewModel() }
    viewModel { RepoViewModel() }
}