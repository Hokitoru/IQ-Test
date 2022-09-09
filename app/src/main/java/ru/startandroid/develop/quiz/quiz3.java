package ru.startandroid.develop.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quiz3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

        Button next1_button = findViewById(R.id.button3_1);
        next1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.score++;
                Intent switcher = new Intent(quiz3.this, quiz4.class);
                quiz3.this.startActivity(switcher);
            }
        });

        Button next2_button = findViewById(R.id.button3_2);
        next2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switcher = new Intent(quiz3.this, quiz4.class);
                quiz3.this.startActivity(switcher);
            }
        });
    }
}