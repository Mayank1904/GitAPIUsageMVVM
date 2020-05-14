package `in`.mayank.githubUser.api

import `in`.mayank.githubUser.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path
import `in`.mayank.githubUser.model.User


//get the endpoint with path
interface ApiService {
    @GET("/users/{username}")
    suspend fun getUser(
        @Path("username") username: String
    ): User


    @GET("/users/{username}/repos")
    suspend fun getRepoes(
        @Path("username") username: String
    ): List<Repo>


}