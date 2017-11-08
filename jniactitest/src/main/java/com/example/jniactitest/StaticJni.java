package com.example.jniactitest;

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

    public native int getIntFromC(int num1);
    public native String getStringFromC();

    public void setName(String name){

    }

    public static int setAge(int age){
        return age;
    }
}
