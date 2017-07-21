package com.example.kareemwaleed.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Keeps track of the score of team A
    private int teamAScore = 0;
    //Keeps track of the score of team B
    private int teamBScore = 0;
    private final int THREE_POINTS = 3;
    private final int TWO_POINTS = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * increase the score of team A by 3
     */
    public void threePointsForTeamA(View view) {
        teamAScore += THREE_POINTS;
        displayForTeamA(teamAScore);
    }


    /**
     * increases the score of team A by 2
     *
     * @param view
     */
    public void twoPointsForTeamA(View view) {
        teamAScore += TWO_POINTS;
        displayForTeamA(teamAScore);
    }

    /**
     * increase the score of team A by 1
     *
     * @param view
     */

    public void freeThrowForTeamA(View view) {
        teamAScore++;
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * increase the score of team B by 3
     */
    public void threePointsForTeamB(View view) {
        teamBScore += THREE_POINTS;
        displayForTeamB(teamBScore);
    }


    /**
     * increases the score of team B by 2
     *
     * @param view
     */
    public void twoPointsForTeamB(View view) {
        teamBScore += TWO_POINTS;
        displayForTeamB(teamBScore);
    }

    /**
     * increase the score of team B by 1
     *
     * @param view
     */

    public void freeThrowForTeamB(View view) {
        teamBScore++;
        displayForTeamB(teamBScore);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view) {
        teamAScore = 0;
        displayForTeamA(teamAScore);
        teamBScore = 0;
        displayForTeamB(teamBScore);
    }
}
