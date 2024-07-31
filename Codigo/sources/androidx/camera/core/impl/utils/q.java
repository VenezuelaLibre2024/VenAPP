package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class q {
    public static void a() {
        androidx.core.util.h.n(c(), "Not in application's main thread");
    }

    private static Handler b() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void d(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            androidx.core.util.h.n(b().post(runnable), "Unable to post to main thread");
        }
    }
}
