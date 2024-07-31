package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class i0 {
    public static i0 a(Executor executor, Handler handler) {
        return new c(executor, handler);
    }

    public abstract Executor b();

    public abstract Handler c();
}
