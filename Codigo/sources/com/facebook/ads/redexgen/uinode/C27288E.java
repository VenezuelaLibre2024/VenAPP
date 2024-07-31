package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8E */
/* loaded from: assets/audience_network.dex */
public final class C27288E {
    public double A00;
    public double A01 = System.currentTimeMillis() / 1000.0d;
    public String A02;
    public Map<String, String> A03;

    public C27288E(double d10, String str, Map<String, String> mData) {
        this.A00 = d10;
        this.A02 = str;
        this.A03 = mData;
    }

    public final double A00() {
        return this.A00;
    }

    public final double A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final String A03() {
        return EnumC3372J5.A0A.toString();
    }

    public final Map<String, String> A04() {
        return this.A03;
    }
}
