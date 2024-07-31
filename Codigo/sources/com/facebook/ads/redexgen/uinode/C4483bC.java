package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bC */
/* loaded from: assets/audience_network.dex */
public class C4483bC extends AbstractRunnableC3455KT {
    public static byte[] A01;
    public final /* synthetic */ C4482bB A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public C4483bC(C4482bB c4482bB) {
        this.A00 = c4482bB;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C4337Yn c4337Yn;
        AbstractC3644NY abstractC3644NY;
        C4484bD c4484bD;
        c4337Yn = this.A00.A02;
        c4337Yn.A0E().AH4();
        abstractC3644NY = this.A00.A04;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 35));
        c4484bD = this.A00.A00;
        abstractC3644NY.loadUrl(append.append(c4484bD.A03()).toString());
    }
}
