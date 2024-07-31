package com.google.android.gms.ads.internal.client;

/* loaded from: classes.dex */
public final class b0 extends i1 {

    /* renamed from: a, reason: collision with root package name */
    private final x8.n f8618a;

    public b0(x8.n nVar) {
        this.f8618a = nVar;
    }

    @Override // com.google.android.gms.ads.internal.client.j1
    public final void zzb() {
        x8.n nVar = this.f8618a;
        if (nVar != null) {
            nVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.j1
    public final void zzc() {
        x8.n nVar = this.f8618a;
        if (nVar != null) {
            nVar.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.j1
    public final void zzd(c3 c3Var) {
        x8.n nVar = this.f8618a;
        if (nVar != null) {
            nVar.onAdFailedToShowFullScreenContent(c3Var.u1());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.j1
    public final void zze() {
        x8.n nVar = this.f8618a;
        if (nVar != null) {
            nVar.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.j1
    public final void zzf() {
        x8.n nVar = this.f8618a;
        if (nVar != null) {
            nVar.onAdShowedFullScreenContent();
        }
    }
}
