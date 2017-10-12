#include "com_example_gaoweili_myjni_NdkJniUtils.h"

JNIEXPORT jstring JNICALL Java_com_example_gaoweili_myjni_NdkJniUtils_getCLanguageString
        (JNIEnv * env, jobject clazz){
    return env -> NewStringUTF("gaoweili : JNI");
}

JNIEXPORT jstring JNICALL Java_com_example_gaoweili_myjni_NdkJniUtils_getMyname
        (JNIEnv * env, jobject clazz){
    return env -> NewStringUTF("gaoweili : getname");
}

