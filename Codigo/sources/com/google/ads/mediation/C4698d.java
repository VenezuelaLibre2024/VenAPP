package com.google.ads.mediation;

import p157i9.InterfaceC7924s;
import p438x8.AbstractC12376n;

/* renamed from: com.google.ads.mediation.d */
/* loaded from: classes.dex */
final class C4698d extends AbstractC12376n {

    /* renamed from: a */
    final AbstractAdViewAdapter f9063a;

    /* renamed from: b */
    final InterfaceC7924s f9064b;

    public C4698d(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC7924s interfaceC7924s) {
        this.f9063a = abstractAdViewAdapter;
        this.f9064b = interfaceC7924s;
    }

    @Override // p438x8.AbstractC12376n
    public final void onAdDismissedFullScreenContent() {
        this.f9064b.onAdClosed(this.f9063a);
    }

    @Override // p438x8.AbstractC12376n
    public final void onAdShowedFullScreenContent() {
        this.f9064b.onAdOpened(this.f9063a);
    }
}
