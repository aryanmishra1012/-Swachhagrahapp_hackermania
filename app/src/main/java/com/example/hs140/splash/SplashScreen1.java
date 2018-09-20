package com.example.hs140.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen1);
        Thread myThread= new Thread(){
            @Override
            public void run() {
                try {
                    sleep(200);
                    Intent intent=new Intent(SplashScreen1.this,LoginScreen.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        };
        myThread.start();
    }
}
