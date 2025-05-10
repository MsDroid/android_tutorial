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
    Button btnAdd, btnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.heading);
        sumResult = findViewById(R.id.sumResult);

        firstName = findViewById(R.id.firstName);
        secondName = findViewById(R.id.secondName);

        btnAdd = findViewById(R.id.add);
        btnSub = findViewById(R.id.sub);

        // add click event
        btnAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                try {
                    String input1 = firstName.getText().toString().trim();
                    String input2 = secondName.getText().toString().trim();

                    if (input1.isEmpty() || input2.isEmpty()) {
                        sumResult.setText("Please enter both numbers");
                        return;
                    }

                    int num1 = Integer.parseInt(input1);
                    int num2 = Integer.parseInt(input2);
                    int sum = num1 + num2;

                    sumResult.setText("Addition = " + sum);
                } catch (NumberFormatException e) {
                    sumResult.setText("Invalid input");
                }

            }
        });


        /// sub click event
//        btnSub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int num1 = Integer.parseInt(firstName.getText().toString());
//                int num2 = Integer.parseInt(secondName.getText().toString());
//                int sub = num1-num2;
//
//                sumResult.setText("Substraction = "+sub);
//
//            }
//        });
    }
}