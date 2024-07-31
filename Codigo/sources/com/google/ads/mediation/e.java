package com.google.ads.mediation;

import a9.h;
import a9.m;
import a9.n;
import a9.p;
import com.google.android.gms.internal.ads.zzbkh;
import i9.v;
import x8.o;

/* loaded from: classes.dex */
final class e extends x8.e implements p, n, m {

    /* renamed from: a, reason: collision with root package name */
    final AbstractAdViewAdapter f8066a;

    /* renamed from: b, reason: collision with root package name */
    final v f8067b;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, v vVar) {
        this.f8066a = abstractAdViewAdapter;
        this.f8067b = vVar;
    }

    @Override // a9.p
    public final void a(h hVar) {
        this.f8067b.onAdLoaded(this.f8066a, new a(hVar));
    }

    @Override // a9.n
    public final void b(zzbkh zzbkhVar) {
        this.f8067b.zzd(this.f8066a, zzbkhVar);
    }

    @Override // a9.m
    public final void c(zzbkh zzbkhVar, String str) {
        this.f8067b.zze(this.f8066a, zzbkhVar, str);
    }

    @Override // x8.e, com.google.android.gms.ads.internal.client.a
    public final void onAdClicked() {
        this.f8067b.onAdClicked(this.f8066a);
    }

    @Override // x8.e
    public final void onAdClosed() {
        this.f8067b.onAdClosed(this.f8066a);
    }

    @Override // x8.e
    public final void onAdFailedToLoad(o oVar) {
        this.f8067b.onAdFailedToLoad(this.f8066a, oVar);
    }

    @Override // x8.e
    public final void onAdImpression() {
        this.f8067b.onAdImpression(this.f8066a);
    }

    @Override // x8.e
    public final void onAdLoaded() {
    }

    @Override // x8.e
    public final void onAdOpened() {
        this.f8067b.onAdOpened(this.f8066a);
    }
}
