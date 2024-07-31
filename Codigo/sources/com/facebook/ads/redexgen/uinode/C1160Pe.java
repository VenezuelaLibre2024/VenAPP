package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Pe */
/* loaded from: assets/audience_network.dex */
public final class C1160Pe {
    public String A02;
    public String A03;
    public final C1N A04;
    public final C05741a A05;
    public final C1399Yn A06;
    public C1P A01 = C1P.A01(null);
    public int A00 = AdError.NETWORK_ERROR_CODE;

    public C1160Pe(C1399Yn c1399Yn, C1N c1n, C05741a c05741a) {
        this.A06 = c1399Yn;
        this.A04 = c1n;
        this.A05 = c05741a;
    }

    public static /* synthetic */ int A00(C1160Pe c1160Pe) {
        return c1160Pe.A00;
    }

    public static /* synthetic */ C1N A01(C1160Pe c1160Pe) {
        return c1160Pe.A04;
    }

    public static /* synthetic */ C1P A02(C1160Pe c1160Pe) {
        return c1160Pe.A01;
    }

    public static /* synthetic */ C05741a A03(C1160Pe c1160Pe) {
        return c1160Pe.A05;
    }

    public static /* synthetic */ C1399Yn A04(C1160Pe c1160Pe) {
        return c1160Pe.A06;
    }

    public static /* synthetic */ String A05(C1160Pe c1160Pe) {
        return c1160Pe.A03;
    }

    public static /* synthetic */ String A06(C1160Pe c1160Pe) {
        return c1160Pe.A02;
    }

    public final C1160Pe A07(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C1160Pe A08(C1P c1p) {
        this.A01 = c1p;
        return this;
    }

    public final C1160Pe A09(String str) {
        this.A02 = str;
        return this;
    }

    public final C1160Pe A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final C1162Pg A0B() {
        return new C1162Pg(this, null);
    }
}
