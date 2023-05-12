package com.example.pencatatskor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mScoreP1, mScoreP2;
    private TextView mScoreTextP1, mScoreTextP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreTextP1 = findViewById(R.id.tvTeamSatu);
        mScoreTextP2 = findViewById(R.id.tvTeamDua);
    }

    public void incrementScore(View view) {
        int viewID = view.getId();
        switch (viewID) {
            case R.id.increment:
                mScoreTextP1.setText(String.valueOf(mScoreP1++));
                break;
            case R.id.incrementenemy:
                mScoreTextP2.setText(String.valueOf(mScoreP2++));
                break;
        }
    }

    public void decrementScore(View view) {
        int viewID = view.getId();
        switch (viewID) {
            case R.id.decrement:
                mScoreTextP1.setText(String.valueOf(mScoreP1--));
                break;
            case R.id.decrementenemy:
                mScoreTextP2.setText(String.valueOf(mScoreP2--));
                break;
        }
    }
}