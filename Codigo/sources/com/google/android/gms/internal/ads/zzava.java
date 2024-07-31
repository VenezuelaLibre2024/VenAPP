package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzava implements Runnable {
    final /* synthetic */ zzavb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzava(zzavb zzavbVar) {
        this.zza = zzavbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        zzfqr zzfqrVar;
        Object obj2;
        obj = this.zza.zzo;
        synchronized (obj) {
            z10 = this.zza.zzp;
            if (z10) {
                return;
            }
            this.zza.zzp = true;
            try {
                zzavb.zzj(this.zza);
            } catch (Exception e10) {
                zzfqrVar = this.zza.zzh;
                zzfqrVar.zzc(2023, -1L, e10);
            }
            obj2 = this.zza.zzo;
            synchronized (obj2) {
                this.zza.zzp = false;
            }
        }
    }
}
