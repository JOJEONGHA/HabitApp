package com.example.piechart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LobbyTop extends Fragment {
    TextView midlle_text;
    ImageButton left_btn, right_btn;
    String getDate;
    Date date;
    Calendar cal;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_lobby, null);

        left_btn = (ImageButton) view.findViewById(R.id.lobby_leftBtn);
        right_btn = (ImageButton) view.findViewById(R.id.lobby_rightBtn);
        midlle_text = (TextView) view.findViewById(R.id.lobby_middleText);

        // text 현재 날짜로 초기화
        // 특정 String type으로 전환
        date = new Date();
        cal = Calendar.getInstance();
        cal.setTime(date);

        SimpleDateFormat date_form = new SimpleDateFormat("yy.MM.dd");
        getDate = '\''+  date_form.format(cal.getTime());

        // 현재 날짜로 초기화
        midlle_text.setText(getDate);

        left_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // chart 혹은 main으로 중간 날짜정보 전송
                // 날짜 - 1 로 변경
                // 날짜 - 7이상 넘어가지 않게 조절
            }
        });

        right_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // chart 혹은 main으로 중간 날짜정보 전송
                // 날짜 변경
                // 날짜 + 1
                // 현재 날짜를 넘어가지 않게
            }
        });


        return view;
    }

}
