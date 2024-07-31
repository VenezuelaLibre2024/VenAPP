package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zzdvm implements zzfln {
    private final Map zza;
    private final zzbbp zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvm(zzbbp zzbbpVar, Map map) {
        this.zza = map;
        this.zzb = zzbbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbL(zzflg zzflgVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbM(zzflg zzflgVar, String str, Throwable th2) {
        if (this.zza.containsKey(zzflgVar)) {
            this.zzb.zzc(((zzdvl) this.zza.get(zzflgVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzbN(zzflg zzflgVar, String str) {
        if (this.zza.containsKey(zzflgVar)) {
            this.zzb.zzc(((zzdvl) this.zza.get(zzflgVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final void zzd(zzflg zzflgVar, String str) {
        if (this.zza.containsKey(zzflgVar)) {
            this.zzb.zzc(((zzdvl) this.zza.get(zzflgVar)).zzb);
        }
    }
}
