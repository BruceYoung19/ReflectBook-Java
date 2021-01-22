package com.example.reflectbook_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Note extends AppCompatActivity {
    private ArrayList<MoodItem> mMoodList;
    private MoodAdapter mAdapter;

    private int ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.note);

        //
        TextView date_t= findViewById(R.id.Date_txt);
        Date date = new Date();

        // Changing the format of the date
        String Store_date = date.toString();
        String output_date = Store_date.substring(0,10);

        date_t.setText(output_date);

        // TODO: 20/01/21 spinner custom
        initList();
        Spinner Mood_choice = findViewById(R.id.mood_spinner);
        mAdapter = new MoodAdapter(this,mMoodList);
        Mood_choice.setAdapter(mAdapter);

        Mood_choice.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                MoodItem Clickeditem = (MoodItem) parent.getItemAtPosition(position);
                String clickedMooditem = Clickeditem.getmMoodName();
                Toast.makeText(Note.this,clickedMooditem + " Selected",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        // TODO: 20/01/21 reflectiveview

        EditText User_input = (EditText) findViewById(R.id.Entry_text);
        String text = User_input.getText().toString();

        Button finished_button = (Button) findViewById(R.id.finish_b);
        finished_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                // TODO: 20/01/21 store information
                // TODO: 21/01/21 make instance of database store the information



            }
        });

    }
    
    public void back_to_profile(){
        Intent i = new Intent(this,profile.class);
        startActivity(i);
    }

    public void initList(){
        mMoodList = new ArrayList<>();
        mMoodList.add(new MoodItem("Angry",R.drawable.angry));
        mMoodList.add(new MoodItem("Good",R.drawable.good));
        mMoodList.add(new MoodItem("happy",R.drawable.happy));
        mMoodList.add(new MoodItem("horrible",R.drawable.horrible));


    }



    // TODO: 21/01/21 method generate an id
    // TODO: 21/01/21 method to store text

}
