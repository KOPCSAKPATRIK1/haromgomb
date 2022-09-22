package com.example.haromgomb;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
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

        textInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                textOutput.setText(textInput.getText().toString());
            }
            @Override
            public void afterTextChanged(Editable editable) {}
        });

        nagybetusGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textOutput.setText(textInput.getText().toString().toUpperCase(Locale.ROOT));
            }
        });

        kisbetusGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textOutput.setText(textInput.getText().toString().toLowerCase(Locale.ROOT));
            }
        });

        szinvaltasGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rn = new Random();
                int r = rn.nextInt(255);
                int g = rn.nextInt(255);
                int b = rn.nextInt(255);
                textOutput.setBackgroundColor(Color.rgb(r, g, b));
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