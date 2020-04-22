package com.example.wmm636midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPhotos = findViewById(R.id.photosBtn);
        Button btnCurrenyConverter = findViewById(R.id.currencyConverterBtn);
        Button btnTravelTips = findViewById(R.id.travelTipsBtn);

        btnPhotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PhotosActivity.class));
            }
        });
        btnCurrenyConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CurrencyConverterActivity.class));
            }
        });
        btnTravelTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TravelTipsActivity.class));
            }
        });
    }
}
