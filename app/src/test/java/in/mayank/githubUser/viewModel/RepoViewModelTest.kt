package `in`.mayank.githubUser.viewModel

import `in`.mayank.githubUser.model.Repo
import `in`.mayank.githubUser.model.User
import androidx.lifecycle.Observer
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.mockito.ArgumentCaptor
import org.mockito.Mockito.*

class RepoViewModelTest {


    private lateinit var viewModel: RepoViewModel

//    private val observer: Observer<List<Repo>> = mock(Class<Observer<List<Repo>>())

    @Before
    fun before() {
        viewModel = RepoViewModel()
//        viewModel.repos.observeForever(observer)
    }

    @Test
    fun fetchUser_ShouldReturnUser() {
        val expectedUser = User(name= "Henning Dodenhof", webSite="https://hdodenhof.de", avatarUrl="https://avatars1.githubusercontent.com/u/1824223?v=4", bio= null, login="hdodenhof")


    }

}