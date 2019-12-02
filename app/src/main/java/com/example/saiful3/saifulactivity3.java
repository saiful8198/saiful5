package com.example.saiful3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class saifulactivity3 extends AppCompatActivity {
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saifulactivity3);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(saifulactivity3.this, MainActivity.class);
                saifulactivity3.this.startActivity(a);
                saifulactivity3.this.finish();

            }
        });
    }

}

