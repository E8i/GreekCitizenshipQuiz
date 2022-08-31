package com.example.greekcitizenshipquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public LinearLayout historyLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout changeActivityBTN = findViewById(R.id.geografiLayout);



        changeActivityBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();

            }
        });

        historyLayout = findViewById(R.id.historyLayout);
        historyLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,History_Page.class);
                startActivity(intent);
            }
        });


    }
    private void changeActivity(){
        Intent intent = new Intent(this,geografi_questions.class);
        startActivity(intent);

    }


}