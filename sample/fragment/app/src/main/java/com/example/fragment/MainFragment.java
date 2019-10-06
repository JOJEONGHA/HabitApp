package com.example.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    TextView textview;
    Button button;
    EditText editText;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // inflater를 이용하여 main_fragment를 뷰와 연결한다.
        View view = inflater.inflate(R.layout.main_fragment,null);

        textview = (TextView)view.findViewById(R.id.textView);
        button = (Button)view.findViewById(R.id.button);
        editText = (EditText)view.findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(editText.getText().toString());
            }
        });

        return view;
    }
}
