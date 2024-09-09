package com.asar.gaming.gamingnetwork.page

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
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

        val layouts = listOf(R.layout.layout_one, R.layout.layout_two)
        val adapter = ViewPagerAdapter(layouts, this)
        binding.viewPager.adapter = adapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            val tabView = LayoutInflater.from(this).inflate(R.layout.custom_tab, null)
            tabTitle = tabView.findViewById<NeumorphButton>(R.id.tabTitle)

            /*
                        when (position) {
                            0 -> {
            //                    tabIcon.setImageResource(R.drawable.ic_tab_one)
                                tabTitle.text = "Yes ₹ 5.3"
            //                    tabTitle.setBackgroundColor(Color.parseColor("#144CC7"))
            //                    tabTitle.setBackgroundColor(Color.parseColor("#144CC7"))

                            }
                            1 -> {
            //                    tabIcon.setImageResource(R.drawable.ic_tab_two)
                                tabTitle.text = "Yes ₹ 4.7"
                                tabTitle.setBackgroundColor(Color.parseColor("#06C170"))

                            }

                        }
            */
            tab.customView = tabView
        }.attach()


        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                // Handle tab selected
                val position = tab.position
                tabTitle.setBackgroundColor(Color.parseColor("#144CC7"))

                // Perform action based on the tab position
                when (position) {
                    0 -> {
                        tabTitle.text = "Yes ₹ 5.3"


                        // First tab clicked
                        Toast.makeText(this@YesNoPageActivity, "Tab 1 clicked", Toast.LENGTH_SHORT)
                            .show()
                    }

                    1 -> {
//                        tabTitle.setBackgroundColor(Color.parseColor("#144CC7"))
                        tabTitle.text = "Yes ₹ 4.7"

                        // Second tab clicked
                        Toast.makeText(this@YesNoPageActivity, "Tab 2 clicked", Toast.LENGTH_SHORT)
                            .show()
                    }
                    // Add more cases for other tabs
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
//                tabTitle.setBackgroundColor(Color.parseColor("#06C170"))
            }

            override fun onTabReselected(tab: TabLayout.Tab) {
                // Handle tab reselected if needed
            }
        })


    }

}



