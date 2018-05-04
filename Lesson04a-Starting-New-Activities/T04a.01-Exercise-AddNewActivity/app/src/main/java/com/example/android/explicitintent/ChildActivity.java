package com.example.android.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    private TextView textViewChild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        // Do steps 6 & 7 in ChildActivity.java
        // TODO (6) Create a TextView field to display your message
        // TODO (7) Get a reference to your TextView in Java
        textViewChild = (TextView) findViewById(R.id.tv_display);

        Intent intentReceived = getIntent();

        if (intentReceived.hasExtra("data")) {
            String inputName = intentReceived.getStringExtra("data");
            if (inputName != null && !inputName.equals("")) {
                Log.i(ChildActivity.class.getSimpleName(), inputName);
                textViewChild.setText(inputName);
            }
        }


    }




}
