package com.example.scoretrecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int totalA=0;
    public void plusThreeA(View view){
        totalA+=3;
        displayForTeamA(totalA);
    }
    public void plusTwoA(View view){
        totalA+=2;
        displayForTeamA(totalA);
    }
    public void plusOneA(View view){
        totalA++;
        displayForTeamA(totalA);
    }
    int totalB=0;
    public void plusThreeB(View view){
        totalB+=3;
        displayForTeamB(totalB);
    }
    public void plusTwoB(View view){
        totalB+=2;
        displayForTeamB(totalB);
    }
    public void plusOneB(View view){
        totalB++;
        displayForTeamB(totalB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View view){
        totalA=0;
        totalB=0;
        displayForTeamA(totalA);
        displayForTeamB(totalB);
    }

}