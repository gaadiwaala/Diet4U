package com.thecodingshef.dietforu.balancedDiet;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.thecodingshef.dietforu.R;


public class NormalMondayFragment extends android.support.v4.app.Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_normal_monday, container, false);


        MobileAds.initialize(getActivity(), "3940256099942544~3347511713");
        AdView adview21=v.findViewById(R.id.adView21);
        AdRequest adRequest= new AdRequest.Builder().build();
        adview21.loadAd(adRequest);

        // Inflate the layout for this fragment
        return v;
    }


}
