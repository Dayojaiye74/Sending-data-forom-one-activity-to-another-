package com.dev_app.sendingdatatootheractivites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    //Declare the TextView variable

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView);

        //This will bring in your input from Activity 1 and Display it in Activity 2

        String getMsg = getIntent().getStringExtra("text");

        // It will be shown in the text view by writing the code below...
        textView.setText(getMsg);

    }
}
