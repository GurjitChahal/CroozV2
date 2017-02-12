package com.example.gurjitc96.menucrooze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText etUser = (EditText) findViewById(R.id.etUser);
        final EditText etPass = (EditText) findViewById(R.id.etPass);
        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final Button bMap = (Button) findViewById(R.id.bMap);
        final TextView registerLink = (TextView) findViewById(R.id.tvRegisterHere);
        bMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openMap = new Intent(LoginActivity.this,HomeActivity.class);
                LoginActivity.this.startActivity(openMap);
            }
        });
        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);

            }

        });
    }
}
