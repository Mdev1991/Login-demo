package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickLogin(View view)
    {
        EditText usernameField = findViewById(R.id.usernameField);
        Log.i("Info", "Button Clicked!");
        Log.i("Name", usernameField.getText().toString());
        Toast.makeText(this, "Hi " + usernameField.getText().toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}