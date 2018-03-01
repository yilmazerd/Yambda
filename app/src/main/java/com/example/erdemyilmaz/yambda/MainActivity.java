package com.example.erdemyilmaz.yambda;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonA;
    Button buttonB;
    Button buttonC;
    Button buttonD;
    Button buttonE;
    Button buttonOK;
    TextView questionText;
    private int selectedButton=1;
    private int qaID=1;
    QuizPage qp = new QuizPage();
    QuizAfterSurgery quizForThisPage = new QuizAfterSurgery();



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button buttonA =  findViewById(R.id.buttonUI_A);
        final Button buttonB =  findViewById(R.id.buttonUI_B);
        final Button buttonC =  findViewById(R.id.buttonUI_C);
        final Button buttonD =  findViewById(R.id.buttonUI_D);
        final Button buttonE =  findViewById(R.id.buttonUI_E);
        final Button buttonOK = findViewById(R.id.buttonOK);

        buttonOK.setVisibility(View.INVISIBLE);



        buttonA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                setButtonsFalse(1);
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                setButtonsFalse(2);
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setButtonsFalse(3);
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setButtonsFalse(4);
            }
        });

        buttonE.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setButtonsFalse(5);
            }
        });

        buttonOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // some action when user submits the questoin;
                setButtonsFalse(100);


                if (qaID == quizForThisPage.numOfQuestions) {
                    // if this is the last question, show a thank you message and make a different button visible
                    setQuestionText("THANK YOU THIS IS THE END OF THE QUESTIONS");
                    makeAllButtonsInvisible();
                    // Assign some task for OK button

                }
                else {
                    loadQADatabase(qaID);
                    qaID++;
                    buttonOK.setVisibility(View.INVISIBLE);
                }
            }
        });

        loadQADatabase(0); // set the first question and answers

    }

    private void setQuestionText(String sss){
        final TextView questionText = findViewById(R.id.textView2);
        questionText.setText(sss);
    }
    private void makeAllButtonsInvisible() {
        final Button buttonA = findViewById(R.id.buttonUI_A);
        final Button buttonB = findViewById(R.id.buttonUI_B);
        final Button buttonC = findViewById(R.id.buttonUI_C);
        final Button buttonD = findViewById(R.id.buttonUI_D);
        final Button buttonE = findViewById(R.id.buttonUI_E);

        buttonA.setVisibility(View.INVISIBLE);
        buttonB.setVisibility(View.INVISIBLE);
        buttonC.setVisibility(View.INVISIBLE);
        buttonD.setVisibility(View.INVISIBLE);
        buttonE.setVisibility(View.INVISIBLE);
    }

    private void setButtonsFalse(int optButton) {
        final Button buttonA =  findViewById(R.id.buttonUI_A);
        final Button buttonB =  findViewById(R.id.buttonUI_B);
        final Button buttonC =  findViewById(R.id.buttonUI_C);
        final Button buttonD =  findViewById(R.id.buttonUI_D);
        final Button buttonE =  findViewById(R.id.buttonUI_E);
        final Button buttonOK =  findViewById(R.id.buttonOK);

        buttonOK.setVisibility(View.VISIBLE);

        buttonA.setSelected(false);
        buttonB.setSelected(false);
        buttonC.setSelected(false);
        buttonD.setSelected(false);
        buttonE.setSelected(false);

        selectedButton = optButton;

        switch (optButton) {
            case 1:  buttonA.setSelected(true);
                break;
            case 2:  buttonB.setSelected(true);
                break;
            case 3:  buttonC.setSelected(true);
                break;
            case 4:  buttonD.setSelected(true);
                break;
            case 5:  buttonE.setSelected(true);
                break;
            default:
                break;
        }
    }

    private void setQuestionAndAnswers(String question, String answerA, String answerB, String answerC, String answerD, String answerE ) {
        final Button buttonA =  findViewById(R.id.buttonUI_A);
        final Button buttonB =  findViewById(R.id.buttonUI_B);
        final Button buttonC =  findViewById(R.id.buttonUI_C);
        final Button buttonD =  findViewById(R.id.buttonUI_D);
        final Button buttonE =  findViewById(R.id.buttonUI_E);
        final Button buttonOK =  findViewById(R.id.buttonOK);
        final TextView questionText =   findViewById(R.id.textView2);

        questionText.setText(question);
        buttonA.setText(answerA);
        buttonB.setText(answerB);
        buttonC.setText(answerC);
        buttonD.setText(answerD);
        buttonE.setText(answerE);


    }

    private void loadQADatabase(int qaID,int a) {
        String question, answerA, answerB, answerC, answerD, answerE;
        switch (qaID) {
            case 1: {
                question = "This is the first question";
                answerA = "This is answer A for the first question";
                answerB = "This is answer B for the first question";
                answerC = "This is answer C for the first question";
                answerD = "This is answer D for the first question";
                answerE = "This is answer E for the first question";

            } break;

            case 2: {
                question = "This is the SECOND question";
                answerA = "This is answer A for the SECOND question";
                answerB = "This is answer B for the SECOND question";
                answerC = "This is answer C for the SECOND question";
                answerD = "This is answer D for the SECOND question";
                answerE = "This is answer E for the SECOND question";

            } break;

            case 3: {
                question = "This is the THIRD question";
                answerA = "This is answer A for the THIRD question";
                answerB = "This is answer B for the THIRD question";
                answerC = "This is answer C for the THIRD question";
                answerD = "This is answer D for the THIRD question";
                answerE = "This is answer E for the THIRD question";

            } break;

            default: {
                question = "Q";
                answerA = "A1";
                answerB = "A2";
                answerC = "A3";
                answerD = "A4";
                answerE = "A5";

            } break;
        }



        setQuestionAndAnswers(question, answerA, answerB, answerC, answerD, answerE);
    }

    private void loadQADatabase(int qaID) {
        Log.d("TAG--", String.valueOf(qaID));
        String question, answerA, answerB, answerC, answerD, answerE;
        String[] SS;
        qp = quizForThisPage.QDB.QL.get(qaID);
        Log.d("TAG--",String.valueOf(quizForThisPage.QDB.QL.size()));
        SS = qp.getQuiz();
        Log.d("TAG--",SS[0]);
        setQuestionAndAnswers(SS[0], SS[1], SS[2], SS[3], SS[4], SS[5]);

    }




}
