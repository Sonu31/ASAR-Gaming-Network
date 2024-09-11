package com.asar.gaming.gamingnetwork.page

import AsarAdapteTwo
import AsarAdapter
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.asar.gaming.gamingnetwork.R
import com.asar.gaming.gamingnetwork.databinding.ActivityHomePageBinding
import com.asar.gaming.gamingnetwork.model.ModelOne
import com.asar.gaming.gamingnetwork.model.ModelTwo
import com.github.angads25.toggle.interfaces.OnToggledListener
import com.github.angads25.toggle.model.ToggleableView
import com.mcdev.splitbuttonlibrary.OnButtonClickListener

class HomePageActivity : AppCompatActivity() {

    var _binding: ActivityHomePageBinding? = null
    val binding get() = _binding!!
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.splitBtn.apply {

            this.setTextColor(R.color.white)
            this.setIconColor(android.R.color.white)
            this.setBgColor(R.color._000000)
            this.setMenuItems(R.menu.category_menu)

          // set menu items color
            this.setOnButtonClickListener(object : OnButtonClickListener {
                override fun onClick(itemId: Int, itemTitle: String?) {
                     if (itemId == R.id.category) {
                        Toast.makeText(this@HomePageActivity, "Category", Toast.LENGTH_SHORT).show()

                    }
                   else if (itemId == R.id.circket) {

                        Toast.makeText(this@HomePageActivity, "Circket", Toast.LENGTH_SHORT).show()
                        Log.d("TAG", "onClick: send  ")
                    }

                    else if (itemId == R.id.badminton) {

                        Toast.makeText(this@HomePageActivity, "Badminton", Toast.LENGTH_SHORT)
                            .show()
                        Log.d("TAG", "onClick: bookmark ")
                    } else if (itemId == R.id.kabaddi) {
                        Toast.makeText(this@HomePageActivity, "Kabaddi", Toast.LENGTH_SHORT).show()

                    } else if (itemId == R.id.fieldhockey) {
                        Toast.makeText(this@HomePageActivity, "Field Hockey", Toast.LENGTH_SHORT).show()

                }
                }
            })


        }


        var list:ArrayList<ModelOne> = ArrayList()
        list.add(ModelOne(R.drawable.bitcoin,"Bitcoin","$54523","+0.45"))
        list.add(ModelOne(R.drawable.pngtreebeautifulbatandball,"IPL","$44223","+0.00"))
        list.add(ModelOne(R.drawable.bitcoin,"Bitcoin","$54523","+0.34"))
        list.add(ModelOne(R.drawable.bitcoin,"IPL","$54523","+0.33"))
        list.add(ModelOne(R.drawable.bitcoin,"IPL","$54523","+0.33"))
        list.add(ModelOne(R.drawable.bitcoin,"IPL","$54523","+0.33"))
        var  adapter = AsarAdapter(list,this)
        binding.rv.adapter = adapter

        var list2:ArrayList<ModelTwo> = ArrayList()
        list2.add(ModelTwo("Kolkata to win the match vs \nMumbai?","H2H last 5 T20 : Kolkata 4, Mumbai 1, DRAW 0","Yes ₹5.3","No ₹ 4.3",R.drawable.ipl_logo))
        list2.add(ModelTwo("Kolkata to win the match vs \nMumbai?","H2H last 5 T20 : Kolkata 4, Mumbai 1, DRAW 0","Yes ₹6.3","No ₹ 1.3",R.drawable.ipl_logo))
        list2.add(ModelTwo("Kolkata to win the match vs \nPanjab?","H2H last 5 T20 : Kolkata 4, Mumbai 1, DRAW 0","Yes ₹2.3","No ₹ 5.3",R.drawable.ipl_logo))
        list2.add(ModelTwo("Kolkata to win the match vs \nPanjab?","H2H last 5 T20 : Kolkata 4, Mumbai 1, DRAW 0","Yes ₹2.3","No ₹ 5.3",R.drawable.ipl_logo))
        list2.add(ModelTwo("Kolkata to win the match vs \nPanjab?","H2H last 5 T20 : Kolkata 4, Mumbai 1, DRAW 0","Yes ₹2.3","No ₹ 5.3",R.drawable.ipl_logo))
        list2.add(ModelTwo("Kolkata to win the match vs \nDelhi?","H2H last 5 T20 : Kolkata 4, Mumbai 1, DRAW 0","Yes ₹6.3","No ₹ 2.3",R.drawable.ipl_logo))

        var  asarAdapter = AsarAdapteTwo(list2,this)
        binding.rv2.adapter = asarAdapter



        binding.switchbtn.setOnToggledListener(object : OnToggledListener {
            override fun onSwitched(toggleableView: ToggleableView?, isOn: Boolean) {

            }
        })






    }
}