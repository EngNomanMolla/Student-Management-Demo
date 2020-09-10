package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity  {
    Spinner mSemesterSpinner;
    Button mButton;
    EditText nameEditText,rollEditText;
    long mPosition;
    String mSemester;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        DatabaseHelper databaseHelper=new DatabaseHelper(Main2Activity.this);
        mSemesterSpinner=findViewById(R.id.semestertSpinnerId);
        mButton=findViewById(R.id.saveButtonId);
        nameEditText=findViewById(R.id.nameEditTextId);
        rollEditText=findViewById(R.id.rollEditTextId);
        ArrayAdapter<CharSequence> arrayAdapter2=ArrayAdapter.createFromResource(this,R.array.semester,android.R.layout.simple_spinner_item);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSemesterSpinner.setAdapter(arrayAdapter2);

        mSemesterSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(id==0){
                    mPosition=id;
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                if(id==1){
                    mPosition=id;
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                if(id==2){
                    mPosition=id;
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                if(id==3){
                    mPosition=id;
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                if(id==4){
                    mPosition=id;
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                if(id==5){
                    mPosition=id;
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                if(id==6){
                    mPosition=id;
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }
                if(id==7){
                    mPosition=id;
                    String semester=parent.getItemAtPosition(position).toString();
                    mSemester=semester;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            String Name,Roll;
            @Override
            public void onClick(View v) {

                Name=nameEditText.getText().toString();
                Roll=rollEditText.getText().toString();

                DatabaseHelper databaseHelper=new DatabaseHelper(Main2Activity.this);
                long id=databaseHelper.InsertData(new ModelClass(mSemester,Roll,Name));
                if(id!=0){
                    Toast.makeText(Main2Activity.this, "Sucessfully inserted", Toast.LENGTH_SHORT).show();
                }





            }


        });
    }








}

