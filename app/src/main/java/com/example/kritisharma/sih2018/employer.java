package com.example.kritisharma.sih2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class employer extends AppCompatActivity {


    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employer);
        btn1=(Button) findViewById(R.id.reg);
        btn2=(Button) findViewById(R.id.sea);
       /* btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(employer.this,enter.class);
                startActivity(intent);
            }
        });*/
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(employer.this,search.class);
                startActivity(intent);
            }
        });
    }
}
