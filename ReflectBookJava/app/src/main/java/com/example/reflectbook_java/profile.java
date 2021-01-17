package com.example.reflectbook_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        //retrieving data
        String fName = getIntent().getStringExtra("userN");
        String LName = getIntent().getStringExtra("userL");
        String gender = getIntent().getStringExtra("gender");
        String problem = getIntent().getStringExtra("problem");

        //component
        Button enterButton = (Button) findViewById(R.id.Entry);

        TextView tvfirstname = (TextView) findViewById(R.id.fnametxt);
        TextView tvlastname = (TextView) findViewById(R.id.lnametxt);
        TextView tvgender = (TextView)findViewById(R.id.gendertxt);
        TextView tvproblem = (TextView)findViewById(R.id.problemTxt);
        
       tvfirstname.setText(fName);
       tvlastname.setText(LName);
       tvgender.setText(gender);
       tvproblem.setText(problem);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MakingEntry();
            }
        });
    }
    public void MakingEntry(){
        Intent intent = new Intent(this,Note.class);
        startActivity(intent);
    }

}

