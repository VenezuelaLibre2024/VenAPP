package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Iy */
/* loaded from: assets/audience_network.dex */
public class C3365Iy {
    public double A00;
    public EnumC3371J4 A01;
    public EnumC3372J5 A02;
    public String A03;
    public String A04;
    public Map<String, String> A05;
    public boolean A06;

    public final C3365Iy A00(double d10) {
        this.A00 = d10;
        return this;
    }

    public final C3365Iy A01(EnumC3371J4 enumC3371J4) {
        this.A01 = enumC3371J4;
        return this;
    }

    public final C3365Iy A02(EnumC3372J5 enumC3372J5) {
        this.A02 = enumC3372J5;
        return this;
    }

    public final C3365Iy A03(String str) {
        this.A03 = str;
        return this;
    }

    public final C3365Iy A04(String str) {
        this.A04 = str;
        return this;
    }

    public final C3365Iy A05(Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final C3365Iy A06(boolean z10) {
        this.A06 = z10;
        return this;
    }

    public final C3366Iz A07(C26937f c26937f) {
        return new C3366Iz(c26937f, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
