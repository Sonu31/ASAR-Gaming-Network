package com.asar.gaming.gamingnetwork.page

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.asar.gaming.gamingnetwork.databinding.ActivityQuestionPageBinding

import ir.mahozad.android.PieChart


class QuestionPageActivity : AppCompatActivity() {
    val GRAPH_MAX_VERTICAL_VALUE = 120f


    var _binding: ActivityQuestionPageBinding?=null
            val binding   get() = _binding!!
            override fun onDestroy() {
                super.onDestroy()
                _binding= null
            }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding= ActivityQuestionPageBinding.inflate(layoutInflater)
        setContentView(binding.root)




        /* binding.
        LabeledSwitch labeledSwitch = findViewById(R.id.switch);
        labeledSwitch.setOnToggledListener(new OnToggledListener() {
            @Override
            public void onSwitched(LabeledSwitch labeledSwitch, boolean isOn) {
                // Implement your switching logic here
            }
        });*/

        binding.pieChart.slices = listOf(
            PieChart.Slice(0.2f, Color.BLUE),
            PieChart.Slice(0.4f, Color.MAGENTA),
            PieChart.Slice(0.3f, Color.YELLOW),
            PieChart.Slice(0.1f, Color.CYAN)
        )

    /*    val series = LineGraphSeries(
            arrayOf(
                DataPoint(0.0, 1.0),
                DataPoint(1.0, 5.0),
                DataPoint(2.0, 3.0),
                DataPoint(3.0, 2.0),
                DataPoint(4.0, 6.0)
            )
        )

        binding.graph.addSeries(series)*/

    }

}