package com.example.educonnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Dashboard extends AppCompatActivity {


    CardView c1,c2,c3,c4,c5,c6;
    ImageButton msgvector;
    BottomNavigationView bottomNavigation1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bottomNavigation1=findViewById(R.id.bottom_navigation);
        c1= (CardView) findViewById(R.id.c1);
        c2= (CardView) findViewById(R.id.c2);
        c3= (CardView) findViewById(R.id.c3);
        c4= (CardView) findViewById(R.id.c4);
        msgvector = (ImageButton) findViewById(R.id.msgvector);

        bottomNavigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.dash:
                        // do nothing, we're already on the profile page
                        return true;
                    case R.id.Setting:
                        Intent intent = new Intent(Dashboard.this, SettingsPage.class);
                        startActivity(intent);
                        return true;
                    case R.id.message:
                        Intent Mintent = new Intent(Dashboard.this, Messages.class);
                        startActivity(Mintent);
                    default:
                        return false;

                }

            }
        });

        msgvector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mintent = new Intent(Dashboard.this, Messages.class);
                startActivity(mintent);
            }
        });


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Dashboard.this, AssignmentPage.class);
                startActivity(intent);

            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ttintent = new Intent(Dashboard.this, TimetablePageAdmin.class);
                startActivity(ttintent);
            }
        });





    }

                    }

