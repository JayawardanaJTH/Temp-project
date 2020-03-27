package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Button Add,Sub,Multi,Div;
    private EditText editText1,editText2,editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Add = (Button) findViewById(R.id.btAdd);
        Sub = (Button) findViewById(R.id.btSub);
        Multi = (Button) findViewById(R.id.btMul);
        Div = (Button) findViewById(R.id.btDiv);
        editText1 = (EditText) findViewById(R.id.editText3);
        editText2 = (EditText) findViewById(R.id.editText4);
        editText3 = (EditText) findViewById(R.id.editText5);

        final Context context =  getApplicationContext();
        int duration = Toast.LENGTH_LONG;

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().toString().equals("") || editText1.getText().toString().equals("")){

                    Toast.makeText(SecondActivity.this, "Please enter some details", Toast.LENGTH_SHORT).show();
                }
                else{

                    editText1.getText().toString();
                    editText1.getText().toString();
                    double a1 = Double.valueOf(editText1.getText().toString());
                    double a2 = Double.valueOf(editText2.getText().toString());
                    double a3;
                    a3 = a1+a2;
                    editText3.setText(String.valueOf(a3));

                    CharSequence message = "Add";
                    Toast toast = Toast.makeText(context,message , Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.getText().toString().equals("") || editText1.getText().toString().equals("")) {

                    Toast.makeText(SecondActivity.this, "Please enter some details", Toast.LENGTH_SHORT).show();
                } else {

                    editText1.getText().toString();
                    editText1.getText().toString();
                    double a1 = Double.valueOf(editText1.getText().toString());
                    double a2 = Double.valueOf(editText2.getText().toString());
                    double a3;
                    a3 = a1 - a2;
                    editText3.setText(String.valueOf(a3));

                    CharSequence message = "Subtract";
                    Toast toast = Toast.makeText(context,message , Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });

        Multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().toString().equals("") || editText1.getText().toString().equals("")){

                    Toast.makeText(SecondActivity.this, "Please enter some details", Toast.LENGTH_SHORT).show();
                }
                else{

                    editText1.getText().toString();
                    editText1.getText().toString();
                    double a1 = Double.valueOf(editText1.getText().toString());
                    double a2 = Double.valueOf(editText2.getText().toString());
                    double a3;
                    a3 = a1*a2;
                    editText3.setText(String.valueOf(a3));

                    CharSequence message = "Multiply";
                    Toast toast = Toast.makeText(context,message , Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText1.getText().toString().equals("") || editText1.getText().toString().equals("")){

                    Toast.makeText(SecondActivity.this, "Please enter some details", Toast.LENGTH_SHORT).show();
                }
                else{

                    editText1.getText().toString();
                    editText1.getText().toString();
                    double a1 = Double.valueOf(editText1.getText().toString());
                    double a2 = Double.valueOf(editText2.getText().toString());
                    double a3;
                    if(a1 > a2) {
                        a3 = a1 / a2;
                        editText3.setText(String.valueOf(a3));
                    }
                    else {
                        a3 = a2 / a1;
                        editText3.setText(String.valueOf(a3));
                    }

                    CharSequence message = "Division";
                    Toast toast = Toast.makeText(context,message , Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        Intent intent = getIntent();
        int number1 = intent.getIntExtra("EXTRA_NUMBER1", 0);
        int number2 = intent.getIntExtra("EXTRA_NUMBER2", 0);

        EditText editText1 = (EditText) findViewById(R.id.editText3);
        EditText editText2 = (EditText) findViewById(R.id.editText4);

        editText1.setText("" + number1);
        editText2.setText("" + number2);

    }
}
