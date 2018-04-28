package com.example.kritisharma.sih2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class admin extends AppCompatActivity {

    Button btn1,btn2,btn3;
    TextView tv1,tv2,tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

     btn1=(Button) findViewById(R.id.btloc);
     btn2=(Button) findViewById(R.id.btsec);
     btn3=(Button) findViewById(R.id.btudata);
     tv1=(TextView) findViewById(R.id.rep1);
     tv2=(TextView) findViewById(R.id.rep2);
     tv3=(TextView) findViewById(R.id.rep3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(admin.this,location.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(admin.this,sector.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(admin.this,udata.class);
                startActivity(intent);
            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(admin.this,udata5.class);
                startActivity(intent);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(admin.this,report2.class);
                startActivity(intent);
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(admin.this,report3.class);
                startActivity(intent);
            }
        });

    }
}
