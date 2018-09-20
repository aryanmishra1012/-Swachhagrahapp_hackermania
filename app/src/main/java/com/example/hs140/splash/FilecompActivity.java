package com.example.hs140.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FilecompActivity extends AppCompatActivity {
Button file;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filecomp);
        file=(Button)findViewById(R.id.filec);

        file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FilecompActivity.this, "Complain registered successfully", Toast.LENGTH_SHORT).show();
                Intent i= new Intent (FilecompActivity.this,Welcome.class);
                startActivity(i);

            }
        });
    }
}
