package com.facebook.ads.redexgen.uinode;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.U5 */
/* loaded from: assets/audience_network.dex */
public final class C4049U5 extends AbstractC3598Mo {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C23872S A04;
    public final C4337Yn A05;

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{-57, -26, -24, -16, -92, -51, -48, -44, -58, -127, -94, -59, -127, -77, -58, -47, -48, -45, -43, -54, -49, -56};
    }

    static {
        A0C();
        A09 = (int) (AbstractC3499LD.A02 * 4.0f);
        A08 = (int) (AbstractC3499LD.A02 * 10.0f);
        A07 = (int) (AbstractC3499LD.A02 * 44.0f);
    }

    public C4049U5(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, String str) {
        super(c4337Yn, interfaceC3369J2, str);
        this.A05 = c4337Yn;
        this.A04 = AbstractC23882T.A00(c4337Yn.A01());
        ImageView imageView = new ImageView(getContext());
        this.A01 = imageView;
        int i10 = A08;
        imageView.setPadding(i10, i10, i10, i10);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setColorFilter(-10459280);
        int i11 = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i11);
        layoutParams.gravity = 16;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A02 = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
        this.A00 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setLayoutParams(layoutParams2);
        horizontalScrollView.addView(linearLayout, layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.A03 = linearLayout2;
        linearLayout2.setOrientation(0);
        AbstractC3536Lo.A0M(linearLayout2, -218103809);
        linearLayout2.setMotionEventSplittingEnabled(false);
        linearLayout2.addView(imageView, layoutParams);
        linearLayout2.addView(horizontalScrollView, layoutParams2);
        addView(linearLayout2, new FrameLayout.LayoutParams(-1, -1));
        linearLayout2.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final void A0L() {
        this.A01.setImageBitmap(AbstractC3545Lx.A01(EnumC3544Lw.CROSS));
        this.A01.setOnClickListener(new ViewOnClickListenerC3607Mx(this));
        this.A01.setContentDescription(A0B(4, 18, 89));
        C3602Ms c3602Ms = new C3602Ms(this.A05);
        c3602Ms.setData(this.A04.A0H(), EnumC3544Lw.HIDE_AD);
        c3602Ms.setOnClickListener(new ViewOnClickListenerC3608My(this, c3602Ms));
        C3602Ms c3602Ms2 = new C3602Ms(this.A05);
        c3602Ms2.setData(this.A04.A0L(), EnumC3544Lw.REPORT_AD);
        c3602Ms2.setOnClickListener(new ViewOnClickListenerC3609Mz(this, c3602Ms2));
        C3602Ms c3602Ms3 = new C3602Ms(this.A05);
        c3602Ms3.setData(this.A04.A0M(), EnumC3544Lw.AD_CHOICES_ICON);
        c3602Ms3.setOnClickListener(new ViewOnClickListenerC3610N0(this, c3602Ms3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A09;
        layoutParams.setMargins(0, i10, i10, i10);
        AbstractC3536Lo.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c3602Ms, layoutParams);
        this.A02.addView(c3602Ms2, layoutParams);
        this.A02.addView(c3602Ms3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final void A0M() {
        AbstractC3536Lo.A0I(this);
        AbstractC3536Lo.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final void A0N(C23912W c23912w, EnumC23892U enumC23892U) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        AbstractC3536Lo.A0X(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        AbstractC3536Lo.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final void A0O(C23912W c23912w, EnumC23892U enumC23892U) {
        AbstractC3536Lo.A0T(this.A03);
        this.A01.setImageBitmap(AbstractC3545Lx.A01(EnumC3544Lw.BACK_ARROW));
        this.A01.setOnClickListener(new ViewOnClickListenerC3611N1(this));
        this.A01.setContentDescription(A0B(0, 4, 125));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A09;
        layoutParams.setMargins(0, i10, i10, i10);
        for (C23912W c23912w2 : c23912w.A05()) {
            C3602Ms c3602Ms = new C3602Ms(this.A05);
            c3602Ms.setData(c23912w2.A04(), null);
            c3602Ms.setOnClickListener(new ViewOnClickListenerC3612N2(this, c3602Ms, c23912w2));
            this.A02.addView(c3602Ms, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final boolean A0P() {
        return true;
    }
}
