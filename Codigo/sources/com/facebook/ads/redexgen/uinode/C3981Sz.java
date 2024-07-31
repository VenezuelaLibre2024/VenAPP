package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sz */
/* loaded from: assets/audience_network.dex */
public class C3981Sz extends AbstractRunnableC3455KT {
    public static byte[] A02;
    public final /* synthetic */ C3979Sx A00;
    public final /* synthetic */ C277893 A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{Byte.MAX_VALUE, -78, -93, -93, -94, -81, -90, -85, -92, 93, -90, -85, -95, -94, -93, -90, -85, -90, -79, -94, -87, -74};
    }

    public C3981Sz(C3979Sx c3979Sx, C277893 c277893) {
        this.A00 = c3979Sx;
        this.A01 = c277893;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C3930SA c3930sa;
        C3930SA c3930sa2;
        InterfaceC3773Pd interfaceC3773Pd;
        c3930sa = this.A00.A0Z;
        if (c3930sa.getState() == EnumC3869RB.A02) {
            c3930sa2 = this.A00.A0Z;
            if (c3930sa2.getCurrentPositionInMillis() == A00()) {
                interfaceC3773Pd = this.A00.A0X;
                interfaceC3773Pd.ADX(A00(0, 22, 43));
            }
        }
    }
}
