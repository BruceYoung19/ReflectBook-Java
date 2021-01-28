package com.example.reflectbook_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        //retrieving data - From Register
        String fName = getIntent().getStringExtra("userN");
        String LName = getIntent().getStringExtra("userL");
        String gender = getIntent().getStringExtra("gender");
        String problem = getIntent().getStringExtra("problem");

        Button enterButton = (Button) findViewById(R.id.Entry);
        Button website_button = (Button) findViewById(R.id.w_button);
        Button help = (Button) findViewById(R.id.Help_button);

        TextView tvfirstname = (TextView) findViewById(R.id.fnametxt);
        TextView tvlastname = (TextView) findViewById(R.id.lnametxt);
        TextView tvgender = (TextView)findViewById(R.id.gendertxt);
        TextView tvproblem = (TextView)findViewById(R.id.problemTxt);
        
        tvfirstname.setText(fName);
        tvlastname.setText(LName);
        tvgender.setText(gender);
        tvproblem.setText(problem);

        // TODO: 25/01/21  recyclerview

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

    public void generate_web(){
        //WebView webView = new WebView();

        // TODO: 22/01/21 content
    }

    // TODO: 27/01/21  getting help
    public void getting_help(){

    }



}

