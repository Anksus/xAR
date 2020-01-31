package com.example.xar_production;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class SelectService extends AppCompatActivity {

    TextView restonameincard;
    String concat;

    CardView menuFood,interoir,restroInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_service);



        restonameincard = findViewById(R.id.restronameincard);
        menuFood = findViewById(R.id.menuFood);
        interoir = findViewById(R.id.interior);
        restroInfo  = findViewById(R.id.restroInfo);

        //code for menuAR apperearance

        menuFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),wikicamera.class);
                startActivity(intent1);
            }
        });









        Intent intent =getIntent();


        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingtoolbarid);
        collapsingToolbarLayout.setTitle(intent.getStringExtra("AppbarTitle"));

        concat = (intent.getStringExtra("AppbarTitle" ));

        String know ="know more about "+ concat;

        restonameincard.setText(know);


    }
}



