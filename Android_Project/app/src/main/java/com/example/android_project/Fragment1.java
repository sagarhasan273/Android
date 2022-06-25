package com.example.android_project;


import android.os.Bundle;


import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Fragment1 extends Fragment implements AdapterView.OnItemSelectedListener{
    EditText nameFragEdit, idFragEdit;
    TextView textView;
    Button okay1Btn;
    static String nameText, idText;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        textView = view.findViewById(R.id.dataObtained);
        idFragEdit = view.findViewById(R.id.studentIdEditText);
        okay1Btn = view.findViewById(R.id.okayBtn1);
        nameFragEdit = view.findViewById(R.id.studentNameEditText);
        okay1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nameText = nameFragEdit.getText().toString();
                idText = idFragEdit.getText().toString();
                textView.setText("Data Obtained!");
            }
        });
        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}