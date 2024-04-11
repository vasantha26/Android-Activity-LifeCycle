package com.example.androidlifecycle;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    String msg = "MainActivity : ";
    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.hello);

        textView.setOnClickListener(view -> {
            Intent i = new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(i);
        });



            Log.d(msg, " MainActivity  >>> " + "The onCreate() event");
        }

        /** Called when the activity is about to become visible. */
        @Override
        protected void onStart() {
            super.onStart();
            Log.d(msg, " MainActivity  >>> " +"The onStart() event");
        }

        /** Called when the activity has become visible. */
        @Override
        protected void onResume() {
            super.onResume();
            Log.d(msg, " MainActivity  >>>  " + "The onResume() event");
        }

        /** Called when another activity is taking focus. */
        @Override
        protected void onPause() {
            super.onPause();
            Log.d(msg, " MainActivity  >>> " + "The onPause() event");
        }

        /** Called when the activity is no longer visible. */
        @Override
        protected void onStop() {
            super.onStop();
            Log.d(msg, " MainActivity  >>> " + "The onStop() event");
        }

        /** Called just before the activity is destroyed. */
        @Override
        public void onDestroy() {
            super.onDestroy();
            Log.d(msg, " MainActivity  >>> " + "The onDestroy() event");
        }

      @Override
      protected void onRestart() {
          super.onRestart();
          Log.d(msg, " MainActivity  >>> " + "The onRestart() event");
      }

  }