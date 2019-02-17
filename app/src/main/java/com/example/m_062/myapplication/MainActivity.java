package com.example.m_062.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    TextView textView1;
    ImageView imageView;
    int[] images = {R.drawable.manireyyyy, R.drawable.ohooooooooooooo};
    String[] name1 = {"モ", "こ"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.textView1);
        imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setImageResource(R.drawable.manireyyyy);
    }

    public void button(View v) {
        Random random = new Random();
        int index = random.nextInt(2);
        imageView.setImageResource(images[index]);
        textView1.setText(name1[index]);
    }

}
