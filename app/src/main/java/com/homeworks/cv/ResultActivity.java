package com.homeworks.cv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView mTvFirstAnswer;
    private TextView mTvSecondAnswer;
    private TextView mTvThirdAnswer;
    private TextView mTvFourthAnswer;
    private TextView mTvFifthAnswer;
    private TextView mTvSixthAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mTvFirstAnswer = findViewById(R.id.tv_first_answer);
        mTvSecondAnswer = findViewById(R.id.tv_second_answer);
        mTvThirdAnswer = findViewById(R.id.tv_third_answer);
        mTvFourthAnswer = findViewById(R.id.tv_fourth_answer);
        mTvFifthAnswer = findViewById(R.id.tv_fifth_answer);
        mTvSixthAnswer = findViewById(R.id.tv_sixth_answer);

        String firstAnswer = getIntent().getStringExtra("firstAnswer");
        String secondAnswer = getIntent().getStringExtra("secondAnswer");
        String thirdAnswer = getIntent().getStringExtra("thirdAnswer");
        String fourthAnswer = getIntent().getStringExtra("fourthAnswer");
        String fifthAnswer = getIntent().getStringExtra("fifthAnswer");
        String sixthAnswer = getIntent().getStringExtra("sixthAnswer");

        mTvFirstAnswer.setText(mTvFirstAnswer.getText().toString() + "" + firstAnswer);
        mTvSecondAnswer.setText(mTvSecondAnswer.getText().toString() + "" + secondAnswer);
        mTvThirdAnswer.setText(mTvThirdAnswer.getText().toString() + "" + thirdAnswer);
        mTvFourthAnswer.setText(mTvFourthAnswer.getText().toString() + "" + fourthAnswer);
        mTvFifthAnswer.setText(mTvFifthAnswer.getText().toString() + "" + fifthAnswer);
        mTvSixthAnswer.setText(mTvSixthAnswer.getText().toString() + "" + sixthAnswer);
    }
}
