package com.example.frywj.navigationdrawerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editTextPassword;
    private EditText editTextUsername;
    private Button buttonLogin;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        
        buttonLogin.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {

        Intent intentMain = new Intent(this, MainActivity.class);
        
        if (editTextUsername.getText().toString().equals("") & editTextPassword.getText().toString().equals("")) {
            this.startActivity(intentMain);
        } else {
            Toast.makeText(this, "Login Unsuccessful", Toast.LENGTH_SHORT).show();
        }
    }
}
