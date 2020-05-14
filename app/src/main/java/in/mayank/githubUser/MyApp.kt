package `in`.mayank.githubUser

import android.app.Application
import org.koin.core.context.startKoin
import `in`.mayank.githubUser.di.myModule

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()

        //use koin and start it here
        startKoin {
            modules(myModule)
        }
    }
}