package com.homeworks.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText mEtThirdAnswer;
    private Button mBtnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);

        mEtThirdAnswer = findViewById(R.id.et_third_answer);

        mBtnOk = findViewById(R.id.btn_ok);
        mBtnOk.setOnClickListener(ThirdQuestionActivity.this);
    }

    public void onClick(View v) {
        String thirdAnswerStr = mEtThirdAnswer.getText().toString();
        if(!TextUtils.isEmpty(thirdAnswerStr)) {
            Intent intent = new Intent(ThirdQuestionActivity.this, FourthQuestionActivity.class);
            intent.putExtra("firstAnswer", getIntent().getStringExtra("firstAnswer"));
            intent.putExtra("secondAnswer", getIntent().getStringExtra("secondAnswer"));
            intent.putExtra("thirdAnswer", mEtThirdAnswer.getText().toString());
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(ThirdQuestionActivity.this, "Введите данные!", Toast.LENGTH_SHORT).show();
        }
    }
}
