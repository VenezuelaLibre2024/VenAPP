package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.J8 */
/* loaded from: assets/audience_network.dex */
public final class C3375J8 implements InterfaceC3914Ru {
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3914Ru
    public final long A4z() {
        return System.nanoTime();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3914Ru
    public final void AGQ(Object obj, long j10) throws InterruptedException {
        obj.wait(j10);
    }
}
