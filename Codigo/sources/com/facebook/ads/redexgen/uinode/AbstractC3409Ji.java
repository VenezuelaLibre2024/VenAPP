package com.facebook.ads.redexgen.uinode;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ji */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3409Ji {
    public static EnumC3407Jg A00(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = displayMetrics.heightPixels;
        int screenHeight = (int) (screenWidth / displayMetrics.density);
        if (C3500LE.A04(i10, screenHeight)) {
            return EnumC3407Jg.A0H;
        }
        if (screenHeight > i10) {
            return EnumC3407Jg.A0J;
        }
        return EnumC3407Jg.A0G;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, EnumC3405Je enumC3405Je) {
        int ceil;
        int i10 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int screenWidth = enumC3405Je.A03();
        if (i10 >= screenWidth) {
            ceil = displayMetrics.widthPixels;
        } else {
            int screenWidth2 = enumC3405Je.A03();
            ceil = (int) Math.ceil(screenWidth2 * displayMetrics.density);
        }
        int screenWidth3 = enumC3405Je.A02();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ceil, (int) Math.ceil(screenWidth3 * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
