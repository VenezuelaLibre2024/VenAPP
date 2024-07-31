package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Pe */
/* loaded from: assets/audience_network.dex */
public final class C3774Pe {
    public String A02;
    public String A03;
    public final C23201N A04;
    public final C23331a A05;
    public final C4337Yn A06;
    public C23221P A01 = C23221P.A01(null);
    public int A00 = AdError.NETWORK_ERROR_CODE;

    public C3774Pe(C4337Yn c4337Yn, C23201N c23201n, C23331a c23331a) {
        this.A06 = c4337Yn;
        this.A04 = c23201n;
        this.A05 = c23331a;
    }

    public static /* synthetic */ int A00(C3774Pe c3774Pe) {
        return c3774Pe.A00;
    }

    public static /* synthetic */ C23201N A01(C3774Pe c3774Pe) {
        return c3774Pe.A04;
    }

    public static /* synthetic */ C23221P A02(C3774Pe c3774Pe) {
        return c3774Pe.A01;
    }

    public static /* synthetic */ C23331a A03(C3774Pe c3774Pe) {
        return c3774Pe.A05;
    }

    public static /* synthetic */ C4337Yn A04(C3774Pe c3774Pe) {
        return c3774Pe.A06;
    }

    public static /* synthetic */ String A05(C3774Pe c3774Pe) {
        return c3774Pe.A03;
    }

    public static /* synthetic */ String A06(C3774Pe c3774Pe) {
        return c3774Pe.A02;
    }

    public final C3774Pe A07(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C3774Pe A08(C23221P c23221p) {
        this.A01 = c23221p;
        return this;
    }

    public final C3774Pe A09(String str) {
        this.A02 = str;
        return this;
    }

    public final C3774Pe A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final C3776Pg A0B() {
        return new C3776Pg(this, null);
    }
}
