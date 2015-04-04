package com.sourav.converter;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editcms = (EditText) findViewById(R.id.editcms);
        final EditText editinches = (EditText) findViewById (R.id.editinches);
        Button btnconvert = (Button)findViewById(R.id.btnconvert);

        configureImageButton();


        btnconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Converted", Toast.LENGTH_SHORT).show();
                double cms = Double.valueOf(editcms.getText().toString());
                double inches = cms * 0.393701;
                String inch = String.format("%.2f",inches);
                editinches.setText(String.valueOf(inch));
            }
        });

    }
    public void configureImageButton(){
        ImageButton imgbtn1 = (ImageButton) findViewById(R.id.imgbtn1);
        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"RED Button Clicked",Toast.LENGTH_SHORT).show();
                RelativeLayout rl = (RelativeLayout)findViewById(R.id.relativelayout);
                rl.setBackgroundColor(Color.RED);
            }

        });

        ImageButton imgbtn2 = (ImageButton) findViewById(R.id.imgbtn2);
        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"GREEN Button Clicked",Toast.LENGTH_SHORT).show();

                RelativeLayout rl = (RelativeLayout)findViewById(R.id.relativelayout);
                rl.setBackgroundColor(Color.GREEN);
            }

        });

        ImageButton imgbtn3 = (ImageButton) findViewById(R.id.imgbtn3);
        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"CYAN Button Clicked",Toast.LENGTH_SHORT).show();

                RelativeLayout rl = (RelativeLayout)findViewById(R.id.relativelayout);
                rl.setBackgroundColor(Color.CYAN);
            }

        });

        ImageButton imgbtn4 = (ImageButton) findViewById(R.id.imgbtn4);
        imgbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"BLUE Button Clicked",Toast.LENGTH_SHORT).show();

                RelativeLayout rl = (RelativeLayout)findViewById(R.id.relativelayout);
                rl.setBackgroundColor(Color.BLUE);
            }

        });

        ImageButton imgbtn5 = (ImageButton) findViewById(R.id.imgbtn5);
        imgbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Magenta Button Clicked",Toast.LENGTH_SHORT).show();

                RelativeLayout rl = (RelativeLayout)findViewById(R.id.relativelayout);
                rl.setBackgroundColor(Color.MAGENTA);
            }

        });

    }


}
