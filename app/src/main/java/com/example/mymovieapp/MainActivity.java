package com.example.mymovieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et,ett;
    TextView tv,tvv;
    private String userName,userAge;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.uName);
        ett = findViewById(R.id.uAge);
        tv=findViewById(R.id.userOutput);
        tvv=findViewById(R.id.userOutputAge);
    }

    //    public void displayName(View view) {
//        EditText et = findViewById(R.id.uName);
//        String userName = et.getText().toString();//bad practice
//        Toast.makeText(this, userName.length(), Toast.LENGTH_SHORT).show();//looks good
//    }
    public void displayName(View view) {
        userName = et.getText().toString();
        userAge=String.valueOf(ett.getText());

        tv.setText(userName);
        tvv.setText(userAge);
        if(TextUtils.isEmpty(userName)|| TextUtils.isEmpty(userAge)) {
            Toast.makeText(this, "plz enter all the informations", Toast.LENGTH_SHORT).show();
            return;
        }

    }

}

