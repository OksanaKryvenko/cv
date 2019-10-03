package com.homeworks.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SixthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText mEtSixthAnswer;
    private Button mBtnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_question);

        mEtSixthAnswer = findViewById(R.id.et_sixth_answer);

        mBtnOk = findViewById(R.id.btn_ok);
        mBtnOk.setOnClickListener(SixthQuestionActivity.this);
    }

    public void onClick(View v) {
        String sixthAnswerStr = mEtSixthAnswer.getText().toString();
        if(!TextUtils.isEmpty(sixthAnswerStr)) {
        Intent intent = new Intent(SixthQuestionActivity.this, ResultActivity.class);
        intent.putExtra("firstAnswer", getIntent().getStringExtra("firstAnswer"));
        intent.putExtra("secondAnswer", getIntent().getStringExtra("secondAnswer"));
        intent.putExtra("thirdAnswer", getIntent().getStringExtra("thirdAnswer"));
        intent.putExtra("fourthAnswer", getIntent().getStringExtra("fourthAnswer"));
        intent.putExtra("fifthAnswer", getIntent().getStringExtra("fifthAnswer"));
        intent.putExtra("sixthAnswer", mEtSixthAnswer.getText().toString());
        startActivity(intent);
            finish();
        } else {
            Toast.makeText(SixthQuestionActivity.this, "Введите данные!", Toast.LENGTH_SHORT).show();
        }
    }
}
