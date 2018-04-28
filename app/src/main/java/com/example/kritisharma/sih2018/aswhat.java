package com.example.kritisharma.sih2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aswhat extends AppCompatActivity {

    Button bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aswhat);

     bt1=(Button) findViewById(R.id.goff);
     bt2=(Button) findViewById(R.id.emp);
     bt3=(Button) findViewById(R.id.user);
     bt1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent=new Intent(aswhat.this,login.class);
             startActivity(intent);
         }
     });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(aswhat.this,login3.class);
                startActivity(intent);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(aswhat.this,Login2.class);
                startActivity(intent);
            }
        });
    }
}
