# MyJNITest
Android JNI 测试例子入门及在其他app中使用其生成的so库

testjin 例子
1.写下需要的native方法
2.使用javah -jni生成头文件 .h(例如 E:\pro\MyJNITest\jnistatictest\src\main\java>javah -jni com.example.jnistatictest.StaticJni)
3.编写c++文件
4.编译调用c++方法，并生成so库

userjin 例子
1.新建jinLibs，放入so库
2.拷贝第三方库
3.新建同包名，使用native
4.调用c++方法

jnistatictest (动态注册例子)
jniactitest (动态注册例子)


