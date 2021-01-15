package com.example.reflectbook_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class register extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String userN="";
    String userL="";
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        EditText firstname = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText lastName = (EditText) findViewById(R.id.editTextTextLastName);

        Spinner spin = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> aa = ArrayAdapter.createFromResource(this ,R.array.gender, android.R.layout.simple_spinner_item);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
        spin.setOnItemSelectedListener(this);

        Button CompleteButton = (Button) findViewById(R.id.Complete_registerButton);
        CompleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 14/01/21 user info

                userN =firstname.getText().toString();
                userL =lastName.getText().toString();

                CompleteRegisration();

            }
        });

    }

    public void CompleteRegisration(){
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
