package com.google.ads.mediation;

import com.google.android.gms.internal.ads.zzbkh;
import p011a9.AbstractC0070h;
import p011a9.InterfaceC0075m;
import p011a9.InterfaceC0076n;
import p011a9.InterfaceC0078p;
import p157i9.InterfaceC7927v;
import p438x8.AbstractC12359e;
import p438x8.C12377o;

/* renamed from: com.google.ads.mediation.e */
/* loaded from: classes.dex */
final class C4699e extends AbstractC12359e implements InterfaceC0078p, InterfaceC0076n, InterfaceC0075m {

    /* renamed from: a */
    final AbstractAdViewAdapter f9065a;

    /* renamed from: b */
    final InterfaceC7927v f9066b;

    public C4699e(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC7927v interfaceC7927v) {
        this.f9065a = abstractAdViewAdapter;
        this.f9066b = interfaceC7927v;
    }

    @Override // p011a9.InterfaceC0078p
    /* renamed from: a */
    public final void mo375a(AbstractC0070h abstractC0070h) {
        this.f9066b.onAdLoaded(this.f9065a, new C4695a(abstractC0070h));
    }

    @Override // p011a9.InterfaceC0076n
    /* renamed from: b */
    public final void mo374b(zzbkh zzbkhVar) {
        this.f9066b.zzd(this.f9065a, zzbkhVar);
    }

    @Override // p011a9.InterfaceC0075m
    /* renamed from: c */
    public final void mo373c(zzbkh zzbkhVar, String str) {
        this.f9066b.zze(this.f9065a, zzbkhVar, str);
    }

    @Override // p438x8.AbstractC12359e, com.google.android.gms.ads.internal.client.InterfaceC4783a
    public final void onAdClicked() {
        this.f9066b.onAdClicked(this.f9065a);
    }

    @Override // p438x8.AbstractC12359e
    public final void onAdClosed() {
        this.f9066b.onAdClosed(this.f9065a);
    }

    @Override // p438x8.AbstractC12359e
    public final void onAdFailedToLoad(C12377o c12377o) {
        this.f9066b.onAdFailedToLoad(this.f9065a, c12377o);
    }

    @Override // p438x8.AbstractC12359e
    public final void onAdImpression() {
        this.f9066b.onAdImpression(this.f9065a);
    }

    @Override // p438x8.AbstractC12359e
    public final void onAdLoaded() {
    }

    @Override // p438x8.AbstractC12359e
    public final void onAdOpened() {
        this.f9066b.onAdOpened(this.f9065a);
    }
}
