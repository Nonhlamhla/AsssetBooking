package com.example.admin.asssetbooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {


    TextView textViewEmail, textViewPassword;
    EditText editTextEmail, editTextPassword;
    Button buttonLogin, buttonGooglePlus,buttonSignUp ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textViewEmail = (TextView)findViewById(R.id.textViewEmail);
        textViewPassword = (TextView)findViewById(R.id.textViewPassword);
        editTextEmail = (EditText)findViewById(R.id.editTextEmail);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);
        buttonLogin = (Button)   findViewById(R.id.buttonLogin);
        buttonGooglePlus = (Button)findViewById(R.id.buttonGooglePlus);
        buttonSignUp = (Button)findViewById(R.id.buttonSignUp);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, FirstScreenActivity.class);
                startActivity(i);
            }
        });
        buttonGooglePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //EXPLICIT INTENT

            }
        });
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
