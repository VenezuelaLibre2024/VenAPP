package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.bW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1529bW extends KT {
    public final /* synthetic */ C05700w A00;

    public C1529bW(C05700w c05700w) {
        this.A00 = c05700w;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C05690v c05690v;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c05690v = this.A00.A02;
        c05690v.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
