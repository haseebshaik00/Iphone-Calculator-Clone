package com.e.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import java.text.DecimalFormat;

public class MainActivity extends Activity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19;
    EditText e1;
    Double r1,r2,r3,r4;
    String s;
    boolean add, sub, mul, div,mod;
    DecimalFormat df = new DecimalFormat("###.#######");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15);
        b16 = (Button) findViewById(R.id.b16);
        b17 = (Button) findViewById(R.id.b17);
        b18 = (Button) findViewById(R.id.b18);
        b19 = (Button) findViewById(R.id.b19);

        e1 = (EditText) findViewById(R.id.e1);

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText((e1.getText() + "1").replaceFirst("^0+(?!$)", ""));
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText((e1.getText() + "2").replaceFirst("^0+(?!$)", ""));
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText((e1.getText() + "3").replaceFirst("^0+(?!$)", ""));
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText((e1.getText() + "0").replaceFirst("^0+(?!$)", ""));
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(e1.getText() + ".");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText((e1.getText() + "7").replaceFirst("^0+(?!$)", ""));
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText((e1.getText() + "8").replaceFirst("^0+(?!$)", ""));
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText((e1.getText() + "9").replaceFirst("^0+(?!$)", ""));
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText((e1.getText() + "4").replaceFirst("^0+(?!$)", ""));
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText((e1.getText() + "5").replaceFirst("^0+(?!$)", ""));
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText((e1.getText() + "6").replaceFirst("^0+(?!$)", ""));
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    r1 = Double.parseDouble(e1.getText() + "");
                    add = true;
                    e1.setText(null);

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    r1 = Double.parseDouble(e1.getText() + "");
                    sub = true;
                    e1.setText(null);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    r1 = Double.parseDouble(e1.getText() + "");
                    mul = true;
                    e1.setText(null);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    r1 = Double.parseDouble(e1.getText() + "");
                    div = true;
                    e1.setText(null);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                r1 = Double.parseDouble(e1.getText() + "");
                mod = true;
                e1.setText(null);
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                r2 = Double.parseDouble(e1.getText() + "");
                if (add == true) {
                    e1.setText(df.format(r1+r2)+ "");
                    add = false;
                }

                if (sub == true) {
                    e1.setText(df.format(r1-r2)+ "");
                    sub = false;
                }

                if (mul == true) {
                    e1.setText(df.format(r1*r2)+ "");
                    mul = false;
                }

                if (div == true) {
                    e1.setText(df.format(r1/r2)+ "");
                    div = false;
                }

                if(mod==true) {
                    e1.setText(df.format(r1%r2)+ "");
                    mod=false;
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("0");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r3 = Double.parseDouble(e1.getText() + "");
                e1.setText(df.format(r3*-1)+ "");            }
        });
    }
}