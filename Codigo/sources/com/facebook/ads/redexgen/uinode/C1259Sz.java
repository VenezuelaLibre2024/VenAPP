package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1259Sz extends KT {
    public static byte[] A02;
    public final /* synthetic */ C1257Sx A00;
    public final /* synthetic */ AnonymousClass93 A01;

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

    public C1259Sz(C1257Sx c1257Sx, AnonymousClass93 anonymousClass93) {
        this.A00 = c1257Sx;
        this.A01 = anonymousClass93;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        SA sa2;
        SA sa3;
        InterfaceC1159Pd interfaceC1159Pd;
        sa2 = this.A00.A0Z;
        if (sa2.getState() == RB.A02) {
            sa3 = this.A00.A0Z;
            if (sa3.getCurrentPositionInMillis() == A00()) {
                interfaceC1159Pd = this.A00.A0X;
                interfaceC1159Pd.ADX(A00(0, 22, 43));
            }
        }
    }
}