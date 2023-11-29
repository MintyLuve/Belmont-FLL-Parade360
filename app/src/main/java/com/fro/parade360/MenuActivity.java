package com.fro.parade360;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    //declaring Buttons
    Button toDrone;
    Button toFacts;
    Button toFood;
    Button toParking;
    Button toSound;
    Button toTiming;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //initiating buttons
        toDrone = (Button) findViewById(R.id.toDrone);
        toFacts = (Button) findViewById(R.id.toFacts);
        toFood = (Button) findViewById(R.id.toFood);
        toParking = (Button) findViewById(R.id.toParking);
        toSound = (Button) findViewById(R.id.toSound);
        toTiming = (Button) findViewById(R.id.toTiming);


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