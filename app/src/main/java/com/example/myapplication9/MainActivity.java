package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
    }
    private int num;
    public void Click(View view) {
        num = num + 1;
        if (num == 7){
            button1.setText("Enough to click. Go to new start!");
            num = 0;
        }
        else
            button1.setText("This is a click number: " + num);
    }
}