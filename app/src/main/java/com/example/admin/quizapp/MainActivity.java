package com.example.admin.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void check1(View view){
        CheckBox ch = (CheckBox) findViewById(R.id.checkBoxStud);
        CheckBox ch2 = (CheckBox) findViewById(R.id.checkBoxProf);
        if(ch2.isChecked()){
            ch2.setChecked(false);
            ch.setChecked(true);
        }
    }
    public void check2(View view){
        CheckBox ch = (CheckBox) findViewById(R.id.checkBoxStud);
        CheckBox ch2 = (CheckBox) findViewById(R.id.checkBoxProf);
        if(ch.isChecked()){
            ch.setChecked(false);
            ch2.setChecked(true);
        }
    }
    public void login(View view){
        CheckBox checkBoxStud = (CheckBox)findViewById(R.id.checkBoxStud);
        CheckBox checkBoxProf = (CheckBox)findViewById(R.id.checkBoxProf);
        if(checkBoxProf.isChecked() == false && checkBoxStud.isChecked() == false ) Toast.makeText(this, "Alegeti un tip de login!", Toast.LENGTH_LONG).show();
        else if (checkBoxProf.isChecked()) {
            Intent intent = new Intent(MainActivity.this, LogInProf.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, LogInStud.class);
            startActivity(intent);
        }
    }
}
