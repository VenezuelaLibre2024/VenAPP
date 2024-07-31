package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public final class N6 extends LinearLayout {
    public static final int A03 = (int) (LD.A02 * 40.0f);
    public static final int A04 = (int) (LD.A02 * 20.0f);
    public static final int A05 = (int) (LD.A02 * 10.0f);
    public final C2W A00;
    public final C1399Yn A01;
    public final InterfaceC1094Mq A02;

    public N6(C1399Yn c1399Yn, C2W c2w, InterfaceC1094Mq interfaceC1094Mq, EnumC1074Lw enumC1074Lw) {
        this(c1399Yn, c2w, interfaceC1094Mq, null, enumC1074Lw);
    }

    public N6(C1399Yn c1399Yn, C2W c2w, InterfaceC1094Mq interfaceC1094Mq, String str, EnumC1074Lw enumC1074Lw) {
        super(c1399Yn);
        this.A01 = c1399Yn;
        this.A00 = c2w;
        this.A02 = interfaceC1094Mq;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View A01 = A01(str);
            A01.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            AbstractC1066Lo.A0M(view, -10459280);
            addView(A01, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(c2w.A03())) {
            View A00 = A00(enumC1074Lw, c2w.A03());
            int i10 = A05;
            A00.setPadding(0, i10, 0, i10);
            addView(A00, layoutParams);
        }
        NC A032 = A03();
        A032.setPadding(0, A05, 0, 0);
        addView(A032, layoutParams);
    }

    private View A00(EnumC1074Lw enumC1074Lw, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        int i10 = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(AbstractC1075Lx.A01(enumC1074Lw));
        TextView textView = new TextView(getContext());
        AbstractC1066Lo.A0X(textView, true, 14);
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
        imageView.setImageBitmap(AbstractC1075Lx.A01(EnumC1074Lw.BACK_ARROW));
        int i10 = A05;
        imageView.setPadding(0, i10, i10 * 2, i10);
        int i11 = A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        imageView.setOnClickListener(new N4(this));
        TextView titleView = new TextView(getContext());
        titleView.setGravity(17);
        titleView.setText(str);
        AbstractC1066Lo.A0X(titleView, true, 16);
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

    private NC A03() {
        NC nc2 = new NC(this.A01);
        for (C2W c2w : this.A00.A05()) {
            C1096Ms c1096Ms = new C1096Ms(this.A01);
            c1096Ms.setData(c2w.A04(), null);
            c1096Ms.setOnClickListener(new N5(this, c1096Ms, c2w));
            nc2.addView(c1096Ms);
        }
        return nc2;
    }
}
