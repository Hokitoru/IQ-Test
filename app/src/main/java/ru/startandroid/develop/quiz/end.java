package ru.startandroid.develop.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class end extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        if (MainActivity.score < 2){
            TextView txtView = findViewById(R.id.end);
            txtView.setText("Ясно рекрут");
        }
        else if (MainActivity.score < 3){
            TextView txtView = findViewById(R.id.end);
            txtView.setText("3000к ммр");
        }
        else if (MainActivity.score < 4){
            TextView txtView = findViewById(R.id.end);
            txtView.setText("7000к ммр");
        }
        else{
            TextView txtView = findViewById(R.id.end);
            txtView.setText("10к ммр");
        }
    }
}