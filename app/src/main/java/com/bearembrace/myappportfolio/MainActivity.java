package com.bearembrace.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button btnProj1;
    private Button btnProj2;
    private Button btnProj3;
    private Button btnProj4;
    private Button btnProj5;
    private Button btnProj6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize buttons

        btnProj1=(Button)findViewById(R.id.project1_btn);
        btnProj2=(Button)findViewById(R.id.project2_btn);
        btnProj3=(Button)findViewById(R.id.project3_btn);
        btnProj4=(Button)findViewById(R.id.project4_btn);
        btnProj5=(Button)findViewById(R.id.project5_btn);
        btnProj6=(Button)findViewById(R.id.project6_btn);

        // add onClickListener to each button
        btnProj1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                // pass corresponding app name to display in toast
                display(getResources().getString(R.string.project1));
            }
        });


        btnProj2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                display(getResources().getString(R.string.project2));
            }
        });

        btnProj3.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                display(getResources().getString(R.string.project3));
            }
        });

        btnProj4.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                display(getResources().getString(R.string.project4));
            }
        });

        btnProj5.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                display(getResources().getString(R.string.project5));
            }
        });

        btnProj6.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                display(getResources().getString(R.string.project6));
            }
        });






    }

    // displays a toast when a button is pressed
    public void display (CharSequence text)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will show "+ text + " App" , Toast.LENGTH_SHORT);
        toast.show();
    }
}
