package com.example.erdemyilmaz.yambda;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class buttonManagement extends AppCompatActivity {

    Button buttonA;
    Button buttonB;
    Button buttonC;
    Button buttonD;
    Button buttonE;
    Button buttonOK;
    private int selectedButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button buttonA = (Button) findViewById(R.id.buttonUI_A);
        final Button buttonB = (Button) findViewById(R.id.buttonUI_B);
        final Button buttonC = (Button) findViewById(R.id.buttonUI_C);
        final Button buttonD = (Button) findViewById(R.id.buttonUI_D);
        final Button buttonE = (Button) findViewById(R.id.buttonUI_E);
        final Button buttonOK = (Button) findViewById(R.id.buttonOK);

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
                buttonOK.setVisibility(View.INVISIBLE);
            }
        });

    }

    private void setButtonsFalse(int optButton) {
        final Button buttonA = (Button) findViewById(R.id.buttonUI_A);
        final Button buttonB = (Button) findViewById(R.id.buttonUI_B);
        final Button buttonC = (Button) findViewById(R.id.buttonUI_C);
        final Button buttonD = (Button) findViewById(R.id.buttonUI_D);
        final Button buttonE = (Button) findViewById(R.id.buttonUI_E);
        final Button buttonOK = (Button) findViewById(R.id.buttonOK);

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
        }
    }


}
