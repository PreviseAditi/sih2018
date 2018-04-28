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

public class register extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5,et6,et7,et8,et9;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9;
    Button btn;
    String url="https://kritisharma41097.000webhostapp.com/enter.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
     et1=(EditText) findViewById(R.id.name);
     et2=(EditText) findViewById(R.id.con);
     et3=(EditText) findViewById(R.id.pref1);
     et4=(EditText)findViewById(R.id.pref2);
     et5=(EditText) findViewById(R.id.sk1);
     et6=(EditText) findViewById(R.id.sk2);
        et7=(EditText) findViewById(R.id.sk3);
        et8=(EditText) findViewById(R.id.uname);
        et9=(EditText) findViewById(R.id.pass);
        btn=(Button) findViewById(R.id.done);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=et1.getText().toString();
                s2=et2.getText().toString();
                s3=et3.getText().toString();
                s4=et4.getText().toString();
                s5=et5.getText().toString();
                s6=et6.getText().toString();
                s7=et7.getText().toString();
                s8=et8.getText().toString();
                s9=et9.getText().toString();

            StringRequest stringRequest=new StringRequest(Request.Method.POST,url,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {

                          Toast.makeText(register.this,response,Toast.LENGTH_SHORT).show();

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(register.this,error.toString(),Toast.LENGTH_SHORT).show();

                }
            })
            {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String,String> params=new HashMap<String, String>();
                    params.put("name",s1);
                    params.put("contact",s2);
                    params.put("location1",s3);
                    params.put("location2",s4);
                    params.put("skill1",s5);
                    params.put("skill2",s6);
                    params.put("skill3",s7);
                    params.put("uname",s8);
                    params.put("pass",s9);
                    return params;
                }
            };

                    MySingleton.getInstance(register.this).addToRequestQueue(stringRequest);
        }});
    }
}
