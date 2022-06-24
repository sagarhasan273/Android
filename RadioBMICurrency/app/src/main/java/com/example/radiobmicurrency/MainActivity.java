package com.example.radiobmicurrency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup);
    }

    public void nextPage(View view) {
        if (radioGroup.getCheckedRadioButtonId() == R.id.radioBtnBMI){
            Intent bmiIntent = new Intent(this, BMI.class);
            startActivity(bmiIntent);
        }else if (radioGroup.getCheckedRadioButtonId() == R.id.radioBtnCurr){
            Intent currIntent = new Intent(this, Currency.class);
            startActivity(currIntent);
        }else{
            Toast.makeText(this, "Choose something!", Toast.LENGTH_SHORT).show();
        }
    }
}