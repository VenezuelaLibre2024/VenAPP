package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.F9 */
/* loaded from: assets/audience_network.dex */
public final class C3134F9 {
    public C3134F9 A00;
    public C3230Gl A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public C3134F9(long j10, int i10) {
        this.A04 = j10;
        this.A03 = i10 + j10;
    }

    public final int A00(long j10) {
        return ((int) (j10 - this.A04)) + this.A01.A00;
    }

    public final C3134F9 A01() {
        this.A01 = null;
        C3134F9 c3134f9 = this.A00;
        this.A00 = null;
        return c3134f9;
    }

    public final void A02(C3230Gl c3230Gl, C3134F9 c3134f9) {
        this.A01 = c3230Gl;
        this.A00 = c3134f9;
        this.A02 = true;
    }
}
