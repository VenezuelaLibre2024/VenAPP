package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07869t {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C0895Eo A04;
    public final boolean A05;
    public final boolean A06;

    public C07869t(C0895Eo c0895Eo, long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.A04 = c0895Eo;
        this.A03 = j10;
        this.A02 = j11;
        this.A00 = j12;
        this.A01 = j13;
        this.A06 = z10;
        this.A05 = z11;
    }

    public final C07869t A00(int i10) {
        return new C07869t(this.A04.A00(i10), this.A03, this.A02, this.A00, this.A01, this.A06, this.A05);
    }

    public final C07869t A01(long j10) {
        return new C07869t(this.A04, j10, this.A02, this.A00, this.A01, this.A06, this.A05);
    }
}
