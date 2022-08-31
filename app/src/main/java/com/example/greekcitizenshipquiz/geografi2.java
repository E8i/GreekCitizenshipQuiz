package com.example.greekcitizenshipquiz;

import static android.graphics.Color.GRAY;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class geografi2 extends AppCompatActivity {

    TextView textView25,textView26,textView27,textView28,textView29,textView30,textView31,textView32;



    EditText editTextTextMultiLine2;
    EditText editTextTextMultiLine3;
    EditText editTextTextMultiLine4;
    EditText editTextTextMultiLine5;
    EditText editTextTextMultiLine6;
    EditText editTextTextMultiLine7;
    EditText editTextTextMultiLine8;
    EditText editTextTextMultiLine9;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geografi2);

        textView25 = (TextView) findViewById(R.id.textView25);textView26 = (TextView) findViewById(R.id.textView26);
        textView27 = (TextView) findViewById(R.id.textView27);textView28 = (TextView) findViewById(R.id.textView28);
        textView29 = (TextView) findViewById(R.id.textView29);textView31 = (TextView) findViewById(R.id.textView31);
        textView32 = (TextView) findViewById(R.id.textView32);





        editTextTextMultiLine2 = (EditText) findViewById(R.id.editTextTextMultiLine2);
        editTextTextMultiLine3 = (EditText) findViewById(R.id.editTextTextMultiLine3);
        editTextTextMultiLine4 = (EditText) findViewById(R.id.editTextTextMultiLine4);
        editTextTextMultiLine5 = (EditText) findViewById(R.id.editTextTextMultiLine5);
        editTextTextMultiLine6 = (EditText) findViewById(R.id.editTextTextMultiLine6);
        editTextTextMultiLine7 = (EditText) findViewById(R.id.editTextTextMultiLine7);
        editTextTextMultiLine8 = (EditText) findViewById(R.id.editTextTextMultiLine8);
        editTextTextMultiLine9 = (EditText) findViewById(R.id.editTextTextMultiLine9);



    }
    public void updaText1(View view){

        textView25.setText("Ενδεικτικά παραδείγματα:Αττικής,Δυτικής Ελλάδας,Πελοποννήσου,Ανατολικής Μακεδονία και Θράκης,Κρήτης,Νοτίου Αιγαίου");
        textView25.setTextColor(Color.BLUE);
        editTextTextMultiLine2.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText2(View view){

        textView26.setText("Απάντηση:Αττικής (Αθήνα), Θεσσαλονίκης (Θεσσαλονίκη), Αχαΐας (Πάτρα), Ηρακλείου (Ηράκλειο), Αιτωλοακαρνανίας (Μεσολόγγι).");
        textView26.setTextColor(Color.BLUE);
        editTextTextMultiLine3.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText3(View view){

        textView27.setText("Απάντηση:Νάξος – Άνδρος – Πάρος – Τήνος –\n" +
                "Μήλος – Κέα – Αμοργός – Ίος – Κύθνος – Μύκονος – Σύρος – Σαντορίνη –\n" +
                "Σέριφος – Σίφνος – Σίκινος – Ανάφη – Κίμωλος – Αντίπαρος – Φολέγανδρος –\n" +
                "Μακρόνησος – Πολύαιγος – Ηρακλειά – Γυάρος – Κέρος – Ρήνεια – Δονούσα –\n" +
                "Θηρασία – Σχοινούσα – Αντίμηλος – Δεσποτικό – Άνω Κουφονήσι – Κάτω\n" +
                "Κουφονήσι – Δήλος..");
        textView27.setTextColor(Color.BLUE);
        editTextTextMultiLine4.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText4(View view){

        textView28.setText("παραδείγματα:Τέσσερα (4) από τα εξής: Κρήτη, Γαύδος, Γαυδοπούλα, Άγιοι Θεόδωροι, Δία,\n" +
                "Χρυσή, Κουφονήσι, Διονυσάδες.");
        textView28.setTextColor(Color.BLUE);
        editTextTextMultiLine5.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText5(View view){

        textView29.setText("Απάντηση: Ενδεικτικά παραδείγματα: Τρικάλων, Ευρυτανίας, Γρεβενών,\n" +
                "Κιλκίς, Κοζάνης, Καστοριάς, Ιωαννίνων.");
        textView29.setTextColor(Color.BLUE);
        editTextTextMultiLine6.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText6(View view){

        textView30.setText("Αχαΐας,Αχαΐας, Αργολίδας, Μεσσηνίας,\n" +
                "Λακωνίας, Αττικής.");
        textView30.setTextColor(Color.BLUE);
        editTextTextMultiLine7.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText7(View view){

        textView31.setText("Όλυμπος, Χελμός, Σμόλικας, Παρνασσός,\n" +
                "Ψηλορείτης, Γκιώνα.");
        textView31.setTextColor(Color.BLUE);
        editTextTextMultiLine8.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText8(View view){

        textView32.setText("Τριχωνίδα, Βόλβη, Κερκίνη, Βιστωνίδα.");
        textView32.setTextColor(Color.BLUE);
        editTextTextMultiLine9.setTextColor(GRAY);

        System.out.println("Button clicked");


    }




}