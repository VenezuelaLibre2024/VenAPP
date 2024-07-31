package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzetw implements zzexq {
    private final zzgey zza;
    private final zzduf zzb;
    private final String zzc;
    private final zzfhh zzd;

    public zzetw(zzgey zzgeyVar, zzduf zzdufVar, zzfhh zzfhhVar, String str) {
        this.zza = zzgeyVar;
        this.zzb = zzdufVar;
        this.zzd = zzfhhVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetw.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzetx zzc() {
        zzfhh zzfhhVar = this.zzd;
        zzduf zzdufVar = this.zzb;
        return new zzetx(zzdufVar.zzb(zzfhhVar.zzf, this.zzc), zzdufVar.zza());
    }
}
