package com.example.android_project;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class InsertData extends AppCompatActivity {
    Button firstFragmentBtn, secondFragmentBtn;
    TextView testText;
    String studentName, studentID, courseName, courseCode, courseCredit;

    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);



        firstFragmentBtn = findViewById(R.id.fragment1btn);
        secondFragmentBtn = findViewById(R.id.fragment2btn);
        testText = findViewById(R.id.testText);
        replaceFragment(new Fragment1());
        firstFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new Fragment1());
            }
        });

        secondFragmentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new Fragment2());
            }
        });
    }
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }

    public void insertFunction(View view) {
        studentName = Fragment1.nameText;
        studentID = Fragment1.idText;
        courseName = Fragment2.courseName;
        courseCode = Fragment2.courseCode;
        courseCredit = Fragment2.courseCredit;


        if (TextUtils.isEmpty(studentName) && TextUtils.isEmpty(studentID)  && TextUtils.isEmpty(courseName) && TextUtils.isEmpty(courseCode) && TextUtils.isEmpty(courseCredit)) {
            Toast.makeText(this, "Please add some data.", Toast.LENGTH_SHORT).show();
        } else {
            mDatabase = FirebaseDatabase.getInstance().getReference("Students");
            String key = mDatabase.push().getKey();
            Students students = new Students(studentName, studentID, courseName, courseCode, courseCredit);
            mDatabase.child(studentID).setValue(students);
            testText.setText(studentName+"-"+studentID+"-"+courseName+"-"+courseCode+"-"+courseCredit);
            Toast.makeText(this, "Data Inserted Successfully!", Toast.LENGTH_SHORT).show();
        }
    }

    public void homePage(View view) {
        Intent mainIntent = new Intent(this, MainActivity.class);
        startActivity(mainIntent);
    }
}