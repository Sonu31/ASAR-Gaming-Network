package com.asar.gaming.gamingnetwork.page

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.agik.swipe_button.Controller.OnSwipeCompleteListener
import com.agik.swipe_button.View.Swipe_Button_View
import com.asar.gaming.gamingnetwork.R
import com.asar.gaming.gamingnetwork.adapter.ViewPagerAdapter
import com.asar.gaming.gamingnetwork.databinding.ActivityMainBinding
import com.asar.gaming.gamingnetwork.databinding.ActivityYesNoPageBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import soup.neumorphism.NeumorphButton

class YesNoPageActivity : AppCompatActivity() {

    var _binding: ActivityYesNoPageBinding? = null
    val binding get() = _binding!!
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    lateinit var tabTitle: NeumorphButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityYesNoPageBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.start.setOnSwipeCompleteListener_forward_reverse(object : OnSwipeCompleteListener {
            override fun onSwipe_Forward(swipeView: Swipe_Button_View) {

                binding.start.setThumbBackgroundColor(ContextCompat.getColor(this@YesNoPageActivity, R.color.bule));
                binding.start.setSwipeBackgroundColor(ContextCompat.getColor(this@YesNoPageActivity, R.color.bule));
                binding.start.setThumbImage(resources.getDrawable(R.drawable.blue_circle_double_right));
                binding.yesbtn.visibility = View.VISIBLE
                binding.nobtn.visibility = View.GONE
                binding.seekBar.progressDrawable =ContextCompat.getDrawable(this@YesNoPageActivity, R.drawable.customprogress_seekbarblue)
                binding.seekBar.thumb = ContextCompat.getDrawable(this@YesNoPageActivity, R.drawable.custom_thumbsblue)

                binding.seekBar.progressTintList =ContextCompat.getColorStateList(this@YesNoPageActivity, R.color.bule)
                binding.start.setText("Swipe for Yes")
            }

            override fun onSwipe_Reverse(swipeView: Swipe_Button_View) {
                binding.start.setText("Swipe for NO")
                binding.start.setThumbImage(resources.getDrawable(R.drawable.green_circle_double_right));
                binding.start.setThumbBackgroundColor(ContextCompat.getColor(this@YesNoPageActivity, R.color.green));
                binding.start.setSwipeBackgroundColor(ContextCompat.getColor(this@YesNoPageActivity, R.color.green));
                binding.nobtn.visibility = View.GONE
                binding.seekBar.progressDrawable =ContextCompat.getDrawable(this@YesNoPageActivity, R.drawable.customprogress_seekbar)

            }
        })

        binding.btnDecrease.setOnClickListener {
            val currentProgress = binding.seekBar.progress
            if (currentProgress > 0) {
                binding.seekBar.progress = currentProgress - 1
            }
        }

        // Increase Button Click Listener
        binding.btnIncrease.setOnClickListener {
            val currentProgress = binding.seekBar.progress
            if (currentProgress < binding.seekBar.max) {
                binding.seekBar.progress = currentProgress + 1
            }
        }

        // SeekBar Change Listener (optional)
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // Handle progress change
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                // Handle when touch starts
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                // Handle when touch stops
            }
        })


    }

}



