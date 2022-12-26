package com.example.myloginapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
    TextView tvUsername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Bundle bundle= getIntent().getExtras();
        String username=bundle.getString("Uname");
        tvUsername=(TextView) findViewById(R.id.tvUsername);
        tvUsername.setText("Welcome "+username);

    }
}