package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Wl */
/* loaded from: assets/audience_network.dex */
public final class C4211Wl implements InterfaceC2959C1 {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C4211Wl(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.A06 = i10;
        this.A07 = i11;
        this.A02 = i12;
        this.A04 = i13;
        this.A03 = i14;
        this.A05 = i15;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j10) {
        long positionOffset = Math.max(0L, j10 - this.A01);
        long j11 = 1000000 * positionOffset;
        long positionOffset2 = this.A02;
        return j11 / positionOffset2;
    }

    public final void A06(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2959C1
    public final long A6r() {
        long j10 = 1000000 * (this.A00 / this.A04);
        long numFrames = this.A07;
        return j10 / numFrames;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2959C1
    public final C2958C0 A7t(long j10) {
        int i10 = this.A04;
        long positionOffset = i10;
        long j11 = ((this.A02 * j10) / 1000000) / positionOffset;
        long positionOffset2 = i10;
        long A0E = AbstractC3322IF.A0E(j11 * positionOffset2, 0L, this.A00 - i10);
        long j12 = this.A01 + A0E;
        long A05 = A05(j12);
        C2960C2 seekPoint = new C2960C2(A05, j12);
        if (A05 < j10) {
            long j13 = this.A00;
            int i11 = this.A04;
            if (A0E != j13 - i11) {
                long seekTimeUs = i11 + j12;
                long seekPosition = A05(seekTimeUs);
                return new C2958C0(seekPoint, new C2960C2(seekPosition, seekTimeUs));
            }
        }
        return new C2958C0(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2959C1
    public final boolean A9I() {
        return true;
    }
}