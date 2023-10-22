package com.example.taskpapb_8_fragmentdantablayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.taskpapb_8_fragmentdantablayout.databinding.ActivityHomeBinding
import com.example.taskpapb_8_fragmentdantablayout.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // mengambil data intent
        val intent =  intent
        val username = intent.getStringExtra("EXT_USERNAME")

        with(binding){
            var usernameShown = "Welcome " + username + "!"
            tvUsername.text = usernameShown
        }
    }

    // ini untuk menampilkan menunya, jadi kayak temlate menunya itu di attach ke homeactivity gitu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_logout, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_logout -> {
                // intent untuk logout
                val intenttoMainActivity = Intent(this@HomeActivity, MainActivity::class.java)

                startActivity(intenttoMainActivity)
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}