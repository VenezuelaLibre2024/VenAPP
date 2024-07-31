package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.TA */
/* loaded from: assets/audience_network.dex */
public class C3992TA implements InterfaceC3653Nh {
    public final /* synthetic */ C3990T8 A00;

    public C3992TA(C3990T8 c3990t8) {
        this.A00 = c3990t8;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3653Nh
    public final void ABh(boolean z10) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(z10);
        this.A00.A07();
    }
}
