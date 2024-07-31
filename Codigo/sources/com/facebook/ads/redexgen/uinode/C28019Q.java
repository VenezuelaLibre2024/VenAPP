package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9Q */
/* loaded from: assets/audience_network.dex */
public final class C28019Q extends AbstractC3974Ss {
    public static byte[] A0L;
    public static String[] A0M = {"Mriq29lS8vjEPztqvg4mnlhqPa1pf4jw", "J0ebGdEZD5oKohgNzUxMA3JiHaSF4bRJ", "IT9tvlYp44pYwsfxgtsksFS", "El43mrOkb3qqMjbYlNbneDDC3riKbt8u", "SsyQgLhJr8BA6K4Jeu0226NIXlotTSUK", "5pKSfcHcmxRzGJ6MCKbxSHPk9j0pnkgf", "vZ9Xs81YGHnjRjGsoTeSsIOHxP", "Y9Sammkz"};
    public AbstractC3693OL A00;
    public C3803Q7 A01;
    public EnumC3818QM A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC25715T A09;
    public final C3935SF A0A;
    public final C3930SA A0B;
    public final C27939I A0C;
    public final AbstractC3790Pu A0D;
    public final AbstractC3788Ps A0E;
    public final AbstractC3721On A0F;
    public final AbstractC3679O7 A0G;
    public final AbstractC3643NX A0H;
    public final AbstractC3636NQ A0I;
    public final C3482Kw A0J;
    public final C3451KP A0K;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0L = new byte[]{-3, 21, 7, 5, 21, -1};
    }

    static {
        A08();
    }

    public C28019Q(C4337Yn c4337Yn, InterfaceC3593Mj interfaceC3593Mj, InterfaceC3369J2 interfaceC3369J2, AbstractC4476b5 abstractC4476b5, C26416c c26416c, InterfaceC3560MC interfaceC3560MC) {
        super(c4337Yn, interfaceC3593Mj, interfaceC3369J2, abstractC4476b5, c26416c, interfaceC3560MC);
        this.A09 = new C3963Sh(this);
        AbstractC3643NX abstractC3643NX = new AbstractC3643NX() { // from class: com.facebook.ads.redexgen.X.9X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3659Nn c3659Nn) {
                C28019Q.this.A07 = true;
            }
        };
        this.A0H = abstractC3643NX;
        AbstractC3679O7 abstractC3679O7 = new AbstractC3679O7() { // from class: com.facebook.ads.redexgen.X.9V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3680O8 c3680o8) {
                C28019Q.this.A08 = true;
                C28019Q.this.A0P();
            }
        };
        this.A0G = abstractC3679O7;
        AbstractC3721On abstractC3721On = new AbstractC3721On() { // from class: com.facebook.ads.redexgen.X.9U
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C278398 c278398) {
            }
        };
        this.A0F = abstractC3721On;
        AbstractC3636NQ abstractC3636NQ = new AbstractC3636NQ() { // from class: com.facebook.ads.redexgen.X.9T
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C277893 c277893) {
                AbstractC3693OL abstractC3693OL;
                C28019Q.this.A0F(c277893);
                C28019Q.this.A0E(c277893);
                abstractC3693OL = C28019Q.this.A00;
                abstractC3693OL.A0C(c277893);
            }
        };
        this.A0I = abstractC3636NQ;
        AbstractC3790Pu abstractC3790Pu = new AbstractC3790Pu() { // from class: com.facebook.ads.redexgen.X.9S
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C27929H c27929h) {
                C3930SA c3930sa;
                C28019Q c28019q = C28019Q.this;
                c3930sa = c28019q.A0B;
                c28019q.A0D(c27929h, c3930sa.getState() != EnumC3869RB.A06, false);
            }
        };
        this.A0D = abstractC3790Pu;
        C28029R c28029r = new C28029R(this);
        this.A0E = c28029r;
        boolean z10 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = false;
        this.A05 = false;
        this.A04 = false;
        C3930SA c3930sa = new C3930SA(super.A03);
        this.A0B = c3930sa;
        c3930sa.setFunnelLoggingHandler(super.A05);
        c3930sa.getEventBus().A03(abstractC3643NX, abstractC3679O7, abstractC3721On, abstractC3636NQ, abstractC3790Pu, c28029r);
        C27939I c27939i = new C27939I(super.A03, super.A04, c3930sa, super.A01.A12());
        this.A0C = c27939i;
        if (C3348Ih.A1X(super.A03)) {
            this.A0A = new C3935SF(super.A03, super.A04, c3930sa, super.A01.A12(), c27939i, null);
        } else {
            this.A0A = null;
        }
        this.A01 = new C3803Q7(super.A03, super.A09, super.A01.A0T(), interfaceC3560MC);
        this.A0J = new C3482Kw(super.A03, super.A05);
        this.A0K = new C3451KP(super.A03);
        A07();
        c3930sa.setVideoURI(super.A02.A0S(super.A01.A0x().A0D().A08()));
        A05();
        int A03 = super.A01.A0x().A0D().A03();
        if (C3348Ih.A1w(super.A03)) {
            this.A05 = A03 == 0;
        } else {
            this.A05 = A03 <= 0;
        }
        if (super.A01.A0x().A0M() && super.A01.A0x().A0D().A02() > 0) {
            z10 = true;
        }
        this.A03 = z10;
        AbstractC3536Lo.A0M(this, super.A01.A0w().A01().A07(true));
        if (C3348Ih.A1q(super.A03)) {
            super.A07.setProgressSpinnerInvisible(true);
        }
    }

    private AbstractC3693OL A00(int i10) {
        return AbstractC3694OM.A00(new C3696OO(super.A03, super.A04, super.A08, super.A01, this.A0B, super.A0A, super.A06).A0E(super.A07.getToolbarHeight()).A0H(super.A07).A0D(i10).A0F(this.A0J).A0I(this.A0K).A0K(), null, true);
    }

    private void A04() {
        this.A0B.postDelayed(new C3962Sg(this), C3348Ih.A0K(super.A03));
    }

    private void A05() {
        this.A0B.postDelayed(new C3961Sf(this), C3348Ih.A0L(super.A03));
    }

    private void A06() {
        this.A05 = true;
        super.A07.A04();
        AbstractC3693OL abstractC3693OL = this.A00;
        if (abstractC3693OL != null) {
            abstractC3693OL.A0y();
        }
    }

    private void A07() {
        this.A0B.A0c(this.A0K);
        this.A0B.A0c(this.A0J);
        if (!TextUtils.isEmpty(super.A01.A0x().A0D().A07())) {
            C26817R c26817r = new C26817R(super.A03);
            this.A0B.A0c(c26817r);
            c26817r.setImage(super.A01.A0x().A0D().A07());
        }
        C26707C c26707c = new C26707C(super.A03, true, super.A05);
        this.A0B.A0c(c26707c);
        this.A0B.A0c(new C3493L7(c26707c, EnumC3831QZ.A03, true));
        this.A0B.A0c(new C26747H(super.A03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C27929H c27929h, boolean z10, boolean z11) {
        if (this.A06) {
            return;
        }
        if (A0M[6].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "N5ZIPH8mvSXK1CHoPTlSEsF";
        strArr[7] = "PVGkj9Ta";
        this.A06 = true;
        if (!this.A05) {
            A06();
        }
        AbstractC3693OL abstractC3693OL = this.A00;
        if (abstractC3693OL != null) {
            abstractC3693OL.A0B(c27929h);
        }
        super.A07.setToolbarActionMessage(A03(0, 0, 25));
        A0H(z10, z11);
        super.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C277893 c277893) {
        if (this.A0B.getState() == EnumC3869RB.A02 && C3348Ih.A1D(super.A03)) {
            this.A0B.postDelayed(new C3964Si(this, c277893), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(C277893 c277893) {
        int A00 = c277893.A00();
        if (this.A03) {
            int A02 = super.A01.A0x().A0D().A02();
            int currentPosMs = A00 / AdError.NETWORK_ERROR_CODE;
            int i10 = A02 - currentPosMs;
            if (!ViewOnClickListenerC4029Tl.A08(super.A01)) {
                if (i10 > 0) {
                    super.A07.setToolbarActionMessage(super.A01.A11().A02().replace(A03(0, 6, 74), String.valueOf(i10)));
                } else {
                    super.A07.setToolbarActionMessage(A03(0, 0, 25));
                }
            }
            if (i10 <= 0) {
                String[] strArr = A0M;
                String str = strArr[2];
                String str2 = strArr[7];
                int totalSecondsForReward = str.length();
                int currentPosMs2 = str2.length();
                if (totalSecondsForReward == currentPosMs2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0M;
                strArr2[0] = "PXM0w4DTcyhv6xVVxlaJPbpxowOdlGPl";
                strArr2[4] = "ZagmJHoPVKqTZKI94Zh80WtjAbW4VeCE";
                A0H(false, false);
            }
        }
        int currentPosMs3 = super.A01.A0x().A0D().A03();
        float f10 = currentPosMs3 * 1000.0f;
        int currentPosMs4 = this.A0B.getDuration();
        float seenPercentage = A00 / Math.min(f10, currentPosMs4);
        super.A07.setProgress(100.0f * seenPercentage);
        if (seenPercentage >= 1.0f && !this.A05) {
            A06();
            AbstractC3559MB abstractC3559MB = super.A07;
            int currentPosMs5 = getCloseButtonStyle();
            abstractC3559MB.setToolbarActionMode(currentPosMs5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(String str) {
        int i10 = 0;
        int i11 = 0;
        C3930SA c3930sa = this.A0B;
        if (c3930sa != null) {
            i10 = c3930sa.getCurrentPositionInMillis();
            i11 = this.A0B.getDuration();
            this.A0B.A0Z(3);
        }
        super.A03.A0E().A2z(str);
        if (C3348Ih.A1E(super.A03)) {
            A0D(new C27929H(i10, i11), false, true);
            return;
        }
        InterfaceC3560MC interfaceC3560MC = super.A08;
        int duration = A0M[3].charAt(0);
        if (duration == 122) {
            throw new RuntimeException();
        }
        A0M[3] = "uhCmlX27t5rzSWT78KYVdoY12DutI5Be";
        interfaceC3560MC.A43(super.A09.A6y());
        super.A08.A43(super.A09.A6u());
    }

    private synchronized void A0H(boolean z10, boolean z11) {
        if (this.A03 && !z10 && !z11) {
            super.A08.A43(super.A09.A5s());
            this.A01.A05();
            this.A03 = false;
            AbstractC3693OL abstractC3693OL = this.A00;
            if (abstractC3693OL != null) {
                abstractC3693OL.A0w();
            }
            return;
        }
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3974Ss
    public final void A0Q() {
        AbstractC3536Lo.A0L(this.A00);
        AbstractC3536Lo.A0L(super.A07);
        this.A0B.setVolume(super.A01.A0x().A0D().A09() ? 0.0f : 1.0f);
        this.A0B.A0b(EnumC3818QM.A02, 20);
        AbstractC3693OL abstractC3693OL = this.A00;
        if (abstractC3693OL != null && this.A03) {
            abstractC3693OL.A0x();
        }
        AbstractC3693OL abstractC3693OL2 = this.A00;
        if (abstractC3693OL2 != null && !this.A05) {
            abstractC3693OL2.A0z();
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3974Ss
    public final void A0S(C25735V c25735v) {
        c25735v.A0N(this.A09);
        int orientation = c25735v.A0J().getResources().getConfiguration().orientation;
        AbstractC3693OL A00 = A00(orientation);
        this.A00 = A00;
        addView(A00, AbstractC3974Ss.A0E);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        AbstractC3536Lo.A0H(this.A00);
        AbstractC3536Lo.A0H(super.A07);
        AbstractC3693OL abstractC3693OL = this.A00;
        setUpFullscreenMode(abstractC3693OL != null && abstractC3693OL.A11());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3974Ss
    public final boolean A0T() {
        AbstractC3693OL abstractC3693OL = this.A00;
        return abstractC3693OL != null && abstractC3693OL.A12(this.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void ACW(boolean z10) {
        if (this.A0B.A0i()) {
            return;
        }
        this.A02 = this.A0B.getVideoStartReason();
        this.A04 = z10;
        this.A0B.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void ACu(boolean z10) {
        EnumC3818QM enumC3818QM;
        if (this.A0B.A0j() || this.A06 || this.A0B.getState() == EnumC3869RB.A06 || (enumC3818QM = this.A02) == null) {
            return;
        }
        if (!this.A04 || z10) {
            C3930SA c3930sa = this.A0B;
            String[] strArr = A0M;
            if (strArr[0].charAt(8) == strArr[4].charAt(8)) {
                throw new RuntimeException();
            }
            A0M[1] = "5vrQw9TAnlgebYwA7tbvLzoGHglPMjBr";
            c3930sa.A0b(enumC3818QM, 19);
        }
    }

    private int getCloseButtonStyle() {
        AbstractC3693OL abstractC3693OL = this.A00;
        if (abstractC3693OL != null) {
            return abstractC3693OL.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3974Ss, com.facebook.ads.redexgen.uinode.InterfaceC3561MD
    public final void onDestroy() {
        super.onDestroy();
        if (C3348Ih.A1W(super.A03)) {
            super.A03.A0A().AGk(this.A0B);
        }
        AbstractC3693OL abstractC3693OL = this.A00;
        if (abstractC3693OL != null) {
            abstractC3693OL.A0v();
        }
        C3930SA c3930sa = this.A0B;
        if (c3930sa != null) {
            if (!this.A06) {
                c3930sa.A0a(EnumC3813QH.A05);
            }
            this.A0B.getEventBus().A04(this.A0H, this.A0G, this.A0F, this.A0I, this.A0D, this.A0E);
            this.A0B.A0V();
        }
        C3935SF c3935sf = this.A0A;
        if (c3935sf != null) {
            c3935sf.A0C();
        }
        this.A0C.A0i();
    }

    public void setServerSideRewardHandler(C3803Q7 c3803q7) {
        this.A01 = c3803q7;
    }
}
