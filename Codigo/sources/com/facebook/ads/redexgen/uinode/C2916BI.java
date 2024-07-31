package com.facebook.ads.redexgen.uinode;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.BI */
/* loaded from: assets/audience_network.dex */
public final class C2916BI extends AbstractC4024Tg {
    public static byte[] A0F;
    public static String[] A0G = {"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};
    public View A00;
    public View A01;
    public C4337Yn A02;
    public C3495L9 A03;
    public AbstractC3559MB A04;
    public C3801Q5 A05;
    public C3437KA A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC3560MC A09;
    public final InterfaceC3672O0 A0A;
    public final C3673O1 A0B;
    public final C3930SA A0C;
    public final C3451KP A0D;
    public final AtomicBoolean A0E;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0F = new byte[]{-53, -60, -39, -56, -30, -42, -41, -60, -43, -41, -52, -47, -54, -30, -60, -47, -52, -48, -60, -41, -52, -46, -47, -42, -30, -45, -49, -60, -36, -56, -57, -51, -48, -44, -58, -32, -45, -58, -40, -62, -45, -59, -32, -44, -60, -45, -58, -58, -49, -32, -44, -55, -48, -40, -49, -53, -75, -57, -45, -71, -62, -72, -45, -73, -75, -58, -72, -45, -57, -68, -61, -53, -62};
    }

    static {
        A08();
    }

    public C2916BI(C3697OP c3697op) {
        super(c3697op, false);
        this.A0E = new AtomicBoolean(false);
        this.A08 = false;
        this.A07 = false;
        this.A02 = c3697op.A05();
        this.A04 = c3697op.A08();
        View view = new View(this.A02);
        this.A01 = view;
        AbstractC3536Lo.A0K(view);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A05();
        InterfaceC3560MC A09 = c3697op.A09();
        this.A09 = A09;
        AbstractC3682OA.A00(c3697op.A05(), this, getAdInfo().A0D().A07());
        C3930SA A01 = A01(c3697op);
        this.A0C = A01;
        getAdDetailsView().bringToFront();
        C3451KP A02 = A02(c3697op);
        this.A0D = A02;
        A14();
        this.A05 = new C3801Q5(this.A02, c3697op.A06(), getAdDataBundle());
        C4022Te c4022Te = new C4022Te(this);
        this.A0A = c4022Te;
        this.A0B = new C3673O1(c3697op, getAdDataBundle(), A01, A02, getAdDetailsView(), A09, c4022Te);
        C3687OF supported = super.A07.A09(getAdDataBundle());
        this.A02.A0F().A00(supported.A01);
        if (supported.A00) {
            getCtaButton().setCreativeAsCtaLoggingHelper(super.A07);
            A01.getVideoImplView().setOnClickListener(new ViewOnClickListenerC3700OS(this));
        } else {
            if (!C3348Ih.A18(getAdContextWrapper())) {
                return;
            }
            AbstractC3657Nl.A00(A01.getVideoImplView(), C3348Ih.A19(getAdContextWrapper()), new ViewOnClickListenerC3701OT(this));
        }
    }

    private C3930SA A01(C3697OP c3697op) {
        C3930SA c3930sa = (C3930SA) c3697op.A02();
        int A13 = A13(c3697op.A08());
        ImageView imageView = (ImageView) c3697op.A03();
        int i10 = AbstractC4024Tg.A0F;
        int i11 = AbstractC4024Tg.A0F;
        int toolbarHeight = AbstractC4024Tg.A0F;
        imageView.setPadding(i10, i11, toolbarHeight, AbstractC4024Tg.A0F);
        int toolbarHeight2 = AbstractC4024Tg.A0G;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(toolbarHeight2, AbstractC4024Tg.A0G);
        int toolbarHeight3 = AbstractC4024Tg.A0E;
        layoutParams.setMargins(0, A13, toolbarHeight3, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        addView(c3930sa, layoutParams2);
        c3930sa.addView(imageView, layoutParams);
        return c3930sa;
    }

    private C3451KP A02(C3697OP c3697op) {
        C3451KP A0A = c3697op.A0A();
        A0A.A06(-1, AbstractC4024Tg.A0B);
        A0A.setPadding(AbstractC4024Tg.A0J, AbstractC4024Tg.A0J, AbstractC4024Tg.A0J, AbstractC4024Tg.A0J);
        RelativeLayout.LayoutParams progressBarLayoutParams = new RelativeLayout.LayoutParams(-1, AbstractC4024Tg.A0I);
        progressBarLayoutParams.addRule(12);
        addView(A0A, progressBarLayoutParams);
        return A0A;
    }

    private void A04() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0C.A0d(getAnimationPlugin());
        }
    }

    private void A05() {
        AbstractC3559MB abstractC3559MB = this.A04;
        if (abstractC3559MB == null) {
            return;
        }
        this.A06 = new C3437KA(abstractC3559MB, 400, -abstractC3559MB.getToolbarHeight(), 0);
    }

    private void A06() {
        new C3377JA(getAdDataBundle().A12(), getAdEventManager()).A04(EnumC3376J9.A0r, null);
        if (!getAdInfo().A0O()) {
            return;
        }
        this.A0E.set(true);
        AbstractC3536Lo.A0T(this);
        AbstractC3536Lo.A0H(this.A0C);
        AbstractC3536Lo.A0a(this.A0C, this.A0D, this.A0B, this.A00);
        AbstractC3536Lo.A0L(this.A04);
        C3801Q5 c3801q5 = this.A05;
        ViewOnClickListenerC4029Tl ctaButton = getCtaButton();
        String[] strArr = A0G;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0G[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        Pair<EnumC3800Q4, View> A03 = c3801q5.A03(ctaButton);
        this.A00 = (View) A03.second;
        switch (C3702OU.A00[((EnumC3800Q4) A03.first).ordinal()]) {
            case 1:
                getAdDetailsView().setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, A13(this.A04), 0, 0);
                layoutParams.addRule(2, getAdDetailsView().getId());
                addView(this.A00, layoutParams);
                break;
            case 2:
                AbstractC3536Lo.A0a(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.setMargins(AbstractC4024Tg.A0H, AbstractC4024Tg.A0H, AbstractC4024Tg.A0H, AbstractC4024Tg.A0H);
                addView(this.A00, layoutParams2);
                break;
        }
        if (getAdInfo().A0G().A00() >= 0) {
            this.A07 = true;
            AbstractC3559MB abstractC3559MB = this.A04;
            if (abstractC3559MB != null) {
                abstractC3559MB.setToolbarActionMode(2);
                this.A04.setProgressImmediate(0.0f);
            }
            C3495L9 c3495l9 = new C3495L9((int) getAdInfo().A0G().A00(), 20.0f, 20L, new Handler(Looper.getMainLooper()), new C4021Td(this));
            this.A03 = c3495l9;
            c3495l9.A07();
        }
    }

    private void A07() {
        C3437KA c3437ka = this.A06;
        if (c3437ka != null) {
            c3437ka.A3Y(true, false);
        }
        if (getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A3Y(true, false);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final void A0B(C27929H c27929h) {
        super.A0B(c27929h);
        A06();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final void A0C(C277893 c277893) {
        super.A0C(c277893);
        int videoLengthMs = c277893.A00();
        int duration = this.A0C.getDuration() - videoLengthMs;
        if (getAnimationPlugin() != null) {
            int videoLengthMs2 = A0G[1].charAt(18);
            if (videoLengthMs2 != 51) {
                throw new RuntimeException();
            }
            A0G[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            if (duration < 3000 && getAnimationPlugin().A0J()) {
                getAnimationPlugin().A0F();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4024Tg, com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final void A0v() {
        super.A0v();
        A04();
        this.A04 = null;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4024Tg, com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final void A10(C23131G c23131g, String str, double d10, Bundle bundle) {
        super.A10(c23131g, str, d10, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A03(0, 31, 118), false)) {
            A07();
        }
        if (bundle.getBoolean(A03(55, 18, 103), false)) {
            A06();
        }
        if (bundle.getBoolean(A03(31, 24, 116), false)) {
            C3673O1 c3673o1 = this.A0B;
            if (A0G[1].charAt(18) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "jjtMTZWEM7Dg1szUnnnmuTjwvMhej";
            strArr[0] = "cexdZia4vusGbXInA5fVVHDcQrSB4";
            c3673o1.A07(this);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final boolean A11() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public final boolean A12(boolean z10) {
        if (z10 && !this.A08) {
            boolean z11 = this.A0E.get();
            String[] strArr = A0G;
            if (strArr[7].length() != strArr[4].length()) {
                String[] strArr2 = A0G;
                strArr2[2] = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw";
                strArr2[0] = "8CoNQoXVMdzgwU1krh95bRLsSKKH4";
                if (!z11) {
                    this.A0B.A07(this);
                    return true;
                }
            }
            throw new RuntimeException();
        }
        boolean A0O = getAdInfo().A0O();
        if (A0G[5].charAt(17) != 'k') {
            A0G[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
            if (A0O && !this.A0E.get()) {
                this.A0C.A0a(EnumC3813QH.A08);
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4024Tg
    public final void A14() {
        super.A14();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A9R(this.A0C);
        }
    }

    public final boolean A15() {
        return getAdInfo().A0O();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3693OL
    public int getCloseButtonStyle() {
        if (this.A07) {
            return 2;
        }
        if (A15() && !this.A0E.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4024Tg, com.facebook.ads.redexgen.uinode.AbstractC3693OL, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
