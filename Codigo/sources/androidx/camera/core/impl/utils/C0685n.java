package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.C0948g;

/* renamed from: androidx.camera.core.impl.utils.n */
/* loaded from: classes.dex */
public final class C0685n {

    /* renamed from: a */
    private static volatile Handler f3001a;

    private C0685n() {
    }

    /* renamed from: a */
    public static Handler m3333a() {
        if (f3001a != null) {
            return f3001a;
        }
        synchronized (C0685n.class) {
            if (f3001a == null) {
                f3001a = C0948g.m4712a(Looper.getMainLooper());
            }
        }
        return f3001a;
    }
}
