package com.example.educonnect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AssignmentPage extends AppCompatActivity {

    CardView AIcard,ANDcard, ADScard, NGDBcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_page);

        CardView AIcard = (CardView) findViewById(R.id.AICARD);
        CardView ANDcard = (CardView) findViewById(R.id.ANDCARD);
        CardView ADScard = (CardView) findViewById(R.id.ADSCARD);
        CardView NGDBcard = (CardView) findViewById(R.id.NGDBCARD);

        AIcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AssignmentPage.this, AI.class);
                startActivity(intent);
            }
        });

        ANDcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AssignmentPage.this, AssignmentPage2.class);
                startActivity(intent);
            }
        });

        ADScard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AssignmentPage.this, Algorithms.class);
                startActivity(intent);
            }
        });
        NGDBcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AssignmentPage.this, NGDB.class);
                startActivity(intent);
            }
        });

    }
}