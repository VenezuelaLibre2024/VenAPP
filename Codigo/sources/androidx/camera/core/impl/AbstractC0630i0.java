package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC0630i0 {
    /* renamed from: a */
    public static AbstractC0630i0 m3100a(Executor executor, Handler handler) {
        return new C0605c(executor, handler);
    }

    /* renamed from: b */
    public abstract Executor mo2996b();

    /* renamed from: c */
    public abstract Handler mo2997c();
}
