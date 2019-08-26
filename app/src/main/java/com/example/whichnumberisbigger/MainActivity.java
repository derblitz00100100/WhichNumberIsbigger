package com.example.whichnumberisbigger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonLeft;
    private Button buttonRight;
    private TextView textViewScore;
    private BiggerNumberGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        // construct the game
        game = new BiggerNumberGame(0 , 1000000);
        // do initial setup before the player takes
        Toast.makeText(this, "onCreate complete!", Toast.LENGTH_SHORT);
        updateGameDisplay();
    }

    private void updateGameDisplay() {
        game.generateRandomNumbers();
        // set the text of each button
        buttonLeft.setText(String.valueOf(game.getNumber1()));
        buttonRight.setText(String.valueOf(game.getNumber2()));
        // set the text of the score
        textViewScore.setText("Score: " + String.valueOf(game.getScore()));
    }

    private void setListeners() {
        // creating an Anonymous Inner Class that implements View.OnClickListener()
        // overriding the one abstract method onClick(View v)
        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int answer = Integer.parseInt(buttonLeft.getText().toString());
                String message = game.checkAnswer(answer);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                updateGameDisplay();
            }
        });
        buttonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int answer = Integer.parseInt(buttonRight.getText().toString());
                String message = game.checkAnswer(answer);
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                updateGameDisplay();
            }
        });

    }

    private void wireWidgets() {
        buttonLeft = findViewById(R.id.button_main_left);
        buttonRight = findViewById(R.id.button_main_right);
        textViewScore = findViewById(R.id.textView_main_score);
    }
}





