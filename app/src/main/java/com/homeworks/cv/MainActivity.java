package com.homeworks.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStart = findViewById(R.id.btn_start);
        mStart.setOnClickListener(MainActivity.this);
    }

    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, FirstQuestionActivity.class);
        startActivity(intent);
    }
}
