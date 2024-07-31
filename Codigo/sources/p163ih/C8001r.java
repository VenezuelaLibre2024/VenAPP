package p163ih;

import android.os.Looper;

/* renamed from: ih.r */
/* loaded from: classes3.dex */
public class C8001r {
    /* renamed from: a */
    public static void m24578a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
