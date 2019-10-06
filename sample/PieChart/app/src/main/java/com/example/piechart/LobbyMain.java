package com.example.piechart;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class LobbyMain extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_lobby);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.lobby_top,new LobbyTop());
        fragmentTransaction.replace(R.id.lobby_middle,new LobbyChart());
        fragmentTransaction.replace(R.id.lobby_bottom,new LobbyBottom());
        fragmentTransaction.commit();
    }
}
