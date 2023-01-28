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
public class ExerciseGainFragment extends android.support.v4.app.Fragment {


    public ExerciseGainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_exercise_gain, container, false);


        MobileAds.initialize(getActivity(), "3940256099942544~3347511713");
        AdView adview28=v.findViewById(R.id.adView28);
        AdRequest adRequest= new AdRequest.Builder().build();
        adview28.loadAd(adRequest);

        // Inflate the layout for this fragment
        return v;
    }

}
