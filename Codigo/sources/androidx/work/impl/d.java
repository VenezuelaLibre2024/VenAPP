package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class d implements f2.q {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f5798a = androidx.core.os.g.a(Looper.getMainLooper());

    @Override // f2.q
    public void a(Runnable runnable) {
        this.f5798a.removeCallbacks(runnable);
    }

    @Override // f2.q
    public void b(long j10, Runnable runnable) {
        this.f5798a.postDelayed(runnable, j10);
    }
}
