package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.EL */
/* loaded from: assets/audience_network.dex */
public final class C3084EL {
    public static byte[] A05;
    public static String[] A06 = {"ys79rflcZR", "JvXVVVa5NcPDQ", "Q89GAQFZPNwANkfCdiKH1gvUr6", "fZOyMOuChjfI9gOKYd90JCIRk18sz1rD", "OOW8UfRJew081BUdbBG5Pxzf0VO", "xPmLQSFy3SjaACTv6gu", "e8kFvK5VJCM4F", "4YvHW6"};
    public final InterfaceC3236Gr A00;
    public final InterfaceC3238Gt A01;
    public final InterfaceC3238Gt A02;
    public final InterfaceC3265HK A03;
    public final C3310I3 A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 26;
            String[] strArr = A06;
            if (strArr[1].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A06[5] = "z6hEl1VDyGriGJRg";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{126, -115, Byte.MIN_VALUE, 124, -113, Byte.MIN_VALUE, 95, 124, -113, 124, 110, -124, -119, -122};
    }

    static {
        A01();
    }

    public C3084EL(InterfaceC3265HK interfaceC3265HK, InterfaceC3238Gt interfaceC3238Gt) {
        this(interfaceC3265HK, interfaceC3238Gt, null, null, null);
    }

    public C3084EL(InterfaceC3265HK interfaceC3265HK, InterfaceC3238Gt interfaceC3238Gt, InterfaceC3238Gt interfaceC3238Gt2, InterfaceC3236Gr interfaceC3236Gr, C3310I3 c3310i3) {
        AbstractC3281Ha.A01(interfaceC3238Gt);
        this.A03 = interfaceC3265HK;
        this.A02 = interfaceC3238Gt;
        this.A01 = interfaceC3238Gt2;
        this.A00 = interfaceC3236Gr;
        this.A04 = c3310i3;
    }

    public final InterfaceC3265HK A02() {
        return this.A03;
    }

    public final C4151Vk A03(boolean z10) {
        InterfaceC3239Gu c4163Vw;
        InterfaceC3238Gt interfaceC3238Gt = this.A01;
        if (interfaceC3238Gt != null) {
            c4163Vw = interfaceC3238Gt.A4X();
        } else {
            c4163Vw = new C4163Vw();
        }
        if (z10) {
            return new C4151Vk(this.A03, C4164Vx.A02, c4163Vw, null, 1, null);
        }
        if (0 != 0) {
            throw new NullPointerException(A00(0, 14, 1));
        }
        C4152Vl c4152Vl = new C4152Vl(this.A03, 2097152L);
        InterfaceC3239Gu A4X = this.A02.A4X();
        C3310I3 c3310i3 = this.A04;
        if (c3310i3 != null) {
            A4X = new C4156Vp(A4X, c3310i3, -1000);
        }
        InterfaceC3239Gu upstream = c4163Vw;
        return new C4151Vk(this.A03, A4X, upstream, c4152Vl, 1, null);
    }

    public final C3310I3 A04() {
        C3310I3 c3310i3 = this.A04;
        return c3310i3 != null ? c3310i3 : new C3310I3();
    }
}
