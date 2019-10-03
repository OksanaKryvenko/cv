package com.homeworks.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FifthQuestionActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText mEtFifthAnswer;
    private Button mBtnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_question);

        mEtFifthAnswer = findViewById(R.id.et_fifth_answer);

        mBtnOk = findViewById(R.id.btn_ok);
        mBtnOk.setOnClickListener(FifthQuestionActivity.this);
    }

    public void onClick(View v) {
        String fifthAnswerStr = mEtFifthAnswer.getText().toString();
        if(!TextUtils.isEmpty(fifthAnswerStr)) {
        Intent intent = new Intent(FifthQuestionActivity.this, SixthQuestionActivity.class);
        intent.putExtra("firstAnswer", getIntent().getStringExtra("firstAnswer"));
        intent.putExtra("secondAnswer", getIntent().getStringExtra("secondAnswer"));
        intent.putExtra("thirdAnswer", getIntent().getStringExtra("thirdAnswer"));
        intent.putExtra("fourthAnswer", getIntent().getStringExtra("fourthAnswer"));
        intent.putExtra("fifthAnswer", mEtFifthAnswer.getText().toString());
        startActivity(intent);
            finish();
        } else {
            Toast.makeText(FifthQuestionActivity.this, "Введите данные!", Toast.LENGTH_SHORT).show();
        }
    }
}
