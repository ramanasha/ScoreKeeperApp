package com.example.deepanshu.scorekeeperapp;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.deepanshu.scorekeeperapp.customfonts.MyTextView;

public class MainActivity extends AppCompatActivity {

    // track the score of Team A
    private int scoreA = 0;

    // track the score of Team B
    private int scoreB = 0;

    private MyTextView teamA;
    private MyTextView teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamA = (MyTextView) findViewById(R.id.team_a_score_tv);
        teamB = (MyTextView) findViewById(R.id.team_b_score_tv);
    }

    /**
     * Add three score for Team A
     * @param view
     */
    public void threePointerTeamA(View view) {
        scoreA = scoreA + 3;
        updateScoreTeamA(scoreA);
    }

    /**
     * Add two score for Team A
     * @param view
     */
    public void twoPointerTeamA(View view) {
        scoreA = scoreA + 2;
        updateScoreTeamA(scoreA);
    }

    /**
     * Add one score for Team A
     * @param view
     */
    public void onePointerTeamA(View view) {
        scoreA = scoreA + 1;
        updateScoreTeamA(scoreA);
    }

    /**
     * Add three score for Team B
     * @param view
     */
    public void threePointerTeamB(View view) {
        scoreB = scoreB + 3;
        updateScoreTeamB(scoreB);
    }

    /**
     * Add two score for Team B
     * @param view
     */
    public void twoPointerTeamB(View view) {
        scoreB = scoreB + 2;
        updateScoreTeamB(scoreB);
    }

    /**
     * Add one score for Team B
     * @param view
     */
    public void onePointerTeamB(View view) {
        scoreB = scoreB + 1;
        updateScoreTeamB(scoreB);
    }

    /**
     * Restore the score for both Teams
     * @param view
     */
    public void resetScore(View view) {
        updateScoreTeamA(scoreA = 0);
        updateScoreTeamB(scoreB = 0);
    }

    // Set the score of team A
    private void updateScoreTeamA(int score) {
        teamA.setText(String.valueOf(score));
    }

    // Set the score of team B
    private void updateScoreTeamB(int score) {
        teamB.setText(String.valueOf(score));
    }
}
