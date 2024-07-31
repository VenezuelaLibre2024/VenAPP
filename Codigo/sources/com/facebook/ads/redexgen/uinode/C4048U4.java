package com.facebook.ads.redexgen.uinode;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.U4 */
/* loaded from: assets/audience_network.dex */
public final class C4048U4 extends AbstractC3598Mo {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C23872S A03;
    public final C4337Yn A04;

    public static String A0B(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{53, 22, 20, 28, 105, 70, 69, 89, 79, 10, 107, 78, 10, 120, 79, 90, 69, 88, 94, 67, 68, 77};
    }

    static {
        A0C();
        A08 = (int) (AbstractC3499LD.A02 * 8.0f);
        A07 = (int) (AbstractC3499LD.A02 * 10.0f);
        A06 = (int) (AbstractC3499LD.A02 * 44.0f);
    }

    public C4048U4(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, String str) {
        super(c4337Yn, interfaceC3369J2, str);
        this.A04 = c4337Yn;
        this.A03 = AbstractC23882T.A00(c4337Yn.A01());
        ImageView imageView = new ImageView(getContext());
        this.A00 = imageView;
        int i10 = A07;
        imageView.setPadding(i10, i10, i10, i10);
        imageView.setColorFilter(-10459280);
        int i11 = A06;
        LinearLayout.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(i11, i11);
        closeButtonParams.gravity = 3;
        imageView.setLayoutParams(closeButtonParams);
        ScrollView scrollView = new ScrollView(getContext());
        this.A02 = scrollView;
        scrollView.setFillViewport(true);
        AbstractC3536Lo.A0M(scrollView, -218103809);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A01 = linearLayout;
        linearLayout.setOrientation(1);
        int i12 = A08;
        linearLayout.setPadding(i12, i12, i12, i12);
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final void A0L() {
        this.A00.setImageBitmap(AbstractC3545Lx.A01(EnumC3544Lw.CROSS));
        this.A00.setOnClickListener(new ViewOnClickListenerC3617N7(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        C3602Ms c3602Ms = new C3602Ms(this.A04);
        c3602Ms.setData(this.A03.A0H(), EnumC3544Lw.HIDE_AD);
        c3602Ms.setOnClickListener(new ViewOnClickListenerC3618N8(this, c3602Ms));
        C3602Ms c3602Ms2 = new C3602Ms(this.A04);
        c3602Ms2.setData(this.A03.A0L(), EnumC3544Lw.REPORT_AD);
        c3602Ms2.setOnClickListener(new ViewOnClickListenerC3619N9(this, c3602Ms2));
        C3602Ms c3602Ms3 = new C3602Ms(this.A04);
        c3602Ms3.setData(this.A03.A0M(), EnumC3544Lw.AD_CHOICES_ICON);
        c3602Ms3.setOnClickListener(new ViewOnClickListenerC3620NA(this, c3602Ms3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        int i10 = A08;
        menuParams.setMargins(i10, i10, i10, i10);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        AbstractC3536Lo.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(c3602Ms, menuParams);
        linearLayout.addView(c3602Ms2, menuParams);
        linearLayout.addView(c3602Ms3, menuParams);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final void A0M() {
        AbstractC3536Lo.A0I(this);
        AbstractC3536Lo.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final void A0N(C23912W c23912w, EnumC23892U enumC23892U) {
        String A0H;
        EnumC3544Lw enumC3544Lw;
        int i10;
        this.A00.setOnClickListener(null);
        if (enumC23892U == EnumC23892U.A05) {
            A0H = this.A03.A0F();
            enumC3544Lw = EnumC3544Lw.REPORT_AD;
            i10 = -552389;
        } else {
            A0H = this.A03.A0H();
            enumC3544Lw = EnumC3544Lw.HIDE_AD;
            i10 = -13272859;
        }
        C3596Mm A0I = new C3596Mm(this.A04, this.A0B).A0I(A0H);
        String title = this.A03.A0D();
        C3596Mm A0H2 = A0I.A0H(title);
        String title2 = c23912w.A04();
        C3597Mn adHiddenView = A0H2.A0F(title2).A0K(false).A0E(enumC3544Lw).A0D(i10).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        AbstractC3536Lo.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final void A0O(C23912W c23912w, EnumC23892U enumC23892U) {
        boolean isReportFlow = enumC23892U == EnumC23892U.A05;
        C3616N6 c3616n6 = new C3616N6(this.A04, c23912w, this.A0B, isReportFlow ? EnumC3544Lw.REPORT_AD : EnumC3544Lw.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(AbstractC3545Lx.A01(EnumC3544Lw.BACK_ARROW));
        this.A00.setOnClickListener(new ViewOnClickListenerC3621NB(this));
        this.A00.setContentDescription(A0B(0, 4, 64));
        AbstractC3536Lo.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c3616n6, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3598Mo
    public final boolean A0P() {
        return true;
    }
}
