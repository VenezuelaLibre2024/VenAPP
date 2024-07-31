package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public final class J8 implements InterfaceC1228Ru {
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1228Ru
    public final long A4z() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1228Ru
    public final void AGQ(Object obj, long j10) throws InterruptedException {
        obj.wait(j10);
    }
}
