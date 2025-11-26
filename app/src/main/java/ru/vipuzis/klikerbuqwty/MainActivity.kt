package ru.vipuzis.klikerbuqwty

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var count = 0
        var multiple = 1


        val textCount = findViewById<TextView>(R.id.count)
        val imageLevel1 = findViewById<ImageView>(R.id.imageView)
        imageLevel1.setOnClickListener {
            count += Plus(multiple)
            textCount.setText(count.toString())

        }
        val intentShop  = Intent(this, MainActivity2::class.java)
        val shopButton = findViewById<ImageView>(R.id.shopButton)
        shopButton.setOnClickListener {
            startActivity(intentShop)

        }
        val intentAchive  = Intent(this, MainActivity3::class.java)
        val achievementButton  = findViewById<ImageView>(R.id.achievementButton)
        achievementButton.setOnClickListener {
            startActivity(intentAchive)


        }

    }
    fun Plus(multiple: Int): Int {
        return 1 * multiple
    }
}

