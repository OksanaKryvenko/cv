package com.homeworks.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText mEtFirstAnswer;
    private Button mBtnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        mEtFirstAnswer = findViewById(R.id.et_first_answer);

        mBtnOk = findViewById(R.id.btn_ok);
        mBtnOk.setOnClickListener(FirstQuestionActivity.this);
    }

    public void onClick(View v) {
        String firstAnswerStr = mEtFirstAnswer.getText().toString();
        if(!TextUtils.isEmpty(firstAnswerStr)) {
            Intent intent = new Intent(FirstQuestionActivity.this, SecondQuestionActivity.class);
            intent.putExtra("firstAnswer", mEtFirstAnswer.getText().toString());
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(FirstQuestionActivity.this, "Введите данные!", Toast.LENGTH_SHORT).show();
        }
    }
}