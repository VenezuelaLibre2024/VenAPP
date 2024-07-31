package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzcba extends zzcat {
    private final n9.d zza;
    private final n9.c zzb;

    public zzcba(n9.d dVar, n9.c cVar) {
        this.zza = dVar;
        this.zzb = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzf(c3 c3Var) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(c3Var.v1());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zzg() {
        n9.d dVar = this.zza;
        if (dVar != null) {
            dVar.onAdLoaded(this.zzb);
        }
    }
}
