package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        String btnText = "";

        switch (view.getId()) {
            case R.id.btn1:
                btnText = "Button 1 Clicked";
                break;

            case R.id.btn2:
                    btnText = "Button 2 Clicked";
                    break;

            case R.id.btn3:
                btnText = "Button 3 Clicked";
                break;
        }

        Toast.makeText(MainActivity.this, btnText, Toast.LENGTH_SHORT).show();
    }
}