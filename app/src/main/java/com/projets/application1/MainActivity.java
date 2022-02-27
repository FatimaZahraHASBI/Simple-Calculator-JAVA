package com.projets.application1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    TextView result;
    Button submit;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        result=findViewById(R.id.result);
        submit=findViewById(R.id.submit);
        reset=findViewById(R.id.reset);

        submit.setOnClickListener(view -> {
            if (num1.getText().toString().equals("") || num2.getText().toString().equals("")){
                Toast.makeText(this, "Please fill all the numbers", Toast.LENGTH_SHORT).show();
            }
            else {
                float i = Float.valueOf(num1.getText().toString())+Float.valueOf(num2.getText().toString());
                result.setText(String.valueOf(i));
            }
        });

        reset.setOnClickListener(view -> {
            num1.setText("");
            num2.setText("");
            result.setText(null);
        });


    }



}