package com.example.scoresetaplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ScorePingpongActivity extends AppCompatActivity {

    private int mScoreP1, mScoreP2, mSetP1, mSetP2;
    private TextView mScoreTextP1, mScoreTextP2, mSetTextP1, mSetTextP2;

    ImageView NameP1, NameP2;

//    static final String STATE_SCORE_1 = "Team 1 Score";
//    static final String STATE_SCORE_2 = "Team 2 Score";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_pingpong);

        mScoreTextP1 = findViewById(R.id.tv_ScoreP1);
        mScoreTextP2 = findViewById(R.id.tv_ScoreP2);

        mSetTextP1 = findViewById(R.id.tv_SetP1);
        mSetTextP2 = findViewById(R.id.tv_SetP2);

        NameP1 = findViewById(R.id.iv_P1);
        NameP2 = findViewById(R.id.iv_P2);


//        if (savedInstanceState != null) {
//            mScoreP1 = savedInstanceState.getInt(STATE_SCORE_1);
//            mScoreP2 = savedInstanceState.getInt(STATE_SCORE_2);
//
//            // Set the score text views.
//            mScoreTextP1.setText(String.valueOf(mScoreP1));
//            mScoreTextP2.setText(String.valueOf(mScoreP2));
//        }


        // Editing Edit Text

//        NameP1.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (isTextViewVisible) {
//                    text = textView.getText().toString();
//                    editText.setText(text);
//                    editText.setVisibility(View.VISIBLE);
//                    textView.setVisibility(View.GONE);
//                    imageView.setImageResource(R.drawable.ic_save);
//                    isTextViewVisible = false;
//                } else {
//                    text = editText.getText().toString();
//                    textView.setText(text);
//                    editText.setVisibility(View.GONE);
//                    textView.setVisibility(View.VISIBLE);
//                    imageView.setImageResource(R.drawable.ic_pencil);
//                    isTextViewVisible = true;
//                }
//            }
//        });
//
//        NameP2.setOnClickListener( new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (isTextViewVisible) {
//                    text = textView.getText().toString();
//                    editText.setText(text);
//                    editText.setVisibility(View.VISIBLE);
//                    textView.setVisibility(View.GONE);
//                    imageView.setImageResource(R.drawable.save_vector);
//                    isTextViewVisible = false;
//                } else {
//                    text = editText.getText().toString();
//                    textView.setText(text);
//                    editText.setVisibility(View.GONE);
//                    textView.setVisibility(View.VISIBLE);
//                    imageView.setImageResource(R.drawable.edit_vector);
//                    isTextViewVisible = true;
//                }
//            }
//        });
    }


    public void incrementScore(View view) {
        int viewID = view.getId();
        switch (viewID) {
            case R.id.cv_incrementScoreP1:
                mScoreTextP1.setText(String.valueOf(mScoreP1++));
                break;
            case R.id.cv_incrementScoreP2:
                mScoreTextP2.setText(String.valueOf(mScoreP2++));
                break;
        }
    }

    public void decrementScore(View view) {
        int viewID = view.getId();
        switch (viewID) {
            case R.id.cv_decrementScoreP1:
                mScoreTextP1.setText(String.valueOf(mScoreP1--));
                break;
            case R.id.cv_decrementScoreP2:
                mScoreTextP2.setText(String.valueOf(mScoreP2--));
                break;
        }

    }

    public void incrementSet (View view) {
        int viewID = view.getId();
        switch (viewID) {
            case R.id.cv_incrementSetP1:
                mSetTextP1.setText(String.valueOf(mSetP1++));
                break;
            case R.id.cv_incrementSetP2:
                mSetTextP2.setText(String.valueOf(mSetP2++));
                break;
        }
    }

    public void decrementSet (View view) {
        int viewID = view.getId();
        switch (viewID) {
            case R.id.cv_decrementSetP1:
                mSetTextP1.setText(String.valueOf(mSetP1--));
                break;
            case R.id.cv_decrementSetP2:
                mSetTextP2.setText(String.valueOf(mSetP2--));
                break;
        }

    }

    public void repeatAll (View view) {
        int viewID = view.getId();
        switch (viewID) {
            case R.id.cv_repeatAll:
                mScoreTextP1.setText(String.valueOf(0));
                mSetTextP1.setText(String.valueOf(0));
                mScoreTextP2.setText(String.valueOf(0));
                mSetTextP2.setText(String.valueOf(0));
                break;
        }

    }
}