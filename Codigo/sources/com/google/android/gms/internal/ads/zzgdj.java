package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgdj extends zzged implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    com.google.common.util.concurrent.f zza;
    Object zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdj(com.google.common.util.concurrent.f fVar, Object obj) {
        fVar.getClass();
        this.zza = fVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.f fVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (fVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (fVar.isCancelled()) {
            zzs(fVar);
            return;
        }
        try {
            try {
                Object zze = zze(obj, zzgen.zzp(fVar));
                this.zzb = null;
                zzf(zze);
            } catch (Throwable th2) {
                try {
                    zzgff.zza(th2);
                    zzd(th2);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e10) {
            zzd(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            zzd(e11.getCause());
        } catch (Exception e12) {
            zzd(e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgdb
    public final String zza() {
        String str;
        com.google.common.util.concurrent.f fVar = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (fVar != null) {
            str = "inputFuture=[" + fVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (zza != null) {
                return str.concat(zza);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    protected final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract Object zze(Object obj, Object obj2);

    abstract void zzf(Object obj);
}
