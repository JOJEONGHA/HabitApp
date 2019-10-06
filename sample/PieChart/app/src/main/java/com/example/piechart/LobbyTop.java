package com.example.piechart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LobbyTop extends Fragment {
    TextView midlle_text;
    ImageButton left_btn, right_btn;

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

        left_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // chart 혹은 main으로 중간 날짜정보 전송
                // 날짜 변경
            }
        });

        right_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // chart 혹은 main으로 중간 날짜정보 전송
                // 날짜 변경
            }
        });


        return view;
    }

}
