package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int aTeamScore = 0;
    int bTeamScore = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(aTeamScore);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void aThreePoints(View v) {
        aTeamScore = aTeamScore + 3;
        displayForTeamA(aTeamScore);
    }

    public void aTwoPoints(View v) {
        aTeamScore = aTeamScore + 2;
        displayForTeamA(aTeamScore);
    }

    public void aOnePoint(View v) {
        aTeamScore = aTeamScore + 1;
        displayForTeamA(aTeamScore);
    }

    public void bThreePoints(View v) {
        bTeamScore = bTeamScore + 3;
        displayForTeamB(bTeamScore);
    }

    public void bTwoPoints(View v) {
        bTeamScore = bTeamScore + 2;
        displayForTeamB(bTeamScore);
    }

    public void bOnePoint(View v) {
        bTeamScore = bTeamScore + 1;
        displayForTeamB(bTeamScore);
    }

    public void resetBothScores(View view) {
        aTeamScore = 0;
        bTeamScore = 0;
        displayForTeamA(aTeamScore);
        displayForTeamB(bTeamScore);
    }
}
