package com.bitcamp.app.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = MainActivity.this;
        final EditText firstNum =  findViewById(R.id.first_num);
        final EditText secondNum = findViewById(R.id.second_num);
        final TextView result = findViewById(R.id.result);
        Button multipBtn = findViewById(R.id.minus_btn);
        Button divisionBtn = findViewById(R.id.division_btn);
        findViewById(R.id.plus_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(Command.calc(firstNum,secondNum,""));
            }
        });
        findViewById(R.id.minus_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
