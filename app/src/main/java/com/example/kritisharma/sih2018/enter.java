package com.example.kritisharma.sih2018;

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

public class enter extends AppCompatActivity {

    EditText et1,et2,et3,et4;
    String s1,s2,s3,s4;
    String url="https://kritisharma41097.000webhostapp.com/enter.php";
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
     et1=(EditText) findViewById(R.id.job);
     et2=(EditText) findViewById(R.id.sk);
     et3=(EditText) findViewById(R.id.loc);
     et4=(EditText) findViewById(R.id.ph);
     btn=(Button) findViewById(R.id.save);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1=et1.getText().toString();
                s2=et2.getText().toString();
                s3=et3.getText().toString();
                s4=et4.getText().toString();


                StringRequest stringRequest=new StringRequest(Request.Method.POST,url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {

                                Toast.makeText(enter.this,response,Toast.LENGTH_SHORT).show();

                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(enter.this,error.toString(),Toast.LENGTH_SHORT).show();

                    }
                })
                {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String,String> params=new HashMap<String, String>();
                        params.put("title",s1);
                        params.put("skill",s2);
                        params.put("location",s3);
                        params.put("contact",s4);
                        return params;
                    }
                };

                MySingleton.getInstance(enter.this).addToRequestQueue(stringRequest);
            }

        });
    }
}
