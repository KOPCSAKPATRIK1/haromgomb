package com.example.haromgomb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    RelativeLayout relativeLayout;
    private EditText textInput;
    private Button nagybetusGomb;
    private Button kisbetusGomb;
    private Button szinvaltasGomb;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        nagybetusGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textInput.getText().toString();
                String output = input.toUpperCase(Locale.ROOT);
                textInput.setText(output);
            }
        });

        kisbetusGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textInput.getText().toString();
                String output = input.toLowerCase(Locale.ROOT);
                textInput.setText(output);
            }
        });

        szinvaltasGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int r = rn.nextInt(255);
                int g = rn.nextInt(255);
                int b = rn.nextInt(255);
            }
        });

    }



    private void init()
    {
        relativeLayout = findViewById(R.id.layout);
        textInput = findViewById(R.id.textIntput);
        nagybetusGomb = findViewById(R.id.nagyBetusGomb);
        kisbetusGomb = findViewById(R.id.kisBetusGomb);
        szinvaltasGomb = findViewById(R.id.szinValtoGomb);
        textOutput = findViewById(R.id.textOutput);
    }
}