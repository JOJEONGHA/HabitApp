package com.example.piechart;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import lecho.lib.hellocharts.model.PieChartData;
import lecho.lib.hellocharts.model.SliceValue;
import lecho.lib.hellocharts.view.PieChartView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class LobbyChart extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.middle_lobby,null);

        // ==================== PieChart Setting
        PieChartView pieChartView = view.findViewById(R.id.chart);
        List<SliceValue> pieData = new ArrayList<>();

        // Label Setting
        pieData.add(new SliceValue(15, Color.BLUE).setLabel("Study"));
        pieData.add(new SliceValue(25, Color.GRAY).setLabel("Play"));
        pieData.add(new SliceValue(10, Color.RED).setLabel("Sleep"));
        pieData.add(new SliceValue(60, Color.MAGENTA).setLabel("Book"));

        // LobbyChart Setting Apply
        PieChartData pieChartData = new PieChartData(pieData);
        pieChartData.setHasLabels(true).setValueLabelTextSize(15);

        // Add Middle Text
//        pieChartData.setHasCenterCircle(true).setCenterText1("Daily Register").setCenterText1FontSize(20).setCenterText1Color(Color.parseColor("#0097A7"));
        pieChartView.animationDataUpdate(5);
        pieChartView.setPieChartData(pieChartData);

        // ===================== Ending

        return view;
    }
}
