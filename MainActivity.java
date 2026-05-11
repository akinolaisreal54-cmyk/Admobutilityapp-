package com.mycompany.admobutility;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.LoadAdError;

public class MainActivity extends AppCompatActivity {
    
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this);

        // Load Banner Ad Unit 1
        AdView adView1 = findViewById(R.id.adView1);
        adView1.loadAd(new AdRequest.Builder().build());

        // Load Interstitial Ad Unit 2
        loadInterstitial();
    }

    private void loadInterstitial() {
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this, "ca-app-pub-7026017161587411/2832864279", adRequest, 
            new InterstitialAdLoadCallback() {
                @Override
                public void onAdLoaded(InterstitialAd interstitialAd) {
                    mInterstitialAd = interstitialAd;
                    mInterstitialAd.show(MainActivity.this); // Shows immediately
                }
                @Override
                public void onAdFailedToLoad(LoadAdError adError) {
                    mInterstitialAd = null;
                }
            });
    }
}


