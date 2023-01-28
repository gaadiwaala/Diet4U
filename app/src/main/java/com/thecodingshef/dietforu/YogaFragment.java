package com.thecodingshef.dietforu;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


/**
 * A simple {@link Fragment} subclass.
 */
public class YogaFragment extends android.support.v4.app.Fragment {


    public YogaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_yoga, container, false);


        MobileAds.initialize(getActivity(), "3940256099942544~3347511713");
        AdView adview30=v.findViewById(R.id.adView30);
        AdRequest adRequest= new AdRequest.Builder().build();
        adview30.loadAd(adRequest);

        // Inflate the layout for this fragment
        return v;
    }

}
