package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes2.dex */
final class zzger implements com.google.common.util.concurrent.f {
    static final com.google.common.util.concurrent.f zza = new zzger(null);
    private static final zzgex zzb = new zzgex(zzger.class);
    private final Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzger(Object obj) {
        this.zzc = obj;
    }

    @Override // com.google.common.util.concurrent.f
    public final void addListener(Runnable runnable, Executor executor) {
        zzfxe.zzc(runnable, "Runnable was null.");
        zzfxe.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.zzc;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.zzc;
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(obj) + "]]";
    }
}
