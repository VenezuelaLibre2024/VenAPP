package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.M9 */
/* loaded from: assets/audience_network.dex */
public final class C3557M9 extends LinearLayout {
    public static byte[] A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final ImageView A00;
    public final ImageView A01;
    public final C23872S A02;
    public final C4337Yn A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{118, 83};
    }

    static {
        A03();
        A08 = (int) (AbstractC3499LD.A02 * 50.0f);
        A05 = (int) (AbstractC3499LD.A02 * 10.0f);
        A06 = (int) (AbstractC3499LD.A02 * 20.0f);
        A09 = (int) (AbstractC3499LD.A02 * 4.0f);
        A07 = (int) (AbstractC3499LD.A02 * 12.0f);
    }

    public C3557M9(C4337Yn c4337Yn, int i10) {
        super(c4337Yn);
        this.A03 = c4337Yn;
        this.A02 = AbstractC23882T.A00(c4337Yn.A01());
        setOrientation(0);
        this.A00 = new ImageView(c4337Yn);
        this.A01 = new ImageView(c4337Yn);
        A04(i10);
    }

    private void A04(int i10) {
        EnumC3544Lw enumC3544Lw;
        A05(this.A00, EnumC3544Lw.AD_CHOICES_ICON);
        if (i10 == 2) {
            int i11 = A05;
            setPadding(i11, i11 / 3, i11, i11 / 3);
            TextView textView = new TextView(this.A03);
            textView.setText(A02(0, 2, 108));
            textView.setTextColor(-1);
            textView.setPadding(0, i11 / 2, i11 / 2, i11 / 2);
            AbstractC3536Lo.A0X(textView, true, 13);
            LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(-2, -2);
            textViewParams.gravity = 16;
            addView(textView, textViewParams);
            int i12 = A07;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i12, i12);
            layoutParams.gravity = 16;
            addView(this.A00, layoutParams);
            return;
        }
        int i13 = A05;
        setPadding(i13, i13, i13, i13);
        if (i10 == 1) {
            enumC3544Lw = EnumC3544Lw.AN_INFO_ICON;
        } else {
            enumC3544Lw = EnumC3544Lw.DEFAULT_INFO_ICON;
        }
        A05(this.A01, enumC3544Lw);
        int i14 = A06;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i14, i14);
        layoutParams2.gravity = 17;
        addView(this.A01, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i14, i14);
        layoutParams3.setMargins(A09, 0, 0, 0);
        layoutParams3.gravity = 17;
        addView(this.A00, layoutParams3);
    }

    public static void A05(ImageView imageView, EnumC3544Lw enumC3544Lw) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(AbstractC3545Lx.A01(enumC3544Lw));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(C23331a c23331a, String str, C3377JA c3377ja, InterfaceC3560MC interfaceC3560MC) {
        setOnClickListener(new ViewOnClickListenerC3556M8(this, c3377ja, interfaceC3560MC, str, c23331a));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A08);
        gradientDrawable.setColor(i10);
        AbstractC3536Lo.A0S(this, gradientDrawable);
    }

    public void setIconColors(int i10) {
        this.A00.setColorFilter(i10);
        this.A01.setColorFilter(i10);
    }
}
