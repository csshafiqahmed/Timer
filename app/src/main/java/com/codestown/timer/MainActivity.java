package com.codestown.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        new CountDownTimer(10000,100){
//            public void onTick(long millisecondsUntilDone){
//                Log.i("Seconds Left : ",String.valueOf(millisecondsUntilDone/1000));
//            }
//            public void onFinish(){
//                Log.i("we are done","no more countdown");
//            }
//        }.start();




        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Log.i("It is a","Timer");
                handler.postDelayed(this,3000);
            }
        };
        handler.post(runnable);
    }
}