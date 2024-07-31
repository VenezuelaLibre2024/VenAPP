package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class zzep implements zzev {
    static final zzev zza = new zzep(null);
    private static final Logger zzb = Logger.getLogger(zzep.class.getName());
    private final Object zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzep(Object obj) {
        this.zzc = obj;
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
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(this.zzc) + "]]";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzev
    public final void zzj(Runnable runnable, Executor executor) {
        throw null;
    }
}
