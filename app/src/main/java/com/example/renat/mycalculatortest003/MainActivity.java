package com.example.renat.mycalculatortest003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    EditText editText;
    EditText editText2;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    String mCount = "";
    double a,b,c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);
        int a=0;
        int b=0;
        int c=0;
        editText =(EditText)findViewById(R.id.editText);
        editText2 =(EditText)findViewById(R.id.editText2);
        textView =(TextView)findViewById(R.id.textView);





        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        a =Float.parseFloat(editText.getText().toString());
        b =Float.parseFloat(editText2 .getText().toString());
        switch (v.getId()) {
            case R.id.button10:
                mCount = "+";
                c = a + b;
                break;
            case R.id.button12:
                mCount = "-";
                c = a - b;
                break;
            case R.id.button13:
                mCount = "*";
                c = a * b;
                break;
            case R.id.button15:
                mCount = "/";
                c = a / b;
                break;
            default:
                break;
        }
        textView.setText(a + " " + mCount + " " + b + " = " + c);

    }
}
