package ud;

import android.util.Log;

/* loaded from: classes.dex */
public class m {
    public static void a(String str) {
        if (Log.isLoggable("FIAM.Display", 3)) {
            Log.d("FIAM.Display", str);
        }
    }

    public static void b(String str) {
        a("============ " + str + " ============");
    }

    public static void c(String str, float f10) {
        a(str + ": " + f10);
    }

    public static void d(String str, float f10, float f11) {
        a(str + ": (" + f10 + ", " + f11 + ")");
    }

    public static void e(String str) {
        Log.e("FIAM.Display", str);
    }

    public static void f(String str) {
        if (Log.isLoggable("FIAM.Display", 4)) {
            Log.i("FIAM.Display", str);
        }
    }
}
