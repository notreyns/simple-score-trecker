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
    int total=0;
    public void plusThree(View view){
        total+=3;
        displayForTeamA(total);
    }
    public void plusTwo(View view){
        total+=2;
        displayForTeamA(total);
    }
    public void plusOne(View view){
        total++;
        displayForTeamA(total);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

}