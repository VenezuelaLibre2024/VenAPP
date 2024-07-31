package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Gk */
/* loaded from: assets/audience_network.dex */
public final class C3229Gk {
    public static String[] A04 = {"1e59kXQlLqMkYu", "73uDxCsdQKWLV7ukq8JJdZs18UKd6swo", "mCuMZDHsEtXcrT2f0", "82", "pR5c7vVXcuaoTTpQp", "OeCOW4uYvzA4LVqnaAabDbQ1U", "2mUnq0j6yY0W6wQrn1U3Lg5rNBUJPBqf", "6oWLaazoE5vpCSBDL9uHOzoNvgEAVE9"};
    public final int A00;
    public final C3226Gh A01;
    public final Object A02;
    public final C2847AB[] A03;

    public C3229Gk(C2847AB[] c2847abArr, InterfaceC3225Gg[] interfaceC3225GgArr, Object obj) {
        this.A03 = c2847abArr;
        this.A01 = new C3226Gh(interfaceC3225GgArr);
        this.A02 = obj;
        this.A00 = c2847abArr.length;
    }

    public final boolean A00(int i10) {
        return this.A03[i10] != null;
    }

    public final boolean A01(C3229Gk c3229Gk) {
        if (c3229Gk == null || c3229Gk.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i10 = 0; i10 < this.A01.A01; i10++) {
            if (!A02(c3229Gk, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(C3229Gk c3229Gk, int i10) {
        if (c3229Gk == null) {
            return false;
        }
        C2847AB[] c2847abArr = this.A03;
        String[] strArr = A04;
        if (strArr[0].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[0] = "XY11p18RHVDFci";
        strArr2[3] = "x2";
        return AbstractC3322IF.A0g(c2847abArr[i10], c3229Gk.A03[i10]) && AbstractC3322IF.A0g(this.A01.A00(i10), c3229Gk.A01.A00(i10));
    }
}
