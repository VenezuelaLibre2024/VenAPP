package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.WI */
/* loaded from: assets/audience_network.dex */
public final class C4185WI implements InterfaceC3173Fo {
    public final List<C3172Fn> A00;

    public C4185WI(List<C3172Fn> list) {
        this.A00 = list;
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
