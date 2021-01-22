package com.example.reflectbook_java;

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

public class MoodAdapter extends ArrayAdapter<MoodItem> {

    public MoodAdapter(@NonNull Context context, ArrayList<MoodItem> moodlist) {
        super(context,0,moodlist);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    private View initView(int position,View covertview,ViewGroup parent){
        if(covertview == null){
            covertview = LayoutInflater.from(getContext()).inflate(
              R.layout.mood_spinner_row,parent,false
            );
        }

        ImageView imageViewflag = covertview.findViewById(R.id.image_view_mood);
        TextView textViewname = covertview.findViewById(R.id.text_view_name);

        MoodItem currentItem = getItem(position);

        imageViewflag.setImageResource(currentItem.getmMoodImage());
        textViewname.setText(currentItem.getmMoodName());

        return covertview;
    }
}
