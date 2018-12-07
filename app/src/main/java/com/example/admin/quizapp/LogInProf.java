package com.example.admin.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LogInProf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_prof);
    }

    public void loginActivity(View view){
        EditText email = (EditText)findViewById(R.id.emailText);
        EditText pass = (EditText)findViewById(R.id.password);
        if(email.getText().toString().isEmpty() || pass.getText().toString().isEmpty()) Toast.makeText(this, "Complete every field!", Toast.LENGTH_LONG).show();
        else
        {
            Intent intent = new Intent(this, Welcome.class);
            intent.putExtra("emailProf",email.getText().toString()); // trimite date in plus intent-ului
            startActivity(intent);
            this.finish();
        }
    }

    public void signinActivity(View view){
        Intent intent =  new Intent(this, SignInProf.class);
        startActivity(intent);
    }

}
