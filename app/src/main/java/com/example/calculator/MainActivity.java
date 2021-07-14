package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
  //  Calculator calculator = new Calculator();
    Calculator2 calculator2 = new Calculator2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);


        calculator2.performOperation(10.5);
        calculator2.performOperation("+");
        calculator2.performOperation(5.2);
        calculator2.performOperation("*");
        calculator2.performOperation(10);
        calculator2.performOperation("=");

        editText.setText("" + calculator2.getResult());


    }
}

/*
multiplication an division are added----> priority must be taken in consideration.
 */