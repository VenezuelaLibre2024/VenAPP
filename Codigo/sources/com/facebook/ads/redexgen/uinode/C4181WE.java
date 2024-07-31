package com.facebook.ads.redexgen.uinode;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.WE */
/* loaded from: assets/audience_network.dex */
public final class C4181WE implements InterfaceC3173Fo {
    public final long[] A00;
    public final C3172Fn[] A01;

    public C4181WE(C3172Fn[] c3172FnArr, long[] jArr) {
        this.A01 = c3172FnArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final List<C3172Fn> A6Z(long j10) {
        C3172Fn c3172Fn;
        int A0B = AbstractC3322IF.A0B(this.A00, j10, true, false);
        if (A0B == -1 || (c3172Fn = this.A01[A0B]) == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(c3172Fn);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final long A70(int i10) {
        boolean z10 = true;
        AbstractC3281Ha.A03(i10 >= 0);
        if (i10 >= this.A00.length) {
            z10 = false;
        }
        AbstractC3281Ha.A03(z10);
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final int A71() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final int A7T(long j10) {
        int A0A = AbstractC3322IF.A0A(this.A00, j10, false, false);
        int index = this.A00.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
