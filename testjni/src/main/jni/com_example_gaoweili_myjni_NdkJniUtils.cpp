#include "com_example_gaoweili_myjni_NdkJniUtils.h"
#include <string.h>
#include <iostream>

/*
 * Class:     com_example_gaoweili_myjni_NdkJniUtils
 * Method:    getCLanguageString
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_gaoweili_myjni_NdkJniUtils_getCLanguageString
        (JNIEnv * env, jobject obj){
    return env->NewStringUTF("hello, I am from C++");
}

/*
 * Class:     com_example_gaoweili_myjni_NdkJniUtils
 * Method:    getMyNamee
 * Signature: (Ljava/lang/String;I)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_gaoweili_myjni_NdkJniUtils_getMyNamee
        (JNIEnv *env, jobject obj, jstring string, jint num){
                const char *str = env->GetStringUTFChars(string, 0);
                char cap[128];
                strcpy(cap, str);
                env->ReleaseStringUTFChars(string, str);
                return env->NewStringUTF(cap);
}

/*
 * Class:     com_example_gaoweili_myjni_NdkJniUtils
 * Method:    getMyAge
 * Signature: (Ljava/lang/String;I)I
 */
JNIEXPORT jint JNICALL Java_com_example_gaoweili_myjni_NdkJniUtils_getMyAge
        (JNIEnv *env, jobject obj, jstring str, jint num){
        return jint(num);
}

/*
 * Class:     com_example_gaoweili_myjni_NdkJniUtils
 * Method:    getIsRight
 * Signature: (Ljava/lang/String;IZ)Z
 */
JNIEXPORT jboolean JNICALL Java_com_example_gaoweili_myjni_NdkJniUtils_getIsRight
        (JNIEnv *env, jobject obj, jstring str, jint num, jboolean bn){
        return bn;
}
