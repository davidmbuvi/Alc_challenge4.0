package davidmbuvi3.com.alc_challenge.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import davidmbuvi3.com.alc_challenge.R

class MainActivity : AppCompatActivity() {
         lateinit var btn_about: Button
         lateinit var btn_profile: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_about=findViewById(R.id.btn_about)as  Button
        btn_profile=findViewById(R.id.btn_profile)as Button

        btn_about.setOnClickListener {
            startActivity(Intent(baseContext, AboutAlc::class.java))
           // finish()
        }
        btn_profile.setOnClickListener {
            startActivity(Intent(baseContext, myprofile::class.java))
            //finish()
        }
    }
}
