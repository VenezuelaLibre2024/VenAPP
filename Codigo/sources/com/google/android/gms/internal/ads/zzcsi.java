package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcsi implements zzdba {
    private final zzfgp zza;
    private final zzfgy zzb;
    private final zzfnu zzc;
    private final zzfny zzd;

    public zzcsi(zzfgy zzfgyVar, zzfny zzfnyVar, zzfnu zzfnuVar) {
        this.zzb = zzfgyVar;
        this.zzd = zzfnyVar;
        this.zzc = zzfnuVar;
        this.zza = zzfgyVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzbK(c3 c3Var) {
        List list = this.zza.zza;
        this.zzd.zzd(this.zzc.zzc(this.zzb, null, list));
    }
}
