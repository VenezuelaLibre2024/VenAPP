package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class SD extends KT {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SA A02;
    public final /* synthetic */ RB A03;

    public SD(SA sa2, RB rb2, int i10, int i11) {
        this.A02 = sa2;
        this.A03 = rb2;
        this.A00 = i10;
        this.A01 = i11;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C1399Yn c1399Yn;
        Handler handler;
        C07608r c07608r;
        C1399Yn c1399Yn2;
        C07608r c07608r2;
        C1078Ma c1078Ma;
        Handler handler2;
        C1399Yn c1399Yn3;
        C07608r c07608r3;
        Handler handler3;
        C1399Yn c1399Yn4;
        C1399Yn c1399Yn5;
        C07608r c07608r4;
        O8 o82;
        Handler handler4;
        C1399Yn c1399Yn6;
        C1399Yn c1399Yn7;
        Handler handler5;
        C07608r c07608r5;
        C07608r c07608r6;
        C1175Pt c1175Pt;
        C1399Yn c1399Yn8;
        C07608r c07608r7;
        if (this.A03 == RB.A07) {
            this.A02.A0L(J9.A0q);
            c1399Yn8 = this.A02.A0A;
            c1399Yn8.A0E().A38();
            c07608r7 = this.A02.A0B;
            c07608r7.A02(SA.A0C());
            return;
        }
        if (this.A03 == RB.A03) {
            this.A02.A0L(J9.A0l);
            this.A02.A03 = true;
            c07608r6 = this.A02.A0B;
            c1175Pt = SA.A0G;
            c07608r6.A02(c1175Pt);
            this.A02.A0K(this.A00);
            return;
        }
        RB rb2 = this.A03;
        RB rb3 = RB.A06;
        String[] strArr = A04;
        if (strArr[0].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
        if (rb2 == rb3) {
            this.A02.A0L(J9.A0k);
            c1399Yn7 = this.A02.A0A;
            c1399Yn7.A0E().A30();
            this.A02.A03 = true;
            handler5 = this.A02.A07;
            handler5.removeCallbacksAndMessages(null);
            c07608r5 = this.A02.A0B;
            int i10 = this.A01;
            c07608r5.A02(new C9H(i10, i10));
            this.A02.A0K(this.A01);
            return;
        }
        if (this.A03 == RB.A0A) {
            c1399Yn4 = this.A02.A0A;
            if (C0988Ih.A1W(c1399Yn4)) {
                c1399Yn6 = this.A02.A0A;
                c1399Yn6.A0A().ADg();
            }
            this.A02.A0L(J9.A0o);
            c1399Yn5 = this.A02.A0A;
            c1399Yn5.A0E().A3F();
            c07608r4 = this.A02.A0B;
            o82 = SA.A0H;
            c07608r4.A02(o82);
            handler4 = this.A02.A07;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0H();
            return;
        }
        if (this.A03 == RB.A05) {
            this.A02.A0L(J9.A0n);
            c1399Yn3 = this.A02.A0A;
            c1399Yn3.A0E().A34();
            c07608r3 = this.A02.A0B;
            final int i11 = this.A00;
            c07608r3.A02(new AbstractC1177Pv(i11) { // from class: com.facebook.ads.redexgen.X.98
            });
            handler3 = this.A02.A07;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0K(this.A00);
            return;
        }
        if (this.A03 == RB.A04) {
            this.A02.A0L(J9.A0m);
            c1399Yn2 = this.A02.A0A;
            c1399Yn2.A0E().A31();
            c07608r2 = this.A02.A0B;
            c1078Ma = SA.A0K;
            c07608r2.A02(c1078Ma);
            handler2 = this.A02.A07;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == RB.A09) {
            this.A02.A0L(J9.A0k);
            c1399Yn = this.A02.A0A;
            c1399Yn.A0E().A3A();
            this.A02.A03 = true;
            handler = this.A02.A07;
            handler.removeCallbacksAndMessages(null);
            c07608r = this.A02.A0B;
            c07608r.A02(new C9H(this.A00, this.A01));
            this.A02.A0K(this.A00);
        }
    }
}
