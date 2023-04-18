package com.example.educonnect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardTeacher extends AppCompatActivity {

    CardView c1,c2,c3,c4,c5,c6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_teacher);

        c1 = (CardView) findViewById(R.id.c1);
        c2 = (CardView) findViewById(R.id.c2);
        c3 = (CardView) findViewById(R.id.c3);
        c4 = (CardView) findViewById(R.id.c4);
        c5 = (CardView) findViewById(R.id.c5);
        c6 = (CardView) findViewById(R.id.c6);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c1 = new Intent(DashboardTeacher.this, AssignmentPage.class);
                startActivity(c1);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c2 = new Intent(DashboardTeacher.this, NotesTeacher.class);
                startActivity(c2);
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c3 = new Intent(DashboardTeacher.this, TimetablePageAdmin.class);
                startActivity(c3);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c4 = new Intent(DashboardTeacher.this, AssignmentPage.class);
                startActivity(c4);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c5 = new Intent(DashboardTeacher.this, Messaging.class);
                startActivity(c5);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c6 = new Intent(DashboardTeacher.this, Setting.class);
                startActivity(c6);
            }
        });
    }
}