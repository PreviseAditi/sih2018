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

public class Login2 extends AppCompatActivity {

    Button Blogin,Bnew;
    EditText Etpass,Etuname;
    String u,p;
    String login_url="https://kritisharma41097.000webhostapp.com/login.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        Blogin=(Button) findViewById(R.id.btnlogin);
        Bnew=(Button) findViewById(R.id.btnew);
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
                    Toast.makeText(Login2.this,"Data missing!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    StringRequest stringRequest=new StringRequest(Request.Method.POST,login_url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {

                                    if(response.equals("Database Connection Success.correct"))
                                    {
                                        Intent intent=new Intent(Login2.this,jobfilter.class);
                                        startActivity(intent);
                                    }
                                    else
                                    {
                                        Etpass.setText("");
                                        Etuname.setText("");
                                        Toast.makeText(Login2.this,"wrong information",Toast.LENGTH_SHORT).show();
                                    }

                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(Login2.this,error.toString(),Toast.LENGTH_SHORT).show();

                        }
                    })
                    {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String,String> params=new HashMap<String, String>();
                            params.put("user",u);
                            params.put("pass",p);
                            return params;
                        }
                    };

                    MySingleton.getInstance(Login2.this).addToRequestQueue(stringRequest);
                }
            }
        });

        Bnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login2.this,register.class);
                startActivity(intent);
            }
        });
    }
}
