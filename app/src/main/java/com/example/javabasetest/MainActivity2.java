package com.example.javabasetest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "MainActivity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Log.i(TAG, "Activity2----------------------------->onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Activity2----------------------------->onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Activity2----------------------------->onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Activity2----------------------------->onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Activity2----------------------------->onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Activity2----------------------------->onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Activity2----------------------------->onDestroy");
    }

}
