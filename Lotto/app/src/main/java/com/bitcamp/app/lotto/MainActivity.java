package com.bitcamp.app.lotto;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView result = findViewById(R.id.result);
        findViewById(R.id.makeNum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] arr = new int[6];
                String lotto_num = "";
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (int) (Math.random() * 45) + 1;
                    if (i == 0) {
                        continue;
                    } else {
                        for (int j = 0; j < i; j++) {
                            if (arr[i] == arr[j]) {
                                i--;
                                break;
                            }
                        }
                    }
                }
                Arrays.sort(arr);
                for (int i = 0; i < 6; i++) {
                    if (i != 5) {
                        lotto_num += arr[i] + ",";
                    } else {
                        lotto_num += arr[i];
                    }
                }
                result.setText(lotto_num);
            }
        });
    }}