package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bP */
/* loaded from: assets/audience_network.dex */
public class C4496bP extends AbstractC3871RD {
    public final /* synthetic */ C4494bN A00;

    public C4496bP(C4494bN c4494bN) {
        this.A00 = c4494bN;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3871RD
    public final void A03() {
        C3528Lg c3528Lg;
        C3528Lg c3528Lg2;
        C3089EQ c3089eq;
        C4482bB c4482bB;
        C3089EQ c3089eq2;
        C3154FV c3154fv;
        C3872RE c3872re;
        C3528Lg c3528Lg3;
        C3154FV c3154fv2;
        InterfaceC3369J2 interfaceC3369J2;
        C3154FV c3154fv3;
        C3154FV c3154fv4;
        C3154FV c3154fv5;
        C23271U A0y;
        C3089EQ c3089eq3;
        C3872RE c3872re2;
        c3528Lg = this.A00.A06;
        if (!c3528Lg.A07()) {
            c3528Lg2 = this.A00.A06;
            c3528Lg2.A05();
            c3089eq = this.A00.A04;
            InterfaceC4513bg A0E = c3089eq.A0E();
            c4482bB = this.A00.A02;
            A0E.A3k(c4482bB != null);
            c3089eq2 = this.A00.A04;
            c3089eq2.A0E().A2k();
            c3154fv = this.A00.A03;
            AbstractC23832O.A00(c3154fv.A0N());
            C3654Ni c3654Ni = new C3654Ni();
            c3872re = this.A00.A0B;
            C3654Ni A03 = c3654Ni.A03(c3872re);
            c3528Lg3 = this.A00.A06;
            C3654Ni A02 = A03.A02(c3528Lg3);
            c3154fv2 = this.A00.A03;
            Map<String, String> A05 = A02.A04(c3154fv2.A0O()).A05();
            interfaceC3369J2 = this.A00.A05;
            c3154fv3 = this.A00.A03;
            interfaceC3369J2.A9g(c3154fv3.A12(), A05);
            c3154fv4 = this.A00.A03;
            if (c3154fv4 == null) {
                A0y = null;
            } else {
                c3154fv5 = this.A00.A03;
                A0y = c3154fv5.A0y();
            }
            c3089eq3 = this.A00.A04;
            C23271U.A07(A0y, c3089eq3);
            c3872re2 = this.A00.A0B;
            c3872re2.A0V();
        }
    }
}
