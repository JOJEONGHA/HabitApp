package com.example.habitapptest;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AdTestJava extends AppCompatActivity
{
    long mNow;
    Date mData;
    SimpleDateFormat mFormat = new SimpleDateFormat("MM-dd");
    private String getTime(){
        mNow = System.currentTimeMillis();
        mData = new Date(mNow);
        return mFormat.format(mData);
    }

    TextView day;

    PieChart chart;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adtj);
        day = (TextView)findViewById(R.id.day);
        day.setText(getTime());

        chart = (PieChart)findViewById(R.id.chart1);

        chart.setUsePercentValues(true);
        chart.getDescription().setEnabled(false);
        chart.setExtraOffsets(5,10,5,5);

        ArrayList<PieEntry> yValues = new ArrayList<PieEntry>();

        yValues.add(new PieEntry(8,"잠"));
        yValues.add(new PieEntry(3,"게임"));
        yValues.add(new PieEntry(5,"일"));
        yValues.add(new PieEntry(5,"공부"));
        Description description = new Description();
        description.setText("Todya Schedule "); //라벨
        description.setTextSize(15);
        chart.setDescription(description);

        //chart.animateY(1000, Easing.EasingOption.EaseInOutCubic); //애니메이션

        PieDataSet dataSet = new PieDataSet(yValues,"Countries");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.JOYFUL_COLORS);

        PieData data = new PieData((dataSet));
        data.setValueTextSize(10f);
        data.setValueTextColor(Color.YELLOW);

        chart.setData(data);
    }
}
