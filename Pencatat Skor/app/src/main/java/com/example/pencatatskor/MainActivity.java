package com.example.pencatatskor;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mScoreP1, mScoreP2;
    private TextView mScoreTextP1, mScoreTextP2;

    static final String STATE_SCORE_1 = "Team 1 Score";
    static final String STATE_SCORE_2 = "Team 2 Score";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mScoreTextP1 = findViewById(R.id.tvTeamSatu);
        mScoreTextP2 = findViewById(R.id.tvTeamDua);

        if (savedInstanceState != null) {
            mScoreP1 = savedInstanceState.getInt(STATE_SCORE_1);
            mScoreP2 = savedInstanceState.getInt(STATE_SCORE_2);

            // Set the score text views.
            mScoreTextP1.setText(String.valueOf(mScoreP1));
            mScoreTextP2.setText(String.valueOf(mScoreP2));
        }
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        // Change the label of the menu based on the state of the app.
        int nightMode = AppCompatDelegate.getDefaultNightMode();
        if(nightMode == AppCompatDelegate.MODE_NIGHT_YES){
            menu.findItem(R.id.night_mode).setTitle(R.string.day_mode);
        } else{
            menu.findItem(R.id.night_mode).setTitle(R.string.night_mode);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Check if the correct item was clicked.
        if (item.getItemId() == R.id.night_mode) {
            // Get the night mode state of the app.
            int nightMode = AppCompatDelegate.getDefaultNightMode();
            // Set the theme mode for the restarted activity.
            if (nightMode == AppCompatDelegate.MODE_NIGHT_YES) {
                AppCompatDelegate.setDefaultNightMode
                        (AppCompatDelegate.MODE_NIGHT_NO);
            } else {
                AppCompatDelegate.setDefaultNightMode
                        (AppCompatDelegate.MODE_NIGHT_YES);
            }
            // Recreate the activity for the theme change to take effect.
            recreate();
        }
        return true;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Save the scores.
        outState.putInt(STATE_SCORE_1, mScoreP1);
        outState.putInt(STATE_SCORE_2, mScoreP2);
        super.onSaveInstanceState(outState);

    }

}