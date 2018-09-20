package com.example.hs140.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity {
Button c,l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        c=(Button)findViewById(R.id.button_con);
        l=(Button)findViewById(R.id.button_log);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RegActivity.this, "Registered successfully...", Toast.LENGTH_SHORT).show();

            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RegActivity.this,LoginScreen.class);
                startActivity(i);

            }
        });
    }
}
