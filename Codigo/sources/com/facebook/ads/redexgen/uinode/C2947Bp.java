package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* renamed from: com.facebook.ads.redexgen.X.Bp */
/* loaded from: assets/audience_network.dex */
public final class C2947Bp extends AbstractC4174W7 {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final InterfaceC3234Gp A0A;
    public final InterfaceC3284Hd A0B;

    public C2947Bp(TrackGroup trackGroup, int[] iArr, InterfaceC3234Gp interfaceC3234Gp, long j10, long j11, long j12, float f10, float f11, long j13, InterfaceC3284Hd interfaceC3284Hd) {
        super(trackGroup, iArr);
        this.A0A = interfaceC3234Gp;
        this.A07 = j10 * 1000;
        this.A06 = j11 * 1000;
        this.A08 = 1000 * j12;
        this.A04 = f10;
        this.A05 = f11;
        this.A09 = j13;
        this.A0B = interfaceC3284Hd;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j10) {
        long A67 = ((float) this.A0A.A67()) * this.A04;
        int i10 = 0;
        for (int i11 = 0; i11 < super.A03; i11++) {
            if (j10 == Long.MIN_VALUE || !A00(i11, j10)) {
                if (Math.round(A76(i11).A04 * this.A00) <= A67) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4174W7, com.facebook.ads.redexgen.uinode.InterfaceC3225Gg
    public final void A5U() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3225Gg
    public final int A7v() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4174W7, com.facebook.ads.redexgen.uinode.InterfaceC3225Gg
    public final void ACc(float f10) {
        this.A00 = f10;
    }
}
