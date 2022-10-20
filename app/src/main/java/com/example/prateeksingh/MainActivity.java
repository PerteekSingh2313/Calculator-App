package com.example.prateeksingh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etFistValue,etSecondValue;
    TextView tvAns;
    Button add,subtract,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFistValue=findViewById(R.id.etFirstValue);
        etSecondValue=findViewById(R.id.etSecondValue);

        tvAns=findViewById(R.id.tvAns);
        add=findViewById(R.id.btAdd);
        subtract=findViewById(R.id.btSubtract);
        multiply=findViewById(R.id.btMultiply);
        divide=findViewById(R.id.btDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(TextUtils.isEmpty(etFistValue.getText().toString()) || TextUtils.isEmpty(etSecondValue.getText().toString()))){
                    int firstValue,secondValue,ans;
                    firstValue = Integer.parseInt(etFistValue.getText().toString());
                    secondValue = Integer.parseInt(etSecondValue.getText().toString());
                    ans = firstValue + secondValue;
                    tvAns.setText("Addition = "+ans);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Please Enter Value",Toast.LENGTH_LONG).show();
                }
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;

                if(!(TextUtils.isEmpty(etFistValue.getText().toString()) || TextUtils.isEmpty(etSecondValue.getText().toString()))){
                    firstValue = Integer.parseInt(etFistValue.getText().toString());
                    secondValue = Integer.parseInt(etSecondValue.getText().toString());
                    ans = firstValue - secondValue;
                    tvAns.setText("Subtration = "+ans);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Please Enter Value",Toast.LENGTH_LONG).show();
                }

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(TextUtils.isEmpty(etFistValue.getText().toString()) || TextUtils.isEmpty(etSecondValue.getText().toString()))){
                    int firstValue,secondValue,ans;
                    firstValue = Integer.parseInt(etFistValue.getText().toString());
                    secondValue = Integer.parseInt(etSecondValue.getText().toString());
                    ans = firstValue * secondValue;
                    tvAns.setText("Multiplication = "+ans);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Please Enter Value",Toast.LENGTH_LONG).show();
                }

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(TextUtils.isEmpty(etFistValue.getText().toString()) || TextUtils.isEmpty(etSecondValue.getText().toString()))){
                    int firstValue,secondValue;
                    double ans;
                    firstValue = Integer.parseInt(etFistValue.getText().toString());
                    secondValue = Integer.parseInt(etSecondValue.getText().toString());
                    ans = (float)firstValue / secondValue;
                    tvAns.setText("Division = "+ans);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Please Enter Value",Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}