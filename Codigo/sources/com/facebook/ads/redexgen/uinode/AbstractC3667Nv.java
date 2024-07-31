package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.widget.Button;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Nv */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3667Nv extends Button {
    public static final int A0A = (int) (AbstractC3499LD.A02 * 16.0f);
    public static final int A0B = (int) (AbstractC3499LD.A02 * 4.0f);
    public int A00;
    public int A01;
    public C23221P A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final int A07;
    public final Runnable A08;
    public final Runnable A09;

    public AbstractC3667Nv(C4337Yn c4337Yn, C23221P c23221p) {
        super(c4337Yn);
        this.A03 = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = true;
        this.A05 = false;
        this.A08 = new C4028Tk(this);
        this.A09 = new C4027Tj(this);
        this.A02 = c23221p;
        this.A07 = C3348Ih.A04(c4337Yn);
        this.A06 = C3348Ih.A00(c4337Yn);
        AbstractC3536Lo.A0X(this, false, 16);
        setGravity(17);
        A03();
    }

    private void A03() {
        C23221P c23221p = this.A02;
        if (c23221p != null) {
            this.A00 = c23221p.A08(this.A05);
            this.A01 = this.A02.A09(this.A05);
        }
        AbstractC3536Lo.A0O(this, this.A00, this.A04 ? A0B : 0);
        setTextColor(this.A01);
    }

    private void A04() {
        if (this.A07 < 0 || this.A03) {
            return;
        }
        this.A03 = true;
        if (C3348Ih.A2B(getContext()) && Build.VERSION.SDK_INT >= 16) {
            postDelayed(this.A08, this.A07);
        }
    }

    public C23221P getColorInfo() {
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

    public void setUpButtonColors(C23221P c23221p) {
        this.A02 = c23221p;
        A03();
    }

    public void setViewShowsOverMedia(boolean z10) {
        this.A05 = z10;
        A03();
    }
}
