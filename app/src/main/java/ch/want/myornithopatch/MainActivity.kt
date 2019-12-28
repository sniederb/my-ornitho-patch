package ch.want.myornithopatch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

/**
 * This 'main' activity implements the navigation view for Android:
 * - The layout defines a DrawerLayout, with an included AppBarLayout. Consequently, the theme is
 *   set to AppTheme.NoActionBar
 * - There is *no* options menu
 */
class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        addNavigationItems()
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each menu should be considered as top level
        // destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_settings
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        //
        //        supportFragmentManager
        //            .beginTransaction()
        //            .replace(R.id.settings_container, SettingsFragment())
        //            .commit()
    }

    //    override fun onCreateOptionsMenu(menu: Menu): Boolean {
    //        // Inflate the menu; this adds items to the action bar if it is present.
    //        menuInflater.inflate(R.menu.main, menu)
    //        return true
    //    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun addNavigationItems() {
        val navView: NavigationView = findViewById(R.id.nav_view)
        val menu = navView.menu
        val submenu = menu.findItem(R.id.nav_patches).subMenu
        val newMenuItem = submenu.add("Flachsee")
    }
}
