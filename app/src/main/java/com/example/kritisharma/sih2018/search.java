package com.example.kritisharma.sih2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class search extends AppCompatActivity {

    private static final String TAG ="here" ;
    ListView lv;
    List<DataModel2> dmlist;
    String Out2[];
    String skill;
    MyAdapter2 myAdapter;
    String url="http://127.0.0.1/solrSample.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        myAdapter=new MyAdapter2(this,dmlist);
        lv.setAdapter(myAdapter);
        StringRequest jsonObjectRequest=new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {

                        // Toast.makeText(show.this,response,Toast.LENGTH_SHORT).show();
                        Out2 = response.split(Pattern.quote("."));

                        int i=0;

                        while(i<Out2.length)
                        {
                            DataModel2 r=new DataModel2();
                            r.setName(Out2[i]);
                            i++;
                            r.setContact(Out2[i]);
                            i++;
                            dmlist.add(r);
                        }
                       /* if(dmlist.isEmpty())
                        {
                            Toast.makeText(show.this,"empty",Toast.LENGTH_SHORT).show();
                        }
                        else
                            Toast.makeText(show.this,"not empty"+dmlist.size(),Toast.LENGTH_SHORT).show();*/

                        myAdapter.notifyDataSetChanged();
                    }

                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(search.this,error.toString(),Toast.LENGTH_SHORT).show();

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
            public Map<String,String> getHeaders() throws AuthFailureError{
                Map<String,String> params =new HashMap<String, String>();
                params.put("Content-Type","application/x-www-form-urlencoded");
                return params;
            }
        };
        MySingleton.getInstance(search.this).addToRequestQueue(jsonObjectRequest);


    }
}
