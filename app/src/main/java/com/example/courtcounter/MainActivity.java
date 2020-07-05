package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int finalScore = 0;
    int finalscoreb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayforteamA(finalScore);
        displayforteamB(finalscoreb);
    }

    /**
     * this method is to display score of TeamB
     */
    public void displayforteamB(int scoreforb) {
        TextView score_viewb = findViewById(R.id.text_view_scoreB);
        score_viewb.setText(String.valueOf(scoreforb));
    }

    /**
     * for button +3 pionts
     */
    public void addthreepiontsforb(View view) {
        finalscoreb = finalscoreb + 3;
        displayforteamB(finalscoreb);

    }

    /**
     * for button +2 pionts
     */
    public void addtwopiontsforb(View view) {
        finalscoreb = finalscoreb + 2;
        displayforteamB(finalscoreb);

    }

    /**
     * for button free throw pionts
     */
    public void freethrowforb(View view) {
        finalscoreb = finalscoreb + 1;
        displayforteamB(finalscoreb);

    }

    /**
     * this method is to display score of TeamA
     */
    public void displayforteamA(int score) {
        TextView score_view = findViewById(R.id.text_view_score);
        score_view.setText(String.valueOf(score));
    }

    /**
     * for button +3 pionts
     */
    public void addthreepionts(View view) {
        finalScore = finalScore + 3;
        displayforteamA(finalScore);

    }

    /**
     * for button +2 pionts
     */
    public void addtwopionts(View view) {
        finalScore = finalScore + 2;
        displayforteamA(finalScore);

    }

    /**
     * for button free throw pionts
     */
    public void freethrow(View view) {
        finalScore = finalScore + 1;
        displayforteamA(finalScore);

    }

    public void reset(View view) {
        String won;
        if (finalscoreb > finalScore) {
            won = "Team B";
        } else {
            won = "Team A";
        }
        if(finalScore!=finalscoreb){
            Intent secoundactivity=new Intent();
            secoundactivity.setClass(this,Secound.class);
            secoundactivity.putExtra("valueteam",won);
            startActivity(secoundactivity);
        }
        finalScore = 0;
        finalscoreb = 0;
        displayforteamA(0);
        displayforteamB(0);


    }
}
