package com.facebook.ads.redexgen.uinode;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.Wq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1350Wq implements D6 {
    public static String[] A02 = {"KDcVXuz53RpoF9UEOZ96l2VZuhVX9ip0", "CKRJ1Pqx0SMvAzHTc14bPVY1Im6KLWKe", "CZRg2SIX1VWZgfyXTOdEl1", "FcRR7mDk42dnDG0ym1pZJ2", "QPo", "3iSkzhZlTwG2jcdx249ci8whKDsXKTKF", "nuc6nRuUqT3GqwIih", "HhkYvD09GQfRAuSaGWngxJEfFHmtitdD"};
    public final C0979Hy A00 = new C0979Hy(new byte[4]);
    public final /* synthetic */ C1348Wo A01;

    public C1350Wq(C1348Wo c1348Wo) {
        this.A01 = c1348Wo;
    }

    @Override // com.facebook.ads.redexgen.uinode.D6
    public final void A4R(C0980Hz c0980Hz) {
        int i10;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        int tableId = c0980Hz.A0E();
        if (tableId != 0) {
            return;
        }
        c0980Hz.A0Z(7);
        int A04 = c0980Hz.A04() / 4;
        for (int programNumber = 0; programNumber < A04; programNumber++) {
            c0980Hz.A0a(this.A00, 4);
            int A042 = this.A00.A04(16);
            this.A00.A08(3);
            if (A042 == 0) {
                this.A00.A08(13);
            } else {
                int i11 = this.A00.A04(13);
                sparseArray2 = this.A01.A06;
                sparseArray2.put(i11, new C1353Wt(new C1349Wp(this.A01, i11)));
                C1348Wo.A01(this.A01);
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

    @Override // com.facebook.ads.redexgen.uinode.D6
    public final void A8q(IB ib2, InterfaceC0839Bu interfaceC0839Bu, DC dc2) {
    }
}