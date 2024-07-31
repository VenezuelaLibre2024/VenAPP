package t6;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f26443a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private static String f26444b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (r1.class) {
            if (f26443a.add(str)) {
                f26444b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (r1.class) {
            str = f26444b;
        }
        return str;
    }
}
