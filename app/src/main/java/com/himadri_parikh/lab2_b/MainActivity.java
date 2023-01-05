package com.himadri_parikh.lab2_b;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Step 1 - instantiation
    TextView tvName, tvAdd, tvContact, tvQual, tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step2 binding views
        tvName = findViewById(R.id.tvName);
        tvAdd = findViewById(R.id.tvAddress);
        tvQual = findViewById(R.id.tvQualification);
        tvEmail = findViewById(R.id.tvEmail);
        tvContact = findViewById(R.id.tvContact);


        //Step3 implementation of listener
        tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tvName.setBackgroundColor(Color.CYAN);
            }
        });
        tvAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvAdd.setBackgroundColor(
                        getResources().getColor(R.color.lightgreen));
            }
        });
    }
}