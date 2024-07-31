package com.google.android.gms.ads.internal.client;

import p438x8.AbstractC12376n;

/* renamed from: com.google.android.gms.ads.internal.client.b0 */
/* loaded from: classes.dex */
public final class BinderC4791b0 extends AbstractBinderC4841i1 {

    /* renamed from: a */
    private final AbstractC12376n f9695a;

    public BinderC4791b0(AbstractC12376n abstractC12376n) {
        this.f9695a = abstractC12376n;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4848j1
    public final void zzb() {
        AbstractC12376n abstractC12376n = this.f9695a;
        if (abstractC12376n != null) {
            abstractC12376n.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4848j1
    public final void zzc() {
        AbstractC12376n abstractC12376n = this.f9695a;
        if (abstractC12376n != null) {
            abstractC12376n.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4848j1
    public final void zzd(C4801c3 c4801c3) {
        AbstractC12376n abstractC12376n = this.f9695a;
        if (abstractC12376n != null) {
            abstractC12376n.onAdFailedToShowFullScreenContent(c4801c3.m12370u1());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4848j1
    public final void zze() {
        AbstractC12376n abstractC12376n = this.f9695a;
        if (abstractC12376n != null) {
            abstractC12376n.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4848j1
    public final void zzf() {
        AbstractC12376n abstractC12376n = this.f9695a;
        if (abstractC12376n != null) {
            abstractC12376n.onAdShowedFullScreenContent();
        }
    }
}
