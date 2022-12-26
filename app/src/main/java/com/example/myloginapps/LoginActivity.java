package com.example.myloginapps;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username,pass;
    Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.etUsername);
        pass = findViewById(R.id.etPassword);
        loginBtn = findViewById(R.id.btnLogin);

        //Button click dia akn do something(listener listen and pbnggil method onclick)
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //compare input adakah sma dngn hardcorder,check sma ke x,klau sma dngn data tu bru bleh login
                //check username and pass
                //usernme =usernm,pas == 1234,bru bleh log in
                //toast messge//22 mesti true klau x dia pegi else
                if (username.getText().toString().equals("Hazirah") && pass.getText().toString().equals("1234")) {
                    //letak intent untuk ke next page
                    Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    //intent to next page
                    Intent intent = new Intent(LoginActivity.this, HomePage.class);
                    intent.putExtra("Uname",username.getText().toString());
                    username.setText("");
                    startActivity(intent);

                } else {
                    //panggil method alert dialog
                    showAlertDialogButtonClicked();
                    username.setText("");
                    pass.setText("");
                    //Toast.makeText(LoginActivity.this,"Login Failed! Please check your Username and  Password", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    public void showAlertDialogButtonClicked(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Authentication Failed");
        builder.setMessage("Username and Password is Wrong,Please Try Again");

        //add button
        builder.setPositiveButton("OK",null);

        //create and show the alert dialog
        AlertDialog dialog=builder.create();
        dialog.show();
    }

    }
