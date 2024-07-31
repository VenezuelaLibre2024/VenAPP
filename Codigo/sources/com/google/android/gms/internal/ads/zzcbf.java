package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;
import x8.n;
import x8.u;

/* loaded from: classes2.dex */
public final class zzcbf extends zzcap {
    private n zza;
    private u zzb;

    public final void zzb(n nVar) {
        this.zza = nVar;
    }

    public final void zzc(u uVar) {
        this.zzb = uVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zze() {
        n nVar = this.zza;
        if (nVar != null) {
            nVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzf() {
        n nVar = this.zza;
        if (nVar != null) {
            nVar.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzg() {
        n nVar = this.zza;
        if (nVar != null) {
            nVar.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzh(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzi(c3 c3Var) {
        n nVar = this.zza;
        if (nVar != null) {
            nVar.onAdFailedToShowFullScreenContent(c3Var.u1());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzj() {
        n nVar = this.zza;
        if (nVar != null) {
            nVar.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaq
    public final void zzk(zzcak zzcakVar) {
        u uVar = this.zzb;
        if (uVar != null) {
            uVar.onUserEarnedReward(new zzcax(zzcakVar));
        }
    }
}
