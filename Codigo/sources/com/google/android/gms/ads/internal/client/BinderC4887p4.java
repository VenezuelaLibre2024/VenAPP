package com.google.android.gms.ads.internal.client;

import p438x8.AbstractC12359e;

/* renamed from: com.google.android.gms.ads.internal.client.p4 */
/* loaded from: classes.dex */
public final class BinderC4887p4 extends AbstractBinderC4826g0 {

    /* renamed from: a */
    private final AbstractC12359e f9802a;

    public BinderC4887p4(AbstractC12359e abstractC12359e) {
        this.f9802a = abstractC12359e;
    }

    /* renamed from: f2 */
    public final AbstractC12359e m12434f2() {
        return this.f9802a;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzc() {
        AbstractC12359e abstractC12359e = this.f9802a;
        if (abstractC12359e != null) {
            abstractC12359e.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzd() {
        AbstractC12359e abstractC12359e = this.f9802a;
        if (abstractC12359e != null) {
            abstractC12359e.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzf(C4801c3 c4801c3) {
        AbstractC12359e abstractC12359e = this.f9802a;
        if (abstractC12359e != null) {
            abstractC12359e.onAdFailedToLoad(c4801c3.m12371v1());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzg() {
        AbstractC12359e abstractC12359e = this.f9802a;
        if (abstractC12359e != null) {
            abstractC12359e.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzi() {
        AbstractC12359e abstractC12359e = this.f9802a;
        if (abstractC12359e != null) {
            abstractC12359e.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzj() {
        AbstractC12359e abstractC12359e = this.f9802a;
        if (abstractC12359e != null) {
            abstractC12359e.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4833h0
    public final void zzk() {
        AbstractC12359e abstractC12359e = this.f9802a;
        if (abstractC12359e != null) {
            abstractC12359e.onAdSwipeGestureClicked();
        }
    }
}
