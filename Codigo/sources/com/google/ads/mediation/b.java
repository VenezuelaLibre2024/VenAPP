package com.google.ads.mediation;

import i9.m;
import x8.o;

/* loaded from: classes.dex */
final class b extends x8.e implements y8.e, com.google.android.gms.ads.internal.client.a {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f8060a;

    /* renamed from: b, reason: collision with root package name */
    final m f8061b;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, m mVar) {
        this.f8060a = abstractAdViewAdapter;
        this.f8061b = mVar;
    }

    @Override // x8.e, com.google.android.gms.ads.internal.client.a
    public final void onAdClicked() {
        this.f8061b.onAdClicked(this.f8060a);
    }

    @Override // x8.e
    public final void onAdClosed() {
        this.f8061b.onAdClosed(this.f8060a);
    }

    @Override // x8.e
    public final void onAdFailedToLoad(o oVar) {
        this.f8061b.onAdFailedToLoad(this.f8060a, oVar);
    }

    @Override // x8.e
    public final void onAdLoaded() {
        this.f8061b.onAdLoaded(this.f8060a);
    }

    @Override // x8.e
    public final void onAdOpened() {
        this.f8061b.onAdOpened(this.f8060a);
    }

    @Override // y8.e
    public final void onAppEvent(String str, String str2) {
        this.f8061b.zzb(this.f8060a, str, str2);
    }
}
