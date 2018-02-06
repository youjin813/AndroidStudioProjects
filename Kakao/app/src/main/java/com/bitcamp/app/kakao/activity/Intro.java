package com.bitcamp.app.kakao.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.bitcamp.app.kakao.R;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
        final Context context = Intro.this;
        final EditText phone = findViewById(R.id.phone);

        findViewById(R.id.next_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"들어온 핸드폰 번호"+String.valueOf(phone.getText()),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context,Index.class);
                startActivity(intent);
            }
        });
    }
}
