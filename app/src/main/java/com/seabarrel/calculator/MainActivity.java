package com.seabarrel.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView equation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        equation = this.findViewById(R.id.equation);

        // registering buttons
        this.findViewById(R.id.equals).setOnClickListener(this::onClick);

    }

    public void onClick(View view) {
        equation.setText(String.valueOf(view.getId()));
    }
}