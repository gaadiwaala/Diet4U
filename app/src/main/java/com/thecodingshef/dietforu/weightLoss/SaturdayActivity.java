package com.thecodingshef.dietforu.weightLoss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.thecodingshef.dietforu.R;

public class SaturdayActivity extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v=inflater.inflate(R.layout.activity_saturday, container, false);


        MobileAds.initialize(getActivity(), "3940256099942544~3347511713");
        AdView adview12=v.findViewById(R.id.adView12);
        AdRequest adRequest= new AdRequest.Builder().build();
        adview12.loadAd(adRequest);

        // Inflate the layout for this fragment
        return v;
    }
}
