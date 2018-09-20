package com.example.hs140.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Scrollme extends AppCompatActivity {
 Button b1,b2,b3,fileb;
 TextView t1,t2,t3;
  int c1=53,c2=111,c3=121;
  int flag1=0;
  int f2=0,f3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollme);
        b1=(Button)findViewById(R.id.v1);
        b2=(Button)findViewById(R.id.v2);
        b3=(Button)findViewById(R.id.v3);
        fileb=(Button)findViewById(R.id.file);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        Toast.makeText(getApplicationContext(),"Click on VOTE to vote :-)",Toast.LENGTH_SHORT).show();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if(flag1==1)
              {
                  Toast.makeText(getApplicationContext(),"Already voted,you can vote next post",Toast.LENGTH_SHORT).show();
              }
               else if (flag1==0) {
                  c1 = Integer.parseInt(t1.getText().toString());
                  t1.setText(String.format(Locale.ENGLISH, "%d", c1 + 1));

              }
              flag1=1;

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(f2==1)
                {
                    Toast.makeText(getApplicationContext(),"Already voted,you can vote next post",Toast.LENGTH_SHORT).show();
                }
                else {
                    c2 = Integer.parseInt(t2.getText().toString());
                    t2.setText(String.format(Locale.ENGLISH, "%d", c2 + 1));
                }        f2=1;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(f3==1)
                {
                    Toast.makeText(getApplicationContext(),"Already voted,you can vote next post",Toast.LENGTH_SHORT).show();
                }
                else {
                    c3 = Integer.parseInt(t3.getText().toString());
                    t3.setText(String.format(Locale.ENGLISH, "%d", c3 + 1));
                }
                f3=1;
            }
        });
        fileb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent (Scrollme.this,FilecompActivity.class);
                startActivity(i);
            }
        });
    }
}
