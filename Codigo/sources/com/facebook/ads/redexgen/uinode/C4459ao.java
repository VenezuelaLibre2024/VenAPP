package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ao */
/* loaded from: assets/audience_network.dex */
public class C4459ao extends AbstractRunnableC3455KT {
    public static byte[] A03;
    public InterfaceC22860p A00;
    public String A01;
    public final /* synthetic */ C3150FR A02;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{105, -116, -119, -104, -100, -115, -102, 72, -100, -111, -107, -115, -105, -99, -100, 86};
    }

    public C4459ao(C3150FR c3150fr, InterfaceC22860p interfaceC22860p, String str) {
        this.A02 = c3150fr;
        this.A00 = interfaceC22860p;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        this.A02.A0S(this.A01);
        this.A02.A0N(this.A00);
        this.A02.ABR(new C3403Jb(AdErrorType.NETWORK_ERROR, A00(0, 16, 38)));
    }
}
