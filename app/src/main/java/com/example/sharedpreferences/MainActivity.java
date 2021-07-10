 package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
     EditText userName;
     EditText password;
     SharedReferance ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ref=new SharedReferance(this);
        userName=findViewById(R.id.userName);
        password=findViewById(R.id.password);
    }

     public void saveClickButton(View view) {


         ref.saveData(userName.getText().toString(),
                 password.getText().toString());
     }

     public void loadClickButton(View view) {
     String data=ref.loadData();
         Toast.makeText(getApplicationContext(),data, Toast.LENGTH_SHORT).show();
     }
 }