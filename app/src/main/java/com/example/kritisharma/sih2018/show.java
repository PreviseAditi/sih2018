package com.example.kritisharma.sih2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class show extends AppCompatActivity {


    String Out2[];
    Intent intent=getIntent();
    String skill=intent.getStringExtra("OPTION");
    String url="http://172.29.10.147/enter.php";
    TextView TV2,TV4;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_show);
            TV2=(TextView) findViewById(R.id.tv2);
            TV4=(TextView) findViewById(R.id.tv4);
            //skill = getIntent().getStringExtra("OPTION");
            //Log.i(TAG,"Reached here");

            StringRequest jsonObjectRequest=new StringRequest(Request.Method.POST, url,
                    new Response.Listener<String>() {

                        @Override
                        public void onResponse(String response) {

                            Out2=response.split(Pattern.quote("."));
                            TV2.setText(Out2[0]);
                            TV4.setText(Out2[1]);

                        }

                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(show.this,error.toString(),Toast.LENGTH_SHORT).show();

                }


            })
            {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String,String> params=new HashMap<String,String>();
                    //       params.put("Content-Type", "application/json");
                    params.put("skill",skill);
                    return params;
                }

            };
            MySingleton.getInstance(show.this).addToRequestQueue(jsonObjectRequest);


        }

}
