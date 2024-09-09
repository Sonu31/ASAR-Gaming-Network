package com.asar.gaming.gamingnetwork

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.asar.gaming.gamingnetwork.databinding.ActivityMainBinding
import com.asar.gaming.gamingnetwork.page.HomePageActivity
import com.asar.gaming.gamingnetwork.page.QuestionPageActivity
import com.asar.gaming.gamingnetwork.page.YesNoPageActivity

class MainActivity : AppCompatActivity() {

    var _binding: ActivityMainBinding?=null
        val binding   get() = _binding!!
        override fun onDestroy() {
            super.onDestroy()
            _binding= null
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.homePageBtn.setOnClickListener {
            startActivity(Intent(this,HomePageActivity::class.java))
        }
        binding.YesNoPagebtn.setOnClickListener {
            startActivity(Intent(this,YesNoPageActivity::class.java))

        }
        binding.QuestionPagebtn.setOnClickListener {
            startActivity(Intent(this,QuestionPageActivity::class.java))


        }

    }
}