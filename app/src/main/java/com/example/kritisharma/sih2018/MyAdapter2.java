package com.example.kritisharma.sih2018;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kapil Sharma on 3/31/2018.
 */

public class MyAdapter2 extends BaseAdapter {

    Context context;
    List<DataModel2> dmList;


    public MyAdapter2(Context context, List<DataModel2> dmlist) {
        //context contains any refrence. Context is the super class of all classes. Child Class of Object Class. It has the reference of the main activity.
        this.context=context;
        this.dmList=dmlist;

    }

    @Override
    public int getCount() {
        return dmList.size();
    }

    @Override
    public Object getItem(int i) {
        return dmList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        if(view==null) {
            LayoutInflater layoutInflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflator.inflate(R.layout.customview,null);
        }
//converting the customview into java.
        //now we find the image,name and phone in the customview.
        // ImageView imageView=(ImageView)  view.findViewById(R.id.img1);
        TextView tv1= (TextView) view.findViewById(R.id.name);
        TextView tv2= (TextView) view.findViewById(R.id.phone);
        Log.i("here","reached here4");
        //imageView.setImageResource(dmList.get(i).getImage());
        tv1.setText(dmList.get(i).getName());
        tv2.setText (dmList.get(i).getContact());

        return view;

    }
}
