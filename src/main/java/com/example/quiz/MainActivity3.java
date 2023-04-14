package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity3 extends AppCompatActivity {
    Button next,back;
    CheckBox c1,c2,c3,c4;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        back=findViewById(R.id.button8);
        c1=findViewById(R.id.checkBox);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        c4=findViewById(R.id.checkBox4);
        Intent intent1=new Intent(getApplicationContext(),MainActivity2.class);
        Bundle b1=getIntent().getExtras();
        Integer s1=b1.getInt("s1");
        score=s1;
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        next=findViewById(R.id.button3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(score<3 && c1.isChecked() && c2.isChecked() && c3.isChecked())
                {
                    score=score+1;
                }
                Intent intent=new Intent(getApplicationContext(),MainActivity4.class);
                intent.putExtra("s1",score);
                Bundle b1=getIntent().getExtras();
                startActivity(intent);
            }
        });
    }
}