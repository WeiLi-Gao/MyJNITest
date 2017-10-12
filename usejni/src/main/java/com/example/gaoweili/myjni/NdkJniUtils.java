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
    public native String getMyname();
}
