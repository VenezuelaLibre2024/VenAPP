package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Om */
/* loaded from: assets/audience_network.dex */
public final class C3720Om extends RelativeLayout {
    public final View A00;
    public final C3676O4 A01;

    public C3720Om(C4337Yn c4337Yn, View view) {
        super(c4337Yn);
        this.A00 = view;
        C3676O4 c3676o4 = new C3676O4(c4337Yn);
        this.A01 = c3676o4;
        AbstractC3536Lo.A0K(c3676o4);
    }

    public final void A00(int i10) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i10));
    }

    public final void A01(C3681O9 c3681o9, boolean z10) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (c3681o9 != null) {
            if (z10) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                c3681o9.setAlignment(3);
                layoutParams2.setMargins(AbstractC3693OL.A07 / 2, AbstractC3693OL.A07 / 2, AbstractC3693OL.A07 / 2, AbstractC3693OL.A07 / 2);
                linearLayout.addView(c3681o9, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                AbstractC3536Lo.A0S(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams insideLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                insideLayoutParams.addRule(3, this.A01.getId());
                insideLayoutParams.setMargins(0, AbstractC3693OL.A07, 0, 0);
                c3681o9.setAlignment(17);
                addView(c3681o9, insideLayoutParams);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}
