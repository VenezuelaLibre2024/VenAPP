package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;
import z8.a;

/* loaded from: classes2.dex */
public final class zzbae extends zzbal {
    private final a.AbstractC0543a zza;
    private final String zzb;

    public zzbae(a.AbstractC0543a abstractC0543a, String str) {
        this.zza = abstractC0543a;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzb(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzc(c3 c3Var) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(c3Var.v1());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzd(zzbaj zzbajVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzbaf(zzbajVar, this.zzb));
        }
    }
}
