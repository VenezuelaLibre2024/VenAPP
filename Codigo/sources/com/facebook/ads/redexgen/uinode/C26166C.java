package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.6C */
/* loaded from: assets/audience_network.dex */
public final class C26166C {
    public final long A00;
    public final EnumC26156B A01;
    public final String A02;
    public final boolean A03;

    public C26166C(String str, boolean z10, EnumC26156B enumC26156B) {
        this(str, z10, enumC26156B, System.currentTimeMillis());
    }

    public C26166C(String str, boolean z10, EnumC26156B enumC26156B, long j10) {
        this.A02 = str;
        this.A03 = z10;
        this.A01 = enumC26156B;
        this.A00 = j10;
    }

    public static C26166C A00() {
        return new C26166C("", true, EnumC26156B.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC26156B A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
