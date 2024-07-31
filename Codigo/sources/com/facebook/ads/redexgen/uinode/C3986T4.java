package com.facebook.ads.redexgen.uinode;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.T4 */
/* loaded from: assets/audience_network.dex */
public final class C3986T4 extends AbstractC3760PQ {
    public static byte[] A0W;
    public static String[] A0X = {"zF", "YuhgBsbCJ4GENG72FYuTSQ3UxVCmrs0t", "RSfzcHToFNO8jc1tX2m0S0AZ0vbf9kKl", "p", "lGjhRdALEILVIUsiuWCm6MXJK2R8L6Co", "wXQvDYR5huLQKlTsBS5mG0rN7ygrQvR2", "AYgBJnzxyMi9rrwHO3oB8yOhTSWVLxNu", "3k2Jytm7iEKA6X2jmmGhgFSNDYaf4AHR"};
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public C23221P A00;
    public C3495L9 A01;
    public EnumC3818QM A02;
    public C3444KI A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final C4337Yn A0C;
    public final AbstractC3660No A0D;
    public final ViewOnClickListenerC4029Tl A0E;
    public final InterfaceC3773Pd A0F;
    public final C3801Q5 A0G;
    public final C3935SF A0H;
    public final C3930SA A0I;
    public final C27939I A0J;
    public final AbstractC3790Pu A0K;
    public final AbstractC3788Ps A0L;
    public final AbstractC3721On A0M;
    public final AbstractC3679O7 A0N;
    public final AbstractC3643NX A0O;
    public final AbstractC3636NQ A0P;
    public final C3519LX A0Q;
    public final C3482Kw A0R;
    public final C3451KP A0S;
    public final C3437KA A0T;
    public final boolean A0U;
    public final boolean A0V;

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0W, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0W = new byte[]{-55, -43, -45, -108, -52, -57, -55, -53, -56, -43, -43, -47, -108, -57, -54, -39, -108, -49, -44, -38, -53, -40, -39, -38, -49, -38, -49, -57, -46, -108, -55, -46, -49, -55, -47, -53, -54, 27, 14, 32, 10, 27, 13, 14, 13, 8, 31, 18, 13, 14, 24};
    }

    static {
        A0D();
        A0b = (int) (AbstractC3499LD.A02 * 48.0f);
        int A01 = AbstractC24102p.A01(-1, 77);
        A0Z = A01;
        A0g = (int) (AbstractC3499LD.A02 * 26.0f);
        A0h = (int) (AbstractC3499LD.A02 * 12.0f);
        A0d = (int) (AbstractC3499LD.A02 * 12.0f);
        A0e = (int) (AbstractC3499LD.A02 * 44.0f);
        A0c = (int) (AbstractC3499LD.A02 * 8.0f);
        A0f = (int) (AbstractC3499LD.A02 * 16.0f);
        A0a = AbstractC24102p.A01(A01, 90);
        A0Y = (int) (AbstractC3499LD.A02 * 4.0f);
    }

    public C3986T4(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, AbstractC4476b5 abstractC4476b5, C26416c c26416c, InterfaceC3593Mj interfaceC3593Mj, int i10, InterfaceC3560MC interfaceC3560MC, C3377JA c3377ja, int i11, int i12, int i13, boolean z10, int i14, boolean z11, boolean z12, boolean z13, InterfaceC3773Pd interfaceC3773Pd) {
        super(c4337Yn, interfaceC3593Mj, interfaceC3369J2, abstractC4476b5, i10, z12, z13, interfaceC3560MC);
        C23221P A00;
        this.A04 = false;
        this.A05 = false;
        this.A07 = false;
        C2867AV c2867av = new C2867AV(this);
        this.A0O = c2867av;
        C2860AO c2860ao = new C2860AO(this);
        this.A0N = c2860ao;
        C2845A9 c2845a9 = new C2845A9(this);
        this.A0M = c2845a9;
        C2840A4 c2840a4 = new C2840A4(this);
        this.A0P = c2840a4;
        C2839A3 c2839a3 = new C2839A3(this);
        this.A0K = c2839a3;
        C2838A2 c2838a2 = new C2838A2(this);
        this.A0L = c2838a2;
        this.A0C = c4337Yn;
        this.A0R = new C3482Kw(c4337Yn, c3377ja);
        this.A0S = new C3451KP(c4337Yn);
        this.A0A = i14;
        this.A0V = z11;
        this.A09 = i11;
        this.A0B = i12;
        this.A0F = interfaceC3773Pd;
        this.A08 = i13;
        this.A0U = z10;
        this.A0G = new C3801Q5(c4337Yn, interfaceC3369J2, super.A05);
        if (i12 == 1) {
            A00 = super.A05.A0w().A01();
        } else {
            A00 = super.A05.A0w().A00();
        }
        this.A00 = A00;
        C3930SA c3930sa = new C3930SA(c4337Yn);
        this.A0I = c3930sa;
        c3930sa.getEventBus().A03(c2867av, c2860ao, c2845a9, c2840a4, c2839a3, c2838a2);
        C27939I c27939i = new C27939I(c4337Yn, interfaceC3369J2, c3930sa, abstractC4476b5.A12());
        this.A0J = c27939i;
        A0C();
        c3930sa.setVideoURI(c26416c.A0S(super.A05.A0x().A0D().A08()));
        A0B();
        C4025Th A05 = A05();
        this.A0D = A05;
        C3437KA c3437ka = new C3437KA(A05, 400, 100, 0);
        this.A0T = c3437ka;
        c3437ka.A3Y(true, false);
        this.A0Q = new C3519LX(true);
        A0E();
        ViewOnClickListenerC4029Tl cTAButton = A05.getCTAButton();
        this.A0E = cTAButton;
        AbstractC3536Lo.A0G(AdError.NO_FILL_ERROR_CODE, cTAButton);
        A0A();
        A09();
        A05.bringToFront();
        if (C3348Ih.A1W(c4337Yn)) {
            c4337Yn.A0A().AGv(c3930sa, super.A05.A12(), true);
        }
        if (C3348Ih.A1X(c4337Yn)) {
            this.A0H = new C3935SF(c4337Yn, interfaceC3369J2, c3930sa, super.A05.A12(), c27939i, null);
        } else {
            this.A0H = null;
        }
    }

    private C4025Th A05() {
        String A08;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (super.A05.A0P().equals(A08(37, 14, 125))) {
            A08 = EnumC3821QP.A04.A02();
        } else {
            A08 = A08(0, 37, 58);
        }
        C4025Th c4025Th = new C4025Th(this.A0C, A0b, super.A05.A0x().A0E().A00() == EnumC23181L.A05, getColors(), super.A05.A0x().A0F().A06(), A08, super.A07, super.A09, super.A0B, super.A08, super.A05.A0y());
        AbstractC3536Lo.A0G(1008, c4025Th);
        c4025Th.A0A(this.A0B);
        addView(c4025Th, layoutParams);
        c4025Th.setInfo(super.A05.A0x().A0E(), super.A05.A0x().A0F(), super.A05.A12(), super.A05.A10().A01(), null);
        return c4025Th;
    }

    private void A09() {
        this.A0S.A06(-1, A0Z);
        C3451KP c3451kp = this.A0S;
        int i10 = A0h;
        c3451kp.setPadding(i10, i10, i10, i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0g);
        layoutParams.addRule(12);
        addView(this.A0S, layoutParams);
    }

    private void A0A() {
        C3482Kw c3482Kw = this.A0R;
        int i10 = A0d;
        c3482Kw.setPadding(i10, i10, i10, i10);
        int i11 = A0e;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
        layoutParams.setMargins(0, AbstractC3559MB.A00, A0c, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        ViewGroup.LayoutParams videoViewParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A0I, videoViewParams);
        addView(this.A0R, layoutParams);
    }

    private void A0B() {
        postDelayed(new C3989T7(this), C3348Ih.A0L(this.A0C));
    }

    private void A0C() {
        this.A0I.A0c(this.A0S);
        this.A0I.A0c(this.A0R);
        if (!TextUtils.isEmpty(super.A05.A0x().A0D().A07())) {
            C26817R c26817r = new C26817R(this.A0C);
            this.A0I.A0c(c26817r);
            c26817r.setImage(super.A05.A0x().A0D().A07());
        }
        this.A0I.A0c(new C26747H(this.A0C));
    }

    private final void A0E() {
        View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null) {
            C3444KI c3444ki = this.A03;
            if (c3444ki != null) {
                this.A0Q.A0I(c3444ki);
            }
            C23221P A01 = super.A05.A0w().A01();
            this.A0Q.A0I(new C3439KC(this.A0D.getCTAButton(), 300, -1, A01.A09(true)));
            int i10 = A0Z;
            int i11 = A0a;
            int i12 = A0Y;
            Drawable A08 = AbstractC3536Lo.A08(i10, i11, i12);
            Drawable endDrawable = AbstractC3536Lo.A05(A01.A08(true), i12);
            this.A0Q.A0I(new C3448KM(this.A0D.getCTAButton(), 300, A08, endDrawable));
            this.A0Q.A0I(new C3441KF(expandableLayout, 150, false));
            this.A0Q.A9R(this.A0I);
            this.A0Q.A0H(2300);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(C277893 c277893) {
        if (this.A0I.getState() == EnumC3869RB.A02 && C3348Ih.A1D(this.A0C)) {
            postDelayed(new C3988T6(this, c277893), 5000L);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A0z() {
        C3495L9 c3495l9 = this.A01;
        if (c3495l9 != null) {
            c3495l9.A06();
        }
        if (C3348Ih.A1W(this.A0C)) {
            this.A0C.A0A().AGk(this.A0I);
        }
        C3935SF c3935sf = this.A0H;
        if (c3935sf != null) {
            c3935sf.A0C();
        }
        C3930SA c3930sa = this.A0I;
        if (c3930sa != null) {
            c3930sa.getEventBus().A04(this.A0O, this.A0N, this.A0M, this.A0P, this.A0K, this.A0L);
            AbstractC3536Lo.A0H(this.A0I);
            this.A0I.A0V();
        }
        this.A0J.A0i();
        View[] viewArr = new View[3];
        viewArr[0] = this.A0I;
        C3451KP c3451kp = this.A0S;
        String[] strArr = A0X;
        if (strArr[0].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A0X[2] = "4e1dr9g4n9kT22ZIdoKy0n8REVoGbgbF";
        viewArr[1] = c3451kp;
        viewArr[2] = this.A0R;
        AbstractC3536Lo.A0a(viewArr);
        super.A0B.A0V();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A10() {
        this.A0C.A0E().A4F();
        this.A04 = true;
        AbstractC3536Lo.A0T(this);
        AbstractC3536Lo.A0H(this.A0I);
        AbstractC3536Lo.A0a(this.A0I, this.A0S, this.A0R);
        Pair<EnumC3800Q4, View> A03 = this.A0G.A03(this.A0E);
        View view = (View) A03.second;
        AbstractC3536Lo.A0G(1101, view);
        switch (C3761PR.A00[((EnumC3800Q4) A03.first).ordinal()]) {
            case 1:
                this.A0D.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, AbstractC3559MB.A00, 0, 0);
                layoutParams.addRule(2, this.A0D.getId());
                addView(view, layoutParams);
                break;
            case 2:
                AbstractC3536Lo.A0a(this.A0D);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                int i10 = A0f;
                layoutParams2.setMargins(i10, i10, i10, i10);
                addView(view, layoutParams2);
                break;
        }
        if (this.A08 == 0 && this.A0U) {
            if (this.A0V) {
                this.A0F.AGq();
            }
            C3495L9 c3495l9 = new C3495L9(this.A0A, 100.0f, 100L, new Handler(Looper.getMainLooper()), new C3987T5(this));
            this.A01 = c3495l9;
            c3495l9.A07();
            return;
        }
        this.A05 = true;
        this.A0F.AD7(true);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A11() {
        this.A0I.setVolume(super.A05.A0x().A0D().A09() ? 0.0f : 1.0f);
        this.A0I.A0b(EnumC3818QM.A02, 20);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A12(boolean z10) {
        C3495L9 c3495l9 = this.A01;
        if (c3495l9 != null) {
            c3495l9.A06();
        }
        if (this.A0I.A0i()) {
            return;
        }
        this.A02 = this.A0I.getVideoStartReason();
        this.A06 = z10;
        this.A0I.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final void A13(boolean z10) {
        EnumC3818QM enumC3818QM;
        C3495L9 c3495l9 = this.A01;
        if (c3495l9 != null && !c3495l9.A05()) {
            C3495L9 c3495l92 = this.A01;
            if (A0X[5].charAt(17) != 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A0X;
            strArr[7] = "pObqmm4LdTsqTcUgL7kozPbufRCkwYZC";
            strArr[6] = "5szeP9lNqMFVM0rzjOQcuK8NUDwg7u3G";
            c3495l92.A07();
        }
        if (this.A04 || this.A0I.getState() == EnumC3869RB.A06 || (enumC3818QM = this.A02) == null) {
            return;
        }
        if (!this.A06 || z10) {
            this.A0I.A0b(enumC3818QM, 19);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final boolean A14() {
        if (this.A08 != 2 && super.A05.A0x().A0O() && !this.A04) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public final boolean A15() {
        return this.A04;
    }

    public C23221P getColors() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public C3772Pc getFullScreenAdStyle() {
        return new C3772Pc(true, C3772Pc.A06, super.A05.A0w().A01(), ViewOnClickListenerC4029Tl.A08(super.A05), super.A05.A0w().A01().A07(true), super.A05.A0x().A0D().A07());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ
    public C3528Lg getTouchDataRecorder() {
        return super.A08;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3760PQ, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C23221P A00;
        super.onConfigurationChanged(configuration);
        if (!this.A04) {
            if (configuration.orientation == 1) {
                A00 = super.A05.A0w().A01();
            } else {
                C23091C A0w = super.A05.A0w();
                if (A0X[4].charAt(4) != 'R') {
                    throw new RuntimeException();
                }
                A0X[1] = "uYIsd2DhsQ91Wp0xmXJ9348eeMLtSRMf";
                A00 = A0w.A00();
            }
            this.A00 = A00;
            this.A0E.setViewShowsOverMedia(true);
            this.A0E.setUpButtonColors(this.A00);
            this.A0D.A0A(configuration.orientation);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View expandableLayout = this.A0D.getExpandableLayout();
        if (expandableLayout != null && z10 && this.A03 == null) {
            C3444KI c3444ki = new C3444KI(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A03 = c3444ki;
            this.A0Q.A0I(c3444ki);
            this.A0Q.A0G();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            A13(false);
        } else {
            A12(false);
        }
    }
}
