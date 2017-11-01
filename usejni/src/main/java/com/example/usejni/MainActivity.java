package com.example.usejni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.gaoweili.myjni.NdkJniUtils;

public class MainActivity extends AppCompatActivity {

    private NdkJniUtils nu = null;
    private TextView mTxt = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTxt = (TextView) findViewById(R.id.test);
        nu = new NdkJniUtils();
        mTxt.setText(nu.getMyName());
    }

}
