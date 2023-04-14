package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity5 extends AppCompatActivity {
    Button next,back;
    RadioGroup radioGroup;
    RadioButton radioButton;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        radioGroup=findViewById(R.id.radio3);
        back=findViewById(R.id.button10);
        Intent intent1=new Intent(getApplicationContext(),MainActivity4.class);
        Bundle b1=getIntent().getExtras();
        Integer s1=b1.getInt("s1");
        score=s1;
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        next=findViewById(R.id.button5);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(i);
                String s=radioButton.getText().toString();
                if(score<5 && s.matches("Computer understands only Binary Language"))
                {
                    score=score+1;
                }
                Intent intent=new Intent(getApplicationContext(),MainActivity6.class);
                intent.putExtra("s1",score);
                startActivity(intent);
            }
        });
    }
}