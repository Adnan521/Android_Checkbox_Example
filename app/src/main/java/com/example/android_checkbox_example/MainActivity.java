package com.example.android_checkbox_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox,checkBox2,checkBox3,checkBox4;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox=findViewById(R.id.checkBox);
        checkBox2=findViewById(R.id.checkBox2);
        checkBox3=findViewById(R.id.checkBox3);
        checkBox4=findViewById(R.id.checkBox4);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);



        //CheckBox Working

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int TotalAmount=0;
                StringBuilder result=new StringBuilder();
                result.append("Your Selected items is:");
                if (checkBox.isChecked()){
                   result.append("\n Sandwitch 500 Rs");
                   TotalAmount += 500;
                }
                if (checkBox2.isChecked()){
                    result.append("\n Pizza 1000 Rs");
                    TotalAmount += 1000;
                }
                if (checkBox3.isChecked()){
                    result.append("\n Burger 300 Rs");
                    TotalAmount += 300;
                }
                if (checkBox4.isChecked()){
                    result.append("\n Coffee 100 Rs");
                    TotalAmount += 100;
                }
                result.append("\nTotal Price is:"+TotalAmount+"Rs");

                textView.setText(result.toString());
            }
        });

    }
}