package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.WN */
/* loaded from: assets/audience_network.dex */
public final class C4190WN extends AbstractC2853AH {
    public static final Object A09 = new Object();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    public C4190WN(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, Object obj) {
        this.A01 = j10;
        this.A05 = j11;
        this.A00 = j12;
        this.A03 = j13;
        this.A04 = j14;
        this.A02 = j15;
        this.A08 = z10;
        this.A07 = z11;
        this.A06 = obj;
    }

    public C4190WN(long j10, long j11, long j12, long j13, boolean z10, boolean z11, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, obj);
    }

    public C4190WN(long j10, boolean z10, boolean z11, Object obj) {
        this(j10, j10, 0L, 0L, z10, z11, obj);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC2853AH
    public final int A00() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC2853AH
    public final int A01() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC2853AH
    public final int A04(Object obj) {
        return A09.equals(obj) ? 0 : -1;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC2853AH
    public final C2851AF A0A(int i10, C2851AF c2851af, boolean z10) {
        AbstractC3281Ha.A00(i10, 0, 1);
        Object uid = z10 ? A09 : null;
        return c2851af.A0B(null, uid, 0, this.A00, -this.A04);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC2853AH
    public final C2852AG A0D(int i10, C2852AG c2852ag, boolean z10, long j10) {
        Object obj;
        AbstractC3281Ha.A00(i10, 0, 1);
        if (z10) {
            obj = this.A06;
        } else {
            obj = null;
        }
        long j11 = this.A02;
        boolean z11 = this.A07;
        if (z11 && j10 != 0) {
            long windowDefaultStartPositionUs = this.A03;
            if (windowDefaultStartPositionUs == -9223372036854775807L) {
                j11 = -9223372036854775807L;
            } else {
                j11 += j10;
                if (j11 > windowDefaultStartPositionUs) {
                    j11 = -9223372036854775807L;
                }
            }
        }
        return c2852ag.A04(obj, this.A01, this.A05, this.A08, z11, j11, this.A03, 0, 0, this.A04);
    }
}
