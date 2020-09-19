package com.example.a2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText w = findViewById(R.id.editTextTextPersonName);
        final EditText a = findViewById(R.id.editTextTextPersonName2);
        Button b = findViewById(R.id.button);
        Button t = findViewById(R.id.button2);
        Button z = findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int bb = Integer.parseInt(w.getText().toString());
                int xx = Integer.parseInt(a.getText().toString());
                int mohammed = xx + bb;

                Toast.makeText(MainActivity.this, mohammed + "", Toast.LENGTH_LONG).show();


            }
        });

    t.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        int ww = Integer.parseInt(w.getText().toString());
        int qq = Integer.parseInt(a.getText().toString());
        int VV = ww * qq ;
            Toast.makeText(MainActivity.this, VV+ "", Toast.LENGTH_LONG).show();
        }
    });


    }
  }