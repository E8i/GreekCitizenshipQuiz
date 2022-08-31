package com.example.greekcitizenshipquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class geograf extends AppCompatActivity implements View.OnClickListener {


    private Button trueButton;
    private Button falseButton;
    private TextView questionTextView;
    private ImageButton prevButton;
    private ImageButton nextButton;
    private TextView countLabel;
    private TextView questionLabel;





    private int currentQuestionIndex = 0;


    private Question[] questionBank = new Question[]{
            new Question(R.string.question_declaration, true),
            new Question(R.string.question_temp, true),
            new Question(R.string.question_body, false),
            new Question(R.string.question_human, false),
            new Question(R.string.question_physics, true),
            new Question(R.string.question_spider, false),
            new Question(R.string.question_water, false),
            new Question(R.string.question_shark, false),
            new Question(R.string.question_electron, false),
            new Question(R.string.question_planet, false),
            new Question(R.string.question_ocean, false),
            new Question(R.string.question_kavalas, true),
            new Question(R.string.question_florinas, true),
            new Question(R.string.question_peloponnhso, false),
            new Question(R.string.question_aitoloakarnanias,true),
            new Question(R.string.question_thrakhs,true),
            new Question(R.string.question_makedonia,true),
            new Question(R.string.question_ellada,false),
            new Question(R.string.question_thessalias,true),
            new Question(R.string.question_naupaktos,true),
            new Question(R.string.question_olybos,true),
            new Question(R.string.question_voras,false),
            new Question(R.string.question_idh,false),
            new Question(R.string.question_galaksidi,true),
            new Question(R.string.question_atalanth,true),
            new Question(R.string.question_parnonas,true),
            new Question(R.string.question_kithaironas,false),
            new Question(R.string.question_elikonas,true),
            new Question(R.string.question_paggaio,false),
            new Question(R.string.question_kalabaka,true),
            new Question(R.string.question_plasthra,true),
            new Question(R.string.question_orestiada,true),
            new Question(R.string.question_ormenio,true),
            new Question(R.string.question_gaydos,false),
            new Question(R.string.question_nhsiotiko,true),
            new Question(R.string.question_fanoi,true),
            new Question(R.string.question_aliakmonas,true),
            new Question(R.string.question_aksios,false),
            new Question(R.string.question_axelos,true),
            new Question(R.string.question_phneios,true),
            new Question(R.string.question_krhth,true),
            new Question(R.string.question_pente,false),
            new Question(R.string.question_thessalia,true),
            new Question(R.string.question_sterea,false),
            new Question(R.string.question_kasos,true),
            new Question(R.string.question_astypalaia,true),
            new Question(R.string.question_ithakh,true),
            new Question(R.string.question_paksoi,true),
            new Question(R.string.question_aoos,false),
            new Question(R.string.question_potamoi,true),
            new Question(R.string.question_ionio,true),
            new Question(R.string.question_pelagos,true),
            new Question(R.string.question_limnes,false),
            new Question(R.string.question_pamvotida,true),
            new Question(R.string.question_gnostoterh,true),
            new Question(R.string.question_kyriotera,true),
            new Question(R.string.question_patra,true),
            new Question(R.string.question_leykada,true),
            new Question(R.string.question_euboia,false),
            new Question(R.string.question_trikala,false),
            new Question(R.string.question_porthmos,true),
            new Question(R.string.question_podophs,true),
            new Question(R.string.question_biotias,false),
            new Question(R.string.question_elladas,true),
            new Question(R.string.question_aigaio,true),
            new Question(R.string.question_ydra,false),
            new Question(R.string.question_boreies,true),
            new Question(R.string.question_psara,true),
            new Question(R.string.question_Xora,true),
            new Question(R.string.question_upedafos,true),
            new Question(R.string.question_megalytero,true),
            new Question(R.string.question_megalyteres,false)


    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geograf);





        falseButton = findViewById(R.id.false_button);
        trueButton = findViewById(R.id.ture_button);
        questionTextView = findViewById(R.id.answer_text_view);
        prevButton =findViewById(R.id.prev_button);
        nextButton = findViewById(R.id.next_button);





        trueButton.setOnClickListener(this);
        falseButton.setOnClickListener(this);
        prevButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.ture_button:
                checkAnswer(true);
                break;

            case R.id.false_button:
                checkAnswer(false);
                break;

            case R.id.next_button:
                currentQuestionIndex = (currentQuestionIndex + 1)% questionBank.length;
                updateQuestion();
                break;

            case R.id.prev_button:
                if (currentQuestionIndex > 0 ){
                    currentQuestionIndex = (currentQuestionIndex - 1)% questionBank.length;
                    updateQuestion();

                }
                break;





        }
        ArrayList<String> tmpArray = new ArrayList<>();



    }
    private void updateQuestion(){
        Log.d("current","onclick" + currentQuestionIndex);
        questionTextView.setText(questionBank[currentQuestionIndex].getAnswerResId());

    }

    private void checkAnswer(boolean userChoosenCorrect) {
        boolean answerIsTrue = questionBank[currentQuestionIndex].isAnswerTrue();






        int toastMessageId = 0;
        if (userChoosenCorrect == answerIsTrue) {
            toastMessageId = R.string.correct_answer;
        } else {
            toastMessageId = R.string.wrong_answer;
        }

        Toast.makeText(geograf.this, toastMessageId, Toast.LENGTH_SHORT).show();


    }



}