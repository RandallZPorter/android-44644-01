package com.example.astronomer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class UpcomingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming);
    }

    public void returnAction(View v) {
        Intent ini = getIntent();
        setResult(0, ini);
        finish();
    }
}
