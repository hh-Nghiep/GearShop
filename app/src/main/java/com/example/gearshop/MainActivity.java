package com.example.gearshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnBai1, btnBai2, btnBai3, btnBai4, btnBai5, btnBai6, btnBai7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBai1 = findViewById(R.id.button1);
        btnBai2 = findViewById(R.id.button2);
        btnBai3 = findViewById(R.id.button3);
        btnBai4 = findViewById(R.id.button4);
        btnBai5 = findViewById(R.id.button5);
        btnBai6 = findViewById(R.id.button6);
        btnBai7 = findViewById(R.id.button7);
        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // khai báo intent Bài 1
                Intent intentBai1 = new Intent(MainActivity.this, Bt1Activity.class);
                // Khởi động == chuyển màn hình
                startActivity(intentBai1);
            }
        });

        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // khai báo intent Bài 2
                Intent intentBai2 = new Intent(MainActivity.this, Bt2Activity.class);
                // Khởi động == chuyển màn hình
                startActivity(intentBai2);
            }
        });
        btnBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // khai báo intent Bài 3
                Intent intentBai3 = new Intent(MainActivity.this, Bt3Activity.class);
                // Khởi động == chuyển màn hình
                startActivity(intentBai3);
            }
        });

        btnBai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // khai báo intent Bài 4
                Intent intentBai4 = new Intent(MainActivity.this, Bt4Activity.class);
                // Khởi động == chuyển màn hình
                startActivity(intentBai4);
            }
        });
        btnBai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // khai báo intent Bài 5
                Intent intentBai5 = new Intent(MainActivity.this, Bt5Activity.class);
                // Khởi động == chuyển màn hình
                startActivity(intentBai5);
            }
        });
        btnBai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // khai báo intent Bài 6
                Intent intentBai6 = new Intent(MainActivity.this, Bt6Activity.class);
                // Khởi động == chuyển màn hình
                startActivity(intentBai6);
            }
        });
        btnBai7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // khai báo intent Bài 7
                Intent intentBai7 = new Intent(MainActivity.this, Bt7Activity.class);
                // Khởi động == chuyển màn hình
                startActivity(intentBai7);
            }
        });
//        btnBai8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // khai báo intent Bài 8
//                Intent intentBai8 = new Intent(MainActivity.this, Bt8Activity.class);
//                // Khởi động == chuyển màn hình
//                startActivity(intentBai8);
//            }
//        });
    }
}