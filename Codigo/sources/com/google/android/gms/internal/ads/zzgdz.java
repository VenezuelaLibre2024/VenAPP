package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgdz extends zzgew {
    private final Executor zza;
    final /* synthetic */ zzgea zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdz(zzgea zzgeaVar, Executor executor) {
        this.zzb = zzgeaVar;
        executor.getClass();
        this.zza = executor;
    }

    abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgew
    final void zzd(Throwable th2) {
        this.zzb.zza = null;
        if (th2 instanceof ExecutionException) {
            this.zzb.zzd(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zzd(th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zzd(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final boolean zzg() {
        return this.zzb.isDone();
    }
}
