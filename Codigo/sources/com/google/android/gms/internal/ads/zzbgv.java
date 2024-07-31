package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
public final class zzbgv extends zzbgw {
    private final com.google.android.gms.ads.internal.f zza;
    private final String zzb;
    private final String zzc;

    public zzbgv(com.google.android.gms.ads.internal.f fVar, String str, String str2) {
        this.zza = fVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzd(com.google.android.gms.dynamic.b bVar) {
        if (bVar == null) {
            return;
        }
        this.zza.zza((View) com.google.android.gms.dynamic.d.g2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zze() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzf() {
        this.zza.zzc();
    }
}
