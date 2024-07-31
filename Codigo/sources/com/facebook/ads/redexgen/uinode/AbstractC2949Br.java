package com.facebook.ads.redexgen.uinode;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Br */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2949Br extends AbstractC4278Xq implements InterfaceC3173Fo {
    public long A00;
    public InterfaceC3173Fo A01;

    public abstract void A08();

    @Override // com.facebook.ads.redexgen.uinode.AbstractC2905B7
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j10, InterfaceC3173Fo interfaceC3173Fo, long j11) {
        super.A01 = j10;
        this.A01 = interfaceC3173Fo;
        if (j11 == Long.MAX_VALUE) {
            j11 = super.A01;
        }
        this.A00 = j11;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final List<C3172Fn> A6Z(long j10) {
        return this.A01.A6Z(j10 - this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final long A70(int i10) {
        return this.A01.A70(i10) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final int A71() {
        return this.A01.A71();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3173Fo
    public final int A7T(long j10) {
        return this.A01.A7T(j10 - this.A00);
    }
}
