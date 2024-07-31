package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.XT */
/* loaded from: assets/audience_network.dex */
public final class C4255XT extends AbstractC2977CJ {
    public static byte[] A03;
    public final long A00;
    public final List<C4255XT> A01;
    public final List<C4254XS> A02;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{12, 79, 67, 66, 88, 77, 69, 66, 73, 94, 95, 22, 12, 79, 3, 10, 14, 25, 10, 28, 85, 79};
    }

    public C4255XT(int i10, long j10) {
        super(i10);
        this.A00 = j10;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C4255XT A06(int i10) {
        int size = this.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            C4255XT c4255xt = this.A01.get(i11);
            int childrenSize = ((AbstractC2977CJ) c4255xt).A00;
            if (childrenSize == i10) {
                return c4255xt;
            }
        }
        return null;
    }

    public final C4254XS A07(int i10) {
        int size = this.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            C4254XS c4254xs = this.A02.get(i11);
            int childrenSize = ((AbstractC2977CJ) c4254xs).A00;
            if (childrenSize == i10) {
                return c4254xs;
            }
        }
        return null;
    }

    public final void A08(C4255XT c4255xt) {
        this.A01.add(c4255xt);
    }

    public final void A09(C4254XS c4254xs) {
        this.A02.add(c4254xs);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC2977CJ
    public final String toString() {
        return AbstractC2977CJ.A02(super.A00) + A04(13, 9, 69) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 6) + Arrays.toString(this.A01.toArray());
    }
}
