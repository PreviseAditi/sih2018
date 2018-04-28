package com.example.kritisharma.sih2018;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      Thread mythread=new Thread()
      {
          public void run()
          {
              try {
                  sleep(3000);
                  Intent intent=new Intent(MainActivity.this,aswhat.class);
                  startActivity(intent);
                  finish();

              } catch (InterruptedException e) {
                  e.printStackTrace();
              }


          }
      };
      mythread.start();

    }
}
