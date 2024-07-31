package wb;

import com.google.crypto.tink.internal.t;

/* loaded from: classes2.dex */
public final class q {
    @Deprecated
    public static int a() {
        Integer a10 = t.a();
        if (a10 != null) {
            return a10.intValue();
        }
        return -1;
    }

    public static boolean b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}
