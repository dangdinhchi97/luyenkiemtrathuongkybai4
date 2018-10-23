package com.deptrai.minhnhat.luyenkiemtrathuongky;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Student> {
    private Context context;
    private int resource;
    private List<Student> objects;
    public MyAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Student> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }


    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        //convertView= LayoutInflater.from(context).inflate(R.layout.person_list.);
        convertView = LayoutInflater.from(context).inflate(resource, parent, false);

        TextView tvname = (TextView) convertView.findViewById(R.id.lbl_custom_tenSV);


        ImageView image = (ImageView) convertView.findViewById(R.id.imgSV);


        tvname.setText(objects.get(position).getTen());

        image.setImageResource(objects.get(position).getHinhanh());


        return convertView;
        //super.getView(position, convertView, parent);
    }
}
