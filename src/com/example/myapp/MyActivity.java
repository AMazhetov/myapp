package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity implements View.OnClickListener{

    Button umnosh;
    Button sloshi;
    Button vychti;
    Button razdeli;

    EditText editText1;
    EditText editText2;

    TextView answer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        umnosh = (Button) findViewById(R.id.umnosh);

        sloshi = (Button) findViewById(R.id.sloshi);

        vychti = (Button) findViewById(R.id.vychti);

        razdeli = (Button) findViewById(R.id.razdeli);

        answer = (TextView) findViewById(R.id.Answer);

        editText1 = (EditText) findViewById(R.id.editText1);

        editText2 = (EditText) findViewById(R.id.editText2);

        umnosh.setOnClickListener(this);
        razdeli.setOnClickListener(this);
        vychti.setOnClickListener(this);
        sloshi.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        double first = 0;
        double second = 0;
        double outs;
        String val;
        first = Double.parseDouble(editText1.getText().toString());
        second = Double.parseDouble(editText2.getText().toString());

        switch (view.getId()) {
            case R.id.umnosh:
                outs = first * second;
                val = new Double(outs).toString();
                answer.setText(val);
                break;
            case R.id.sloshi:
                outs = first + second;
                val = new Double(outs).toString();
                answer.setText(val);
                break;
            case R.id.razdeli:
                outs = first / second;
                val = new Double(outs).toString();
                answer.setText(val);
                break;
            case R.id.vychti:
                outs = first - second;
                val = new Double(outs).toString();
                answer.setText(val);
                break;
        }

    }
}
