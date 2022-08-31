package com.example.greekcitizenshipquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class History_Page extends AppCompatActivity {

    private LinearLayout history10,history11,history12,history13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_page);

        history10=findViewById(R.id.history10);
        history10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History_Page.this,History1.class);
                startActivity(intent);
            }
        });
        history11=findViewById(R.id.history11);
        history11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History_Page.this,History2.class);
                startActivity(intent);
            }
        });
        history12=findViewById(R.id.history12);
        history12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History_Page.this,History3.class);
                startActivity(intent);
            }
        });
        history13=findViewById(R.id.history13);
        history13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History_Page.this,History4.class);
                startActivity(intent);
            }
        });



    }

}