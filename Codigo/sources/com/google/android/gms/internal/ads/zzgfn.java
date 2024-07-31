package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes2.dex */
public final class zzgfn extends zzged implements RunnableFuture {
    private volatile zzgew zza;

    public zzgfn(zzgdt zzgdtVar) {
        this.zza = new zzgfl(this, zzgdtVar);
    }

    public zzgfn(Callable callable) {
        this.zza = new zzgfm(this, callable);
    }

    public static zzgfn zze(Runnable runnable, Object obj) {
        return new zzgfn(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgew zzgewVar = this.zza;
        if (zzgewVar != null) {
            zzgewVar.run();
        }
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgdb
    public final String zza() {
        zzgew zzgewVar = this.zza;
        if (zzgewVar == null) {
            return super.zza();
        }
        return "task=[" + zzgewVar.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    protected final void zzb() {
        zzgew zzgewVar;
        if (zzt() && (zzgewVar = this.zza) != null) {
            zzgewVar.zzh();
        }
        this.zza = null;
    }
}
