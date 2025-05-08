package com.example.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result, sumResult;
    EditText firstName, secondName;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        sumResult = findViewById(R.id.sumResult);
        firstName = findViewById(R.id.firstName);
        secondName = findViewById(R.id.secondName);
        btnAdd = findViewById(R.id.button);

        // add click event
        btnAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(firstName.getText().toString());
                int num2 = Integer.parseInt(secondName.getText().toString());
                int sum = num1+num2;

                sumResult.setText("Addition =  " +sum);
            }
        });
    }
}