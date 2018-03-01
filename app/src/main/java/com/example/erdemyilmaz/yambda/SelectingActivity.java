package com.example.erdemyilmaz.yambda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecting);

        final Button b1 = (Button)findViewById(R.id.select_button1);
        final Button b2 = (Button)findViewById(R.id.select_button2);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ReceiverActivity.class);
                i.putExtra("key","value-1");
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ReceiverActivity.class);
                i.putExtra("key","value-2");
                startActivity(i);
            }
        });
    }
}
