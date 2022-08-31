package com.example.greekcitizenshipquiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class History2 extends AppCompatActivity {


    private Button aswerBTN2;

    private TextView optionA,optionB,optionC,optionD;
    private TextView questionnumber,question,score;
    private TextView chechkout1,checkout2;
    int currentIndex;
    int mscore=0;
    int qn=1;
    ProgressBar progressBar;

    int CurrentQuestion,CurrentOptionA,CurrentOptionB,CurrentOptionC,CurrentOptionD;

    private answerclass[] questionBank= new answerclass[]{

            new answerclass(R.string.question_21,R.string.question_21A,R.string.question_21B,R.string.question_21C,R.string.question_21D,R.string.answer_21),
            new answerclass(R.string.question_22,R.string.question_22A,R.string.question_22B,R.string.question_22C,R.string.question_22D,R.string.answer_22),
            new answerclass(R.string.question_23,R.string.question_23A,R.string.question_23B,R.string.question_23C,R.string.question_23D,R.string.answer_23),
            new answerclass(R.string.question_24,R.string.question_24A,R.string.question_24B,R.string.question_24C,R.string.question_24D,R.string.answer_24),
            new answerclass(R.string.question_25,R.string.question_25A,R.string.question_25B,R.string.question_25C,R.string.question_25D,R.string.answer_25),
            new answerclass(R.string.question_26,R.string.question_26A,R.string.question_26B,R.string.question_26C,R.string.question_26D,R.string.answer_26),
            new answerclass(R.string.question_27,R.string.question_27A,R.string.question_27B,R.string.question_27C,R.string.question_27D,R.string.answer_27),
            new answerclass(R.string.question_28,R.string.question_28A,R.string.question_28B,R.string.question_28C,R.string.question_28D,R.string.answer_28),
            new answerclass(R.string.question_29,R.string.question_29A,R.string.question_29B,R.string.question_29C,R.string.question_29D,R.string.answer_29),
            new answerclass(R.string.question_30,R.string.question_30A,R.string.question_30B,R.string.question_30C,R.string.question_30D,R.string.answer_30),




    };

    final int PROGRESS_BAR = (int) Math.ceil(100/questionBank.length);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history2);

        aswerBTN2=findViewById(R.id.aswerBTN2);
        aswerBTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(History2.this,History_answer2.class);
                startActivity(intent);
            }
        });




        optionA=findViewById(R.id.optionA);
        optionB=findViewById(R.id.optionB);
        optionC=findViewById(R.id.optionC);
        optionD=findViewById(R.id.optionD);

        question=findViewById(R.id.question);
        score=findViewById(R.id.score);
        questionnumber=findViewById(R.id.QuestionNumber);

        chechkout1=findViewById(R.id.selectoption);
        checkout2=findViewById(R.id.CorrectAnswer);
        progressBar=findViewById(R.id.progress_bar);

        CurrentQuestion=questionBank[currentIndex].getQuestionid();
        question.setText(CurrentQuestion);
        CurrentOptionA=questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB=questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC=questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD=questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);



        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(CurrentOptionA);
                updateQuestion();

            }
        });
        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(CurrentOptionB);
                updateQuestion();

            }
        });
        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(CurrentOptionC);
                updateQuestion();

            }
        });
        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(CurrentOptionD);
                updateQuestion();



            }
        });



    }

    private void checkAnswer(int userSelection) {
        int correctanswer=questionBank[currentIndex].getAnswerid();

        chechkout1.setText(userSelection);
        checkout2.setText(correctanswer);

        String m= chechkout1.getText().toString().trim();
        String n= checkout2.getText().toString().trim();

        if (m.equals(n))
        {
            Toast.makeText(getApplicationContext(),"Απάντησες Σωστά",Toast.LENGTH_SHORT).show();
            mscore=mscore+1;
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Απάντησες Λάθος",Toast.LENGTH_SHORT).show();
        }




    }

    @SuppressLint("SetTextI18n")
    private void updateQuestion() {

        currentIndex=(currentIndex+1)%questionBank.length;

        if (currentIndex==0) {
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Game Over");
            alert.setCancelable(false);
            alert.setMessage("Your Score" + mscore + "points");
            alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }

            });
            alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    mscore = 0;
                    qn = 1;
                    progressBar.setProgress(0);
                    score.setText("Score" + mscore + "/" + questionBank.length);
                    questionnumber.setText(qn + "/" + questionBank.length + "Question");
                }
            });

            alert.show();

        }

        CurrentQuestion=questionBank[currentIndex].getQuestionid();
        question.setText(CurrentQuestion);
        CurrentOptionA=questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB=questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC=questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD=questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);

        qn=qn+1;

        if(qn<=questionBank.length)

        {
            questionnumber.setText(qn + "/" + questionBank.length +"Question");
        }
        score.setText("Score" + mscore +"/" +questionBank.length);
        progressBar.incrementProgressBy(PROGRESS_BAR);



    }
}