package com.example.myfirtsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnProcess = findViewById(R.id.btnProcess);
        btnProcess.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView txvTitle = findViewById(R.id.txvTitle);
        EditText inputText = findViewById(R.id.inputText);

        if (v.getId() == R.id.btnProcess) {
            txvTitle.setText(inputText.getText());
        }
    }
}
