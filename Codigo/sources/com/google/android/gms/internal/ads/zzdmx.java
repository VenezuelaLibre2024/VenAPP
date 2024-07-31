package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdmx {
    private zzbjj zza;

    public zzdmx(zzdmj zzdmjVar) {
        this.zza = zzdmjVar;
    }

    public final synchronized zzbjj zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbjj zzbjjVar) {
        this.zza = zzbjjVar;
    }
}
