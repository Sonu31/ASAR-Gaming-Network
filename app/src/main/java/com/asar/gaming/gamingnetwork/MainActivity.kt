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
        val scaleUp = ObjectAnimator.ofFloat(binding.animimage, "scaleX", 1f, 2f)
        val scaleDown = ObjectAnimator.ofFloat(binding.animimage, "scaleX", 2f, 1f)
        scaleUp.duration = 1000
        scaleDown.duration = 1000

// Start scale up, then scale down
        scaleUp.start()



        /*---------translationX -----------------*/

//        val objectAnimator = ObjectAnimator.ofFloat(binding.animimage, "translationX", 360f) /// horizantal movement
  /*      val objectAnimator = ObjectAnimator.ofFloat(binding.animimage, "translationY",-20f,0f ) // vertical movement

        objectAnimator.duration = 1000 // 1 second
        objectAnimator.start()*/


        /*---------rotation-----------------*/
/*        val objectAnimator2 = ObjectAnimator.ofFloat(binding.animimage, "rotation", 0f, -360f) // vertical movement

        objectAnimator2.duration = 1000 // 1 second
        objectAnimator2.start()*/


        /*scaleX  size horizantal incrize*/
/*        val objectAnimator3 = ObjectAnimator.ofFloat(binding.animimage, "scaleX",   0f, 2f) // vertical movement

        objectAnimator3.duration = 1000 // 1 second
        objectAnimator3.start()*/

        /*scaleY  size vertical incrize*/
     /*   val objectAnimator4 = ObjectAnimator.ofFloat(binding.animimage, "scaleY",   0f, 2f) // vertical movement

        objectAnimator4.duration = 1000 // 1 second
        objectAnimator4.start()*/

        val moveAnimator = ObjectAnimator.ofFloat(binding.animimage, "translationX", 300f)
        moveAnimator.duration = 1000 // 1 second

        // Button ko rotate karna
        val rotateAnimator = ObjectAnimator.ofFloat(binding.animimage, "rotation", 360f)
        rotateAnimator.duration = 1000 // 1 second

        // Button ko fade-out karna (alpha = 0)
        val fadeOutAnimator = ObjectAnimator.ofFloat(binding.animimage, "alpha",0f ,10f)
        fadeOutAnimator.duration = 1000 // 1 second

        // In sab animations ko combine karte hain using AnimatorSet
        val animatorSet = AnimatorSet()

        // Sab animations ko ek ke baad ek chalana (sequentially)
        animatorSet.playSequentially(moveAnimator, rotateAnimator, fadeOutAnimator)

        // AnimatorSet ko start karna
        animatorSet.start()
    }
}