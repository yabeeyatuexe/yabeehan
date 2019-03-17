package com.example.m_062.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    TextView nameTextView;
    TextView foodTextView;
    TextView manjiTextView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    String[] text1 = {"こ", "始", "ナイ", "クレ"};
    String[] text2 = {"な", "皇", "チン", "オパ"};
    String[] text3 = {"つ", "帝", "ゲール", "トラ"};
    int[] images = {R.drawable.manireyyyy, R.drawable.ohooooooooooooo,R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextView = (TextView) findViewById(R.id.nameTextView);
        foodTextView = (TextView) findViewById(R.id.foodTextView);
        manjiTextView = (TextView) findViewById(R.id.manjiTextView);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);

        imageView1.setImageResource(R.drawable.manireyyyy);
        imageView2.setImageResource(R.drawable.manireyyyy);
        imageView3.setImageResource(R.drawable.manireyyyy);
    }

    public void button1(View v) {
        Random random = new Random();
        int index = random.nextInt(4);
        imageView1.setImageResource(images[index]);
        nameTextView.setText(text1[index]);
    }

    public void button2(View v) {
        Random random = new Random();
        int index = random.nextInt(4);
        imageView2.setImageResource(images[index]);
        foodTextView.setText(text2[index]);
    }

    public void button3(View v) {
        Random random = new Random();
        int index = random.nextInt(4);
        imageView3.setImageResource(images[index]);
        manjiTextView.setText(text3[index]);
    }

}
