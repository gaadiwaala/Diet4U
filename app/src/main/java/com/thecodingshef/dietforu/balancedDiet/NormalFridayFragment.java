package com.thecodingshef.dietforu.balancedDiet;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.thecodingshef.dietforu.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class NormalFridayFragment extends android.support.v4.app.Fragment {


    public NormalFridayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_normal_friday, container, false);


        MobileAds.initialize(getActivity(), "3940256099942544~3347511713");
        AdView adview25=v.findViewById(R.id.adView25);
        AdRequest adRequest= new AdRequest.Builder().build();
        adview25.loadAd(adRequest);

        // Inflate the layout for this fragment
        return v;


    }

}
