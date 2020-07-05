package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Secound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        Intent caller=getIntent();
        String wonteam = caller.getStringExtra("valueteam");
        TextView textView=findViewById(R.id.textview);
        textView.setText("You Have Won The Match");
        Toast.makeText(getApplicationContext(),
                wonteam, Toast.LENGTH_LONG).show();
    }
}
