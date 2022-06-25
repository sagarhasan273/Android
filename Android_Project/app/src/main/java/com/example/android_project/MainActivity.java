package com.example.android_project;

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
        if (radioGroup.getCheckedRadioButtonId() == R.id.radioBtnInsert) {
            Intent insertIntent = new Intent(this, InsertData.class);
            startActivity(insertIntent);
        } else if (radioGroup.getCheckedRadioButtonId() == R.id.radioBtnView) {
            Intent viewIntent = new Intent(this, ViewData.class);
            startActivity(viewIntent);
        } else {
            Toast.makeText(this, "Choose something!", Toast.LENGTH_SHORT).show();
        }
    }
}