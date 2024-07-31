package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.ads.internal.util.v1;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class zzcem implements Executor {
    private final Handler zza = new v1(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.zza.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th2) {
            t.r();
            j2.l(t.q().zzd(), th2);
            throw th2;
        }
    }
}
