package ru.startandroid.develop.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quiz4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);

        Button next1_button = findViewById(R.id.button4_1);
        next1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.score++;
                Intent switcher = new Intent(quiz4.this, end.class);
                quiz4.this.startActivity(switcher);
            }
        });

        Button next2_button = findViewById(R.id.button4_2);
        next2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher = new Intent(quiz4.this, end.class);
                quiz4.this.startActivity(switcher);
            }
        });
    }
}