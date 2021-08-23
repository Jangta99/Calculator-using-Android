package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t1;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Commands for the input numbers
    public boolean getNumbers()  {

        // Gets the 1st number
        e1 = (EditText) findViewById(R.id.num1);

        // Gets the 2nd number
        e2 = (EditText) findViewById(R.id.num2);

        // Displays the total result from e1 and e2
        t1 = (TextView) findViewById(R.id.result);

        // Takes the input from text box 1
        String s1 = e1.getText().toString();

        // Takes the input from text box 2
        String s2 = e2.getText().toString();

        // Checks to see if the text boxes are not empty
        //if ((s1.equals(null) && s2.equals(null))
        //     || (s1.equals("") && s2.equals (""))) {
        if (s1.equals(null) || s2.equals(null) || s1.equals("") || s2.equals (""))
        {

            String result = "Please enter integers for both input lines.";
            t1.setText(result);

            // The value is currently null/empty, so prompts the user to enter values.
            return false;
        }
        else {

            // Converts the two strings to int.
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);

            // Accepts the two numbers and does an operation.
            return true;
        }

    }

    // Add function
    public void doSum(View v) {

        // Always coverts the two numbers from String to Int.
        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        }

    }

    // Sub function
    public void doSub(View v) {

        // Always coverts the two numbers from String to Int.
        if (getNumbers()) {
            int sum = num1 - num2;
            t1.setText(Integer.toString(sum));
        }

    }

    // Multiplication function
    public void doMul(View v) {

        // Always coverts the two numbers from String to Int.
        if (getNumbers()) {
            int sum = num1 * num2;
            t1.setText(Integer.toString(sum));
        }

    }

    // Div function
    public void doDiv(View v) {

        // Always coverts the two numbers from String to Int.
        if (getNumbers()) {
            double sum = num1 / (num2 * 1.0);
            t1.setText(Double.toString(sum));
        }

    }

    // Pow function
    public void doPow(View v) {

        // Always coverts the two numbers from String to Int.
        if (getNumbers()) {
            double sum = Math.pow(num1, num2);
            t1.setText(Double.toString(sum));
        }

    }

    // Mod function
    public void doMod(View v) {

        // Always coverts the two numbers from String to Int.
        if (getNumbers()) {
            double sum = num1 % num2;
            t1.setText(Double.toString(sum));
        }

    }

    // Clears both input lines and the result.
    public void doClr(View v) {

        if (getNumbers()) {
            e1.setText("");
            e2.setText("");
            t1.setText("");
        }
    }


}