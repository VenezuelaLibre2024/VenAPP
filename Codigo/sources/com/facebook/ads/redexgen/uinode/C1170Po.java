package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Po, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1170Po extends LinearLayout {
    public static final int A04 = (int) (LD.A02 * 32.0f);
    public static final int A05 = (int) (LD.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public O3 A02;
    public final C1399Yn A03;

    public C1170Po(C1399Yn c1399Yn) {
        super(c1399Yn);
        this.A03 = c1399Yn;
        A00(c1399Yn);
    }

    private final void A00(C1399Yn c1399Yn) {
        setGravity(16);
        O3 o32 = new O3(c1399Yn);
        this.A02 = o32;
        o32.setFullCircleCorners(true);
        int i10 = A04;
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(i10, i10);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c1399Yn);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c1399Yn);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        AbstractC1066Lo.A0X(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        TextView textView = new TextView(c1399Yn);
        this.A01 = textView;
        AbstractC1066Lo.A0X(textView, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i10, int i11) {
        this.A00.setTextColor(i10);
        this.A01.setTextColor(i11);
    }

    public void setPageDetails(C05741a c05741a) {
        AsyncTaskC1276Tq asyncTaskC1276Tq = new AsyncTaskC1276Tq(this.A02, this.A03);
        int i10 = A04;
        asyncTaskC1276Tq.A05(i10, i10);
        asyncTaskC1276Tq.A07(c05741a.A01());
        this.A00.setText(c05741a.A02());
        this.A01.setText(c05741a.A03());
    }
}