package com.example.prateeksingh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
                int firstValue,secondValue,ans;
                firstValue = Integer.parseInt(etFistValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue + secondValue;
                tvAns.setText("Ans = "+ans);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue = Integer.parseInt(etFistValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue - secondValue;
                tvAns.setText("Ans = "+ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue,ans;
                firstValue = Integer.parseInt(etFistValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = firstValue * secondValue;
                tvAns.setText("Ans = "+ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstValue,secondValue;
                float ans;
                firstValue = Integer.parseInt(etFistValue.getText().toString());
                secondValue = Integer.parseInt(etSecondValue.getText().toString());
                ans = (float)firstValue / secondValue;
                tvAns.setText("Ans = "+ans);
            }
        });


    }
}