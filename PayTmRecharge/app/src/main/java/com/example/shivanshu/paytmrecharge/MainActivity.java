package com.example.shivanshu.paytmrecharge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton radiobutton1;
    RadioButton radiobutton2;
    TextView textView;
    Button textButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiobutton1 = (RadioButton) findViewById(R.id.prepaid);
        radiobutton2 = (RadioButton) findViewById(R.id.postpaid);
        textButton = (Button) findViewById(R.id.text_button);


    }

    public void radioFunction(View view)

    {
        if ((view.getId() == R.id.prepaid) ) {
            radiobutton1.setChecked(true);
            radiobutton2.setChecked(false);
            textButton.setText("Proceed To Recharge");




        }
        else if ((view.getId() == R.id.postpaid) ) {
           // setContentView(R.layout.activity_main);
            radiobutton1.setChecked(false);
            radiobutton2.setChecked(true);
            textButton.setText("Proceed To Pay Bill");


        }

    }
    public void layoutsetfunction(View view)
    {
        if ((view.getId() == R.id.mobile_number)&& (radiobutton1.isChecked()==true)) {
            setContentView(R.layout.recharge_layout);
        }
        else if ((view.getId() == R.id.mobile_number)&& (radiobutton2.isChecked()==true)) {
            setContentView(R.layout.post_paid);
        }

        else if (view.getId() == R.id.mobile_postpaid) {
            setContentView(R.layout.post_paid);
        }

    }
}
