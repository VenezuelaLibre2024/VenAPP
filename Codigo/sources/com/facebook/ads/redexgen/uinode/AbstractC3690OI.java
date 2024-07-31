package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.OI */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3690OI {
    public static float A00(C23131G c23131g) {
        int height = c23131g.A0D().A01();
        int width = c23131g.A0D().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d10) {
        int availableWidth = (int) ((AbstractC3498LC.A00().widthPixels - (AbstractC3693OL.A07 * 2)) / d10);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = AbstractC3536Lo.A01(16);
        int ctaTextHeight = AbstractC3667Nv.A0A;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC3693OL.A07;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = AbstractC3498LC.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static ViewOnClickListenerC3689OH A03(ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl, String str) {
        return new ViewOnClickListenerC3689OH(viewOnClickListenerC4029Tl, str);
    }

    public static boolean A04(double d10) {
        return d10 < 0.9d;
    }

    public static boolean A05(double d10, int i10) {
        return A02(i10) < A01(d10);
    }

    public static boolean A06(int i10, int i11, double d10) {
        return i10 == 2 || A05(d10, i11);
    }
}
