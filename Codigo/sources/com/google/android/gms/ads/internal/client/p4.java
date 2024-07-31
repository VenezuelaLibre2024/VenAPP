package com.google.android.gms.ads.internal.client;

/* loaded from: classes.dex */
public final class p4 extends g0 {

    /* renamed from: a, reason: collision with root package name */
    private final x8.e f8725a;

    public p4(x8.e eVar) {
        this.f8725a = eVar;
    }

    public final x8.e f2() {
        return this.f8725a;
    }

    @Override // com.google.android.gms.ads.internal.client.h0
    public final void zzc() {
        x8.e eVar = this.f8725a;
        if (eVar != null) {
            eVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.h0
    public final void zzd() {
        x8.e eVar = this.f8725a;
        if (eVar != null) {
            eVar.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.h0
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.ads.internal.client.h0
    public final void zzf(c3 c3Var) {
        x8.e eVar = this.f8725a;
        if (eVar != null) {
            eVar.onAdFailedToLoad(c3Var.v1());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.h0
    public final void zzg() {
        x8.e eVar = this.f8725a;
        if (eVar != null) {
            eVar.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.h0
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.h0
    public final void zzi() {
        x8.e eVar = this.f8725a;
        if (eVar != null) {
            eVar.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.h0
    public final void zzj() {
        x8.e eVar = this.f8725a;
        if (eVar != null) {
            eVar.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.h0
    public final void zzk() {
        x8.e eVar = this.f8725a;
        if (eVar != null) {
            eVar.onAdSwipeGestureClicked();
        }
    }
}
