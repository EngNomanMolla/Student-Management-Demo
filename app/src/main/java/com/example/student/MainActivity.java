package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mViewButtonId,mAddbuttonId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAddbuttonId=findViewById(R.id.studentAddButtonId);
        mViewButtonId=findViewById(R.id.studentViewButtonId);
        mAddbuttonId.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.studentAddButtonId){
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);


        }
    }
}
