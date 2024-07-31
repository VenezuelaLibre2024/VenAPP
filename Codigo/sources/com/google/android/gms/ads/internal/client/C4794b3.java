package com.google.android.gms.ads.internal.client;

import p438x8.C12354b0;
import p438x8.C12377o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.client.b3 */
/* loaded from: classes.dex */
public final class C4794b3 extends C4936y {

    /* renamed from: c */
    final /* synthetic */ C4808d3 f9696c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4794b3(C4808d3 c4808d3) {
        this.f9696c = c4808d3;
    }

    @Override // com.google.android.gms.ads.internal.client.C4936y, p438x8.AbstractC12359e
    public final void onAdFailedToLoad(C12377o c12377o) {
        C12354b0 c12354b0;
        C4808d3 c4808d3 = this.f9696c;
        c12354b0 = c4808d3.f9713d;
        c12354b0.m39960c(c4808d3.m12385l());
        super.onAdFailedToLoad(c12377o);
    }

    @Override // com.google.android.gms.ads.internal.client.C4936y, p438x8.AbstractC12359e
    public final void onAdLoaded() {
        C12354b0 c12354b0;
        C4808d3 c4808d3 = this.f9696c;
        c12354b0 = c4808d3.f9713d;
        c12354b0.m39960c(c4808d3.m12385l());
        super.onAdLoaded();
    }
}
