package com.homeworks.cv;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText mEtSecondAnswer;
    private Button mBtnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);

        mEtSecondAnswer = findViewById(R.id.et_second_answer);

        mBtnOk = findViewById(R.id.btn_ok);
        mBtnOk.setOnClickListener(SecondQuestionActivity.this);
    }

    public void onClick(View v) {
        String secondAnswerStr = mEtSecondAnswer.getText().toString();
        if(!TextUtils.isEmpty(secondAnswerStr)) {
            Intent intent = new Intent(SecondQuestionActivity.this, ThirdQuestionActivity.class);
            intent.putExtra("firstAnswer", getIntent().getStringExtra("firstAnswer"));
            intent.putExtra("secondAnswer", mEtSecondAnswer.getText().toString());
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(SecondQuestionActivity.this, "Введите данные!", Toast.LENGTH_SHORT).show();
        }
    }
}