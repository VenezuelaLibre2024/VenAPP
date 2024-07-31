package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Sm */
/* loaded from: assets/audience_network.dex */
public class C3968Sm implements InterfaceC3653Nh {
    public final /* synthetic */ C28099Y A00;

    public C3968Sm(C28099Y c28099y) {
        this.A00 = c28099y;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3653Nh
    public final void ABh(boolean z10) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A04;
        atomicBoolean.set(z10);
        this.A00.A05();
    }
}
