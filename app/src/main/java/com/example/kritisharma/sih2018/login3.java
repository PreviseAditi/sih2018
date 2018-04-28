package com.example.kritisharma.sih2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class login3 extends AppCompatActivity {

    Button Blogin;
    EditText Etpass,Etuname;
    String u,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);
        Blogin=(Button) findViewById(R.id.btnlogin);
        Etpass=(EditText) findViewById(R.id.etpass);
        Etuname=(EditText) findViewById(R.id.etuname);
        Blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                u=Etuname.getText().toString();
                p=Etpass.getText().toString();
                if(u.equals("") || p.equals(""))
                {
                    Etuname.setText("");
                    Etpass.setText("");
                    Toast.makeText(login3.this,"Data missing!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(u.equals("employer") && p.equals("password"))
                    {
                        Intent intent=new Intent(login3.this,employer.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Etuname.setText("");
                        Etpass.setText("");
                        Toast.makeText(login3.this,"Wrong Information!Enter again",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
