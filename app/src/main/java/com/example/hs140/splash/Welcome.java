package com.example.hs140.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
Button c,rat,re,fe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_welcome);
        c=(Button)findViewById(R.id.button_comp);
        rat=(Button)findViewById(R.id.button_rat);
        re=(Button)findViewById(R.id.button_re);
        fe=(Button)findViewById(R.id.button_fd);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Welcome.this,Scrollme.class);
                startActivity(i);
            }
        });
        rat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Welcome.this,Ghmcrating.class);
                startActivity(i);
            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ia= new Intent( Welcome.this,RewardActivity.class);
                startActivity(ia);

            }
        });
        fe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ia= new Intent( Welcome.this,FeedbackActivity.class);
                startActivity(ia);
            }
        });
    }
}
