package com.example.catarina.footballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.catarina.footballscore.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    TextView teamAScore;
    TextView teamBScore;
    TextView teamAFoul;
    TextView teamBFoul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAScore =findViewById(R.id.team_a_score);
        teamBScore = findViewById(R.id.team_b_score);
        teamAFoul = findViewById(R.id.team_a_foul);
        teamBFoul = findViewById(R.id.team_b_foul);
    }

    /**
     * Increase the score for Team A by 1 goal.
     */
    public void goalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA (scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 goal.
     */
    public void setScoreTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB (scoreTeamB);
    }

    /**
     * Increase the fouls for Team A by 1.
     */
    public void foulForTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        String foulsTeamA = "Fouls: " + (foulTeamA);
        displayFoulTextA (foulsTeamA);
    }

    /**
     * Increase the foul for Team B by 1.
     */
    public void foulForTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        String foulsTeamB = "Fouls: " + (foulTeamB);
        displayFoulTextB (foulsTeamB);
    }

    /**
     * Reset the score and fouls for both teams.
     */
    public void newGame(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA (scoreTeamA);
        displayForTeamB (scoreTeamB);
        displayFoulTeamA (foulTeamA);
        displayFoulTeamB (foulTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) teamAScore;
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) teamBScore;
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulTeamA(int foul) {
        TextView scoreView = (TextView) teamAFoul;
        scoreView.setText(String.valueOf(foul));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayFoulTextA(String foulsTeamA) {
        TextView foulsATextView = (TextView) teamAFoul;
        foulsATextView.setText(foulsTeamA);
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulTeamB(int foul) {
        TextView scoreView = (TextView) teamBFoul;
        scoreView.setText(String.valueOf(foul));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayFoulTextB(String foulsTeamB) {
        TextView foulsBTextView = (TextView) teamBFoul;
        foulsBTextView.setText(foulsTeamB);
    }

}
