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
public final class C3776Pg extends LinearLayout {
    public LinearLayout A00;
    public final int A01;
    public final C4337Yn A02;
    public final C3675O3 A03;
    public final C3681O9 A04;
    public static final int A07 = (int) (AbstractC3499LD.A02 * 16.0f);
    public static final int A08 = (int) (AbstractC3499LD.A02 * 16.0f);
    public static final int A06 = (int) (AbstractC3499LD.A02 * 8.0f);
    public static final int A05 = (int) (AbstractC3499LD.A02 * 72.0f);

    public C3776Pg(C3774Pe c3774Pe) {
        super(C3774Pe.A04(c3774Pe));
        C4337Yn A04 = C3774Pe.A04(c3774Pe);
        this.A02 = A04;
        this.A03 = new C3675O3(A04);
        this.A04 = new C3681O9(A04, C3774Pe.A02(c3774Pe), true, false, true);
        this.A01 = C3774Pe.A00(c3774Pe);
        A03(c3774Pe);
    }

    public /* synthetic */ C3776Pg(C3774Pe c3774Pe, C3965Sj c3965Sj) {
        this(c3774Pe);
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

    private void A02(C3774Pe c3774Pe) {
        if (!TextUtils.isEmpty(C3774Pe.A05(c3774Pe))) {
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
            AbstractC3536Lo.A0X(textView, false, 16);
            textView.setText(C3774Pe.A05(c3774Pe));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new AsyncTaskC4034Tq(imageView, this.A02).A04().A07(C3774Pe.A06(c3774Pe));
            int i11 = A07;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i11, i11);
            layoutParams2.setMargins(0, 0, i10 / 2, 0);
            this.A00.addView(imageView, layoutParams2);
            this.A00.addView(textView, layoutParams);
            GradientDrawable bgDrawable = new GradientDrawable();
            bgDrawable.setCornerRadius(100.0f);
            bgDrawable.setColor(469762047);
            AbstractC3536Lo.A0S(this.A00, bgDrawable);
            addView(this.A00, informativeTextViewParams);
        }
    }

    private void A03(C3774Pe c3774Pe) {
        AbstractC3536Lo.A0M(this.A03, 0);
        this.A03.setRadius(50);
        if (C3774Pe.A01(c3774Pe).A00() == EnumC23181L.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        new AsyncTaskC4034Tq(this.A03, this.A02).A04().A07(C3774Pe.A03(c3774Pe).A01());
        this.A04.A03(C3774Pe.A01(c3774Pe).A06(), C3774Pe.A03(c3774Pe).A03(), null, false, true);
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
        A02(c3774Pe);
        AbstractC3536Lo.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(InterfaceC3775Pf interfaceC3775Pf) {
        A00();
        postDelayed(new C3965Sj(this, interfaceC3775Pf), this.A01);
    }
}
