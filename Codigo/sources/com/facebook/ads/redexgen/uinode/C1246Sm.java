package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Sm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1246Sm implements InterfaceC1111Nh {
    public final /* synthetic */ C9Y A00;

    public C1246Sm(C9Y c9y) {
        this.A00 = c9y;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1111Nh
    public final void ABh(boolean z10) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A04;
        atomicBoolean.set(z10);
        this.A00.A05();
    }
}
