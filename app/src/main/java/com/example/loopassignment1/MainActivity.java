package com.example.loopassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button evenSumBtn, nSumBtn, sqBtn, palindromeBtn, nextPageBtn;
    EditText  editText;
    LinearLayout myLayout;
    int sum = 0;
    long t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        evenSumBtn = findViewById(R.id.even_sum_btn);
        nSumBtn = findViewById(R.id.n_sum_btn);
        sqBtn = findViewById(R.id.square_btn);
        palindromeBtn = findViewById(R.id.palindrome_btn);
        nextPageBtn = findViewById(R.id.next_page);
        editText = findViewById(R.id.edit_text);
        myLayout = findViewById(R.id.my_layout);

        evenSumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myLayout.removeAllViews();

                String evenSumValue = editText.getText().toString();
                int evenSum = Integer.parseInt(evenSumValue);

                TextView textView = new TextView(MainActivity.this);
                textView.setTextSize(18);
                textView.setText("");
                sum = 0;

                for (int x = 0; x <= evenSum; x++){

                    if (x%2==0){

                        sum = sum+x;
                        textView.append(""+ x +", ");

                    }
                }

                textView.append(" Sum: "+ sum);
                myLayout.addView(textView);

            }
        });


        nSumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myLayout.removeAllViews();

                String nSumValue = editText.getText().toString();
                long nSum = Long.parseLong(nSumValue);

                TextView textView = new TextView(MainActivity.this);
                textView.setTextSize(18);
                textView.setText("");
                t = 0;
                long sum = 0;

                for (int n = 1; n <= nSum; n++){

                    t = t*10 + 9;
                    textView.append("" + t + ", ");
                    sum = sum+ t;

                }

                textView.append("Sum: " + sum);
                myLayout.addView(textView);
            }
        });


        sqBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myLayout.removeAllViews();


                String sqValue = editText.getText().toString();
                int square = Integer.parseInt(sqValue);

                TextView textView = new TextView(MainActivity.this);
                textView.setTextSize(18);
                textView.setText("");
                sum = 0;

                textView.append(""+square+" * "+square+" = "+ square*square);
                myLayout.addView(textView);

            }
        });


        palindromeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String palindrome = editText.getText().toString();
                String reverse = "";

                myLayout.removeAllViews();
                TextView textView = new TextView(MainActivity.this);
                textView.setTextSize(18);
                textView.setText("");
                sum = 0;

                for (int i = (palindrome.length() - 1); i >= 0; i--){

                    reverse = reverse + palindrome.charAt(i);

                }
                if (palindrome.equalsIgnoreCase(reverse)){

                    textView.append(palindrome + " is a palindrome");

                }
                else {

                    textView.append(palindrome + " is not a palindrome");

                }

                myLayout.addView(textView);

            }
        });



    }
}