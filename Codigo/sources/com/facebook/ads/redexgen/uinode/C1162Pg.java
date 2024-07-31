package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Pg */
/* loaded from: assets/audience_network.dex */
public final class C1162Pg extends LinearLayout {
    public LinearLayout A00;
    public final int A01;
    public final C1399Yn A02;
    public final O3 A03;
    public final O9 A04;
    public static final int A07 = (int) (LD.A02 * 16.0f);
    public static final int A08 = (int) (LD.A02 * 16.0f);
    public static final int A06 = (int) (LD.A02 * 8.0f);
    public static final int A05 = (int) (LD.A02 * 72.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1162Pg(com.facebook.ads.redexgen.uinode.C1160Pe r7) {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Yn r0 = com.facebook.ads.redexgen.uinode.C1160Pe.A04(r7)
            r6.<init>(r0)
            com.facebook.ads.redexgen.X.Yn r1 = com.facebook.ads.redexgen.uinode.C1160Pe.A04(r7)
            r6.A02 = r1
            com.facebook.ads.redexgen.X.O3 r0 = new com.facebook.ads.redexgen.X.O3
            r0.<init>(r1)
            r6.A03 = r0
            com.facebook.ads.redexgen.X.O9 r0 = new com.facebook.ads.redexgen.X.O9
            com.facebook.ads.redexgen.X.1P r2 = com.facebook.ads.redexgen.uinode.C1160Pe.A02(r7)
            r3 = 1
            r4 = 0
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A04 = r0
            int r0 = com.facebook.ads.redexgen.uinode.C1160Pe.A00(r7)
            r6.A01 = r0
            r6.A03(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C1162Pg.<init>(com.facebook.ads.redexgen.X.Pe):void");
    }

    public /* synthetic */ C1162Pg(C1160Pe c1160Pe, C1243Sj c1243Sj) {
        this(c1160Pe);
    }

    private void A00() {
        A01(this.A03, 150);
        A01(this.A04, 170);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, 190);
        }
    }

    private void A01(View view, int i10) {
        view.setTranslationY(i10);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i10).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(C1160Pe c1160Pe) {
        String str;
        String str2;
        String str3;
        str = c1160Pe.A03;
        if (!TextUtils.isEmpty(str)) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.A00 = linearLayout;
            linearLayout.setGravity(17);
            LinearLayout linearLayout2 = this.A00;
            int i10 = A08;
            linearLayout2.setPadding(i10, i10 / 2, i10, i10 / 2);
            LinearLayout.LayoutParams informativeTextViewParams = new LinearLayout.LayoutParams(-2, -2);
            informativeTextViewParams.setMargins(0, i10 / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            AbstractC1066Lo.A0X(textView, false, 16);
            str2 = c1160Pe.A03;
            textView.setText(str2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            AsyncTaskC1276Tq A04 = new AsyncTaskC1276Tq(imageView, this.A02).A04();
            str3 = c1160Pe.A02;
            A04.A07(str3);
            int i11 = A07;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i11, i11);
            layoutParams2.setMargins(0, 0, i10 / 2, 0);
            this.A00.addView(imageView, layoutParams2);
            this.A00.addView(textView, layoutParams);
            GradientDrawable bgDrawable = new GradientDrawable();
            bgDrawable.setCornerRadius(100.0f);
            bgDrawable.setColor(469762047);
            AbstractC1066Lo.A0S(this.A00, bgDrawable);
            addView(this.A00, informativeTextViewParams);
        }
    }

    private void A03(C1160Pe c1160Pe) {
        C1N c1n;
        C05741a c05741a;
        C1N c1n2;
        C05741a c05741a2;
        AbstractC1066Lo.A0M(this.A03, 0);
        this.A03.setRadius(50);
        c1n = c1160Pe.A04;
        if (c1n.A00() == C1L.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        AsyncTaskC1276Tq A04 = new AsyncTaskC1276Tq(this.A03, this.A02).A04();
        c05741a = c1160Pe.A05;
        A04.A07(c05741a.A01());
        O9 o92 = this.A04;
        c1n2 = c1160Pe.A04;
        String A062 = c1n2.A06();
        c05741a2 = c1160Pe.A05;
        o92.A03(A062, c05741a2.A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A08;
        layoutParams.setMargins(0, i10, 0, i10 / 2);
        View view = this.A03;
        int i11 = A05;
        ViewGroup.LayoutParams titleAndDescriptionParams = new LinearLayout.LayoutParams(i11, i11);
        addView(view, titleAndDescriptionParams);
        addView(this.A04, layoutParams);
        A02(c1160Pe);
        AbstractC1066Lo.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(InterfaceC1161Pf interfaceC1161Pf) {
        A00();
        postDelayed(new C1243Sj(this, interfaceC1161Pf), this.A01);
    }
}
