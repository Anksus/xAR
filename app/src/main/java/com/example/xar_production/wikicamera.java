package com.example.xar_production;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.wikitude.architect.ArchitectStartupConfiguration;
import com.wikitude.architect.ArchitectView;

public class wikicamera extends AppCompatActivity {

    private ArchitectView architectView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wikicamera);

        this.architectView = this.findViewById( R.id.architectView );
        final ArchitectStartupConfiguration config = new ArchitectStartupConfiguration();
        config.setLicenseKey( "HwQaN3VedLd4jbJAb6JTzfQhunAMNg/jNmvaLbxK0j8zmwoSYXvXAHOYSHsAcuvrKEqjHCItz7C+3BDYvyhyyTderShKdsjhMKjLH/E+OYzVHEnV3/EP4adlFBrNP5PjSSrO/WKEJJ9nuguO8d/rTttgk0HIHtPatVQuy7ChknNTYWx0ZWRfXwNIgMlVCQI6Sbd41NSX6VFL6RDrEVAZzrDJVAdacL5NtwpgQbBvYIZgGsqXqGVOBjj0F5eV34bjkJ9S/83sA4zPGGuxkVpV6r4Orv8ZcCnRqQ1xyqDInX5GiqvEDBFRNDDY90XmSnzC2Ta+v6/8DlbUa7Nf48yRAeL19GsqatJ9nyyk+k4mphxsehTRU52sssh2ufZeajBIQ8eBNrexCXfwoCQEn/oDRMmHcNY+hbvh1brXs669NSGAbwRhzElrqmv1EFuIDThEQ5hB3WoHl5428ssDfsENYHmAQ8M8MQQOSPmDCkQfhWkCASTr+T3Tj7O+qIsBlvhfsr/TsCKA5XEskTr1MxV/GdInj3Wpmp+yDPcSH7gVWIu8k5CGIvHK/2F6gjXd6xADr+C54DmorUXaPS14vmiwa6iR9izAK6HDsqDk85Dw2fvq8d8p/Ain4Q2JSo7Z0bWKlftgzEC+vMVh1bA8DA5UP8QP4TtlZ53IKu+BLC8lCLIrguqeJL3RzY5Odkl8PG208/gL7Jdj6vu8xlFAyT3PXjLBSUYc0U08xwYO2mI3RbDrG4v5qrcNqzIwfP/vwxgyqjjO//cQ3DbINPEzEuPZa0oyKs70x7LbpDxRq2zYJVI=" );
        this.architectView.onCreate( config );

        config.setCamera2Enabled(true);
        config.getCameraFocusMode();
        config.getCameraResolution();

        //Intent intent1 =getIntent();
    }




    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        architectView.onPostCreate();

    }

    @Override
    protected void onResume() {
       architectView.onResume();
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        architectView.onDestroy();


    }



    @Override
    protected void onPause() {
        super.onPause();

        architectView.onPause();


    }

}



