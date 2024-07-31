package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcfn implements Runnable {
    final /* synthetic */ zzcfp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfn(zzcfp zzcfpVar) {
        this.zza = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfq zzcfqVar;
        boolean z10;
        zzcfq zzcfqVar2;
        zzcfq zzcfqVar3;
        zzcfp zzcfpVar = this.zza;
        zzcfqVar = zzcfpVar.zzq;
        if (zzcfqVar != null) {
            z10 = zzcfpVar.zzr;
            if (!z10) {
                zzcfqVar3 = zzcfpVar.zzq;
                zzcfqVar3.zzg();
                this.zza.zzr = true;
            }
            zzcfqVar2 = this.zza.zzq;
            zzcfqVar2.zze();
        }
    }
}
