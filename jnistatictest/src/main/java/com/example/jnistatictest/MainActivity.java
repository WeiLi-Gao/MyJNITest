package com.example.jnistatictest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        mTxt.setText(nu.getStringFromC()+ "\n");

    }
}
