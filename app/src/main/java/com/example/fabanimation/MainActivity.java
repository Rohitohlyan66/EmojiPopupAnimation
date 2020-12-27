package com.example.fabanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencing Views
        btn = findViewById(R.id.btn);
        cardView = findViewById(R.id.card_view);


        //Setting up Animation
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fab_anim);


        //Button long click listener
        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                //Showing card view with animation
                cardView.setVisibility(View.VISIBLE);
                cardView.startAnimation(animation);

                return false;
            }
        });
    }
}