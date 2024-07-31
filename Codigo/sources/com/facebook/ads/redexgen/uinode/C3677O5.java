package com.facebook.ads.redexgen.uinode;

import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.O5 */
/* loaded from: assets/audience_network.dex */
public final class C3677O5 extends LinearLayout {
    public static final int A06 = (int) (AbstractC3499LD.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C4337Yn A04;
    public final C3678O6[] A05;

    public C3677O5(C4337Yn c4337Yn, int i10, int i11, int i12, int i13) {
        super(c4337Yn);
        this.A00 = A06;
        this.A04 = c4337Yn;
        setOrientation(0);
        this.A03 = i10;
        this.A01 = i12;
        this.A02 = i13;
        this.A05 = new C3678O6[i11];
        for (int i14 = 0; i14 < i11; i14++) {
            this.A05[i14] = A00();
            addView(this.A05[i14]);
        }
        A01();
    }

    private C3678O6 A00() {
        C3678O6 c3678o6 = new C3678O6(this.A04, this.A01, this.A02);
        int i10 = this.A03;
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(i10, i10);
        starRatingViewParams.gravity = 16;
        c3678o6.setLayoutParams(starRatingViewParams);
        return c3678o6;
    }

    private void A01() {
        int i10 = 0;
        while (true) {
            C3678O6[] c3678o6Arr = this.A05;
            int i11 = c3678o6Arr.length;
            if (i10 < i11) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) c3678o6Arr[i10].getLayoutParams();
                int i12 = i10 == 0 ? 0 : this.A00;
                layoutParams.leftMargin = i12;
                i10++;
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(float r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.O6[] r0 = r3.A05
            int r0 = r0.length
            if (r2 >= r0) goto L1f
            float r0 = (float) r2
            float r1 = r4 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r0, r1)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L15
            r1 = 0
        L15:
            com.facebook.ads.redexgen.X.O6[] r0 = r3.A05
            r0 = r0[r2]
            r0.setFillRatio(r1)
            int r2 = r2 + 1
            goto L1
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C3677O5.A02(float):void");
    }

    public void setItemSpacing(int i10) {
        this.A00 = i10;
        A01();
    }

    public void setRating(float f10) {
        A02(f10);
    }
}
