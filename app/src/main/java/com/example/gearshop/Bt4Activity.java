package com.example.gearshop;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bt4Activity extends AppCompatActivity {

    EditText edtUsername, edtPassword, edtDateOfBirth, edtEmail;
    Button btnSignUp;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bt4);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        edtEmail = findViewById(R.id.edtEmail);
        edtDateOfBirth = findViewById(R.id.edtDateOfBirth);
        btnSignUp = findViewById(R.id.btnSignUp);
        tvResult = findViewById(R.id.result);

        btnSignUp.setOnClickListener(view -> {
            String result = "Tài khoản: " + edtUsername.getText() + "\nMật khẩu: " + edtPassword.getText() + "\nNgày sinh: " + edtDateOfBirth.getText() + "\nEmail: " + edtEmail.getText();
            tvResult.setText(result);
        });
    }
}