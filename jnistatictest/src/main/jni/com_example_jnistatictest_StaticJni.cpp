// jni头文件
#include <jni.h>

#include <cassert>
#include <cstdlib>
#include <iostream>
#include "com_example_jnistatictest_StaticJni.h"
using namespace std;

jstring returnString(JNIEnv *env,jobject jobj){
    char* str = "I come from C＋＋";
    return env->NewStringUTF(str);
}

static JNINativeMethod gMethods[] = {
        {"getStringFromC","()Ljava/lang/String;",(void *)returnString }
};

JNIEXPORT int JNICALL JNI_OnLoad(JavaVM *vm,void *reserved) {
    JNIEnv *env;
    if (vm->GetEnv((void **) &env,JNI_VERSION_1_6) != JNI_OK){
        return JNI_ERR;
    }

    jclass javaClass = env->FindClass("com/example/jnistatictest/StaticJni");
    if (javaClass == NULL){
         return JNI_ERR;
    }
    if (env->RegisterNatives(javaClass,gMethods,NELEM(gMethods)) < 0) {
        return JNI_ERR;
    }

    return JNI_VERSION_1_6;
}