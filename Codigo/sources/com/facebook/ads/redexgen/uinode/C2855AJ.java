package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.AJ */
/* loaded from: assets/audience_network.dex */
public final class C2855AJ {
    public static String[] A06 = {"rmgpPCWB7BYHQ3azE8yCiRChgWLX4K1O", "ESYL8WQp59BjyyK9DI9xkUBJ1yOk4QLd", "YweXfGig2PVNilG2mJZlv3ovQAOkP8UY", "CAftEyLXQvcAYYqOnK17yfwScyM6Y9GQ", "5ZUx", "CHSAxwc6W9B6bhcUywJKjVUar2kzl0Sb", "G9dVYOs473", "8VVZpCzafohaQpJb3SOOvVZNRfYg5osa"};
    public C2856AK A01;
    public C2856AK A02;
    public boolean A03;
    public final ArrayList<C2856AK> A05 = new ArrayList<>();
    public final C2851AF A04 = new C2851AF();
    public AbstractC2853AH A00 = AbstractC2853AH.A01;

    private C2856AK A00(C2856AK c2856ak, AbstractC2853AH abstractC2853AH) {
        if (abstractC2853AH.A0E() || this.A00.A0E()) {
            return c2856ak;
        }
        AbstractC2853AH abstractC2853AH2 = this.A00;
        int i10 = c2856ak.A01.A02;
        if (A06[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A06[3] = "6Z7kXvoTE0GMRlV8X7ahHWF28Ir1JA8U";
        Object uid = abstractC2853AH2.A0A(i10, this.A04, true).A03;
        int newPeriodIndex = abstractC2853AH.A04(uid);
        if (newPeriodIndex == -1) {
            return c2856ak;
        }
        int newWindowIndex = abstractC2853AH.A09(newPeriodIndex, this.A04).A00;
        return new C2856AK(newWindowIndex, c2856ak.A01.A00(newPeriodIndex));
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    public final C2856AK A03() {
        return this.A01;
    }

    public final C2856AK A04() {
        if (this.A05.isEmpty()) {
            return null;
        }
        ArrayList<C2856AK> arrayList = this.A05;
        int size = arrayList.size() - 1;
        if (A06[3].charAt(28) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "IuVtQJyFuB";
        strArr[7] = "VEjGs0KHAo6Qkjlg0Fq6YAYYmbb9RMII";
        return arrayList.get(size);
    }

    public final C2856AK A05() {
        if (this.A05.isEmpty() || this.A00.A0E() || this.A03) {
            return null;
        }
        return this.A05.get(0);
    }

    public final C2856AK A06() {
        return this.A02;
    }

    public final C3113Eo A07(int i10) {
        C3113Eo c3113Eo = null;
        AbstractC2853AH abstractC2853AH = this.A00;
        if (abstractC2853AH != null) {
            int A00 = abstractC2853AH.A00();
            for (int periodIndex = 0; periodIndex < this.A05.size(); periodIndex++) {
                C2856AK mediaPeriod = this.A05.get(periodIndex);
                C3113Eo match = mediaPeriod.A01;
                int i11 = match.A02;
                if (i11 < A00 && this.A00.A09(i11, this.A04).A00 == i10) {
                    if (c3113Eo != null) {
                        return null;
                    }
                    c3113Eo = mediaPeriod.A01;
                }
            }
        }
        return c3113Eo;
    }

    public final void A08() {
        this.A03 = false;
        A02();
    }

    public final void A09() {
        this.A03 = true;
    }

    public final void A0A(int i10) {
        A02();
    }

    public final void A0B(int i10, C3113Eo c3113Eo) {
        this.A05.add(new C2856AK(i10, c3113Eo));
        if (this.A05.size() == 1 && !this.A00.A0E()) {
            A02();
        }
    }

    public final void A0C(int i10, C3113Eo c3113Eo) {
        C2856AK mediaPeriod;
        C2856AK c2856ak = new C2856AK(i10, c3113Eo);
        this.A05.remove(c2856ak);
        C2856AK mediaPeriod2 = this.A02;
        if (c2856ak.equals(mediaPeriod2)) {
            if (this.A05.isEmpty()) {
                mediaPeriod = null;
            } else {
                C2856AK mediaPeriod3 = this.A05.get(0);
                mediaPeriod = mediaPeriod3;
            }
            this.A02 = mediaPeriod;
        }
    }

    public final void A0D(int i10, C3113Eo c3113Eo) {
        this.A02 = new C2856AK(i10, c3113Eo);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0E(com.facebook.ads.redexgen.uinode.AbstractC2853AH r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.AK> r0 = r3.A05
            int r0 = r0.size()
            if (r2 >= r0) goto L1b
            java.util.ArrayList<com.facebook.ads.redexgen.X.AK> r1 = r3.A05
            java.lang.Object r0 = r1.get(r2)
            com.facebook.ads.redexgen.X.AK r0 = (com.facebook.ads.redexgen.uinode.C2856AK) r0
            com.facebook.ads.redexgen.X.AK r0 = r3.A00(r0, r4)
            r1.set(r2, r0)
            int r2 = r2 + 1
            goto L1
        L1b:
            com.facebook.ads.redexgen.X.AK r0 = r3.A02
            if (r0 == 0) goto L25
            com.facebook.ads.redexgen.X.AK r0 = r3.A00(r0, r4)
            r3.A02 = r0
        L25:
            r3.A00 = r4
            r3.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C2855AJ.A0E(com.facebook.ads.redexgen.X.AH):void");
    }

    public final boolean A0F() {
        return this.A03;
    }
}