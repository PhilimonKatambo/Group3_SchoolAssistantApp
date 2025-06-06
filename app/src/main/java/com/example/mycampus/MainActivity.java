package com.example.mycampus;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.cardview.widget.CardView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Intent;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        CardView classCard = findViewById(R.id.classCard);
        classCard.setOnClickListener(v -> {
            Intent classIntent = new Intent(MainActivity.this, class_schedule.class);
            startActivity(classIntent);
        });

        CardView assignmentCard = findViewById(R.id.assignmentCard);
        assignmentCard.setOnClickListener(v -> {
            Intent assignmentIntent = new Intent(MainActivity.this, AssignmentsAndExams.class);
            startActivity(assignmentIntent);
        });

        CardView campusCard = findViewById(R.id.campusCard);
        campusCard.setOnClickListener(v -> {
            Intent campusIntent = new Intent(MainActivity.this, campusmap.class);
            startActivity(campusIntent);
        });

        ImageView imageView10 = findViewById(R.id.imageView10);

        imageView10.setOnClickListener(v -> {
            Intent settingsIntent = new Intent(MainActivity.this, profileSettings.class);
            startActivity(settingsIntent);
        });

        ImageView imageView4 = findViewById(R.id.imageView4);

        imageView4.setOnClickListener(v -> {
            Intent settingsIntent = new Intent(MainActivity.this, profileSettings.class);
            startActivity(settingsIntent);
        });

    }
}