package com.stv.trieucse.nhacsan;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;

import com.github.lzyzsd.circleprogress.DonutProgress;

import java.util.Timer;
import java.util.TimerTask;

    public class Splash extends Activity {
        private Timer timer;
        private DonutProgress donutProgress;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);
            donutProgress = (DonutProgress) findViewById(R.id.donut_progress);


            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            donutProgress.setProgress(donutProgress.getProgress() + 1);
                            if(donutProgress.getProgress()==100)
                            {
                                timer.cancel();
                                Toast.makeText(Splash.this,"CHÀO MỪNG BẠN ĐẾN VỚI SÀN NHẠC",Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(Splash.this, MainActivity.class);
                                startActivity(intent);

                            }

                        }
                    });
                }
            }, 0, 30);
            //timer.cancel();
//            new CountDownTimer(1000, 100) {
//
//                public void onTick(long millisUntilFinished) {
//                    donutProgress.setProgress(donutProgress.getProgress() + 1);
//                }
//
//                public void onFinish() {
//                    Toast.makeText(Splash.this,"complite",Toast.LENGTH_LONG).show();
//
//                }
//            }.start();
        }


        @Override
        protected void onDestroy() {
            super.onDestroy();
            timer.cancel();
        }


    }
