package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Mn */
/* loaded from: assets/audience_network.dex */
public final class C3597Mn extends RelativeLayout {
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public final int A00;
    public final int A01;
    public final C23872S A02;
    public final C4337Yn A03;
    public final InterfaceC3600Mq A04;
    public final boolean A05;

    static {
        int i10 = (int) (AbstractC3499LD.A02 * 16.0f);
        A09 = i10;
        A0A = (int) (AbstractC3499LD.A02 * 8.0f);
        A0D = (int) (AbstractC3499LD.A02 * 44.0f);
        int i11 = (int) (AbstractC3499LD.A02 * 10.0f);
        A08 = i11;
        A07 = i10 - i11;
        A0E = (int) (AbstractC3499LD.A02 * 75.0f);
        A0B = (int) (AbstractC3499LD.A02 * 25.0f);
        A0F = (int) (AbstractC3499LD.A02 * 45.0f);
        A0C = (int) (AbstractC3499LD.A02 * 15.0f);
        A06 = (int) (AbstractC3499LD.A02 * 16.0f);
    }

    public C3597Mn(C3596Mm c3596Mm) {
        super(C3596Mm.A01(c3596Mm));
        C4337Yn A01 = C3596Mm.A01(c3596Mm);
        this.A03 = A01;
        this.A02 = AbstractC23882T.A00(A01.A01());
        this.A04 = C3596Mm.A03(c3596Mm);
        this.A01 = C3596Mm.A09(c3596Mm) ? A0E : A0F;
        this.A00 = C3596Mm.A09(c3596Mm) ? A0B : A0C;
        this.A05 = C3596Mm.A0A(c3596Mm);
        setFocusable(true);
        View A012 = A01(c3596Mm);
        View A00 = A00(c3596Mm);
        View footerView = getFooterView();
        AbstractC3536Lo.A0K(A012);
        AbstractC3536Lo.A0K(A00);
        AbstractC3536Lo.A0K(footerView);
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(10);
        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(-1, -1);
        headerParams.addRule(13);
        headerParams.addRule(3, A012.getId());
        headerParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i10 = A09;
        layoutParams.setMargins(i10, 0, i10, i10);
        addView(A012, footerParams);
        addView(A00, headerParams);
        addView(footerView, layoutParams);
        footerView.setVisibility(C3596Mm.A0B(c3596Mm) ? 0 : 8);
    }

    public /* synthetic */ C3597Mn(C3596Mm c3596Mm, ViewOnClickListenerC3594Mk viewOnClickListenerC3594Mk) {
        this(c3596Mm);
    }

    private View A00(C3596Mm c3596Mm) {
        ImageView imageView = new ImageView(getContext());
        int i10 = this.A00;
        imageView.setPadding(i10, i10, i10, i10);
        imageView.setImageBitmap(AbstractC3545Lx.A01(C3596Mm.A02(c3596Mm)));
        imageView.setColorFilter(-1);
        int i11 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(C3596Mm.A00(c3596Mm));
        AbstractC3536Lo.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i12 = A09;
        layoutParams.setMargins(i12, 0, i12, i12);
        TextView textView = new TextView(getContext());
        AbstractC3536Lo.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(C3596Mm.A04(c3596Mm));
        textView.setGravity(17);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(-1, -2);
        iconParams.setMargins(i12, 0, i12, i12);
        TextView textView2 = new TextView(getContext());
        AbstractC3536Lo.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(C3596Mm.A05(c3596Mm));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i12, 0, i12, i12);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, iconParams);
        linearLayout.addView(textView2, layoutParams2);
        if (C3596Mm.A08(c3596Mm)) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(C3596Mm.A06(c3596Mm))) {
                C3675O3 c3675o3 = new C3675O3(this.A03);
                int i13 = A0F;
                LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(i13, i13);
                subtitleParams.setMargins(0, 0, A0A, 0);
                c3675o3.setFullCircleCorners(true);
                new AsyncTaskC4034Tq(c3675o3, this.A03).A05(i13, i13).A07(C3596Mm.A06(c3596Mm));
                linearLayout2.addView(c3675o3, subtitleParams);
            }
            C3602Ms c3602Ms = new C3602Ms(this.A03);
            c3602Ms.setData(C3596Mm.A07(c3596Mm), EnumC3544Lw.CHECKMARK);
            c3602Ms.setSelected(true);
            linearLayout2.addView(c3602Ms, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C3596Mm c3596Mm) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (C3596Mm.A0C(c3596Mm)) {
            ImageView imageView = new ImageView(getContext());
            int i10 = A08;
            imageView.setPadding(i10, i10, i10, i10);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(AbstractC3545Lx.A01(EnumC3544Lw.CROSS));
            imageView.setOnClickListener(new ViewOnClickListenerC3594Mk(this));
            int i11 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
            int i12 = A07;
            layoutParams.setMargins(i12, i12, i12, i12);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(AbstractC3545Lx.A01(EnumC3544Lw.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i10 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 17;
        TextView managePrefsText = new TextView(getContext());
        AbstractC3536Lo.A0X(managePrefsText, false, 16);
        managePrefsText.setTextColor(-13272859);
        int i11 = A0A;
        managePrefsText.setPadding(i11, i11, i11, i11);
        managePrefsText.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ViewOnClickListenerC3595Ml(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(managePrefsText, settingsIconParams);
        return linearLayout;
    }
}
