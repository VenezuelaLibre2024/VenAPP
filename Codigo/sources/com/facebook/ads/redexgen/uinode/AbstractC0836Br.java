package com.facebook.ads.redexgen.uinode;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Br, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0836Br extends AbstractC1376Xq implements InterfaceC0919Fo {
    public long A00;
    public InterfaceC0919Fo A01;

    public abstract void A08();

    @Override // com.facebook.ads.redexgen.uinode.B7
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j10, InterfaceC0919Fo interfaceC0919Fo, long j11) {
        super.A01 = j10;
        this.A01 = interfaceC0919Fo;
        if (j11 == Long.MAX_VALUE) {
            j11 = super.A01;
        }
        this.A00 = j11;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0919Fo
    public final List<C0918Fn> A6Z(long j10) {
        return this.A01.A6Z(j10 - this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0919Fo
    public final long A70(int i10) {
        return this.A01.A70(i10) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0919Fo
    public final int A71() {
        return this.A01.A71();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0919Fo
    public final int A7T(long j10) {
        return this.A01.A7T(j10 - this.A00);
    }
}
