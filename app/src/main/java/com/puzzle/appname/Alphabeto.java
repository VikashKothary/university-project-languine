package com.puzzle.appname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.puzzle.appname.R;

public class Alphabeto extends AppCompatActivity {

    RelativeLayout layout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabeto);
        layout1 = (RelativeLayout) findViewById(R.id.layout1);
        for(int i=0; i < 26; i++) // where x is the size of the list containing your alphabet.
        {

        }
    }
}