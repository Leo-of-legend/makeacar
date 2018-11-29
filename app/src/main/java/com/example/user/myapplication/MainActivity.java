package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Car bENZ = new Car();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bENZ.engine=4;
        bENZ.seat=4;
        bENZ.speed=0;
        bENZ.wheel=4;

        Log.d("my_tag","SpeedUp");
        bENZ.SpeedUp();
        Log.d("my_tag","SpeedDown");
        bENZ.SpeedDown();

        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button){
            bENZ.SpeedUp();
        }
        while (v.getId()==R.id.button2){
            bENZ.SpeedDown();
            break;
        }
        }
}
class Car {
        int speed;
        int engine;
        int wheel;
        int seat;

        void SpeedUp() {
            speed = speed + 1;
            Log.d("my_tag", "속도" + speed + "가올랐습니다");
        }

        void SpeedDown() {
            speed = speed - 1;
            Log.d("my_tag", "속도" + speed + "가올랐습니다");
        }

    }