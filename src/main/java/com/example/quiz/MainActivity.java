package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    int score=0;
    Button next,close;
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next=findViewById(R.id.button1);
        close=findViewById(R.id.button6);
        radioGroup=findViewById(R.id.radio);

        close.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int i=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(i);
                String s=radioButton.getText().toString();
                if(score<1 && s.matches("Central Processing Unit"))
                {
                    score=score+1;
                }
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("s1",score);
                startActivity(intent);

            }
        });

    }
}