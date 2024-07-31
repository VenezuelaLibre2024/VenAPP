package p382ud;

import android.util.Log;

/* renamed from: ud.m */
/* loaded from: classes.dex */
public class C11544m {
    /* renamed from: a */
    public static void m36182a(String str) {
        if (Log.isLoggable("FIAM.Display", 3)) {
            Log.d("FIAM.Display", str);
        }
    }

    /* renamed from: b */
    public static void m36183b(String str) {
        m36182a("============ " + str + " ============");
    }

    /* renamed from: c */
    public static void m36184c(String str, float f10) {
        m36182a(str + ": " + f10);
    }

    /* renamed from: d */
    public static void m36185d(String str, float f10, float f11) {
        m36182a(str + ": (" + f10 + ", " + f11 + ")");
    }

    /* renamed from: e */
    public static void m36186e(String str) {
        Log.e("FIAM.Display", str);
    }

    /* renamed from: f */
    public static void m36187f(String str) {
        if (Log.isLoggable("FIAM.Display", 4)) {
            Log.i("FIAM.Display", str);
        }
    }
}
