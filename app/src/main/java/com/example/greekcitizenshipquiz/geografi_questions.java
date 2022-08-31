package com.example.greekcitizenshipquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;

public class geografi_questions extends AppCompatActivity {

    private LinearLayout geografi24;
    private LinearLayout geografi10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geografi_questions);


        LinearLayout changeActivityBTN = findViewById(R.id.geografi72);



        changeActivityBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();

            }
        });

        geografi24=findViewById(R.id.geografi24);
        geografi24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(geografi_questions.this,Question2.class);
                startActivity(intent);
            }
        });
        geografi10=findViewById(R.id.qeografi10);
        geografi10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(geografi_questions.this,geografi2.class);
                startActivity(intent);
            }
        });




    }
    private void changeActivity(){
        Intent intent = new Intent(this,geograf.class);
        startActivity(intent);


    }


}