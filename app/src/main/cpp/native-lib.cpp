#include <jni.h>
#include <string>

std::string hrex(int i);

std::string hlex(int i);

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_brewsec_evabs_ExportedActivity_stringFromJNI(JNIEnv *env, jobject /* this */) {
    std::string hi = "_0xhijack4dblv1";
    return env->NewStringUTF(hi.c_str());
}


extern "C"
JNIEXPORT jstring JNICALL
Java_com_brewsec_evabs_DebugMe_stringFromJNI(JNIEnv *env, jobject instance) {

    std::string debugme = "_0xhijack4dblv1";
    return env->NewStringUTF(debugme.c_str());
}


extern "C"
JNIEXPORT jstring JNICALL
Java_com_brewsec_evabs_SmaliInject_stringFromJNI(JNIEnv *env, jobject instance) {

    std::string labon = "LAB_ON";
    return env->NewStringUTF(labon.c_str());
}



extern "C"
JNIEXPORT jstring JNICALL
Java_com_brewsec_evabs_CustomAccess_stringFromJNI(JNIEnv *env, jobject instance) {

    std::string r_half_key = hrex(2);
    std::string l_half_key = hlex(3);

    std::string flag = r_half_key + l_half_key;
    //std::string sensor_key = flag;

    return env->NewStringUTF(flag.c_str());
}

std::string hlex(int y) {
    int i;
    int h4[] = {95, 115, 101, 110, 115, 48, 114, 95, 97, 99, 99, 51, 115, 115 };
    int h5[14];
    char h6[14];

    for(i=0;i<14;++i)
    {
        h5[i] = h4[i] + y;
    }

    for(i=0;i<14;++i)
    {
        h6[i] = char(h5[i]);
    }

    return std::string(h6);
}


std::string hrex(int x) {
    int i;
    int h1[] = {95, 51, 118, 97, 98, 36, 95, 115, 121, 112, 51, 114};
    int h2[12];
    char h3[12];

    for(i=0;i<12;++i)
    {
        h2[i] = h1[i] + x;
    }

    for(i=0;i<12;++i)
    {
        h3[i] = char(h2[i]);
    }

    return std::string(h3);
}
