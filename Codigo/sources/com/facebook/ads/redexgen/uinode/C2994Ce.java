package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ce */
/* loaded from: assets/audience_network.dex */
public final class C2994Ce {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final Format A07;
    public final long[] A08;
    public final long[] A09;
    public final C2995Cf[] A0A;

    public C2994Ce(int i10, int i11, long j10, long j11, long j12, Format format, int i12, C2995Cf[] c2995CfArr, int i13, long[] jArr, long[] jArr2) {
        this.A00 = i10;
        this.A03 = i11;
        this.A06 = j10;
        this.A05 = j11;
        this.A04 = j12;
        this.A07 = format;
        this.A02 = i12;
        this.A0A = c2995CfArr;
        this.A01 = i13;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final C2995Cf A00(int i10) {
        C2995Cf[] c2995CfArr = this.A0A;
        if (c2995CfArr == null) {
            return null;
        }
        return c2995CfArr[i10];
    }
}
