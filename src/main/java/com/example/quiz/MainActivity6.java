package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    TextView tv;
    Button close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        tv=findViewById(R.id.textView8);
        Intent intent1=new Intent(getApplicationContext(),MainActivity5.class);
        Bundle b1=getIntent().getExtras();
        Integer s1=b1.getInt("s1");
        String s2=String.valueOf(s1);
        tv.setText(s2);
        close=findViewById(R.id.button11);
        close.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent);
            }
        });
    }
}