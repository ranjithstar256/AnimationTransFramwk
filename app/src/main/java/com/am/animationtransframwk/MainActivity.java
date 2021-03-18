package com.am.animationtransframwk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation animation,a;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.abc);
        a= AnimationUtils.loadAnimation(MainActivity.this,R.anim.abz);

    }

    public void ro(View view) {
        view.startAnimation(animation);
        textView.startAnimation(a);
    }
}