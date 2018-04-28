package com.example.kritisharma.sih2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class location extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
    ImageView img,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

     tv1=(TextView) findViewById(R.id.bang);
        tv2=(TextView) findViewById(R.id.bhub);
        tv3=(TextView) findViewById(R.id.del);
        tv4=(TextView) findViewById(R.id.ind);
        tv5=(TextView) findViewById(R.id.nas);
        tv6=(TextView) findViewById(R.id.pu);
        tv7=(TextView) findViewById(R.id.rai);
        img=(ImageView) findViewById(R.id.img1);
        img2=(ImageView) findViewById(R.id.img2);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                  img.setImageResource(getResources().getIdentifier("banglore","drawable",getPackageName()));
                  img2.setImageResource(getResources().getIdentifier("bangloreincome","drawable",getPackageName()));
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                img.setImageResource(getResources().getIdentifier("bhubaneshwar","drawable",getPackageName()));
                img2.setImageResource(getResources().getIdentifier("bhubaneshwarincome","drawable",getPackageName()));
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                img.setImageResource(getResources().getIdentifier("delhi","drawable",getPackageName()));
                img2.setImageResource(getResources().getIdentifier("delhiincome","drawable",getPackageName()));
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                img.setImageResource(getResources().getIdentifier("indore","drawable",getPackageName()));
                img2.setImageResource(getResources().getIdentifier("indoreincome","drawable",getPackageName()));
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                img.setImageResource(getResources().getIdentifier("nasik","drawable",getPackageName()));
                img2.setImageResource(getResources().getIdentifier("nasikincome","drawable",getPackageName()));
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                img.setImageResource(getResources().getIdentifier("pune","drawable",getPackageName()));
                img2.setImageResource(getResources().getIdentifier("puneincome","drawable",getPackageName()));
            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                img.setImageResource(getResources().getIdentifier("raipur","drawable",getPackageName()));
                img2.setImageResource(getResources().getIdentifier("raipurincome","drawable",getPackageName()));
            }
        });

    }
}
