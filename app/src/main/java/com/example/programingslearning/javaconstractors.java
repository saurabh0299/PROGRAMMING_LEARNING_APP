package com.example.programingslearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class javaconstractors extends AppCompatActivity {

    Button theory,video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javaconstractors);


        //gradiant animation

        RelativeLayout relativeLayout = findViewById(R.id.animationbackground);
        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

        //end

        theory=(Button)findViewById(R.id.theory1);
        video=(Button)findViewById(R.id.video);


        theory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(javaconstractors.this,javatheoryconstractor.class);
                startActivity(intent);
            }
        });


        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(javaconstractors.this,javavideoconstractor.class);
                startActivity(intent);
            }
        });


    }
}
