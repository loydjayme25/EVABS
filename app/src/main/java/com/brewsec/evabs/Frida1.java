package com.brewsec.evabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Frida1 extends AppCompatActivity implements View.OnClickListener{

    int a=25, b=2, x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frida1);
        Button bt = (Button) findViewById(R.id.fbutton);
        bt.setOnClickListener(this);

        Button btnhint = (Button) findViewById(R.id.buttonhintfrida);
        final TextView tvhint = (TextView) findViewById(R.id.textViewhintfrida);
        btnhint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvhint.setText("``Dynamic instrumentation`` what?");
            }
        });
    }

    @Override
    public void onClick(View view) {

        TextView tv = (TextView)findViewById(R.id.result);
        TextView at = (TextView)findViewById(R.id.valuea);
        TextView bt = (TextView)findViewById(R.id.valueb);
        TextView xt = (TextView)findViewById(R.id.xres);

        at.setText(String.valueOf(a));
        bt.setText(String.valueOf(b));

        x = a*b;
        xt.setText(String.valueOf(x));
        if (x > 560) {
            tv.setText("VIBRAN IS RESDY TO FLY! YOU ARE GOING HOME!");
        }
        else{
            tv.setText("Co-ordinates Not Found!");
        }

    }
}
