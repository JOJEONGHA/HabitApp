package com.example.inflation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    boolean visible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // activity_main.xml에서 정의한 LinearLayout 객체 할당
        LinearLayout inflatedLayout = (LinearLayout)findViewById(R.id.inflatedLayout);
        // LayoutInflater 객체 생성
        LayoutInflater inflater =  (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // Inflated_Layout.xml로 구성한 레이아웃을 inflatedLayout 영역으로 확장
        inflater.inflate(R.layout.inflated_layout, inflatedLayout);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }


	//activity_main.xml에서 정의한 버튼을 클릭할 때 동적으로 확장되도록 할 수도 있음.
	public void onClick(View v){

		if(visible == false)
		{
			LinearLayout inflatedLayout = (LinearLayout)findViewById(R.id.inflatedLayout);

			LayoutInflater inflater =  (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			inflater.inflate(R.layout.inflated_layout, inflatedLayout);

			visible = true;
		}
	}

}