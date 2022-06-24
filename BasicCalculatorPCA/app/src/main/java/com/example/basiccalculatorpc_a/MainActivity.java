package com.example.basiccalculatorpc_a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1Text, num2Text;
    TextView resultView;
    double num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1Text = findViewById(R.id.firstEditTextId);
        num2Text = findViewById(R.id.secondEditTextId);
        resultView = findViewById(R.id.resultTextViewID);
    }


    public void calculateFunction(View view) {
        num1 = Double.parseDouble(num1Text.getText().toString());
        num2 = Double.parseDouble(num2Text.getText().toString());
        if (view.getId() == R.id.sumBtnID) {
            result = num1 + num2;
        } else if (view.getId() == R.id.subBtnID) {
            result = num1 - num2;
        } else if (view.getId() == R.id.multiBtnID) {
            result = num1 * num2;
        } else {
            result = num1 / num2;
        }

        resultView.setText("" + result);
    }
}