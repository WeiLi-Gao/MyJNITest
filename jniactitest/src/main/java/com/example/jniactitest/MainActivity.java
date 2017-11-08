package com.example.jniactitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private StaticJni nu = null;
    private TextView mTxt = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTxt = (TextView) findViewById(R.id.test);
        nu = new StaticJni();
        mTxt.setText(nu.getStringFromC()+ "\n" +nu.getIntFromC(3));
        Log.i("gaoweili", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("gaoweili", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("gaoweili", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("gaoweili", "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("gaoweili", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("gaoweili", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("gaoweili", "onPause");
    }
}
