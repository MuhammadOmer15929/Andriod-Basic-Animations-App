package com.example.myass2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    ImageView img1;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        getSupportActionBar().hide();

        img1=(ImageView) findViewById(R.id.imageView);

        btn2=(Button) findViewById(R.id.button2);
        btn3=(Button) findViewById(R.id.button3);
        btn4=(Button) findViewById(R.id.button4);
        btn5=(Button) findViewById(R.id.button10);
        btn6=(Button) findViewById(R.id.button11);
        btn7=(Button) findViewById(R.id.button12);
        btn8=(Button) findViewById(R.id.button13);
        btn9=(Button) findViewById(R.id.button14);
        btn10=(Button) findViewById(R.id.button15);

        btn1=(Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                img1.setVisibility(View.VISIBLE);
                img1.startAnimation(animation);


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                img1.setVisibility(View.VISIBLE);
                img1.startAnimation(animation);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                img1.setVisibility(View.VISIBLE);
                img1.startAnimation(animation);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                img1.setVisibility(View.VISIBLE);
                img1.startAnimation(animation);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
                img1.setVisibility(View.VISIBLE);
                img1.startAnimation(animation);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
                img1.setVisibility(View.VISIBLE);
                img1.startAnimation(animation);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
                img1.setVisibility(View.VISIBLE);
                img1.startAnimation(animation);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.inter);
                img1.setVisibility(View.VISIBLE);
                img1.startAnimation(animation);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clock);
                img1.setVisibility(View.VISIBLE);
                img1.startAnimation(animation);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.clearAnimation();
            }
        });

    }
}