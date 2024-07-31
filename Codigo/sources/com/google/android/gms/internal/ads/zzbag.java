package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;
import x8.n;

/* loaded from: classes2.dex */
public final class zzbag extends zzbap {
    private n zza;

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzb() {
        n nVar = this.zza;
        if (nVar != null) {
            nVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzc() {
        n nVar = this.zza;
        if (nVar != null) {
            nVar.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzd(c3 c3Var) {
        n nVar = this.zza;
        if (nVar != null) {
            nVar.onAdFailedToShowFullScreenContent(c3Var.u1());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zze() {
        n nVar = this.zza;
        if (nVar != null) {
            nVar.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzf() {
        n nVar = this.zza;
        if (nVar != null) {
            nVar.onAdShowedFullScreenContent();
        }
    }

    public final void zzg(n nVar) {
        this.zza = nVar;
    }
}
