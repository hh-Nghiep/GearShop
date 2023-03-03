package com.example.gearshop;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bt5Activity extends AppCompatActivity {

    EditText edtName, edtIDCard, edtOther;
    RadioButton radUniversity, radCollege, radIntermediate;
    CheckBox cbxGame, cbxBook, cbxNewspaper;
    TextView tvInformation;
    Button btnSendInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bt5);
        edtName = findViewById(R.id.edtName);
        edtIDCard = findViewById(R.id.edtIDCard);
        edtOther = findViewById(R.id.edtOther);
        radUniversity = findViewById(R.id.radUniversity);
        radCollege = findViewById(R.id.radCollege);
        radIntermediate = findViewById(R.id.radIntermediate);
        cbxGame = findViewById(R.id.cbxGame);
        cbxBook = findViewById(R.id.cbxBook);
        cbxNewspaper = findViewById(R.id.cbxNewspaper);
        tvInformation = findViewById(R.id.tvInformation);
        btnSendInfo = findViewById(R.id.btnSendInfo);

        btnSendInfo.setOnClickListener(view -> {
            String info = "";
            String name = edtName.getText().toString();
            if (name.length() <= 3) {
                edtName.setError("Phải có lớn hơn 3 ký tự");
                edtName.requestFocus();
                return;
            }
            String idCard = edtIDCard.getText().toString();
            if (idCard.length() != 12) {
                edtIDCard.setError("Phải có chính xác 12 ký tự");
                edtIDCard.requestFocus();
                return;
            }
            info += "Họ và tên: " + name + "\nCCCD: " + idCard + "\n";
            if (radCollege.isChecked()) {
                info += "Bằng cấp: " + radCollege.getText() + "\n";
            }else if (radIntermediate.isChecked()) {
                info += "Bằng cấp: " + radIntermediate.getText() + "\n";
            }else if (radUniversity.isChecked()) {
                info += "Bằng cấp: " + radUniversity.getText() + "\n";
            }
            info += "Sở thích:\n";
            if (cbxBook.isChecked()) {
                info += cbxBook.getText() + "\n";
            }
            if (cbxGame.isChecked()) {
                info += cbxGame.getText() + "\n";
            }
            if (cbxNewspaper.isChecked()) {
                info += cbxNewspaper.getText() + "\n";
            }
            info += "Thông tin khác: " + edtOther.getText();
            tvInformation.setText(info);
        });
    }
}