package com.homeworks.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FourthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText mEtFourthAnswer;
    private Button mBtnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_question);

        mEtFourthAnswer = findViewById(R.id.et_fourth_answer);

        mBtnOk = findViewById(R.id.btn_ok);
        mBtnOk.setOnClickListener(FourthQuestionActivity.this);
    }

    public void onClick(View v) {
        String fourthAnswerStr = mEtFourthAnswer.getText().toString();
        if(!TextUtils.isEmpty(fourthAnswerStr)) {
        Intent intent = new Intent(FourthQuestionActivity.this, FifthQuestionActivity.class);
        intent.putExtra("firstAnswer", getIntent().getStringExtra("firstAnswer"));
        intent.putExtra("secondAnswer", getIntent().getStringExtra("secondAnswer"));
        intent.putExtra("thirdAnswer", getIntent().getStringExtra("thirdAnswer"));
        intent.putExtra("fourthAnswer", mEtFourthAnswer.getText().toString());
        startActivity(intent);
            finish();
        } else {
            Toast.makeText(FourthQuestionActivity.this, "Введите данные!", Toast.LENGTH_SHORT).show();
        }
    }
}
