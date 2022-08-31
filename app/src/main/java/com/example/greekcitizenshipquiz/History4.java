package com.example.greekcitizenshipquiz;

import static android.graphics.Color.GRAY;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class History4 extends AppCompatActivity {

    TextView textView88,textView89,textView90,textView91,textView92,textView93,textView94,textView95,
            textView96,textView97,textView98,textView99,textView100,textView101,textView102,textView103,
    textView104,textView105,textView106,textView107,textView108,textView109,textView110,textView111,textView112;



    EditText editTextTextPersonName,editTextTextPersonName2,editTextTextPersonName3,editTextTextPersonName4,
            editTextTextPersonName5,editTextTextPersonName6,editTextTextPersonName7,editTextTextPersonName8,
            editTextTextPersonName9,editTextTextPersonName10,editTextTextPersonName11,editTextTextPersonName12,
    editTextTextPersonName13,editTextTextPersonName14,editTextTextPersonName15,editTextTextPersonName16,
    editTextTextPersonName17,editTextTextPersonName18,editTextTextPersonName19,editTextTextPersonName20,
            editTextTextPersonName21,editTextTextPersonName22,editTextTextPersonName23,editTextTextPersonName24,
            editTextTextPersonName25;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history4);


        textView88 = (TextView) findViewById(R.id.textView88);textView89 = (TextView) findViewById(R.id.textView89);
        textView90 = (TextView) findViewById(R.id.textView90);textView91 = (TextView) findViewById(R.id.textView91);
        textView92 = (TextView) findViewById(R.id.textView92);textView93 = (TextView) findViewById(R.id.textView93);
        textView94 = (TextView) findViewById(R.id.textView94);textView95 = (TextView) findViewById(R.id.textView95);
        textView96 = (TextView) findViewById(R.id.textView96);textView97 = (TextView) findViewById(R.id.textView97);
        textView98 = (TextView) findViewById(R.id.textView98);textView99 = (TextView) findViewById(R.id.textView99);
        textView100 = (TextView) findViewById(R.id.textView100);textView101 = (TextView) findViewById(R.id.textView101);
        textView102 = (TextView) findViewById(R.id.textView102);textView103 = (TextView) findViewById(R.id.textView103);
        textView104 = (TextView) findViewById(R.id.textView104);textView105 = (TextView) findViewById(R.id.textView105);
        textView106 = (TextView) findViewById(R.id.textView106);textView107 = (TextView) findViewById(R.id.textView107);
        textView108 = (TextView) findViewById(R.id.textView108);textView109 = (TextView) findViewById(R.id.textView109);
        textView110 = (TextView) findViewById(R.id.textView110);textView111 = (TextView) findViewById(R.id.textView111);
        textView112 = (TextView) findViewById(R.id.textView112);





        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3 = (EditText) findViewById(R.id.editTextTextPersonName3);
        editTextTextPersonName4 = (EditText) findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5 = (EditText) findViewById(R.id.editTextTextPersonName5);
        editTextTextPersonName6 = (EditText) findViewById(R.id.editTextTextPersonName6);
        editTextTextPersonName7 = (EditText) findViewById(R.id.editTextTextPersonName7);
        editTextTextPersonName8 = (EditText) findViewById(R.id.editTextTextPersonName8);
        editTextTextPersonName9 = (EditText) findViewById(R.id.editTextTextPersonName9);
        editTextTextPersonName10 = (EditText) findViewById(R.id.editTextTextPersonName10);
        editTextTextPersonName11 = (EditText) findViewById(R.id.editTextTextPersonName11);
        editTextTextPersonName12 = (EditText) findViewById(R.id.editTextTextPersonName12);
        editTextTextPersonName13 = (EditText) findViewById(R.id.editTextTextPersonName13);
        editTextTextPersonName14 = (EditText) findViewById(R.id.editTextTextPersonName14);
        editTextTextPersonName15 = (EditText) findViewById(R.id.editTextTextPersonName15);
        editTextTextPersonName17 = (EditText) findViewById(R.id.editTextTextPersonName17);
        editTextTextPersonName18 = (EditText) findViewById(R.id.editTextTextPersonName18);
        editTextTextPersonName19 = (EditText) findViewById(R.id.editTextTextPersonName19);
        editTextTextPersonName20 = (EditText) findViewById(R.id.editTextTextPersonName20);
        editTextTextPersonName21 = (EditText) findViewById(R.id.editTextTextPersonName21);
        editTextTextPersonName22 = (EditText) findViewById(R.id.editTextTextPersonName22);
        editTextTextPersonName23 = (EditText) findViewById(R.id.editTextTextPersonName23);
        editTextTextPersonName24 = (EditText) findViewById(R.id.editTextTextPersonName24);
        editTextTextPersonName25 = (EditText) findViewById(R.id.editTextTextPersonName25);




    }

    public void updaText1(View view){

        textView88.setText("Απαντήσεις:\n" +
                "1. Οι αρματολοί ήταν ένοπλα σώματα που οργάνωνε η οθωμανική\n" +
                "διοίκηση την περίοδο της Τουρκοκρατίας για την τήρηση της τάξης.\n" +
                "Συχνά, όμως, οι αρματολοί γίνονταν κλέφτες ή και το αντίστροφο.\n" +
                "2. Μεγάλη Ελλάδα ονομάστηκε η Κάτω Ιταλία (Νότια Ιταλία), γιατί εκεί,\n" +
                "τον 8ο π.Χ. αιώνα, κατά τον Β΄ αποικισμό, οι Έλληνες ίδρυσαν πάρα\n" +
                "πολλές αποικίες, δηλαδή ελληνικές πόλεις.");
        textView88.setTextColor(Color.BLUE);
        editTextTextPersonName.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText2(View view){

        textView89.setText("Απάντηση:\n" +
                "Το 1922, μετά τον Α ́ Παγκόσμιο Πόλεμο, συνέβη η Μικρασιατική\n" +
                "καταστροφή.");
        textView89.setTextColor(Color.BLUE);
        editTextTextPersonName2.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText3(View view){

        textView90.setText("Απαντήσεις:\n" +
                "1. Από το 1951 έως το 1967 το μεγαλύτερο νόμιμο κόμμα της\n" +
                "Αριστεράς ήταν η Ενιαία -Δημοκρατική- Αριστερά (ΕΔΑ).");
        textView90.setTextColor(Color.BLUE);
        editTextTextPersonName3.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText4(View view){

        textView91.setText("Στη -Χαιρώνεια- ο στρατός του Φιλίππου Β ́ της Μακεδονίας\n" +
                "νίκησε τον ενωμένο στρατό Αθηναίων και Θηβαίων.");
        textView91.setTextColor(Color.BLUE);
        editTextTextPersonName4.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText5(View view){

        textView92.setText("Τον 9ο αιώνα οι -Σαρακηνοί/Άραβες- κατέλαβαν την Κρήτη και ίδρυσαν\n" +
                "εκεί εμιράτο.");
        textView92.setTextColor(Color.BLUE);
        editTextTextPersonName5.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText6(View view){

        textView93.setText("Ο Αδαμάντιος -Κοραής- είναι ένας από τους σημαντικότερους\n" +
                "εκπροσώπους του Νεοελληνικού Διαφωτισμού.");
        textView93.setTextColor(Color.BLUE);
        editTextTextPersonName6.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText7(View view){

        textView94.setText("Ο «Χρυσός Αιώνας» σχετίζεται με τη διακυβέρνηση της Αθηναϊκής\n" +
                "Δημοκρατίας από τον -Περικλή-.");
        textView94.setTextColor(Color.BLUE);
        editTextTextPersonName7.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText8(View view){

        textView95.setText("Το 390 μ.Χ. ο ρωμαίος αυτοκράτορας Θεοδόσιος Α΄/Μέγας\n" +
                "Θεοδόσιος- διέταξε τη σφαγή τουλάχιστον 7.000 -Θεσσαλονικέων στο\n" +
                "ιπποδρόμιο της πόλης.");
        textView95.setTextColor(Color.BLUE);
        editTextTextPersonName8.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText9(View view){

        textView96.setText("Ο αρχιστράτηγος της Ελληνικής Επανάστασης που έμεινε γνωστός ως\n" +
                "«γέρος του Μοριά» ήταν ο -Θεόδωρος Κολοκοτρώνης-.");
        textView96.setTextColor(Color.BLUE);
        editTextTextPersonName9.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText10(View view){

        textView97.setText("Ιδρυτής της ΕΡΕ ήταν ο -Κωνσταντίνος Καραμανλής-.");
        textView97.setTextColor(Color.BLUE);
        editTextTextPersonName10.setTextColor(GRAY);

        System.out.println("Button clicked");


    }
    public void updaText11(View view){

        textView98.setText("Τον εκσυγχρονισμό της Ελλάδας τον 19ο αι. προώθησε κυρίως ο\n" +
                "πρωθυπουργός -Χαρίλαος Τρικούπης-.");
        textView98.setTextColor(Color.BLUE);
        editTextTextPersonName11.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText12(View view){

        textView99.setText("Η βαλκανική συνεργασία εναντίον της Οθωμανικής Αυτοκρατορίας\n" +
                "στις αρχές του 20ου αι. διευκολύνθηκε από τον έλληνα πρωθυπουργό\n" +
                "-Ελευθέριο Βενιζέλο-.");
        textView99.setTextColor(Color.BLUE);
        editTextTextPersonName12.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText13(View view){

        textView100.setText("Την εκστρατεία των Ελλήνων εναντίον των Περσών οδήγησε ο\n" +
                "βασιλιάς -Αλέξανδρος Γ΄ ο Μακεδών/Μέγας Αλέξανδρος-.");
        textView100.setTextColor(Color.BLUE);
        editTextTextPersonName13.setTextColor(GRAY);

        System.out.println("Button clicked");

    }

    public void updaText14(View view){

        textView101.setText("Ηρωίδα της Ελληνικής Επανάστασης ήταν η καπετάνισσα από τις\n" +
                "Σπέτσες Λασκαρίνα Μπουμπουλίνα.");
        textView101.setTextColor(Color.BLUE);
        editTextTextPersonName14.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText15(View view){

        textView102.setText("Σάρισα ήταν ένα δόρυ, μεγάλο σε μήκος, που χρησιμοποιούσε στην\n" +
                "αρχαιότητα η μακεδονική φάλαγγα.");
        textView102.setTextColor(Color.BLUE);
        editTextTextPersonName15.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText16(View view){

        textView103.setText("Στάση του Νίκα ήταν η εξέγερση εναντίον του Ιουστινιανού Α΄ το 532\n" +
                "στην Κωνσταντινούπολη, που ξεκίνησε από σύγκρουση οπαδών ομάδων\n" +
                "στο ιπποδρόμιο.");
        textView103.setTextColor(Color.BLUE);
        editTextTextPersonName16.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText17(View view){

        textView104.setText("Απέλλα ήταν η γενική συνέλευση των πολιτών στην αρχαία Σπάρτη.");
        textView104.setTextColor(Color.BLUE);
        editTextTextPersonName17.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText18(View view){

        textView105.setText("Οι ακρίτες ήταν φύλακες στα βυζαντινά σύνορα («άκρα») στους\n" +
                "οποίους δωρίζονταν εκεί κτήματα, για να τα καλλιεργούν και να τα\n" +
                "υπερασπίζονται.");
        textView105.setTextColor(Color.BLUE);
        editTextTextPersonName18.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText19(View view){

        textView106.setText("Για τη συμμετοχή ή όχι της Ελλάδας στον Α΄ Παγκόσμιο Πόλεμο\n" +
                "υπήρξε διαφωνία μεταξύ του πρωθυπουργού και του βασιλιά\n" +
                "-Κωνσταντίνου Α-΄.");
        textView106.setTextColor(Color.BLUE);
        editTextTextPersonName19.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText20(View view){

        textView107.setText("Γνωστός για την ανατίναξη της τουρκικής ναυαρχίδας στη Χίο είναι ο\n" +
                "μπουρλοτιέρης -Κωνσταντίνος Κανάρης-.");
        textView107.setTextColor(Color.BLUE);
        editTextTextPersonName20.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText21(View view){

        textView108.setText("Μια σημαντική συμβολική στιγμή Αντίστασης μέσα στην Κατοχή\n" +
                "ήταν, όταν δύο νεαροί πατριώτες, -ο Μανώλης Γλέζος- και (4) ο\n" +
                "-Απόστολος (Λάκης) Σάντας-, απομάκρυναν τη γερμανική σημαία από την\n" +
                "Ακρόπολη.");
        textView108.setTextColor(Color.BLUE);
        editTextTextPersonName21.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText22(View view){

        textView109.setText("Ένα άρμα μάχης έριξε την κεντρική πύλη του Πολυτεχνείου τα\n" +
                "ξημερώματα της 17ης -Νοεμβρίου- 1973.");
        textView109.setTextColor(Color.BLUE);
        editTextTextPersonName22.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText23(View view){

        textView110.setText("Ο «οστρακισμός» ήταν μέτρο που θέσπισε στην αρχαία Αθήνα ο\n" +
                "-Κλεισθένης-, προκειμένου να εξορίζεται προληπτικά όποιος θεωρούνταν\n" +
                "επικίνδυνος για τη δημοκρατία.");
        textView110.setTextColor(Color.BLUE);
        editTextTextPersonName23.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText24(View view){

        textView111.setText("Ο λόρδος -Βύρων/Μπάιρον- ήταν γνωστός άγγλος φιλέλληνας, που\n" +
                "πέθανε κατά τη διάρκεια της Ελληνικής Επανάστασης στο Μεσολόγγι.");
        textView111.setTextColor(Color.BLUE);
        editTextTextPersonName24.setTextColor(GRAY);

        System.out.println("Button clicked");

    }
    public void updaText25(View view){

        textView112.setText("Οι πολύνεκρες συγκρούσεις στην Αθήνα τον Δεκέμβριο του 1944\n" +
                "ανάμεσα στον ΕΛΑΣ και τις κυβερνητικές δυνάμεις, που υποστηρίζονταν\n" +
                "από τον βρετανικό στρατό, ονομάστηκαν -«Δεκεμβριανά»-.");
        textView112.setTextColor(Color.BLUE);
        editTextTextPersonName25.setTextColor(GRAY);

        System.out.println("Button clicked");

    }

}

