package com.example.jnistatictest;

import android.util.Log;

/**
 * Created by gaoweili on 2017/11/1 0001.
 */

public class StaticJni {
    private static final String TAG = "FactoryModeEngfetch";

    static{
        try{
            Log.d(TAG, "Load engmodelJNI ");
            System.loadLibrary("engmodjni");
        }
        catch(UnsatisfiedLinkError ule){
            Log.d(TAG, "Load engmodelJNI failed");
        }
    }


    public native String getStringFromC();
}
