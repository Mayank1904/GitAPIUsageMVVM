package `in`.mayank.githubUser.repository

import androidx.lifecycle.LiveData
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import `in`.mayank.githubUser.api.ApiService
import `in`.mayank.githubUser.api.RetrofitClient
import `in`.mayank.githubUser.model.Repo
import `in`.mayank.githubUser.model.User

object Repository {
    var job: CompletableJob? = null

    fun getUser(username: String): LiveData<User> {
        job = Job()

        return object : LiveData<User>() {
            override fun onActive() {
                super.onActive()
                job?.let { theJob ->
                    CoroutineScope(IO + theJob).launch {

                        //fetch data from web service here
                        val user = RetrofitClient.createWebAPI<ApiService>().getUser(username)
                        withContext(Main) {
                            value = user
                            theJob.complete()
                        }
                    }
                }
            }
        }


    }
    fun getRepoes(username: String): LiveData<List<Repo>> {
        job = Job()

        return object : LiveData<List<Repo>>() {
            override fun onActive() {
                super.onActive()
                job?.let { theJob ->
                    CoroutineScope(IO + theJob).launch {

                        //fetch data from web service here
                        val repoes = RetrofitClient.createWebAPI<ApiService>().getRepoes(username)
                        withContext(Main) {
                            value = repoes
                            theJob.complete()
                        }
                    }
                }
            }
        }


    }


    //cancel the job
    fun cancelJob() {
        job?.cancel()
    }
}