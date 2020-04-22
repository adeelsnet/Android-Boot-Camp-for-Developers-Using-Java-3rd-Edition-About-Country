package com.example.wmm636midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class TravelTipsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_tips);

        TextView travelTip1 = findViewById(R.id.travelTip1);
        TextView travelTip2 = findViewById(R.id.travelTip2);
        TextView travelTip3 = findViewById(R.id.travelTip3);

        travelTip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(
                        new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://www.usnews.com/news/best-countries/articles/2019-07-31/10-interesting-facts-about-pakistan")
                        ));
            }
        });
        travelTip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(
                        new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://youtu.be/tKruj66Zaxw")
                        ));
            }
        });
        travelTip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(
                        new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://youtu.be/CWeWxl7ruGE")
                        ));
            }
        });
    }
}
