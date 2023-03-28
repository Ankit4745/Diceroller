package com.ankit.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton imgbtn;
    private TextView txt;
    private Random myrandom = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgbtn = findViewById(R.id.imageButton);
        txt = findViewById(R.id.textView);

        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myRanNumber = myrandom.nextInt(6)+1;

                switch (myRanNumber){
                    case 1:
                        imgbtn.setImageResource(R.drawable.dice1);
                        txt.setText("one");
                        break;
                        case 2:
                        imgbtn.setImageResource(R.drawable.dice2);
                        txt.setText("two");
                        break;
                        case 3:
                        imgbtn.setImageResource(R.drawable.dice3);
                        txt.setText("three");
                        break;
                        case 4:
                        imgbtn.setImageResource(R.drawable.dice4);
                        txt.setText("four");
                        break;
                        case 5:
                        imgbtn.setImageResource(R.drawable.dice5);
                        txt.setText("five");
                        break;
                        case 6:
                        imgbtn.setImageResource(R.drawable.dice6);
                        txt.setText("six");
                        break;
                }
            }
        });
    }
}