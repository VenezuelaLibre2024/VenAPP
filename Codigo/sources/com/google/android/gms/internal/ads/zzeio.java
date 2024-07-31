package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzeio implements zzein {
    public final zzein zza;
    private final zzfws zzb;

    public zzeio(zzein zzeinVar, zzfws zzfwsVar) {
        this.zza = zzeinVar;
        this.zzb = zzfwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final com.google.common.util.concurrent.f zza(zzfgy zzfgyVar, zzfgm zzfgmVar) {
        return zzgen.zzm(this.zza.zza(zzfgyVar, zzfgmVar), this.zzb, zzcep.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzein
    public final boolean zzb(zzfgy zzfgyVar, zzfgm zzfgmVar) {
        return this.zza.zzb(zzfgyVar, zzfgmVar);
    }
}
