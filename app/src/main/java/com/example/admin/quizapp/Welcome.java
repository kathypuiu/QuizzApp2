package com.example.admin.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.admin.quizapp.model.Profesor;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView edt = (TextView) findViewById(R.id.mesaj);

        String email_profesor = getIntent().getStringExtra("emailProf");
        if(email_profesor != null)
        {
            String mesaj1 = "Hello "+ email_profesor.toString()+ " !!! ";
            edt.setText(mesaj1);
        }
        else {


            Profesor prof = (Profesor) getIntent().getSerializableExtra("prof");
            String mesaj = "Welcome, " + prof.getEmail().toString() + "!";

            // TextView edt = (TextView) findViewById(R.id.mesaj);
            edt.setText(mesaj);
        }
    }

    public void createNewQuiz(View view){
        Intent intent = new Intent(getApplicationContext(), NewQuiz.class);
        startActivity(intent);
        this.finish();
    }

}
