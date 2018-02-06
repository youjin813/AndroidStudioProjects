package com.bitcamp.app.kaup;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = MainActivity.this;
        final EditText name = findViewById(R.id.name);
        final EditText height = findViewById(R.id.height);
        final EditText weight = findViewById(R.id.weight);
        final TextView result = findViewById(R.id.result);
        findViewById(R.id.calcBtn).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                result.setText(Command.calc(name,height,weight));
           }
       });

    }
}
