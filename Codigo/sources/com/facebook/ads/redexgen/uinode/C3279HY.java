package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.HY */
/* loaded from: assets/audience_network.dex */
public class C3279HY implements InterfaceC3879RL {
    public final /* synthetic */ C26586x A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public C3279HY(C26586x c26586x, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c26586x;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3879RL
    public final void AB9(InterfaceC3877RJ interfaceC3877RJ) {
        C26586x.A06(interfaceC3877RJ.A69(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3879RL
    public final void ABS(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
