package com.harshad.har;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;
import com.harshad.har.R;

public class Login extends AppCompatActivity implements Log_in {

    private Button mbtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_login);

//        Firebase myFirebaseRef = new Firebase("https://harmnc.firebaseio.com/");

        mbtn = (Button)findViewById(R.id.btn2);

        mbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Register.class);
                startActivity(i);
            }
        });
    }




}
