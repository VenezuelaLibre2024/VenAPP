package com.facebook.ads.redexgen.uinode;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.Wq */
/* loaded from: assets/audience_network.dex */
public class C4216Wq implements InterfaceC3020D6 {
    public static String[] A02 = {"KDcVXuz53RpoF9UEOZ96l2VZuhVX9ip0", "CKRJ1Pqx0SMvAzHTc14bPVY1Im6KLWKe", "CZRg2SIX1VWZgfyXTOdEl1", "FcRR7mDk42dnDG0ym1pZJ2", "QPo", "3iSkzhZlTwG2jcdx249ci8whKDsXKTKF", "nuc6nRuUqT3GqwIih", "HhkYvD09GQfRAuSaGWngxJEfFHmtitdD"};
    public final C3305Hy A00 = new C3305Hy(new byte[4]);
    public final /* synthetic */ C4214Wo A01;

    public C4216Wq(C4214Wo c4214Wo) {
        this.A01 = c4214Wo;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3020D6
    public final void A4R(C3306Hz c3306Hz) {
        int i10;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        int tableId = c3306Hz.A0E();
        if (tableId != 0) {
            return;
        }
        c3306Hz.A0Z(7);
        int A04 = c3306Hz.A04() / 4;
        for (int programNumber = 0; programNumber < A04; programNumber++) {
            c3306Hz.A0a(this.A00, 4);
            int A042 = this.A00.A04(16);
            this.A00.A08(3);
            if (A042 == 0) {
                this.A00.A08(13);
            } else {
                int i11 = this.A00.A04(13);
                sparseArray2 = this.A01.A06;
                sparseArray2.put(i11, new C4219Wt(new C4215Wp(this.A01, i11)));
                C4214Wo.A01(this.A01);
            }
        }
        i10 = this.A01.A05;
        int programCount = A02[4].length();
        if (programCount == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "4awIAPS5zJKVkKN48BLjJX";
        strArr[2] = "yyhTqQNSKamLuuIUjTGErW";
        if (i10 != 2) {
            sparseArray = this.A01.A06;
            sparseArray.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3020D6
    public final void A8q(C3318IB c3318ib, InterfaceC2952Bu interfaceC2952Bu, C3025DC c3025dc) {
    }
}
