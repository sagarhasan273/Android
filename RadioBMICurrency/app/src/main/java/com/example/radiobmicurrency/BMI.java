package com.example.radiobmicurrency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {
    EditText weightText, heightText;
    TextView outputView;
    double bmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        weightText = findViewById(R.id.weightID);
        heightText = findViewById(R.id.heightID);
        outputView = findViewById(R.id.bmiOutput);
    }

    public void calculateBMI(View view) {
        bmi = (Double.parseDouble(weightText.getText().toString()) / Double.parseDouble(heightText.getText().toString()) );
        outputView.setText("Output: " + bmi);
    }

    public void homePage(View view) {
        Intent homeIntent = new Intent(this, MainActivity.class);
        startActivity(homeIntent);
    }
}