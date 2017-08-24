package com.example.admin.asssetbooking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FirstScreenActivity extends AppCompatActivity {

    ImageButton iBProfile, iBFaq,iBAbout, iBCategory,  iBNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        iBProfile = (ImageButton)findViewById(R.id.iBProfile);
        iBFaq = (ImageButton)findViewById(R.id.iBFaq);
        iBAbout = (ImageButton)findViewById(R.id.iBAbout);
        iBCategory = (ImageButton)findViewById(R.id.iBCategory);
        iBNotification = (ImageButton)findViewById(R.id.iBNotification);


        iBProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent i = new Intent(FirstScreenActivity.this, ProfileActivity.class);
//                startActivity(i);
            }
        });

        iBFaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        iBAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        iBAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        iBCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        iBNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
