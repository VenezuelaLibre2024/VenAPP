package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bX */
/* loaded from: assets/audience_network.dex */
public final class C4504bX extends AbstractC22790h {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 115, 123, 126, 119, 118, 50, -122, -127, 50, -127, -126, 119, Byte.MIN_VALUE, 50, 126, 123, Byte.MIN_VALUE, 125, 50, -121, -124, 126, 76, 50};
    }

    static {
        A01();
        A02 = C4504bX.class.getSimpleName();
    }

    public C4504bX(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, String str, Uri uri) {
        super(c4337Yn, interfaceC3369J2, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22790h
    public final EnumC22780g A0C() {
        try {
            C3481Kv.A0D(new C3481Kv(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 17) + this.A00.toString();
        }
        return EnumC22780g.A08;
    }
}
