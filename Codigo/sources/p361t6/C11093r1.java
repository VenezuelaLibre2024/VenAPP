package p361t6;

import java.util.HashSet;

/* renamed from: t6.r1 */
/* loaded from: classes.dex */
public final class C11093r1 {

    /* renamed from: a */
    private static final HashSet<String> f28696a = new HashSet<>();

    /* renamed from: b */
    private static String f28697b = "goog.exo.core";

    /* renamed from: a */
    public static synchronized void m34452a(String str) {
        synchronized (C11093r1.class) {
            if (f28696a.add(str)) {
                f28697b += ", " + str;
            }
        }
    }

    /* renamed from: b */
    public static synchronized String m34453b() {
        String str;
        synchronized (C11093r1.class) {
            str = f28697b;
        }
        return str;
    }
}
