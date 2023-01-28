package com.thecodingshef.dietforu.AdapterClass;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.thecodingshef.dietforu.BMIActivity;
import com.thecodingshef.dietforu.ContactActivity;
import com.thecodingshef.dietforu.DietForDisease.DiseaseActivity;
import com.thecodingshef.dietforu.Model;
import com.thecodingshef.dietforu.R;
import com.thecodingshef.dietforu.balancedDiet.WeeklyActivity;
import com.thecodingshef.dietforu.bodyfact.Main2Activity;
import com.thecodingshef.dietforu.weightGain.WeightGainActivity;
import com.thecodingshef.dietforu.weightLoss.WeightLossActivity;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    InterstitialAd interstitialAd,interstitialAd1,interstitialAd2,interstitialAd3,interstitialAd4,interstitialAd5,interstitialAd6;
    Context c;
    private List<Model> nameList;
    public Adapter(Context c,List<Model> nameList){

        this.c=c;
        this.nameList=nameList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row,viewGroup,false);
        return new ViewHolder(view,c,nameList);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Model model= nameList.get(i);
        viewHolder.tx.setText(model.getDescription());

        viewHolder.image.setImageResource(model.getImage());


        interstitialAd = new InterstitialAd(c.getApplicationContext());
        interstitialAd.setAdUnitId("ca-app-pub-6844900672401058/3444164995");
        interstitialAd.loadAd(new AdRequest.Builder().build());


        interstitialAd1 = new InterstitialAd(c.getApplicationContext());
        interstitialAd1.setAdUnitId("ca-app-pub-6844900672401058/8573202740");
        interstitialAd1.loadAd(new AdRequest.Builder().build());


        interstitialAd2 = new InterstitialAd(c.getApplicationContext());
        interstitialAd2.setAdUnitId("ca-app-pub-6844900672401058/2937732689");
        interstitialAd2.loadAd(new AdRequest.Builder().build());



        interstitialAd3 = new InterstitialAd(c.getApplicationContext());
        interstitialAd3.setAdUnitId("ca-app-pub-6844900672401058/4989180959");
        interstitialAd3.loadAd(new AdRequest.Builder().build());



        interstitialAd4 = new InterstitialAd(c.getApplicationContext());
        interstitialAd4.setAdUnitId("ca-app-pub-6844900672401058/9105531690");
        interstitialAd4.loadAd(new AdRequest.Builder().build());



        interstitialAd5 = new InterstitialAd(c.getApplicationContext());
        interstitialAd5.setAdUnitId("ca-app-pub-6844900672401058/5166286686");
        interstitialAd5.loadAd(new AdRequest.Builder().build());



        interstitialAd6 = new InterstitialAd(c.getApplicationContext());
        interstitialAd6.setAdUnitId("ca-app-pub-6844900672401058/9870096252");
        interstitialAd6.loadAd(new AdRequest.Builder().build());





        viewHolder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(model.getDescription().equalsIgnoreCase("Facts")){

                    if(interstitialAd5.isLoaded()){
                        interstitialAd5.show();
                    }
                    else {
                        Intent i=new Intent(c,Main2Activity.class);
                        i.putExtra("n",model.getDescription());
                        c.startActivity(i);

                    }


                    interstitialAd5.setAdListener(new AdListener() {

                        @Override
                        public void onAdClosed() {
                            Intent i=new Intent(c,Main2Activity.class);
                            i.putExtra("n",model.getDescription());
                            c.startActivity(i);

                        }
                    });




                }
                if(model.getDescription().equalsIgnoreCase("BMI calculator"))
                {

                    if(interstitialAd4.isLoaded()){
                        interstitialAd4.show();
                    }
                    else {
                        Intent i1=new Intent(c,BMIActivity.class);
                        c.startActivity(i1);
                    }


                    interstitialAd4.setAdListener(new AdListener() {

                        @Override
                        public void onAdClosed() {
                            Intent i1=new Intent(c,BMIActivity.class);
                            c.startActivity(i1);
                        }
                    });


                }
                if(model.getDescription().equalsIgnoreCase("About us")) {

                    if(interstitialAd6.isLoaded()){
                        interstitialAd6.show();
                    }
                    else {
                        Intent i1=new Intent(c,ContactActivity.class);
                        c.startActivity(i1);
                    }


                    interstitialAd6.setAdListener(new AdListener() {

                        @Override
                        public void onAdClosed() {
                            Intent i1=new Intent(c,ContactActivity.class);
                            c.startActivity(i1);
                        }
                    });
                }
                if(model.getDescription().equalsIgnoreCase("weight loss diet")) {



                    if(interstitialAd.isLoaded()){
                        interstitialAd.show();
                    }
                    else {
                        Intent i1=new Intent(c,WeightLossActivity.class);
                        c.startActivity(i1);
                        }


                    interstitialAd.setAdListener(new AdListener() {

                        @Override
                        public void onAdClosed() {
                            Intent i1=new Intent(c,WeightLossActivity.class);
                            c.startActivity(i1);
                        }
                    });

                }
                if(model.getDescription().equalsIgnoreCase("weight gain diet")) {

                    if(interstitialAd1.isLoaded()){
                        interstitialAd1.show();
                    }
                    else {
                        Intent i1=new Intent(c,WeightGainActivity.class);
                        c.startActivity(i1);
                    }


                    interstitialAd1.setAdListener(new AdListener() {

                        @Override
                        public void onAdClosed() {
                            Intent i1=new Intent(c,WeightGainActivity.class);
                            c.startActivity(i1);
                        }
                    });

                }
                if(model.getDescription().equalsIgnoreCase("weekly diet")) {
                    if(interstitialAd2.isLoaded()){
                        interstitialAd2.show();
                    }
                    else {
                        Intent i1=new Intent(c,WeeklyActivity.class);
                        c.startActivity(i1);
                    }


                    interstitialAd2.setAdListener(new AdListener() {

                        @Override
                        public void onAdClosed() {
                            Intent i1=new Intent(c,WeeklyActivity.class);
                            c.startActivity(i1);
                        }
                    });

                }
                if(model.getDescription().equalsIgnoreCase("Exercise")) {
                    if(interstitialAd3.isLoaded()){
                        interstitialAd3.show();
                    }
                    else {
                        Intent i1=new Intent(c,DiseaseActivity.class);
                        c.startActivity(i1);
                    }


                    interstitialAd3.setAdListener(new AdListener() {

                        @Override
                        public void onAdClosed() {
                            Intent i1=new Intent(c,DiseaseActivity.class);
                            c.startActivity(i1);
                        }
                    });

                }



                if(model.getDescription().equalsIgnoreCase("Rate us")) {
                    try{
                        c.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id="+c.getPackageName())));
                    }catch (ActivityNotFoundException e){
                        c.startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://play.google.com/store/apps/details?id="+c.getPackageName())));
                    }
                }



            }
        });

    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tx;
        ImageView image;
        List<Model> nameList=new ArrayList<>();
        Context context;
        RelativeLayout layout;

        public ViewHolder(@NonNull View itemView,Context context,List<Model> nameList) {
            super(itemView);
            this.context=context;
           this.nameList=nameList;



            tx=itemView.findViewById(R.id.tx);

            image=itemView.findViewById(R.id.image);
            layout=(RelativeLayout)itemView.findViewById(R.id.layout);


        }
    }
}
