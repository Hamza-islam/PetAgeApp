package com.hamza.petageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    public void ageCalculator(View view) {
//        int yearOfAge = 1990;
        EditText myEditText = (EditText) findViewById(R.id.editTextDate);
//        int userInput = Integer.parseInt(myEditText.getText().toString());
        TextView myTextView = (TextView) findViewById(R.id.textView);

        int petAge = Calendar.getInstance().get(Calendar.YEAR)- Integer.parseInt(myEditText.getText().toString());

        myTextView.setText(petAge+"");
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}