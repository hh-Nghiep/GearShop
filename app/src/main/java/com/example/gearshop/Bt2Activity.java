package com.example.gearshop;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bt2Activity extends AppCompatActivity {
    Button btnSend;
    EditText content, topic;
    TextView contentView, topicView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bt2);
        btnSend = findViewById(R.id.btnSendBai2);
        content = findViewById(R.id.content_input);
        topic = findViewById(R.id.topic_input);
        contentView = findViewById(R.id.content);
        topicView = findViewById(R.id.topic);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contentView.setText(content.getText());
                topicView.setText(topic.getText());
            }
        });
    }
}