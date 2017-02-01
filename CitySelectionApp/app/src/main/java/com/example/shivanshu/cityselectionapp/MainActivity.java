package com.example.shivanshu.cityselectionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String CountryCode="countryname";
    private static final int CoountryRequestCode=10;
    //LinearLayout mainLayout;
    EditText countryEditText;
    EditText cityEditText;
    Button ChooseHotelButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryEditText=(EditText)findViewById(R.id.country_edit_text);
        cityEditText=(EditText)findViewById(R.id.city_edit_text);
        ChooseHotelButton=(Button)findViewById(R.id.hotel_button);
        countryEditText.setOnClickListener(this);
        cityEditText.setOnClickListener(this);
        ChooseHotelButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==countryEditText)
        {
            Intent intent =new CountryActivity().CreateIntent(this,CountryCode);
            startActivityForResult(intent,CoountryRequestCode);

        }
        if(v==cityEditText)
        {
          //  Intent intent =new CountryActivity().CreateIntent(this,CountryCode);
           // startActivityForResult(intent,CoountryRequestCode);

        }
        if(v==ChooseHotelButton)
        {
            Intent intent=new Intent(this,ChooseHotel.class);
            intent.putExtra("country name",countryEditText.getText().toString());
            intent.putExtra("city name",cityEditText.getText());
            startActivity(intent);


        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if((requestCode==CoountryRequestCode)&&(resultCode==RESULT_OK))
        {
            String s=data.getStringExtra(CountryCode);
countryEditText.setText(s);
        }
    }
}
