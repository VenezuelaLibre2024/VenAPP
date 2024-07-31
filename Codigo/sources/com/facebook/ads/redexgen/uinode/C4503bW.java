package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.bW */
/* loaded from: assets/audience_network.dex */
public class C4503bW extends AbstractRunnableC3455KT {
    public final /* synthetic */ C22930w A00;

    public C4503bW(C22930w c22930w) {
        this.A00 = c22930w;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C22920v c22920v;
        CountDownLatch countDownLatch;
        this.A00.A07();
        c22920v = this.A00.A02;
        c22920v.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
