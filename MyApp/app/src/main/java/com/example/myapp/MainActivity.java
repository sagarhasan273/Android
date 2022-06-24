package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView primaryTextView, secondaryTextView;
    char last_c;
    double num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primaryTextView = findViewById(R.id.primaryTextViewID);
        secondaryTextView = findViewById(R.id.secondaryTextViewID);
    }

    public void calculateNow(View view) {
    }

    public void clickMeNow(View view) {
        String primaryValue = primaryTextView.getText().toString();
        String secondaryValue = secondaryTextView.getText().toString();

        int n = secondaryValue.length();

//        char last = secondaryValue.charAt(n - 1);


        if (primaryValue.equals("0")) {
            switch (view.getId()) {
                case R.id.oneBtnID:
                    primaryTextView.setText("1");
                    break;
                case R.id.twoBtnID:
                    primaryTextView.setText("2");
                    break;
                case R.id.threeBtnID:
                    primaryTextView.setText("3");
                    break;
                case R.id.fourBtnID:
                    primaryTextView.setText("4");
                    break;
                case R.id.fiveBtnID:
                    primaryTextView.setText("5");
                    break;
                case R.id.sixBtnID:
                    primaryTextView.setText("6");
                    break;
                case R.id.sevenBtnID:
                    primaryTextView.setText("7");
                    break;
                case R.id.eightBtnID:
                    primaryTextView.setText("8");
                    break;
                case R.id.nineBtnID:
                    primaryTextView.setText("9");
                    break;
            }
        }else{
            switch (view.getId()) {
                case R.id.dotBtnID:
                    primaryTextView.setText(primaryValue + ".");
                    break;
                case R.id.zeroBtnID:
                    primaryTextView.setText(primaryValue + "0");
                    break;
                case R.id.oneBtnID:
                    primaryTextView.setText(primaryValue + "1");
                    break;
                case R.id.twoBtnID:
                    primaryTextView.setText(primaryValue + "2");
                    break;
                case R.id.threeBtnID:
                    primaryTextView.setText(primaryValue + "3");
                    break;
                case R.id.fourBtnID:
                    primaryTextView.setText(primaryValue + "4");
                    break;
                case R.id.fiveBtnID:
                    primaryTextView.setText(primaryValue + "5");
                    break;
                case R.id.sixBtnID:
                    primaryTextView.setText(primaryValue + "6");
                    break;
                case R.id.sevenBtnID:
                    primaryTextView.setText(primaryValue + "7");
                    break;
                case R.id.eightBtnID:
                    primaryTextView.setText(primaryValue + "8");
                    break;
                case R.id.nineBtnID:
                    primaryTextView.setText(primaryValue + "9");
                    break;
            }
        }
    }
}