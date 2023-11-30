package com.fro.parade360;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    //declaring Buttons
    ImageButton toDrone;
    ImageButton toFacts;
    ImageButton toFood;
    ImageButton toParking;
    ImageButton toSound;
    ImageButton toTiming;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //initiating buttons
        toDrone = (ImageButton) findViewById(R.id.toDrone);
        toFacts = (ImageButton) findViewById(R.id.toFacts);
        toFood = (ImageButton) findViewById(R.id.toFood);
        toParking = (ImageButton) findViewById(R.id.toParking);
        toSound = (ImageButton) findViewById(R.id.toSound);
        toTiming = (ImageButton) findViewById(R.id.toTiming);


        toDrone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), DroneActivity.class));
            }});
        toFacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FactsActivity.class));
            }});
        toFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FoodActivity.class));
            }});
        toParking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ParkingActivity.class));
            }});
        toSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SoundActivity.class));
            }});
        toTiming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TimingActivity.class));
            }});
    }
}