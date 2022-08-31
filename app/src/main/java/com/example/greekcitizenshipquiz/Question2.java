package com.example.greekcitizenshipquiz;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.GRAY;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.graphics.Color.WHITE;
import static android.graphics.Color.YELLOW;
import static android.graphics.Color.blue;
import static android.graphics.Color.colorSpace;
import static android.graphics.Color.convert;
import static android.graphics.Color.green;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.hardware.camera2.params.BlackLevelPattern;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Question2 extends AppCompatActivity {

    private Button button25,button26;

    TextView textView;TextView textView2;TextView textView3;TextView textView4;TextView textView5;
    TextView textView6;TextView textView7;TextView textView8;TextView textView9;TextView textView10;
    TextView textView11;TextView textView12;TextView textView13;TextView textView14;TextView textView15;
    TextView textView16;TextView textView17;TextView textView18;TextView textView19;TextView textView20;
    TextView textView21;TextView textView22;TextView textView23;TextView textView24;TextView textView25;


    EditText inputText;EditText inputText2;EditText inputText3;EditText inputText4;EditText inputText5;
    EditText inputText6;EditText inputText7;EditText inputText8;EditText inputText9;EditText inputText10;
    EditText inputText11;EditText inputText12;EditText inputText13;EditText inputText14;EditText inputText15;
    EditText inputText16;EditText inputText17;EditText inputText18;EditText inputText19;EditText inputText20;
    EditText inputText21;EditText inputText22;EditText inputText23;EditText inputText24;EditText inputText25;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        button25=findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Question2.this,geografi_questions.class);
                startActivity(intent);
            }
        });

        button26=findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Question2.this,Question2.class);
                startActivity(intent);
            }
        });



        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView10 = (TextView) findViewById(R.id.textView10);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView12 = (TextView) findViewById(R.id.textView12);
        textView13 = (TextView) findViewById(R.id.textView13);
        textView14 = (TextView) findViewById(R.id.textView14);
        textView15 = (TextView) findViewById(R.id.textView15);
        textView16 = (TextView) findViewById(R.id.textView16);
        textView17 = (TextView) findViewById(R.id.textView17);
        textView18 = (TextView) findViewById(R.id.textView18);
        textView19 = (TextView) findViewById(R.id.textView19);
        textView20 = (TextView) findViewById(R.id.textView20);
        textView21 = (TextView) findViewById(R.id.textView21);
        textView22 = (TextView) findViewById(R.id.textView22);
        textView23 = (TextView) findViewById(R.id.textView23);
        textView24 = (TextView) findViewById(R.id.textView24);






        inputText = (EditText) findViewById(R.id.inputText);
        inputText2 = (EditText) findViewById(R.id.inputText2);
        inputText3 = (EditText) findViewById(R.id.inputText3);
        inputText4 = (EditText) findViewById(R.id.inputText4);
        inputText5 = (EditText) findViewById(R.id.inputText5);
        inputText6 = (EditText) findViewById(R.id.inputText6);
        inputText7 = (EditText) findViewById(R.id.inputText7);
        inputText8 = (EditText) findViewById(R.id.inputText8);
        inputText9 = (EditText) findViewById(R.id.inputText9);
        inputText10 = (EditText) findViewById(R.id.inputText10);
        inputText11 = (EditText) findViewById(R.id.inputText11);
        inputText12 = (EditText) findViewById(R.id.inputText12);
        inputText13 = (EditText) findViewById(R.id.inputText13);
        inputText14 = (EditText) findViewById(R.id.inputText14);
        inputText15 = (EditText) findViewById(R.id.inputText15);
        inputText16 = (EditText) findViewById(R.id.inputText16);
        inputText17 = (EditText) findViewById(R.id.inputText17);
        inputText18 = (EditText) findViewById(R.id.inputText18);
        inputText19 = (EditText) findViewById(R.id.inputText19);
        inputText20 = (EditText) findViewById(R.id.inputText20);
        inputText21 = (EditText) findViewById(R.id.inputText21);
        inputText22 = (EditText) findViewById(R.id.inputText22);
        inputText23 = (EditText) findViewById(R.id.inputText23);
        inputText24 = (EditText) findViewById(R.id.inputText24);






    }

    public void updaText1(View view){

        textView.setText("Το σωστό είναι Ο Άγιος Νικόλαος.");
        textView.setTextColor(Color.BLUE);
        inputText.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText2(View view){

        textView2.setText("Το σωστό είναι Μυτιλήνη.");
        textView2.setTextColor(Color.BLUE);
        inputText2.setTextColor(GRAY);

        System.out.println("Button2 clicked");


    }
    public void updaText3(View view){
        textView3.setText("Το σωστό είναι Ερμούπολη.");
        textView3.setTextColor(Color.BLUE);
        inputText3.setTextColor(GRAY);

        System.out.println("Button3 clicked");


    }
    public void updaText4(View view){

        textView4.setText("Το σωστό είναι Ηγουμενίτσα.");
        textView4.setTextColor(Color.BLUE);
        inputText4.setTextColor(GRAY);

        System.out.println("Button4 clicked");
    }

    public void updaText5(View view){

        textView5.setText("Το σωστό είναι Κορινθίας.");
        textView5.setTextColor(Color.BLUE);
        inputText5.setTextColor(GRAY);

        System.out.println("Button5 clicked");

    }

    public void updaText6(View view){

        textView6.setText("Το σωστό είναι Αχαΐας.");
        textView6.setTextColor(Color.BLUE);
        inputText6.setTextColor(GRAY);

        System.out.println("Button6 clicked");
    }

    public void updaText7(View view){

        textView7.setText("Το σωστό είναι Αιτωλοακαρνανίας.");
        textView7.setTextColor(Color.BLUE);
        inputText7.setTextColor(GRAY);

        System.out.println("Button7 clicked");

    }

    public void updaText8(View view){

        textView8.setText("Το σωστό είναι Πρέβεζας.");
        textView8.setTextColor(Color.BLUE);
        inputText8.setTextColor(GRAY);

        System.out.println("Button8 clicked");

    }

    public void updaText9(View view){

        textView9.setText("Το σωστό είναι Αχαΐας.");
        textView9.setTextColor(Color.BLUE);
        inputText9.setTextColor(GRAY);

        System.out.println("Button9 clicked");
    }

    public void updaText10(View view){

        textView10.setText("Το σωστό είναι Θεσσαλονίκης.");
        textView10.setTextColor(Color.BLUE);
        inputText10.setTextColor(GRAY);

        System.out.println("Button10 clicked");

    }

    public void updaText11(View view){

        textView11.setText("Το σωστό είναι Ευρυτανίας.");
        textView11.setTextColor(Color.BLUE);
        inputText11.setTextColor(GRAY);

        System.out.println("Button11 clicked");
    }

    public void updaText12(View view){

        textView12.setText("Το σωστό είναι Μεσσηνίας.");
        textView12.setTextColor(Color.BLUE);
        inputText12.setTextColor(GRAY);

        System.out.println("Button12 clicked");

    }
    public void updaText13(View view){

        textView13.setText("Το σωστό είναι Φθιώτιδας.");
        textView13.setTextColor(Color.BLUE);
        inputText13.setTextColor(GRAY);

        System.out.println("Button13 clicked");

    }
    public void updaText14(View view){

        textView14.setText("Το σωστό είναι Ηλείας.");
        textView14.setTextColor(Color.BLUE);
        inputText14.setTextColor(GRAY);

        System.out.println("Button14 clicked");

    }
    public void updaText15(View view){

        textView15.setText("Το σωστό είναι Λασθίου.");
        textView15.setTextColor(Color.BLUE);
        inputText15.setTextColor(GRAY);

        System.out.println("Button15 clicked");

    }
    public void updaText16(View view){

        textView16.setText("Το σωστό είναι Μαγνησίας.");
        textView16.setTextColor(Color.BLUE);
        inputText16.setTextColor(GRAY);

        System.out.println("Button16 clicked");

    }
    public void updaText17(View view){

        textView17.setText("Το σωστό είναι Χαλκίδα.");
        textView17.setTextColor(Color.BLUE);
        inputText17.setTextColor(GRAY);

        System.out.println("Button17 clicked");

    }
    public void updaText18(View view){

        textView18.setText("Το σωστό είναι Ναύπλιο.");
        textView18.setTextColor(Color.BLUE);
        inputText18.setTextColor(GRAY);

        System.out.println("Button18 clicked");

    }
    public void updaText19(View view){

        textView19.setText("Το σωστό είναι Σπάρτη.");
        textView19.setTextColor(Color.BLUE);
        inputText19.setTextColor(GRAY);

        System.out.println("Button19 clicked");

    }
    public void updaText20(View view){

        textView20.setText("Το σωστό είναι Πολύγυρος.");
        textView20.setTextColor(Color.BLUE);
        inputText20.setTextColor(GRAY);

        System.out.println("Button20 clicked");

    }
    public void updaText21(View view){

        textView21.setText("Το σωστό είναι Αιτωλοακαρνανίας.");
        textView21.setTextColor(Color.BLUE);
        inputText21.setTextColor(GRAY);

        System.out.println("Button21 clicked");

    }
    public void updaText22(View view){

        textView22.setText("Το σωστό είναι Θεσσαλονίκης.");
        textView22.setTextColor(Color.BLUE);
        inputText22.setTextColor(GRAY);

        System.out.println("Button22 clicked");

    }
    public void updaText23(View view){

        textView23.setText("Το σωστό είναι Βοιωτίας.");
        textView23.setTextColor(Color.BLUE);
        inputText23.setTextColor(GRAY);

        System.out.println("Button23 clicked");

    }
    public void updaText24(View view){

        textView24.setText("Το σωστό είναι Κιλκίς.");
        textView24.setTextColor(Color.BLUE);
        inputText24.setTextColor(GRAY);

        System.out.println("Button24 clicked");


    }


}