package com.example.jeongha.pushsample;


import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    NotificationManager nm = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
    Notification notify = new Notification(android.R.drawable.ic_lock_idle_alarm,"알람!!",System.currentTimeMillis());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
