package com.example.gaoweili.myjni;

/**
 * Created by gaoweili on 2017/10/11 0011.
 */

public class NdkJniUtils {

    static
    {
        System.loadLibrary("MyJni");
    }


    public native String getCLanguageString();
    public native String getMyNamee(String name,int age);
    public native int getMyAge(String name,int age);
    public native boolean getIsRight(String name,int age,boolean is);
}
