package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.It, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0998It {
    public static String[] A04 = {"VLi8WrXKJp9LAfXNm4uZETrUUakGZ0WJ", "E0EVlIE69utJBkpy2DAhge3Hway87PLR", "qesF58zlzdTn3lZrcRPwRcXAd51VIYsw", "DEhD", "3RGnWFLj1o7mNylLhDHkdliNsrvaqEmP", "q3CsqlllThy2l0WXj26QCfAwDyJHO8xz", "YGqlmSv0HhFp83FTVTLuq2K4C5WSoxDU", "sGX8UiLG8Isc3yhet7ELjp1Y4Ecy5PZh"};
    public EnumC0995Iq A01 = EnumC0995Iq.A02;
    public EnumC0996Ir A02 = EnumC0996Ir.A07;
    public EnumC0997Is A03 = EnumC0997Is.A02;
    public EnumC0994Ip A00 = EnumC0994Ip.A02;

    public final void A00() {
        this.A00 = EnumC0994Ip.A03;
    }

    public final void A01() {
        this.A02 = EnumC0996Ir.A05;
    }

    public final void A02() {
        this.A02 = EnumC0996Ir.A06;
    }

    public final void A03() {
        this.A03 = EnumC0997Is.A03;
    }

    public final boolean A04() {
        if (this.A02 != EnumC0996Ir.A07 && this.A02 != EnumC0996Ir.A03) {
            EnumC0996Ir enumC0996Ir = this.A02;
            if (A04[4].charAt(28) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[7] = "MUDNUnKN31103IrO48BPEmRZSZgb6Srw";
            strArr[2] = "6QfhYTpMJgBL3pE6aQQCkQeTlukRlAkO";
            if (enumC0996Ir != EnumC0996Ir.A06) {
                return false;
            }
        }
        return true;
    }

    public final boolean A05() {
        return this.A02 == EnumC0996Ir.A07 || this.A02 == EnumC0996Ir.A03;
    }

    public final boolean A06() {
        return this.A03 == EnumC0997Is.A03;
    }

    public final boolean A07() {
        return this.A00 == EnumC0994Ip.A03;
    }
}