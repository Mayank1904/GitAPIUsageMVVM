package `in`.mayank.githubUser.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import `in`.mayank.githubUser.R
import androidx.navigation.Navigation.findNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSupportNavigateUp(): Boolean {

        findNavController(this, R.id.homeFragment)
            .navigateUp()

        return super.onSupportNavigateUp()
    }
}
