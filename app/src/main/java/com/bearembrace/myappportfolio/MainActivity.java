package com.bearembrace.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // displays a toast when a button is pressed (activated from buttons onClick attribute defined in PrimaryButton style
    public void displayToast (View view)
    {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will show "+ ((Button)view).getText()+ " App" , Toast.LENGTH_SHORT);
        toast.show();
    }
}
