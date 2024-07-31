package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Po */
/* loaded from: assets/audience_network.dex */
public final class C3784Po extends LinearLayout {
    public static final int A04 = (int) (AbstractC3499LD.A02 * 32.0f);
    public static final int A05 = (int) (AbstractC3499LD.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C3675O3 A02;
    public final C4337Yn A03;

    public C3784Po(C4337Yn c4337Yn) {
        super(c4337Yn);
        this.A03 = c4337Yn;
        A00(c4337Yn);
    }

    private final void A00(C4337Yn c4337Yn) {
        setGravity(16);
        C3675O3 c3675o3 = new C3675O3(c4337Yn);
        this.A02 = c3675o3;
        c3675o3.setFullCircleCorners(true);
        int i10 = A04;
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(i10, i10);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c4337Yn);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c4337Yn);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        AbstractC3536Lo.A0X(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        TextView textView = new TextView(c4337Yn);
        this.A01 = textView;
        AbstractC3536Lo.A0X(textView, false, 14);
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

    public void setPageDetails(C23331a c23331a) {
        AsyncTaskC4034Tq asyncTaskC4034Tq = new AsyncTaskC4034Tq(this.A02, this.A03);
        int i10 = A04;
        asyncTaskC4034Tq.A05(i10, i10);
        asyncTaskC4034Tq.A07(c23331a.A01());
        this.A00.setText(c23331a.A02());
        this.A01.setText(c23331a.A03());
    }
}
