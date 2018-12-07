package com.example.admin.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.admin.quizapp.adapters.RecycleViewAdapter;
import com.example.admin.quizapp.model.Intrebare;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Questions_Prof extends AppCompatActivity {


    private static final String JSON_URL = "https://webtech-2018-paunstefan101.c9users.io/json";
    private JsonArrayRequest request;
    private RequestQueue requestQueue;
    private List<Intrebare> listaIntrebare;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_questions__prof);


        String nr_intrebari = getIntent().getStringExtra("nr_intrebari1");


        listaIntrebare = new ArrayList<>();
        recyclerView = findViewById(R.id.intrebari_recycleview);

        jsonrequest();
    }

    private void jsonrequest() {

        request = new JsonArrayRequest(JSON_URL, new Response.Listener<JSONArray>() {


            @Override
            public void onResponse(JSONArray response) {

                JSONObject jsonObject = null;
                Toast.makeText(getApplicationContext(), String.valueOf(response),Toast.LENGTH_SHORT).show();

                for(int i=0;i<response.length();i++)
                {
                    //extra:
                    Toast.makeText(getApplicationContext(),String.valueOf(i),Toast.LENGTH_SHORT).show();


                    try {
                        jsonObject=response.getJSONObject(i);
                        Intrebare intreb = new Intrebare();

                        intreb.setText(jsonObject.getString("Text"));
                        intreb.setRaspuns1(jsonObject.getString("Raspuns1"));
                        intreb.setRaspuns2(jsonObject.getString("Raspuns2"));
                        intreb.setRaspuns3(jsonObject.getString("Raspuns3"));
                        intreb.setRaspuns4(jsonObject.getString("Raspuns4"));
                        //aici incerc sa fac ca si var raspuns corect sa primeasca ce trebuie citit din fisierul json
                        intreb.setRaspunsCorect(jsonObject.getString("RaspunsCorect"));

                        listaIntrebare.add(intreb);


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                //extra:
                Toast.makeText(getApplicationContext(),"Size of Liste "+String.valueOf(listaIntrebare.size()),Toast.LENGTH_SHORT).show();

                SetUpRecycler(listaIntrebare);

            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });


        requestQueue=Volley.newRequestQueue(Questions_Prof.this);
        requestQueue.add(request);

    }

    private void SetUpRecycler(List<Intrebare> lst) {


        RecycleViewAdapter myAdapter = new RecycleViewAdapter(this,lst);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //extra:
        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(myAdapter);
        Log.e("Zawe", String.valueOf(lst.size()));
        Log.e("ARIBA", String.valueOf(lst.size()));

    }

}
