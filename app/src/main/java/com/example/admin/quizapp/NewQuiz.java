package com.example.admin.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;


public class NewQuiz extends AppCompatActivity  {

    private Spinner Spinner_nr_questions;
    private Button Create_questions_btn;
    public String nr_intrebari1="";


    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_quiz);


        Spinner_nr_questions = (Spinner)findViewById(R.id.spinner_nr_questions);
        Create_questions_btn = (Button)findViewById(R.id.create_questions_btn);


        Spinner_nr_questions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long l) {

                nr_intrebari1 = parent.getItemAtPosition(pos).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Create_questions_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent open_questions_prof = new Intent(getApplicationContext(),Questions_Prof.class);
                open_questions_prof.putExtra("nr_intrebari1",nr_intrebari1);
                startActivity(open_questions_prof);
                finish();

            }
        });

    }

}
