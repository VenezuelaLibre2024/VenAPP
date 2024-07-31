package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
abstract class zzafg {
    protected final zzaea zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzafg(zzaea zzaeaVar) {
        this.zza = zzaeaVar;
    }

    protected abstract boolean zza(zzfp zzfpVar);

    protected abstract boolean zzb(zzfp zzfpVar, long j10);

    public final boolean zzf(zzfp zzfpVar, long j10) {
        return zza(zzfpVar) && zzb(zzfpVar, j10);
    }
}
