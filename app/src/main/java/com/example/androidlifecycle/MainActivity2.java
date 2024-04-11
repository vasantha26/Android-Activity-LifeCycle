package com.example.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    String msg = "MainActivity2 : ";

    TextView textView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        textView = findViewById(R.id.hello1);

        textView.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        });

        Log.d(msg, " MainActivity2 >>> " + "The onCreate() event");


    }
        /** Called when the activity is about to become visible. */
        @Override
        protected void onStart() {
            super.onStart();
            Log.d(msg, " MainActivity2 >>> " +"The onStart() event");
        }

        /** Called when the activity has become visible. */
        @Override
        protected void onResume() {
            super.onResume();
            Log.d(msg, " MainActivity2 >>>  " + "The onResume() event");
        }

        /** Called when another activity is taking focus. */
        @Override
        protected void onPause() {
            super.onPause();
            Log.d(msg, " MainActivity2 >>> " + "The onPause() event");
        }

        /** Called when the activity is no longer visible. */
        @Override
        protected void onStop() {
            super.onStop();
            Log.d(msg, " MainActivity2 >>> " + "The onStop() event");
        }

        /** Called just before the activity is destroyed. */
        @Override
        public void onDestroy() {
            super.onDestroy();
            Log.d(msg, " MainActivity2 >>> " + "The onDestroy() event");
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d(msg, " MainActivity2 >>> " + "The onRestart() event");
        }

}