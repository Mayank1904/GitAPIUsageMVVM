package `in`.mayank.githubUser.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import `in`.mayank.githubUser.model.Repo
import `in`.mayank.githubUser.repository.Repository

class RepoViewModel : ViewModel() {
    private val _username: MutableLiveData<String> = MutableLiveData()

    val repos: LiveData<List<Repo>> = Transformations.switchMap(_username) { userId ->
        Repository.getRepoes(userId)


    }


    fun setUsername(userId: String) {
        if (_username.value == userId) {
            return
        }
        _username.value = userId

    }


    fun cancelJob() {
        Repository.cancelJob()
    }
}