package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.number1);
        EditText num2 = findViewById(R.id.number2);
        Button calculate = findViewById(R.id.calc);
        TextView result = findViewById(R.id.tot);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a =Integer.parseInt(num1.getText().toString());
                int b =Integer.parseInt(num2.getText().toString());
                int x = a+b ;
                result.setText(x+"");
                System.out.println("///"+x);
            }
        });

    }


}