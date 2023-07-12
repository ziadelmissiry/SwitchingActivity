package com.example.switchingactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When button1 is clicked, start NewActivity
                Activity2();

            }
        });

    }

    /**
     * Starts the MainActivity.
     * This method is called when button2 is clicked in NewActivity.
     * It creates an Intent to switch to the MainActivity class and starts the activity.
     */

public void Activity2(){
    Intent intent = new Intent(this, NewActivity.class);
    startActivity(intent);
}


}