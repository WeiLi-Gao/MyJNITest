package com.example.gaoweili.myjni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private NdkJniUtils nu = null;
    private TextView mTxt = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTxt = (TextView) findViewById(R.id.test);
        nu = new NdkJniUtils();
        mTxt.setText(nu.getMyNamee("gao",20)+ "\n" + nu.getMyAge("wei",30) + "\n" + nu.getIsRight("li",40,true));
       // mTxt.setText(nu.getMyNamee("gao",20) +"," + nu.getMyA@Override

    }
}
