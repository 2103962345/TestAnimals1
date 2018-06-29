package com.example.alexandra.testanimals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class ActivityListView extends AppCompatActivity {
    private AdView mAdView;

    int[] africaImages = {R.drawable.lion,R.drawable.elephant,R.drawable.buffalo,R.drawable.leopard,R.drawable.rhinoceros};
    String[] africaNames = {"Lion", "African Elephant", "Cape Buffalo", "Leopard", "Rhinoceros"};

    int[] sAmericaImages = {R.drawable.jaguar,R.drawable.sloth,R.drawable.guanaco,R.drawable.capybara,R.drawable.anteater};
    String[] sAmericaNames = {"Jaguar", "Sloth", "Guanaco", "Capybara", "Giant Anteatr"};

    int[] nAmericaImages = {R.drawable.hseal,R.drawable.bbear,R.drawable.groundhog,R.drawable.pronghorn,R.drawable.alligator};
    String[] nAmericaNames = {"Hawaiian Monk Seal", "American Black Bear", "Groundhog", "Pronghorn", "American Alligator"};

    int[] antarctidaImages = {R.drawable.penguin,R.drawable.seal,R.drawable.whale};
    String[] antarctidaNames = {"Penguin", "Seal", "Whale"};

    int[] australiaImages = {R.drawable.kangaroo,R.drawable.koala,R.drawable.echidna,R.drawable.dingo,R.drawable.wombat};
    String[] australiaNames = {"Kangaroo", "Koala", "Echidna", "Dingo", "Wombat"};

    int[] eurasiaImages = {R.drawable.lynx,R.drawable.fox,R.drawable.sleopard,R.drawable.btiger,R.drawable.panda};
    String[] eurasiaNames = {"Lynx", "Urban Fox", "Snow Leopard", "Bengal Tiger", "Panda"};



    ListView lView;
    TextView tView;
    ListAdapter lAdapter;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView = findViewById(R.id.adView);
        mAdView.loadAd(adRequest1);
        tView = (TextView) findViewById(R.id.banner);

        lView = (ListView) findViewById(R.id.androidList);
        if (savedInstanceState == null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                if (bundle.containsKey("africa")) {
                    lAdapter = new ListAdapter(this, africaNames, africaImages);
                    tView.setText("Africa");
                }
                else
                if (bundle.containsKey("nAmerica")) {
                    lAdapter = new ListAdapter(this, nAmericaNames, nAmericaImages);
                    tView.setText("North America");
                }
                else
                if (bundle.containsKey("sAmerica")) {
                    lAdapter = new ListAdapter(this, sAmericaNames, sAmericaImages);
                    tView.setText("South America");
                }
                else
                if (bundle.containsKey("eurasia")) {
                    lAdapter = new ListAdapter(this, eurasiaNames, eurasiaImages);
                    tView.setText("Eurasia");
                }
                else
                if (bundle.containsKey("australia")) {
                    lAdapter = new ListAdapter(this, australiaNames, australiaImages);
                    tView.setText("Australia");
                }
                else
                if (bundle.containsKey("antarctida")) {
                    lAdapter = new ListAdapter(this, antarctidaNames, antarctidaImages);
                    tView.setText("Antarctida");
                }
            }
        }
        lView.setAdapter(lAdapter);



        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
    TextView name = (TextView) view.findViewById(R.id.aNametxt);
       Intent intent = new Intent(getApplicationContext(),ActivityShowInfo.class);
        intent.putExtra(name.getText().toString(),this.getClass().getSimpleName());
    startActivity(intent);
        }
        });
    }

}