package com.example.hs140.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RewardActivity extends AppCompatActivity {
Button h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);
        h=(Button)findViewById(R.id.home);

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(RewardActivity.this,Welcome.class);
                startActivity(i);

            }
        });
    }

}
