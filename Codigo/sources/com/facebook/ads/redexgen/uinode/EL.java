package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class EL {
    public static byte[] A05;
    public static String[] A06 = {"ys79rflcZR", "JvXVVVa5NcPDQ", "Q89GAQFZPNwANkfCdiKH1gvUr6", "fZOyMOuChjfI9gOKYd90JCIRk18sz1rD", "OOW8UfRJew081BUdbBG5Pxzf0VO", "xPmLQSFy3SjaACTv6gu", "e8kFvK5VJCM4F", "4YvHW6"};
    public final InterfaceC0947Gr A00;
    public final InterfaceC0949Gt A01;
    public final InterfaceC0949Gt A02;
    public final HK A03;
    public final I3 A04;

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

    public EL(HK hk2, InterfaceC0949Gt interfaceC0949Gt) {
        this(hk2, interfaceC0949Gt, null, null, null);
    }

    public EL(HK hk2, InterfaceC0949Gt interfaceC0949Gt, InterfaceC0949Gt interfaceC0949Gt2, InterfaceC0947Gr interfaceC0947Gr, I3 i32) {
        AbstractC0955Ha.A01(interfaceC0949Gt);
        this.A03 = hk2;
        this.A02 = interfaceC0949Gt;
        this.A01 = interfaceC0949Gt2;
        this.A00 = interfaceC0947Gr;
        this.A04 = i32;
    }

    public final HK A02() {
        return this.A03;
    }

    public final C1321Vk A03(boolean z10) {
        InterfaceC0950Gu c1333Vw;
        InterfaceC0949Gt interfaceC0949Gt = this.A01;
        if (interfaceC0949Gt != null) {
            c1333Vw = interfaceC0949Gt.A4X();
        } else {
            c1333Vw = new C1333Vw();
        }
        if (z10) {
            return new C1321Vk(this.A03, C1334Vx.A02, c1333Vw, null, 1, null);
        }
        if (0 != 0) {
            throw new NullPointerException(A00(0, 14, 1));
        }
        C1322Vl c1322Vl = new C1322Vl(this.A03, 2097152L);
        InterfaceC0950Gu A4X = this.A02.A4X();
        I3 i32 = this.A04;
        if (i32 != null) {
            A4X = new C1326Vp(A4X, i32, -1000);
        }
        InterfaceC0950Gu upstream = c1333Vw;
        return new C1321Vk(this.A03, A4X, upstream, c1322Vl, 1, null);
    }

    public final I3 A04() {
        I3 i32 = this.A04;
        return i32 != null ? i32 : new I3();
    }
}
