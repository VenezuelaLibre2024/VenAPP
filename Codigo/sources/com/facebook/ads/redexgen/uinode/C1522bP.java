package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1522bP extends RD {
    public final /* synthetic */ C1520bN A00;

    public C1522bP(C1520bN c1520bN) {
        this.A00 = c1520bN;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        C1058Lg c1058Lg;
        C1058Lg c1058Lg2;
        EQ eq;
        C1508bB c1508bB;
        EQ eq2;
        FV fv;
        RE re2;
        C1058Lg c1058Lg3;
        FV fv2;
        J2 j22;
        FV fv3;
        FV fv4;
        FV fv5;
        C1U A0y;
        EQ eq3;
        RE re3;
        c1058Lg = this.A00.A06;
        if (!c1058Lg.A07()) {
            c1058Lg2 = this.A00.A06;
            c1058Lg2.A05();
            eq = this.A00.A04;
            InterfaceC1539bg A0E = eq.A0E();
            c1508bB = this.A00.A02;
            A0E.A3k(c1508bB != null);
            eq2 = this.A00.A04;
            eq2.A0E().A2k();
            fv = this.A00.A03;
            C2O.A00(fv.A0N());
            C1112Ni c1112Ni = new C1112Ni();
            re2 = this.A00.A0B;
            C1112Ni A03 = c1112Ni.A03(re2);
            c1058Lg3 = this.A00.A06;
            C1112Ni A02 = A03.A02(c1058Lg3);
            fv2 = this.A00.A03;
            Map<String, String> A05 = A02.A04(fv2.A0O()).A05();
            j22 = this.A00.A05;
            fv3 = this.A00.A03;
            j22.A9g(fv3.A12(), A05);
            fv4 = this.A00.A03;
            if (fv4 == null) {
                A0y = null;
            } else {
                fv5 = this.A00.A03;
                A0y = fv5.A0y();
            }
            eq3 = this.A00.A04;
            C1U.A07(A0y, eq3);
            re3 = this.A00.A0B;
            re3.A0V();
        }
    }
}
