package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sf */
/* loaded from: assets/audience_network.dex */
public class C3961Sf extends AbstractRunnableC3455KT {
    public static byte[] A01;
    public final /* synthetic */ C28019Q A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{100, 91, 86, 87, 93, 18, 69, 83, 65, 18, 92, 87, 68, 87, 64, 18, 66, 64, 87, 66, 83, 64, 87, 86};
    }

    public C3961Sf(C28019Q c28019q) {
        this.A00 = c28019q;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        boolean z10;
        z10 = this.A00.A07;
        if (!z10) {
            this.A00.A0G(A00(0, 24, 76));
        }
    }
}
