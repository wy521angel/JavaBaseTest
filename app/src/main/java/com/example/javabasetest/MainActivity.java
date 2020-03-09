package com.example.javabasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.LruCache;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });

        Log.i(TAG,"Activity1----------------------------->onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Activity1----------------------------->onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"Activity1----------------------------->onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"Activity1----------------------------->onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Activity1----------------------------->onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Activity1----------------------------->onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Activity1----------------------------->onDestroy");
    }

}
