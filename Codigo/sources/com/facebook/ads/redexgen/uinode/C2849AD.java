package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.AD */
/* loaded from: assets/audience_network.dex */
public final class C2849AD {
    public static final C2849AD A02;
    public static final C2849AD A03;
    public static final C2849AD A04;
    public static final C2849AD A05;
    public static final C2849AD A06;
    public final long A00;
    public final long A01;

    static {
        C2849AD c2849ad = new C2849AD(0L, 0L);
        A04 = c2849ad;
        A02 = new C2849AD(Long.MAX_VALUE, Long.MAX_VALUE);
        A06 = new C2849AD(Long.MAX_VALUE, 0L);
        A05 = new C2849AD(0L, Long.MAX_VALUE);
        A03 = c2849ad;
    }

    public C2849AD(long j10, long j11) {
        AbstractC3281Ha.A03(j10 >= 0);
        AbstractC3281Ha.A03(j11 >= 0);
        this.A01 = j10;
        this.A00 = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2849AD c2849ad = (C2849AD) obj;
        return this.A01 == c2849ad.A01 && this.A00 == c2849ad.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
