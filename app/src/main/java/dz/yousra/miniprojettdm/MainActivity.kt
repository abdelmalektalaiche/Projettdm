package dz.yousra.miniprojettdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import dz.yousra.miniprojettdm.fragments.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        //injecter le fragment dans notre boite
       /* val transaction=supportFragmentManager.beginTransaction()
       transaction.replace(R.id.fragmentContainer,HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()*/
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
        val navController = navHostFragment.navController

//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
//        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(nav_bottom,navController)


    }
}