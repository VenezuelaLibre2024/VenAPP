package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.57 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC254957 {
    public static String[] A00 = {"UqypfisWbLbbWLDfIVvpiaUsz0iS", "wEiCJDeLGzLJebV", "cX", "dRMEhdR7kDOm9Ob", "SmhGT229bW5LAFpAZzaxeRYqKvMDeGhX", "QcSoUKFtoryhyFMFYIfDI81ChPsDlMu7", "SBvSWfqovIH0ljTVzoffsyrdWCNw", "n"};

    public static int A00(C254553 c254553, AbstractC25144Y abstractC25144Y, View view, View view2, AbstractC25304o abstractC25304o, boolean z10) {
        if (abstractC25304o.A0W() == 0 || c254553.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(abstractC25304o.A0p(view) - abstractC25304o.A0p(view2)) + 1;
        }
        int A0C = abstractC25144Y.A0C(view2);
        int A0F = abstractC25144Y.A0F(view);
        String[] strArr = A00;
        if (strArr[4].charAt(28) == strArr[5].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[3] = "xd2oZUwi45Npmqe";
        strArr2[1] = "1k2xoHfklbXXQiR";
        int extend = abstractC25144Y.A0B();
        return Math.min(extend, A0C - A0F);
    }

    public static int A01(C254553 c254553, AbstractC25144Y abstractC25144Y, View view, View view2, AbstractC25304o abstractC25304o, boolean z10) {
        if (abstractC25304o.A0W() == 0 || c254553.A03() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return c254553.A03();
        }
        int A0C = abstractC25144Y.A0C(view2) - abstractC25144Y.A0F(view);
        int A0p = abstractC25304o.A0p(view);
        int laidOutArea = abstractC25304o.A0p(view2);
        float abs = A0C / (Math.abs(A0p - laidOutArea) + 1);
        int laidOutArea2 = c254553.A03();
        return (int) (abs * laidOutArea2);
    }

    public static int A02(C254553 c254553, AbstractC25144Y abstractC25144Y, View view, View view2, AbstractC25304o abstractC25304o, boolean z10, boolean z11) {
        int laidOutArea;
        if (abstractC25304o.A0W() != 0) {
            int A03 = c254553.A03();
            String[] strArr = A00;
            if (strArr[3].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[6] = "xSzU3PMpL9LC7k2G9V08vNIV3nIP";
            strArr2[0] = "UsrmTbcEPDcBULmsiiLKltF5MwgK";
            if (A03 != 0 && view != null && view2 != null) {
                int maxPosition = Math.min(abstractC25304o.A0p(view), abstractC25304o.A0p(view2));
                int A0p = abstractC25304o.A0p(view);
                int minPosition = abstractC25304o.A0p(view2);
                int max = Math.max(A0p, minPosition);
                if (z11) {
                    int minPosition2 = c254553.A03();
                    laidOutArea = Math.max(0, (minPosition2 - max) - 1);
                } else {
                    laidOutArea = Math.max(0, maxPosition);
                }
                if (!z10) {
                    return laidOutArea;
                }
                int itemsBefore = abstractC25144Y.A0C(view2);
                int minPosition3 = abstractC25144Y.A0F(view);
                int maxPosition2 = Math.abs(itemsBefore - minPosition3);
                int itemsBefore2 = abstractC25304o.A0p(view);
                int minPosition4 = abstractC25304o.A0p(view2);
                float abs = laidOutArea * (maxPosition2 / (Math.abs(itemsBefore2 - minPosition4) + 1));
                int itemsBefore3 = abstractC25144Y.A0A();
                int minPosition5 = abstractC25144Y.A0F(view);
                return Math.round(abs + (itemsBefore3 - minPosition5));
            }
        }
        return 0;
    }
}
