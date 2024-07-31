package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Handler f2657a;

    private n() {
    }

    public static Handler a() {
        if (f2657a != null) {
            return f2657a;
        }
        synchronized (n.class) {
            if (f2657a == null) {
                f2657a = androidx.core.os.g.a(Looper.getMainLooper());
            }
        }
        return f2657a;
    }
}
