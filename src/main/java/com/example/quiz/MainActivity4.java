package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity4 extends AppCompatActivity {
    Button next,back;
    int score;
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        back=findViewById(R.id.button9);
        radioGroup=findViewById(R.id.radio2);
        Intent intent1=new Intent(getApplicationContext(),MainActivity3.class);
        Bundle b1=getIntent().getExtras();
        Integer s1=b1.getInt("s1");
        score=s1;
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(intent);
            }
        });
        next=findViewById(R.id.button4);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(i);
                String s=radioButton.getText().toString();
                if(score<4 && s.matches("Hardware"))
                {
                    score=score+1;
                }
                Intent intent=new Intent(getApplicationContext(),MainActivity5.class);
                intent.putExtra("s1",score);
                startActivity(intent);
            }
        });
    }
}