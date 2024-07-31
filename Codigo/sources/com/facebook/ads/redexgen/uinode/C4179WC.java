package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.WC */
/* loaded from: assets/audience_network.dex */
public final class C4179WC implements InterfaceC3173Fo {
    public static final C4179WC A01 = new C4179WC();
    public final List<C3172Fn> A00;

    public C4179WC() {
        this.A00 = Collections.emptyList();
    }

    public C4179WC(C3172Fn c3172Fn) {
        this.A00 = Collections.singletonList(c3172Fn);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final List<C3172Fn> A6Z(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final long A70(int i10) {
        AbstractC3281Ha.A03(i10 == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final int A71() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final int A7T(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
