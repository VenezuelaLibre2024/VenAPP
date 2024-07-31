package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WC implements InterfaceC0919Fo {
    public static final WC A01 = new WC();
    public final List<C0918Fn> A00;

    public WC() {
        this.A00 = Collections.emptyList();
    }

    public WC(C0918Fn c0918Fn) {
        this.A00 = Collections.singletonList(c0918Fn);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0919Fo
    public final List<C0918Fn> A6Z(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0919Fo
    public final long A70(int i10) {
        AbstractC0955Ha.A03(i10 == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0919Fo
    public final int A71() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0919Fo
    public final int A7T(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
