package com.brewsec.evabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Decode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decode);

        String gc_key_1 = "ZXZhYnN7czBtMzBuM19pcw==";  //Ew! what is that encoding, with an " == in the end "?
        String gc_key_2 = "X2NoYW5nIW5nX2dyYXZpdGF0aW9uYWxfcHJvcGVydGllcw==";
        String gc_key_3 = "X2dldF9vdXR0YV9oZXJlX2FzYXAhfQ==";

        String THE_KEY = gc_key_1 + gc_key_2 + gc_key_3;

        Button btnhintdeode = (Button) findViewById(R.id.buttonhintdecode);
        final TextView tvdecodehint = (TextView) findViewById(R.id.textViewhintgc);
        btnhintdeode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvdecodehint.setText("Reversing APK to Java? hmmm..");
            }
        });
    }

}
