package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.widget.Button;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Nv */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1125Nv extends Button {
    public static final int A0A = (int) (LD.A02 * 16.0f);
    public static final int A0B = (int) (LD.A02 * 4.0f);
    public int A00;
    public int A01;
    public C1P A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final int A07;
    public final Runnable A08;
    public final Runnable A09;

    public AbstractC1125Nv(C1399Yn c1399Yn, C1P c1p) {
        super(c1399Yn);
        this.A03 = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = true;
        this.A05 = false;
        this.A08 = new C1270Tk(this);
        this.A09 = new C1269Tj(this);
        this.A02 = c1p;
        this.A07 = C0988Ih.A04(c1399Yn);
        this.A06 = C0988Ih.A00(c1399Yn);
        AbstractC1066Lo.A0X(this, false, 16);
        setGravity(17);
        A03();
    }

    private void A03() {
        C1P c1p = this.A02;
        if (c1p != null) {
            this.A00 = c1p.A08(this.A05);
            this.A01 = this.A02.A09(this.A05);
        }
        AbstractC1066Lo.A0O(this, this.A00, this.A04 ? A0B : 0);
        setTextColor(this.A01);
    }

    private void A04() {
        if (this.A07 < 0 || this.A03) {
            return;
        }
        this.A03 = true;
        if (C0988Ih.A2B(getContext()) && Build.VERSION.SDK_INT >= 16) {
            postDelayed(this.A08, this.A07);
        }
    }

    public C1P getColorInfo() {
        return this.A02;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A04();
    }

    public void setRoundedCornersEnabled(boolean z10) {
        this.A04 = z10;
        A03();
    }

    public void setText(String str) {
        super.setText((CharSequence) str.toUpperCase(Locale.US));
    }

    public void setUpButtonColors(C1P c1p) {
        this.A02 = c1p;
        A03();
    }

    public void setViewShowsOverMedia(boolean z10) {
        this.A05 = z10;
        A03();
    }
}