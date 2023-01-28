package com.thecodingshef.dietforu.weightLoss;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.thecodingshef.dietforu.MainActivity;
import com.thecodingshef.dietforu.R;
import com.thecodingshef.dietforu.weightGain.MondayGainActivity;



public class WeightLossActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
AdView adview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_loss);

        MobileAds.initialize(this, "3940256099942544~3347511713");
        adview1=findViewById(R.id.adView1);

        AdRequest adRequest= new AdRequest.Builder().build();
        adview1.loadAd(adRequest);



        if(getSupportActionBar()!=null){
      getSupportActionBar().setTitle("Weight loss diet plan");
     getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
}

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.container, new WeightLossPlanActivity()).addToBackStack(null).commit();
            }
        });
  btn2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          FragmentManager fm = getSupportFragmentManager();
          fm.beginTransaction().replace(R.id.container, new TuesdayActivity()).addToBackStack(null).commit();
      }


  });
  btn3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          FragmentManager fm = getSupportFragmentManager();
          fm.beginTransaction().replace(R.id.container, new WednesdayLossActivity()).addToBackStack(null).commit();


  }
  });
  btn4.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          FragmentManager fm = getSupportFragmentManager();
          fm.beginTransaction().replace(R.id.container, new ThursdayLossActivity()).addToBackStack(null).commit();
      }
  });
  btn5.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          FragmentManager fm = getSupportFragmentManager();
          fm.beginTransaction().replace(R.id.container, new FridayActivity()).addToBackStack(null).commit();
      }
  });
  btn6.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          FragmentManager fm = getSupportFragmentManager();
          fm.beginTransaction().replace(R.id.container, new SaturdayActivity()).addToBackStack(null).commit();
      }
  });
  btn7.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          FragmentManager fm = getSupportFragmentManager();
          fm.beginTransaction().replace(R.id.container, new SundayActivity()).addToBackStack(null).commit();
      }
  });

    }
     @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        android.view.MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }
     @Override
    public boolean onOptionsItemSelected(android.view.MenuItem item) {

      if(item.getItemId()==R.id.home){
          Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
          shareIntent.setType("text/plain");
          shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Insert Subject here");
          String app_url = " https://play.google.com/store/apps/details?id=com.thecodingshef.dietforu";
          shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);
          startActivity(Intent.createChooser(shareIntent, "Share via"));
             }


        return super.onOptionsItemSelected(item);
    }




}
