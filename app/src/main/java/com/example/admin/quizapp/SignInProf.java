package com.example.admin.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.quizapp.model.Profesor;

public class SignInProf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_prof);
    }

    public void signinActivity(View view){
        EditText email = (EditText)findViewById(R.id.mailSignIn);
        EditText password = (EditText)findViewById(R.id.passwordSignIn);
        Profesor profesor = new Profesor(email.getText().toString(), password.getText().toString());
        if(email.getText().toString().isEmpty() || password.getText().toString().isEmpty()) Toast.makeText(this, "Complete all the fields!", Toast.LENGTH_LONG).show();
        else {
            Intent intent = new Intent(this, Welcome.class);
            intent.putExtra("prof", profesor);
            startActivity(intent);
        }
    }
}
