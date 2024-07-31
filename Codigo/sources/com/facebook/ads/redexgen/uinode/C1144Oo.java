package com.facebook.ads.redexgen.uinode;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Oo */
/* loaded from: assets/audience_network.dex */
public final class C1144Oo extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC1271Tl A02;
    public static final int A05 = (int) (LD.A02 * 36.0f);
    public static final int A06 = (int) (LD.A02 * 36.0f);
    public static final int A03 = (int) (LD.A02 * 23.0f);
    public static final int A04 = (int) (LD.A02 * 3.0f);
    public static final int A07 = (int) (LD.A02 * 4.0f);

    public C1144Oo(C1399Yn c1399Yn, AbstractC1502b5 abstractC1502b5, J2 j22, MC mc2, RE re2, C1058Lg c1058Lg, C1P c1p, InterfaceC1120Nq interfaceC1120Nq) {
        super(c1399Yn);
        this.A00 = c1p.A08(true);
        RelativeLayout relativeLayout = new RelativeLayout(c1399Yn);
        this.A01 = relativeLayout;
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setClickable(false);
        A01(c1399Yn, abstractC1502b5.A0x().A0F().A04());
        ViewOnClickListenerC1271Tl viewOnClickListenerC1271Tl = new ViewOnClickListenerC1271Tl(c1399Yn, abstractC1502b5.A0L(), null, j22, mc2, re2, c1058Lg, abstractC1502b5.A0y());
        this.A02 = viewOnClickListenerC1271Tl;
        viewOnClickListenerC1271Tl.setCta(abstractC1502b5.A0x().A0F(), abstractC1502b5.A12(), new HashMap(), interfaceC1120Nq);
        viewOnClickListenerC1271Tl.setIsInAppBrowser(true);
        addView(viewOnClickListenerC1271Tl, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(C1399Yn c1399Yn, View view) {
        ImageView imageView = new ImageView(c1399Yn);
        imageView.setImageBitmap(AbstractC1075Lx.A01(EnumC1074Lw.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        int i10 = A03;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        int i11 = A04;
        imageView.setPadding(i11, i11, i11, i11);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(C1399Yn c1399Yn, String str) {
        Button button = new Button(c1399Yn);
        AbstractC1066Lo.A0K(button);
        int i10 = A06;
        button.setPadding(i10, 0, i10, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        AbstractC1066Lo.A0O(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c1399Yn, button);
    }

    public final void A02(String str) {
        this.A02.A09(str);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC1502b5 abstractC1502b5, MB mb2) {
        this.A02.A0A(abstractC1502b5, mb2);
    }
}
