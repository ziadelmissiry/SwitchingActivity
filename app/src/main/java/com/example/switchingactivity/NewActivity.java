package com.example.switchingactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);


        button = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When button2 is clicked, start MainActivity
                Activity1();

            }
        });
    }

    /**
     * Starts the MainActivity.
     * This method is called when button2 is clicked in NewActivity.
     * It creates an Intent to switch to the MainActivity class and starts the activity.
     */
    public void Activity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);}
}