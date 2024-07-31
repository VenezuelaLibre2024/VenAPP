package com.google.ads.mediation;

import p135h9.AbstractC7670a;
import p135h9.AbstractC7671b;
import p157i9.InterfaceC7924s;
import p438x8.C12377o;

/* renamed from: com.google.ads.mediation.c */
/* loaded from: classes.dex */
final class C4697c extends AbstractC7671b {

    /* renamed from: a */
    final AbstractAdViewAdapter f9061a;

    /* renamed from: b */
    final InterfaceC7924s f9062b;

    public C4697c(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC7924s interfaceC7924s) {
        this.f9061a = abstractAdViewAdapter;
        this.f9062b = interfaceC7924s;
    }

    @Override // p438x8.AbstractC12361f
    public final void onAdFailedToLoad(C12377o c12377o) {
        this.f9062b.onAdFailedToLoad(this.f9061a, c12377o);
    }

    @Override // p438x8.AbstractC12361f
    public final /* bridge */ /* synthetic */ void onAdLoaded(AbstractC7670a abstractC7670a) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.f9061a;
        AbstractC7670a abstractC7670a2 = abstractC7670a;
        abstractAdViewAdapter.mInterstitialAd = abstractC7670a2;
        abstractC7670a2.setFullScreenContentCallback(new C4698d(abstractAdViewAdapter, this.f9062b));
        this.f9062b.onAdLoaded(this.f9061a);
    }
}
