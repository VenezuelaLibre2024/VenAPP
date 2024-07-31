package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Ms */
/* loaded from: assets/audience_network.dex */
public final class C3602Ms extends LinearLayout {
    public boolean A00;
    public final ImageView A01;
    public final TextView A02;
    public static final int A04 = (int) (AbstractC3499LD.A02 * 16.0f);
    public static final int A05 = (int) (AbstractC3499LD.A02 * 12.0f);
    public static final int A06 = (int) (AbstractC3499LD.A02 * 12.0f);
    public static final int A03 = (int) (AbstractC3499LD.A02 * 16.0f);

    public C3602Ms(C4337Yn c4337Yn) {
        super(c4337Yn);
        this.A00 = false;
        setOrientation(0);
        int i10 = A04;
        int i11 = A05;
        setPadding(i10, i11, i10, i11);
        ImageView imageView = new ImageView(getContext());
        this.A01 = imageView;
        int i12 = A03;
        LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(i12, i12);
        textViewParams.gravity = 17;
        TextView textView = new TextView(getContext());
        this.A02 = textView;
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        addView(imageView, textViewParams);
        addView(textView, layoutParams);
        A00();
    }

    private void A00() {
        int textColor;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.A00 ? -13272859 : -1315344);
        gradientDrawable.setCornerRadius(50.0f);
        AbstractC3536Lo.A0S(this, gradientDrawable);
        AbstractC3536Lo.A0X(this.A02, false, 14);
        if (this.A00) {
            textColor = -1;
        } else {
            textColor = -10459280;
        }
        this.A02.setTextColor(textColor);
        this.A01.setColorFilter(textColor);
    }

    public final void A01() {
        setSelected(!this.A00);
    }

    public void setData(String str, EnumC3544Lw enumC3544Lw) {
        this.A02.setText(str);
        if (enumC3544Lw != null) {
            this.A01.setImageBitmap(AbstractC3545Lx.A01(enumC3544Lw));
            this.A01.setVisibility(0);
            this.A02.setPadding(A06, 0, 0, 0);
        } else {
            this.A01.setVisibility(8);
            this.A02.setPadding(0, 0, 0, 0);
        }
        A00();
    }

    @Override // android.view.View
    public void setSelected(boolean z10) {
        this.A00 = z10;
        A00();
    }
}
