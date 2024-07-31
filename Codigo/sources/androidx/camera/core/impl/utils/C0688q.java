package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.core.util.C0984h;

/* renamed from: androidx.camera.core.impl.utils.q */
/* loaded from: classes.dex */
public final class C0688q {
    /* renamed from: a */
    public static void m3339a() {
        C0984h.m4836n(m3341c(), "Not in application's main thread");
    }

    /* renamed from: b */
    private static Handler m3340b() {
        return new Handler(Looper.getMainLooper());
    }

    /* renamed from: c */
    public static boolean m3341c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: d */
    public static void m3342d(Runnable runnable) {
        if (m3341c()) {
            runnable.run();
        } else {
            C0984h.m4836n(m3340b().post(runnable), "Unable to post to main thread");
        }
    }
}
