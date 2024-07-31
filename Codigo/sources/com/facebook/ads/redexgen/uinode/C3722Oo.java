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
public final class C3722Oo extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final ViewOnClickListenerC4029Tl A02;
    public static final int A05 = (int) (AbstractC3499LD.A02 * 36.0f);
    public static final int A06 = (int) (AbstractC3499LD.A02 * 36.0f);
    public static final int A03 = (int) (AbstractC3499LD.A02 * 23.0f);
    public static final int A04 = (int) (AbstractC3499LD.A02 * 3.0f);
    public static final int A07 = (int) (AbstractC3499LD.A02 * 4.0f);

    public C3722Oo(C4337Yn c4337Yn, AbstractC4476b5 abstractC4476b5, InterfaceC3369J2 interfaceC3369J2, InterfaceC3560MC interfaceC3560MC, C3872RE c3872re, C3528Lg c3528Lg, C23221P c23221p, InterfaceC3662Nq interfaceC3662Nq) {
        super(c4337Yn);
        this.A00 = c23221p.A08(true);
        RelativeLayout relativeLayout = new RelativeLayout(c4337Yn);
        this.A01 = relativeLayout;
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setClickable(false);
        A01(c4337Yn, abstractC4476b5.A0x().A0F().A04());
        ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl = new ViewOnClickListenerC4029Tl(c4337Yn, abstractC4476b5.A0L(), null, interfaceC3369J2, interfaceC3560MC, c3872re, c3528Lg, abstractC4476b5.A0y());
        this.A02 = viewOnClickListenerC4029Tl;
        viewOnClickListenerC4029Tl.setCta(abstractC4476b5.A0x().A0F(), abstractC4476b5.A12(), new HashMap(), interfaceC3662Nq);
        viewOnClickListenerC4029Tl.setIsInAppBrowser(true);
        addView(viewOnClickListenerC4029Tl, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(C4337Yn c4337Yn, View view) {
        ImageView imageView = new ImageView(c4337Yn);
        imageView.setImageBitmap(AbstractC3545Lx.A01(EnumC3544Lw.MINIMIZE_ARROW));
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

    private void A01(C4337Yn c4337Yn, String str) {
        Button button = new Button(c4337Yn);
        AbstractC3536Lo.A0K(button);
        int i10 = A06;
        button.setPadding(i10, 0, i10, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        AbstractC3536Lo.A0O(button, this.A00, A07);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams ctaParams = new RelativeLayout.LayoutParams(-2, A05);
        ctaParams.addRule(12);
        ctaParams.addRule(14);
        this.A01.addView(button, ctaParams);
        A00(c4337Yn, button);
    }

    public final void A02(String str) {
        this.A02.A09(str);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }

    public void setAutoClickTime(AbstractC4476b5 abstractC4476b5, AbstractC3559MB abstractC3559MB) {
        this.A02.A0A(abstractC4476b5, abstractC3559MB);
    }
}
