package com.brewsec.evabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Game extends AppCompatActivity {

    EditText userno = (EditText) findViewById(R.id.no);
    TextView rand = (TextView) findViewById(R.id.randno);
    TextView points = (TextView) findViewById(R.id.points);
    TextView tvscore = (TextView) findViewById(R.id.textViewtotal);
    Button btcheck = (Button) findViewById(R.id.buttonchecknum);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        btcheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int win = 0;
                int lose = 1;

                String uinput = userno.getText().toString();

                rand.setText(uinput);

                for(;;)
                {
                    Random r = new Random();
                    final int sec = r.nextInt(200);

                    if(Integer.parseInt(uinput) == sec)
                    {
                        win += 1;
                        lose += -1;
                        points.setText("You Win!");
                    }
                    else{
                        lose += 1;
                        win = 0;
                        points.setText("You Lose!");
                    }
                }


            }
        });
    }

}