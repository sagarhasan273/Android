package com.example.android_project;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;


public class Fragment2 extends Fragment implements AdapterView.OnItemSelectedListener {
    static String courseName, courseCode, courseCredit;
    Button okay2Btn;
    EditText courseCodeEditText, courseCreditEditText;
    TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        Spinner spinner = view.findViewById(R.id.spinCountry);
        ArrayAdapter<CharSequence> adapter =  ArrayAdapter.createFromResource(getActivity(),R.array.country_array,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        textView = view.findViewById(R.id.dataObtained);
        okay2Btn = view.findViewById(R.id.okayBtn2);
        courseCodeEditText = view.findViewById(R.id.courseCodeEdit);
        courseCreditEditText = view.findViewById(R.id.courseCreditEdit);
        okay2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                courseCode = courseCodeEditText.getText().toString();
                courseCredit = courseCreditEditText.getText().toString();
                textView.setText("Data Obtained!");
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
        courseName = parent.getItemAtPosition(i).toString();
        Toast.makeText(parent.getContext(), courseName, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}