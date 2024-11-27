package com.example.wash_wear;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //adding edge to edge support
    private static int SPLASH_SCREEN_TIMER = 5000;

    //creating hooks
    View firstLine, secondLine, thirdLine, fourthLine, fifthLine, sixthLine;

    //hooks for textviews
            TextView appName, tagLine;

      //Animation Hooks
    Animation topAnim, bottomAnim, middleAnim;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //--------making windows fullscreen

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                 WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //calling the splash screen layout
        setContentView(R.layout.splash_screen);


        //Assigning hooks to View IDs

        firstLine = findViewById(R.id.first_line);
        secondLine = findViewById(R.id.second_line);
        thirdLine = findViewById(R.id.third_line);
        fourthLine = findViewById(R.id.fourth_line);
        fifthLine = findViewById(R.id.fifth_line);
        sixthLine = findViewById(R.id.sixth_line);


        //Assigning hooks to textViews
        appName = findViewById(R.id.appName);
        tagLine = findViewById(R.id.tagline);


        //Assigning hooks to animation

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAnim = AnimationUtils.loadAnimation(this,R.anim.middle_animation);


        //setting animation to views

        firstLine.setAnimation(topAnim);
        secondLine.setAnimation(topAnim);
        thirdLine.setAnimation(topAnim);
        fourthLine.setAnimation(topAnim);
        fifthLine.setAnimation(topAnim);
        sixthLine.setAnimation(topAnim);

        //setting animation to textViews
        appName.setAnimation(middleAnim);
        tagLine.setAnimation(bottomAnim);


        //splash screen code to call new Activity after 5 seconds: layout navigation
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //calling a new activity
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN_TIMER);

    }
}