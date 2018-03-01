package com.example.erdemyilmaz.yambda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {

    String value = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getString("key");
            //The key argument here must match that used in the other activity
        }

        TextView tv = (TextView)findViewById(R.id.textViewReceive);
        tv.setText(value);
    }
}
