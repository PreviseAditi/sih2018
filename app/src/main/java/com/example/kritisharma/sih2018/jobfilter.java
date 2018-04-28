package com.example.kritisharma.sih2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class jobfilter extends AppCompatActivity {

    Button But;
    RadioGroup RG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobfilter);
        But=(Button) findViewById(R.id.but1);
        RG=(RadioGroup) findViewById(R.id.rg);
        But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=RG.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton) findViewById(id);
              //  Toast.makeText(MainActivity.this,rb.getText().toString(),Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(jobfilter.this,show.class);
             intent.putExtra("OPTION",rb.getText().toString());
                startActivity(intent);

            }
        });
    }
}
