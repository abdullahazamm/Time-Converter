package com.example.timeconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConverterHours();
        ConverterMinutes();
        ConverterSeconds();
        Reset();

    }
    public void ConverterHours(){
        Button btn1=findViewById(R.id.button4);
        Button btn2=findViewById(R.id.button3);
        Button btn3=findViewById(R.id.button1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);


                float HoursToMinutes=Float.parseFloat(editText.getText().toString());
                float HToM=HoursToMinutes*60;

                editText1.setText(String.valueOf(HToM));

                float HoursToSeconds=Float.parseFloat(editText.getText().toString());
                float HToS=HoursToSeconds*3600 ;

                editText2.setText(String.valueOf(HToS));

            }
        });


    }
    public void ConverterMinutes() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);


                float MinutesToHours=Float.parseFloat(editText1.getText().toString());
                float MToH=MinutesToHours/60;
                editText.setText(String.valueOf(MToH));


                float MinutesToSeconds=Float.parseFloat(editText1.getText().toString());
                float MToS= MinutesToSeconds*60;
                editText2.setText(String.valueOf(MToS));
            }
        });
    }

    public void ConverterSeconds() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);


                float SecondsToHours=Float.parseFloat(editText2.getText().toString());
                float SToH=SecondsToHours/3600 ;
                editText.setText(String.valueOf(SToH));


                float SecondsToMinutes=Float.parseFloat(editText2.getText().toString());
                float SToM= SecondsToMinutes*60;
                editText1.setText(String.valueOf(SToM));

            }

        });

    }
    public void Reset(){
        Button resetbtn=findViewById(R.id.resetbtn);
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);



                editText.setText(null);
                editText1.setText(null);
                editText2.setText(null);

            }
        });


    }


}