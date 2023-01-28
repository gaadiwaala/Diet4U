package com.thecodingshef.dietforu.weightGain;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.thecodingshef.dietforu.R;


public class FridayGainFragment extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_friday_gain, container, false);


        MobileAds.initialize(getActivity(), "3940256099942544~3347511713");
        AdView adview18=v.findViewById(R.id.adView18);
        AdRequest adRequest= new AdRequest.Builder().build();
        adview18.loadAd(adRequest);


        // Inflate the layout for this fragment
        return v;
    }

}
