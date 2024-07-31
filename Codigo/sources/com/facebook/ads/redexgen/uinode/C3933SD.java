package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.SD */
/* loaded from: assets/audience_network.dex */
public class C3933SD extends AbstractRunnableC3455KT {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C3930SA A02;
    public final /* synthetic */ EnumC3869RB A03;

    public C3933SD(C3930SA c3930sa, EnumC3869RB enumC3869RB, int i10, int i11) {
        this.A02 = c3930sa;
        this.A03 = enumC3869RB;
        this.A00 = i10;
        this.A01 = i11;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C4337Yn c4337Yn;
        Handler handler;
        C27668r c27668r;
        C4337Yn c4337Yn2;
        C27668r c27668r2;
        C3584Ma c3584Ma;
        Handler handler2;
        C4337Yn c4337Yn3;
        C27668r c27668r3;
        Handler handler3;
        C4337Yn c4337Yn4;
        C4337Yn c4337Yn5;
        C27668r c27668r4;
        C3680O8 c3680o8;
        Handler handler4;
        C4337Yn c4337Yn6;
        C4337Yn c4337Yn7;
        Handler handler5;
        C27668r c27668r5;
        C27668r c27668r6;
        C3789Pt c3789Pt;
        C4337Yn c4337Yn8;
        C27668r c27668r7;
        if (this.A03 == EnumC3869RB.A07) {
            this.A02.A0L(EnumC3376J9.A0q);
            c4337Yn8 = this.A02.A0A;
            c4337Yn8.A0E().A38();
            c27668r7 = this.A02.A0B;
            c27668r7.A02(C3930SA.A0C());
            return;
        }
        if (this.A03 == EnumC3869RB.A03) {
            this.A02.A0L(EnumC3376J9.A0l);
            this.A02.A03 = true;
            c27668r6 = this.A02.A0B;
            c3789Pt = C3930SA.A0G;
            c27668r6.A02(c3789Pt);
            this.A02.A0K(this.A00);
            return;
        }
        EnumC3869RB enumC3869RB = this.A03;
        EnumC3869RB enumC3869RB2 = EnumC3869RB.A06;
        String[] strArr = A04;
        if (strArr[0].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
        if (enumC3869RB == enumC3869RB2) {
            this.A02.A0L(EnumC3376J9.A0k);
            c4337Yn7 = this.A02.A0A;
            c4337Yn7.A0E().A30();
            this.A02.A03 = true;
            handler5 = this.A02.A07;
            handler5.removeCallbacksAndMessages(null);
            c27668r5 = this.A02.A0B;
            int i10 = this.A01;
            c27668r5.A02(new C27929H(i10, i10));
            this.A02.A0K(this.A01);
            return;
        }
        if (this.A03 == EnumC3869RB.A0A) {
            c4337Yn4 = this.A02.A0A;
            if (C3348Ih.A1W(c4337Yn4)) {
                c4337Yn6 = this.A02.A0A;
                c4337Yn6.A0A().ADg();
            }
            this.A02.A0L(EnumC3376J9.A0o);
            c4337Yn5 = this.A02.A0A;
            c4337Yn5.A0E().A3F();
            c27668r4 = this.A02.A0B;
            c3680o8 = C3930SA.A0H;
            c27668r4.A02(c3680o8);
            handler4 = this.A02.A07;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0H();
            return;
        }
        if (this.A03 == EnumC3869RB.A05) {
            this.A02.A0L(EnumC3376J9.A0n);
            c4337Yn3 = this.A02.A0A;
            c4337Yn3.A0E().A34();
            c27668r3 = this.A02.A0B;
            c27668r3.A02(new AbstractC3791Pv(this.A00) { // from class: com.facebook.ads.redexgen.X.98
            });
            handler3 = this.A02.A07;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0K(this.A00);
            return;
        }
        if (this.A03 == EnumC3869RB.A04) {
            this.A02.A0L(EnumC3376J9.A0m);
            c4337Yn2 = this.A02.A0A;
            c4337Yn2.A0E().A31();
            c27668r2 = this.A02.A0B;
            c3584Ma = C3930SA.A0K;
            c27668r2.A02(c3584Ma);
            handler2 = this.A02.A07;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC3869RB.A09) {
            this.A02.A0L(EnumC3376J9.A0k);
            c4337Yn = this.A02.A0A;
            c4337Yn.A0E().A3A();
            this.A02.A03 = true;
            handler = this.A02.A07;
            handler.removeCallbacksAndMessages(null);
            c27668r = this.A02.A0B;
            c27668r.A02(new C27929H(this.A00, this.A01));
            this.A02.A0K(this.A00);
        }
    }
}
