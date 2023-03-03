package com.example.gearshop;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Bt3Activity extends AppCompatActivity {

    EditText number1, number2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView result;
    float nb1, nb2, rs;

    private View.OnClickListener btn_Listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            if (number1.getText().toString().isEmpty() || number2.getText().toString().isEmpty()) {
                result.setText("Vui lòng nhập đầy đủ hai số");
                return;
            }else{
                nb1 = Float.parseFloat(number1.getText().toString());
                nb2 = Float.parseFloat(number2.getText().toString());
                System.out.println(view);
                if(view == btnAdd) {
                    rs = nb1 + nb2;
                }else if(view == btnSub) {
                    rs = nb1 - nb2;
                }else if(view == btnMul) {
                    rs = nb1 * nb2;
                }else if(view == btnDiv) {
                    rs = nb1 / nb2;
                }
                result.setText(String.valueOf(rs));
                return;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bt3);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        result = findViewById(R.id.result);

        btnAdd.setOnClickListener(btn_Listener);
        btnSub.setOnClickListener(btn_Listener);
        btnMul.setOnClickListener(btn_Listener);
        btnDiv.setOnClickListener(btn_Listener);
    }
}