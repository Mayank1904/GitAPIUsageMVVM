package `in`.mayank.githubUser.repository

import `in`.mayank.githubUser.model.User
import androidx.lifecycle.Observer
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class RepositoryTest {

    private lateinit var repository : Repository

    @Before
    fun setup(){
        repository = Repository
    }



    @Test
    fun getUser_requestGetUser(){
        repository.getUser("hdodenhof")

        Mockito.verify(repository).getUser(
            "hdodenhof"
        )
    }
}