package com.example.labw05;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;

@SuppressWarnings("deprecation")
public class MainActivity extends ActionBarActivity {


    TextView text1;
    Button knopka1;

    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.textView1);
        knopka1 = (Button) findViewById(R.id.button1);
        knopka1.setOnClickListener(obrabotka);
    }

    OnClickListener obrabotka = new OnClickListener() {

    @Override
    public void onClick(View arg0) {
        text1.setText("Кнопка была нажата!");
        }

    };

}