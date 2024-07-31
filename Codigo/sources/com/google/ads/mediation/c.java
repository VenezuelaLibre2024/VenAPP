package com.google.ads.mediation;

import i9.s;
import x8.o;

/* loaded from: classes.dex */
final class c extends h9.b {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f8062a;

    /* renamed from: b, reason: collision with root package name */
    final s f8063b;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, s sVar) {
        this.f8062a = abstractAdViewAdapter;
        this.f8063b = sVar;
    }

    @Override // x8.f
    public final void onAdFailedToLoad(o oVar) {
        this.f8063b.onAdFailedToLoad(this.f8062a, oVar);
    }

    @Override // x8.f
    public final /* bridge */ /* synthetic */ void onAdLoaded(h9.a aVar) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.f8062a;
        h9.a aVar2 = aVar;
        abstractAdViewAdapter.mInterstitialAd = aVar2;
        aVar2.setFullScreenContentCallback(new d(abstractAdViewAdapter, this.f8063b));
        this.f8063b.onAdLoaded(this.f8062a);
    }
}
