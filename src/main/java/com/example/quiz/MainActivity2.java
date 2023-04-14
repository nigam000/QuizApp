package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity2 extends AppCompatActivity {
    Button next,back;
    Switch aswitch;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        back=findViewById(R.id.button7);
        aswitch=findViewById(R.id.switch1);
        Intent intent=new Intent(getApplicationContext(),MainActivity.class);
        Bundle b=getIntent().getExtras();
        Integer s1=b.getInt("s1");
        score=s1;
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        aswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(score<2 && isChecked==true){
                    score=score+1;
                }
            }
        });
        next=findViewById(R.id.button2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
                intent.putExtra("s1",score);
                Bundle b1=getIntent().getExtras();
                startActivity(intent);
            }
        });
    }
}