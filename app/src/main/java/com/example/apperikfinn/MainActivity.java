package com.example.apperikfinn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.opengl.Visibility;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    TranslateAnimation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animation = new TranslateAnimation(0.0f, 0.0f,-500.0f, 1920.0f);
        //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
        animation.setDuration(5000);  // animation duration
        animation.setRepeatCount(1);  // animation repeat count
        animation.setRepeatMode(1);   // repeat animation (left to right, right to left )
        animation.setInterpolator(new LinearInterpolator());

        ImageView finn = (ImageView)findViewById(R.id.imageButton);
        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams)finn.getLayoutParams();
        params.topMargin = -505;
        params.leftMargin = 0;
        findViewById(R.id.imageButton).setVisibility(View.INVISIBLE);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView finn = (ImageView)findViewById(R.id.imageButton);
                findViewById(R.id.button).setVisibility(View.INVISIBLE);
                findViewById(R.id.imageButton).setVisibility(View.VISIBLE);
                finn.startAnimation(animation);  // start animation


            }
        });




        finn.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.performClick();
                findViewById(R.id.textView).setVisibility(View.VISIBLE);
                findViewById(R.id.imageButton).clearAnimation();
                findViewById(R.id.imageButton).setVisibility(View.INVISIBLE);

                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.audiofinn);
                mediaPlayer.start(); // no need to call prepare(); create() does that for you
                return false;
            }
        });


    }


    public void heheh(){
        //hahaha nix passiert

    }

}
