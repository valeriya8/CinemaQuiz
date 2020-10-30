package com.example.cinemaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class totalPoints extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_points);

        int points = getIntent().getIntExtra(MainActivity.EXTRA_POINTS, 0);
        display(points);


    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.total_points);
        quantityTextView.setText("" + number);
    }

}
