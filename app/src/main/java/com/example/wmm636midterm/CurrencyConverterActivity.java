package com.example.wmm636midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class CurrencyConverterActivity extends AppCompatActivity {

    private Double dollar = 162.97;
    private Double euro = 177.13;
    private Spinner spinner;
    private EditText pakRupeesInput;
    private String spinnerValue;
    private Double parseInputValToInt, result;
    private TextView displayResult;
    private DecimalFormat dollarFormatter, euroFormatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        spinner = findViewById(R.id.spinner);
        pakRupeesInput = findViewById(R.id.pakRupeesInput);
        displayResult = findViewById(R.id.result);
        dollarFormatter = new DecimalFormat("$#.####");
        euroFormatter = new DecimalFormat("€#.####");
        Button btnCalculate = findViewById(R.id.calculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputVal = pakRupeesInput.getText().toString();

                if (inputVal.equals("") || inputVal.equals("0")) {
                    Toast.makeText(CurrencyConverterActivity.this,
                            "First, please enter a number > 0!",
                            Toast.LENGTH_LONG).show();

                    InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

                } else {
                    parseInputValToInt = Double.parseDouble(inputVal);
                    spinnerValue = spinner.getSelectedItem().toString();
                    if (spinnerValue.equals("US Dollar $")) {
                        result = parseInputValToInt / dollar;
                        displayResult.setText(inputVal + " Pak Ruppes to US Dollar $ is " + dollarFormatter.format(result));
                    } else if (spinnerValue.equals("Euro €")) {
                        result = parseInputValToInt / euro;
                        displayResult.setText(inputVal + " Pak Ruppes to Euro € is " + euroFormatter.format(result));
                    } else {
                        Toast.makeText(CurrencyConverterActivity.this,
                                "Please choose either\nUS Dollar $ or Euro €",
                                Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

    }
}
