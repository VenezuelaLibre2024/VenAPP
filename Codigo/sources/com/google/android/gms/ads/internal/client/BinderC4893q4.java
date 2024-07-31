package com.google.android.gms.ads.internal.client;

import p438x8.AbstractC12361f;

/* renamed from: com.google.android.gms.ads.internal.client.q4 */
/* loaded from: classes.dex */
public final class BinderC4893q4 extends AbstractBinderC4847j0 {

    /* renamed from: a */
    private final AbstractC12361f f9807a;

    /* renamed from: b */
    private final Object f9808b;

    public BinderC4893q4(AbstractC12361f abstractC12361f, Object obj) {
        this.f9807a = abstractC12361f;
        this.f9808b = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4853k0
    public final void zzb(C4801c3 c4801c3) {
        AbstractC12361f abstractC12361f = this.f9807a;
        if (abstractC12361f != null) {
            abstractC12361f.onAdFailedToLoad(c4801c3.m12371v1());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC4853k0
    public final void zzc() {
        Object obj;
        AbstractC12361f abstractC12361f = this.f9807a;
        if (abstractC12361f == null || (obj = this.f9808b) == null) {
            return;
        }
        abstractC12361f.onAdLoaded(obj);
    }
}
