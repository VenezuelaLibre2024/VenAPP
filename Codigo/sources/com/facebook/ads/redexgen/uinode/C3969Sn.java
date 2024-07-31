package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Sn */
/* loaded from: assets/audience_network.dex */
public class C3969Sn implements InterfaceC25715T {
    public final /* synthetic */ C28099Y A00;

    public C3969Sn(C28099Y c28099y) {
        this.A00 = c28099y;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC25715T
    public final boolean A8u() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        return !atomicBoolean.get() || this.A00.A0T();
    }
}
