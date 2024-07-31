package com.google.ads.mediation;

import i9.s;
import x8.n;

/* loaded from: classes.dex */
final class d extends n {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f8064a;

    /* renamed from: b, reason: collision with root package name */
    final s f8065b;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, s sVar) {
        this.f8064a = abstractAdViewAdapter;
        this.f8065b = sVar;
    }

    @Override // x8.n
    public final void onAdDismissedFullScreenContent() {
        this.f8065b.onAdClosed(this.f8064a);
    }

    @Override // x8.n
    public final void onAdShowedFullScreenContent() {
        this.f8065b.onAdOpened(this.f8064a);
    }
}
