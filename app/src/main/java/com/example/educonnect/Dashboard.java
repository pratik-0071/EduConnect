package com.example.educonnect;

import android.annotation.SuppressLint;
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
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class Dashboard extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener  {

    BottomNavigationView bnvd;

    FirebaseUser user;

    FirebaseAuth mAuth;
    FirebaseFirestore db;

    CardView c1,c2,c3,c4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        bnvd = findViewById(R.id.bnvd);
        c1 = (CardView) findViewById(R.id.c1);
        c2 = (CardView) findViewById(R.id.c2);
        c3 = (CardView) findViewById(R.id.c3);
        c4 = (CardView) findViewById(R.id.c4);

        bnvd.setOnNavigationItemSelectedListener(this);
        bnvd.setSelectedItemId(R.id.dash);

    }

    Dash da = new Dash();
    Messaging ms = new Messaging();
    Setting st = new Setting();
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        switch (item.getItemId()) {
            case R.id.dash:
                getSupportFragmentManager().beginTransaction().replace(R.id.ifragemnt, da).commit();
                return true;

            case R.id.message:
                getSupportFragmentManager().beginTransaction().replace(R.id.ifragemnt, ms).commit();
                return true;

            case R.id.setting:
                getSupportFragmentManager().beginTransaction().replace(R.id.ifragemnt, st).commit();
                return true;
        }
        return false;
    }


}