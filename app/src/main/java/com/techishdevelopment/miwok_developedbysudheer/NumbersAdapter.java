package com.techishdevelopment.miwok_developedbysudheer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NumbersAdapter extends ArrayAdapter<Numbers> {
    private Context mContext;
    int mResource;
    private static final String LOG_TAG="NumbersAdapter";

    public NumbersAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Numbers> objects) {
        super(context, resource, objects);
        mContext=context;
        mResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
         String numbersHindi=getItem(position).getNumbersInMiwok();
         String numbersEng=getItem(position).getNumbersInEnglish();
        ImageView imageView=getItem(position).getImageView();
         Numbers numbers=new Numbers(numbersHindi,numbersEng,imageView);
         LayoutInflater inflater=LayoutInflater.from(mContext);
        convertView=inflater.inflate(mResource,parent,false);
        TextView hinTv=convertView.findViewById(R.id.hiTv);
        TextView enTv=convertView.findViewById(R.id.enTv);
        ImageView imgView=convertView.findViewById(R.id.imgView);
        hinTv.setText(numbers.getNumbersInMiwok());
        enTv.setText(numbers.getNumbersInEnglish());

        return convertView;
    }
}
