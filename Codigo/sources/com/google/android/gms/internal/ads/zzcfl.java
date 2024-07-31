package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzcfl implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcfp zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfl(zzcfp zzcfpVar, int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzcfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcfq zzcfqVar;
        zzcfq zzcfqVar2;
        zzcfp zzcfpVar = this.zzc;
        zzcfqVar = zzcfpVar.zzq;
        if (zzcfqVar != null) {
            int i10 = this.zza;
            int i11 = this.zzb;
            zzcfqVar2 = zzcfpVar.zzq;
            zzcfqVar2.zzj(i10, i11);
        }
    }
}
