package com.piyushgarg.binaryconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText binarynum = (EditText) findViewById(R.id.binarynum);
        final Button button = (Button) findViewById(R.id.button1);
        final TextView result = (TextView) findViewById(R.id.result);

        final EditText decimalnum =(EditText) findViewById(R.id.decimalnum);
        final Button button2 = (Button) findViewById(R.id.button2);
        final TextView result3 = (TextView) findViewById(R.id.result3);

        final TextView result4 = (TextView) findViewById(R.id.result4);

        final TextView result5 = (TextView) findViewById(R.id.result5);


       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              int num =  Integer.parseInt(decimalnum.getText().toString());
              String bin=Integer.toBinaryString(num);
              String hex=Integer.toHexString(num);
              String oct=Integer.toOctalString(num);

              result3.setText("Binary:"+ " "+ bin);
              result4.setText("HexaDecimal:"+ " "+ hex);
              result5.setText("OctalDecimal:"+ " " +oct);

           }
       });





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n= Integer.parseInt(binarynum.getText().toString());
                int decimal =0;
                int i=0;
                int remainder;

                while (n!=0) {
                    remainder =(int)n%10;
                    n/=10;
                    decimal+=remainder*Math.pow(2,i);
                    ++i;

                }

                System.out.print(decimal);

                String res = Integer.toString(decimal);
                result.setText("Decimal : " +res);
            }
        });
    }
}
