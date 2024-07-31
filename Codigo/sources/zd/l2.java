package zd;

import android.util.Log;

/* loaded from: classes.dex */
public class l2 {
    public static void a(String str) {
        if (Log.isLoggable("FIAM.Headless", 3)) {
            Log.d("FIAM.Headless", str);
        }
    }

    public static void b(String str) {
        Log.e("FIAM.Headless", str);
    }

    public static void c(String str) {
        if (Log.isLoggable("FIAM.Headless", 4)) {
            Log.i("FIAM.Headless", str);
        }
    }

    public static void d(String str) {
        Log.w("FIAM.Headless", str);
    }
}
