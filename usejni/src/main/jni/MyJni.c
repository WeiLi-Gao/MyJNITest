#include <jni.h>

JNIEXPORT jbooleanJNICALL
Java_com_example_gaoweili_myjni_NdkJniUtils_getIsRight(JNIEnv
*env,
jobject instance,
        jstring name_, jint age)
{
const char *name = (*env)->GetStringUTFChars(env, name_, 0);

// TODO

(*env)->ReleaseStringUTFChars(env, name_, name);
}