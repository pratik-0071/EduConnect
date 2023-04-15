package com.example.educonnect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Notes extends AppCompatActivity {

    CardView AI, AND, NGDB, ADS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        AI = (CardView) findViewById(R.id.AI);
        AND = (CardView) findViewById(R.id.AND);
        ADS = (CardView) findViewById(R.id.ADS);
        NGDB = (CardView) findViewById(R.id.NGDB);

        AI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Notes.this, AINotes.class);
                startActivity(i);
            }
        });

        AND.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Notes.this, AndroidNotes.class);
                startActivity(i);
            }
        });

        ADS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Notes.this, ADSNotes.class);
                startActivity(i);
            }
        });

        NGDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Notes.this, NGDB.class);
                startActivity(i);
            }
        });
    }
}