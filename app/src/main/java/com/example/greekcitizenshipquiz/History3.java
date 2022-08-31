package com.example.greekcitizenshipquiz;

import static android.graphics.Color.GRAY;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class History3 extends AppCompatActivity {


    private TextView textView73,textView74,textView75,textView77,textView79,textView80,textView81,textView82,
            textView84,textView85,textView86,textView87,textView90,textView91,textView92,textView93,textView95,
            textView96,textView97,textView98,textView100,textView101,textView102,textView103,textView105,textView106,
            textView107,textView108,textView110,textView111,textView112,textView113,textView115,textView116,textView117,textView118;

    private Button button35;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history3);

        button35=findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History3.this,History_Page.class);
                startActivity(intent);
            }
        });


        textView73=findViewById(R.id.textView73);
        textView73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView73.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });
        textView74=findViewById(R.id.textView74);
        textView74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView74.setBackgroundColor(Color.parseColor("#66f13d"));
                textView74.setTextColor(Color.BLUE);


            }
        });
        textView75=findViewById(R.id.textView75);
        textView75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView75.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });
        textView77=findViewById(R.id.textView77);
        textView77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView77.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });

        textView79=findViewById(R.id.textView79);
        textView79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView79.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });
        textView80=findViewById(R.id.textView80);
        textView80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView80.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });
        textView81=findViewById(R.id.textView81);
        textView81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView81.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });
        textView82=findViewById(R.id.textView82);
        textView82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView82.setBackgroundColor(Color.parseColor("#66f13d"));
                textView82.setTextColor(Color.BLUE);

            }
        });

        textView84=findViewById(R.id.textView84);
        textView84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView84.setBackgroundColor(Color.parseColor("#66f13d"));
                textView84.setTextColor(Color.BLUE);

            }
        });
        textView85=findViewById(R.id.textView85);
        textView85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView85.setBackgroundColor(Color.parseColor("#f56d6d"));


            }
        });
        textView86=findViewById(R.id.textView86);
        textView86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView86.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });
        textView87=findViewById(R.id.textView87);
        textView87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView87.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });

        textView90=findViewById(R.id.textView90);
        textView90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView90.setBackgroundColor(Color.parseColor("#66f13d"));
                textView90.setTextColor(Color.BLUE);

            }
        });
        textView91=findViewById(R.id.textView91);
        textView91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView91.setBackgroundColor(Color.parseColor("#f56d6d"));


            }
        });
        textView92=findViewById(R.id.textView92);
        textView92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView92.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });
        textView93=findViewById(R.id.textView93);
        textView93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView93.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });

        textView95=findViewById(R.id.textView95);
        textView95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView95.setBackgroundColor(Color.parseColor("#f56d6d"));


            }
        });
        textView96=findViewById(R.id.textView96);
        textView96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView96.setBackgroundColor(Color.parseColor("#f56d6d"));


            }
        });
        textView97=findViewById(R.id.textView97);
        textView97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView97.setBackgroundColor(Color.parseColor("#66f13d"));
                textView97.setTextColor(Color.BLUE);

            }
        });
        textView98=findViewById(R.id.textView98);
        textView98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView98.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });

        textView100=findViewById(R.id.textView100);
        textView100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView100.setBackgroundColor(Color.parseColor("#f56d6d"));


            }
        });
        textView101=findViewById(R.id.textView101);
        textView101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView101.setBackgroundColor(Color.parseColor("#f56d6d"));


            }
        });
        textView102=findViewById(R.id.textView102);
        textView102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView102.setBackgroundColor(Color.parseColor("#f56d6d"));


            }
        });
        textView103=findViewById(R.id.textView103);
        textView103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView103.setBackgroundColor(Color.parseColor("#66f13d"));
                textView103.setTextColor(Color.BLUE);


            }
        });

        textView105=findViewById(R.id.textView105);
        textView105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView105.setBackgroundColor(Color.parseColor("#66f13d"));
                textView105.setTextColor(Color.BLUE);


            }
        });
        textView106=findViewById(R.id.textView106);
        textView106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView106.setBackgroundColor(Color.parseColor("#f56d6d"));


            }
        });
        textView107=findViewById(R.id.textView107);
        textView107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView107.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });
        textView108=findViewById(R.id.textView108);
        textView108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView108.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });

        textView110=findViewById(R.id.textView110);
        textView110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView110.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });
        textView111=findViewById(R.id.textView111);
        textView111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView111.setBackgroundColor(Color.parseColor("#f56d6d"));


            }
        });
        textView112=findViewById(R.id.textView112);
        textView112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView112.setBackgroundColor(Color.parseColor("#66f13d"));
                textView112.setTextColor(Color.BLUE);

            }
        });
        textView113=findViewById(R.id.textView113);
        textView113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView113.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });



        textView115=findViewById(R.id.textView115);
        textView115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView115.setBackgroundColor(Color.parseColor("#f56d6d"));

            }
        });
        textView116=findViewById(R.id.textView116);
        textView116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView116.setBackgroundColor(Color.parseColor("#f56d6d"));


            }
        });
        textView117=findViewById(R.id.textView117);
        textView117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView117.setBackgroundColor(Color.parseColor("#f56d6d"));


            }
        });
        textView118=findViewById(R.id.textView118);
        textView118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView118.setBackgroundColor(Color.parseColor("#66f13d"));
                textView118.setTextColor(Color.BLUE);


            }
        });







    }


}