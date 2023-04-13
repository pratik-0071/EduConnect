package com.example.educonnect;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterPage extends AppCompatActivity {

    private EditText emailTextView, passwordTextView;
    private Button Btn, backtologin;
    private ProgressBar progressbar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        // taking FirebaseAuth instance
        mAuth = FirebaseAuth.getInstance();

        // initialising all views through id defined above
        emailTextView = findViewById(R.id.email);
        passwordTextView = findViewById(R.id.passwd);
        Btn = findViewById(R.id.btnregister);
        backtologin = findViewById(R.id.backtologin);
        progressbar = findViewById(R.id.progressbar);

        backtologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lgnIntent = new Intent(getApplicationContext(), LoginPage.class);
                startActivity(lgnIntent);
            }
        });

        // Set on Click Listener on Registration button
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email, password;
                email = emailTextView.getText().toString();
                password = passwordTextView.getText().toString();



                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {

                                    Intent intent = new Intent(RegisterPage.this, LoginPage.class);
                                    startActivity(intent);
                                    FirebaseUser user = mAuth.getCurrentUser();

                                } else {


                                    Toast.makeText(RegisterPage.this, "User Already Registered",Toast.LENGTH_SHORT).show();

                                }
                            }
                        });
                // show the visibility of progress bar to show loading
                progressbar.setVisibility(View.VISIBLE);

                // Take the value of two edit texts in Strings

                email = emailTextView.getText().toString();
                password = passwordTextView.getText().toString();

                // Validations for input email and password
                if (TextUtils.isEmpty(email)) {

                    Toast.makeText(getApplicationContext(),
                                    "Please enter email!!",
                                    Toast.LENGTH_LONG)
                            .show();
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(),
                                    "Please enter password!!",
                                    Toast.LENGTH_LONG)
                            .show();
                    return;

                }
            }
        });}}