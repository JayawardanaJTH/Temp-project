package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    public static final String EXTRA_NUMBER1 = "com.example.intentsproj.EXTRA_NUMBER";
//    public static final String EXTRA_NUMBER2 = "com.example.intentsproj.EXTRA_NUMBER";

    EditText number1,number2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.customtoast,(ViewGroup)
        findViewById(R.id.custom_toas_layout));

        number1 = (EditText) findViewById(R.id.editTextNumberOne);
        number2 = (EditText) findViewById(R.id.editTextNumberTwo);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Context context =  getApplicationContext();
                int duration = Toast.LENGTH_LONG;

                if(!number1.getText().toString().isEmpty() && !number2.getText().toString().isEmpty()){
                    CharSequence message = "Welcome";
                    Toast toast = Toast.makeText(context,message , Toast.LENGTH_LONG);
                    toast.show();
                    openActivityTwo();

                }
                else{
                    CharSequence message = "Error";
                    Toast toast = Toast.makeText(context,message , Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout);
        toast.show();





    }

    public void openActivityTwo(){

        EditText editText1 = (EditText) findViewById(R.id.editTextNumberOne);
        int number1 = Integer.parseInt(editText1.getText().toString());

        EditText editText2 = (EditText) findViewById(R.id.editTextNumberTwo);
        int number2 = Integer.parseInt(editText2.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("EXTRA_NUMBER1", number1);
        intent.putExtra("EXTRA_NUMBER2", number2);
        startActivity(intent);
    }

}
