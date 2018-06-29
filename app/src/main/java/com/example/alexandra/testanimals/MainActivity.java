package com.example.alexandra.testanimals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout africa = (LinearLayout) findViewById(R.id.africa);
        LinearLayout antarctida = (LinearLayout) findViewById(R.id.antarctida);
        LinearLayout southAmerica = (LinearLayout) findViewById(R.id.southamerica);
        LinearLayout northAmerica = (LinearLayout) findViewById(R.id.northamerica);
        LinearLayout eurasia = (LinearLayout) findViewById(R.id.eurasia);
        LinearLayout australia = (LinearLayout) findViewById(R.id.australia);

        africa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent africa_intent = new Intent(getApplicationContext(), ActivityListView.class);
                africa_intent.putExtra("africa",this.getClass().getSimpleName());
                startActivity(africa_intent);

            }
        });

        eurasia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eurasia_intent = new Intent(getApplicationContext(), ActivityListView.class);
                eurasia_intent.putExtra("eurasia",this.getClass().getSimpleName());
                startActivity(eurasia_intent);

            }
        });
        northAmerica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nAmerica_intent = new Intent(getApplicationContext(), ActivityListView.class);
                nAmerica_intent.putExtra("nAmerica",this.getClass().getSimpleName());
                startActivity(nAmerica_intent );

            }
        });
        southAmerica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sAmerica_intent = new Intent(getApplicationContext(), ActivityListView.class);
                sAmerica_intent.putExtra("sAmerica",this.getClass().getSimpleName());
                startActivity(sAmerica_intent );

            }
        });
        antarctida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent antarctida_intent = new Intent(getApplicationContext(), ActivityListView.class);
                antarctida_intent.putExtra("antarctida",this.getClass().getSimpleName());
                startActivity(antarctida_intent );
            }
        });
        australia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent australia_intent = new Intent(getApplicationContext(), ActivityListView.class);
                australia_intent.putExtra("australia",this.getClass().getSimpleName());
                startActivity(australia_intent );

            }
        });
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

    }

    }

