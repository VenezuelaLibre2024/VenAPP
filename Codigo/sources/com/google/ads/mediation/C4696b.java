package com.google.ads.mediation;

import com.google.android.gms.ads.internal.client.InterfaceC4783a;
import p157i9.InterfaceC7918m;
import p438x8.AbstractC12359e;
import p438x8.C12377o;
import p461y8.InterfaceC12649e;

/* renamed from: com.google.ads.mediation.b */
/* loaded from: classes.dex */
final class C4696b extends AbstractC12359e implements InterfaceC12649e, InterfaceC4783a {

    /* renamed from: a */
    final AbstractAdViewAdapter f9059a;

    /* renamed from: b */
    final InterfaceC7918m f9060b;

    public C4696b(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC7918m interfaceC7918m) {
        this.f9059a = abstractAdViewAdapter;
        this.f9060b = interfaceC7918m;
    }

    @Override // p438x8.AbstractC12359e, com.google.android.gms.ads.internal.client.InterfaceC4783a
    public final void onAdClicked() {
        this.f9060b.onAdClicked(this.f9059a);
    }

    @Override // p438x8.AbstractC12359e
    public final void onAdClosed() {
        this.f9060b.onAdClosed(this.f9059a);
    }

    @Override // p438x8.AbstractC12359e
    public final void onAdFailedToLoad(C12377o c12377o) {
        this.f9060b.onAdFailedToLoad(this.f9059a, c12377o);
    }

    @Override // p438x8.AbstractC12359e
    public final void onAdLoaded() {
        this.f9060b.onAdLoaded(this.f9059a);
    }

    @Override // p438x8.AbstractC12359e
    public final void onAdOpened() {
        this.f9060b.onAdOpened(this.f9059a);
    }

    @Override // p461y8.InterfaceC12649e
    public final void onAppEvent(String str, String str2) {
        this.f9060b.zzb(this.f9059a, str, str2);
    }
}
