package com.bitcamp.app.kaup;

import android.widget.EditText;

/**
 * Created by hb1002 on 2018-02-05.
 */

public class Command {
    public static String calc(EditText name,EditText hight,EditText weight){
        String res = "";
        double weight1=0.0,height1=0.0,bmi=0.0;
        weight1 = Double.parseDouble(String.valueOf(weight.getText()));
        height1 = Double.parseDouble(String.valueOf(hight.getText()))/100.0;
        bmi = weight1/ (height1 * height1) ;
        if(bmi > 35) {
            res="고도비만";
        }else if(30 <= bmi && bmi< 35){
            res="중등도 비만";
        }else if(25 <=bmi && bmi < 30){
            res="경도 비만";
        }else if(23 <= bmi && bmi< 24.9){
            res="과체중";
        }else if(18.5 <=bmi && bmi< 22.9){
            res="정상";
        }else {
            res="저체중";
        }
        return res;
        }
    }

