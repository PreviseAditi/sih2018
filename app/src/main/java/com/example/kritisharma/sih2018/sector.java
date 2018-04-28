package com.example.kritisharma.sih2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class sector extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sector);

        tv1=(TextView) findViewById(R.id.bang);
        tv2=(TextView) findViewById(R.id.bhub);
        tv3=(TextView) findViewById(R.id.del);
        tv4=(TextView) findViewById(R.id.ind);
        tv5=(TextView) findViewById(R.id.nas);
        tv6=(TextView) findViewById(R.id.pu);
        tv7=(TextView) findViewById(R.id.rai);
        img=(ImageView) findViewById(R.id.img1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                img.setImageResource(getResources().getIdentifier("bpo","drawable",getPackageName()));
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                img.setImageResource(getResources().getIdentifier("diploma","drawable",getPackageName()));
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                img.setImageResource(getResources().getIdentifier("govt","drawable",getPackageName()));
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                img.setImageResource(getResources().getIdentifier("health","drawable",getPackageName()));
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                img.setImageResource(getResources().getIdentifier("pharma","drawable",getPackageName()));
            }
        });


    }
}
