package com.asar.gaming.gamingnetwork.page

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.asar.gaming.gamingnetwork.databinding.ActivityQuestionPageBinding
import com.velli20.materialunixgraph.Line
import com.velli20.materialunixgraph.LinePoint

import ir.mahozad.android.PieChart
import java.util.Random


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


        val unixTimeNow = System.currentTimeMillis()
        val oneDayInMillis = (1000 * 60 * 60 * 24).toLong()
        val showLinePoints = true

        val line: Line = getDummyLine(unixTimeNow, unixTimeNow + oneDayInMillis, showLinePoints)
        line.lineColor = Color.parseColor("#00b0ff")
        line.fillLine = true
        line.setFillAlpha(60) /* Set alpha of the fill color 0-255 */
        line.lineStrokeWidth = 2f

        binding.graph.setMaxVerticalAxisValue(GRAPH_MAX_VERTICAL_VALUE.toFloat())
        binding.graph.addLine(line)



    }

    fun getDummyLine(startDateInMillis: Long, endDateInMillis: Long, showPoints: Boolean): Line {
        val line = Line()
        val random: Random = Random()

        var point: LinePoint
        for (i in 0..9) {
            val x = startDateInMillis + (((endDateInMillis - startDateInMillis) / 10) * i)

            point = LinePoint(x, random.nextInt(GRAPH_MAX_VERTICAL_VALUE.toInt()).toFloat())
            point.drawPoint = showPoints

            line.addPoint(point)
        }

        return line
    }


}