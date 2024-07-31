package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.N6 */
/* loaded from: assets/audience_network.dex */
public final class C3616N6 extends LinearLayout {
    public static final int A03 = (int) (AbstractC3499LD.A02 * 40.0f);
    public static final int A04 = (int) (AbstractC3499LD.A02 * 20.0f);
    public static final int A05 = (int) (AbstractC3499LD.A02 * 10.0f);
    public final C23912W A00;
    public final C4337Yn A01;
    public final InterfaceC3600Mq A02;

    public C3616N6(C4337Yn c4337Yn, C23912W c23912w, InterfaceC3600Mq interfaceC3600Mq, EnumC3544Lw enumC3544Lw) {
        this(c4337Yn, c23912w, interfaceC3600Mq, null, enumC3544Lw);
    }

    public C3616N6(C4337Yn c4337Yn, C23912W c23912w, InterfaceC3600Mq interfaceC3600Mq, String str, EnumC3544Lw enumC3544Lw) {
        super(c4337Yn);
        this.A01 = c4337Yn;
        this.A00 = c23912w;
        this.A02 = interfaceC3600Mq;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View A01 = A01(str);
            A01.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            AbstractC3536Lo.A0M(view, -10459280);
            addView(A01, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(c23912w.A03())) {
            View A00 = A00(enumC3544Lw, c23912w.A03());
            int i10 = A05;
            A00.setPadding(0, i10, 0, i10);
            addView(A00, layoutParams);
        }
        C3622NC A032 = A03();
        A032.setPadding(0, A05, 0, 0);
        addView(A032, layoutParams);
    }

    private View A00(EnumC3544Lw enumC3544Lw, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i10 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(AbstractC3545Lx.A01(enumC3544Lw));
        TextView textView = new TextView(getContext());
        AbstractC3536Lo.A0X(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(AbstractC3545Lx.A01(EnumC3544Lw.BACK_ARROW));
        int i10 = A05;
        imageView.setPadding(0, i10, i10 * 2, i10);
        int i11 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        imageView.setOnClickListener(new ViewOnClickListenerC3614N4(this));
        TextView titleView = new TextView(getContext());
        titleView.setGravity(17);
        titleView.setText(str);
        AbstractC3536Lo.A0X(titleView, true, 16);
        titleView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, i11, 0);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(titleView, layoutParams2);
        return linearLayout;
    }

    private C3622NC A03() {
        C3622NC c3622nc = new C3622NC(this.A01);
        for (C23912W c23912w : this.A00.A05()) {
            C3602Ms c3602Ms = new C3602Ms(this.A01);
            c3602Ms.setData(c23912w.A04(), null);
            c3602Ms.setOnClickListener(new ViewOnClickListenerC3615N5(this, c3602Ms, c23912w));
            c3622nc.addView(c3602Ms);
        }
        return c3622nc;
    }
}
