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
public final class C1091Mn extends RelativeLayout {
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
    public final C2S A02;
    public final C1399Yn A03;
    public final InterfaceC1094Mq A04;
    public final boolean A05;

    static {
        int i10 = (int) (LD.A02 * 16.0f);
        A09 = i10;
        A0A = (int) (LD.A02 * 8.0f);
        A0D = (int) (LD.A02 * 44.0f);
        int i11 = (int) (LD.A02 * 10.0f);
        A08 = i11;
        A07 = i10 - i11;
        A0E = (int) (LD.A02 * 75.0f);
        A0B = (int) (LD.A02 * 25.0f);
        A0F = (int) (LD.A02 * 45.0f);
        A0C = (int) (LD.A02 * 15.0f);
        A06 = (int) (LD.A02 * 16.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1091Mn(com.facebook.ads.redexgen.uinode.C1090Mm r11) {
        /*
            r10 = this;
            com.facebook.ads.redexgen.X.Yn r0 = com.facebook.ads.redexgen.uinode.C1090Mm.A01(r11)
            r10.<init>(r0)
            com.facebook.ads.redexgen.X.Yn r0 = com.facebook.ads.redexgen.uinode.C1090Mm.A01(r11)
            r10.A03 = r0
            com.facebook.ads.redexgen.X.Ym r0 = r0.A01()
            com.facebook.ads.redexgen.X.2S r0 = com.facebook.ads.redexgen.uinode.C2T.A00(r0)
            r10.A02 = r0
            com.facebook.ads.redexgen.X.Mq r0 = com.facebook.ads.redexgen.uinode.C1090Mm.A03(r11)
            r10.A04 = r0
            boolean r0 = com.facebook.ads.redexgen.uinode.C1090Mm.A09(r11)
            if (r0 == 0) goto L9f
            int r0 = com.facebook.ads.redexgen.uinode.C1091Mn.A0E
        L25:
            r10.A01 = r0
            boolean r0 = com.facebook.ads.redexgen.uinode.C1090Mm.A09(r11)
            if (r0 == 0) goto L9c
            int r0 = com.facebook.ads.redexgen.uinode.C1091Mn.A0B
        L2f:
            r10.A00 = r0
            boolean r0 = com.facebook.ads.redexgen.uinode.C1090Mm.A0A(r11)
            r10.A05 = r0
            r0 = 1
            r10.setFocusable(r0)
            android.view.View r7 = r10.A01(r11)
            android.view.View r6 = r10.A00(r11)
            android.view.View r5 = r10.getFooterView()
            com.facebook.ads.redexgen.uinode.AbstractC1066Lo.A0K(r7)
            com.facebook.ads.redexgen.uinode.AbstractC1066Lo.A0K(r6)
            com.facebook.ads.redexgen.uinode.AbstractC1066Lo.A0K(r5)
            r9 = -1
            r8 = -2
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r4.<init>(r9, r8)
            r0 = 10
            r4.addRule(r0)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r3.<init>(r9, r9)
            r0 = 13
            r3.addRule(r0)
            r1 = 3
            int r0 = r7.getId()
            r3.addRule(r1, r0)
            r1 = 2
            int r0 = r5.getId()
            r3.addRule(r1, r0)
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r9, r8)
            r0 = 12
            r2.addRule(r0)
            int r0 = com.facebook.ads.redexgen.uinode.C1091Mn.A09
            r1 = 0
            r2.setMargins(r0, r1, r0, r0)
            r10.addView(r7, r4)
            r10.addView(r6, r3)
            r10.addView(r5, r2)
            boolean r0 = com.facebook.ads.redexgen.uinode.C1090Mm.A0B(r11)
            if (r0 == 0) goto L99
        L95:
            r5.setVisibility(r1)
            return
        L99:
            r1 = 8
            goto L95
        L9c:
            int r0 = com.facebook.ads.redexgen.uinode.C1091Mn.A0C
            goto L2f
        L9f:
            int r0 = com.facebook.ads.redexgen.uinode.C1091Mn.A0F
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C1091Mn.<init>(com.facebook.ads.redexgen.X.Mm):void");
    }

    public /* synthetic */ C1091Mn(C1090Mm c1090Mm, ViewOnClickListenerC1088Mk viewOnClickListenerC1088Mk) {
        this(c1090Mm);
    }

    private View A00(C1090Mm c1090Mm) {
        EnumC1074Lw enumC1074Lw;
        int i10;
        String str;
        String str2;
        boolean z10;
        String str3;
        String str4;
        String str5;
        ImageView imageView = new ImageView(getContext());
        int i11 = this.A00;
        imageView.setPadding(i11, i11, i11, i11);
        enumC1074Lw = c1090Mm.A01;
        imageView.setImageBitmap(AbstractC1075Lx.A01(enumC1074Lw));
        imageView.setColorFilter(-1);
        int i12 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i12, i12);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        i10 = c1090Mm.A00;
        gradientDrawable.setColor(i10);
        AbstractC1066Lo.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i13 = A09;
        layoutParams.setMargins(i13, 0, i13, i13);
        TextView textView = new TextView(getContext());
        AbstractC1066Lo.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        str = c1090Mm.A06;
        textView.setText(str);
        textView.setGravity(17);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(-1, -2);
        iconParams.setMargins(i13, 0, i13, i13);
        TextView textView2 = new TextView(getContext());
        AbstractC1066Lo.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        str2 = c1090Mm.A05;
        textView2.setText(str2);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i13, 0, i13, i13);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, iconParams);
        linearLayout.addView(textView2, layoutParams2);
        z10 = c1090Mm.A09;
        if (z10) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            str3 = c1090Mm.A04;
            if (!TextUtils.isEmpty(str3)) {
                O3 o32 = new O3(this.A03);
                int i14 = A0F;
                LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(i14, i14);
                subtitleParams.setMargins(0, 0, A0A, 0);
                o32.setFullCircleCorners(true);
                AsyncTaskC1276Tq A05 = new AsyncTaskC1276Tq(o32, this.A03).A05(i14, i14);
                str5 = c1090Mm.A04;
                A05.A07(str5);
                linearLayout2.addView(o32, subtitleParams);
            }
            C1096Ms c1096Ms = new C1096Ms(this.A03);
            str4 = c1090Mm.A03;
            c1096Ms.setData(str4, EnumC1074Lw.CHECKMARK);
            c1096Ms.setSelected(true);
            linearLayout2.addView(c1096Ms, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C1090Mm c1090Mm) {
        boolean z10;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        z10 = c1090Mm.A0A;
        if (z10) {
            ImageView imageView = new ImageView(getContext());
            int i10 = A08;
            imageView.setPadding(i10, i10, i10, i10);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(AbstractC1075Lx.A01(EnumC1074Lw.CROSS));
            imageView.setOnClickListener(new ViewOnClickListenerC1088Mk(this));
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
        imageView.setImageBitmap(AbstractC1075Lx.A01(EnumC1074Lw.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i10 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 17;
        TextView managePrefsText = new TextView(getContext());
        AbstractC1066Lo.A0X(managePrefsText, false, 16);
        managePrefsText.setTextColor(-13272859);
        int i11 = A0A;
        managePrefsText.setPadding(i11, i11, i11, i11);
        managePrefsText.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ViewOnClickListenerC1089Ml(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(managePrefsText, settingsIconParams);
        return linearLayout;
    }
}
