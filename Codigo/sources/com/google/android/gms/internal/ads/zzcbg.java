package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzcbg extends zzcat {
    private final o9.b zza;
    private final zzcbh zzb;

    public zzcbg(o9.b bVar, zzcbh zzcbhVar) {
        this.zza = bVar;
        this.zzb = zzcbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzf(c3 c3Var) {
        o9.b bVar = this.zza;
        if (bVar != null) {
            bVar.onAdFailedToLoad(c3Var.v1());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzg() {
        zzcbh zzcbhVar;
        o9.b bVar = this.zza;
        if (bVar == null || (zzcbhVar = this.zzb) == null) {
            return;
        }
        bVar.onAdLoaded(zzcbhVar);
    }
}
