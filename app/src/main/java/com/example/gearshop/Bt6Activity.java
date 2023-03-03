package com.example.gearshop;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class Bt6Activity extends AppCompatActivity {

    ToggleButton swL;
    Switch swF;
    ImageView imgL, imgF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bt6);

        swL = findViewById(R.id.switchLight);
        swF = findViewById(R.id.switchFan);
        imgL = findViewById(R.id.imgLight);
        imgF = findViewById(R.id.imgFan);

        swL.setOnClickListener(view -> {
            if (swL.isChecked()) {
                imgL.setImageResource(R.drawable.denmo);
            } else {
                imgL.setImageResource(R.drawable.dentat);
            }
        });
        swF.setOnClickListener(view -> {
            if (swF.isChecked()) {
                imgF.setImageResource(R.drawable.moquat);
            } else {
                imgF.setImageResource(R.drawable.quat);
            }
        });
    }

}