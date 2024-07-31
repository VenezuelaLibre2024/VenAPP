package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.TP */
/* loaded from: assets/audience_network.dex */
public class C4007TP extends AbstractC3871RD {
    public final /* synthetic */ C2901B3 A00;

    public C4007TP(C2901B3 c2901b3) {
        this.A00 = c2901b3;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3871RD
    public final void A03() {
        C3528Lg c3528Lg;
        C3528Lg c3528Lg2;
        C3872RE c3872re;
        C3528Lg c3528Lg3;
        InterfaceC3369J2 interfaceC3369J2;
        AbstractC4476b5 abstractC4476b5;
        AbstractC4476b5 abstractC4476b52;
        C4337Yn c4337Yn;
        C4337Yn c4337Yn2;
        AbstractC4476b5 abstractC4476b53;
        InterfaceC3560MC interfaceC3560MC;
        InterfaceC3560MC interfaceC3560MC2;
        InterfaceC3593Mj interfaceC3593Mj;
        c3528Lg = this.A00.A0B;
        if (!c3528Lg.A07()) {
            c3528Lg2 = this.A00.A0B;
            c3528Lg2.A05();
            C3654Ni c3654Ni = new C3654Ni();
            c3872re = this.A00.A0H;
            C3654Ni A03 = c3654Ni.A03(c3872re);
            c3528Lg3 = this.A00.A0B;
            Map<String, String> A05 = A03.A02(c3528Lg3).A05();
            interfaceC3369J2 = this.A00.A08;
            abstractC4476b5 = this.A00.A06;
            interfaceC3369J2.A9g(abstractC4476b5.A12(), A05);
            abstractC4476b52 = this.A00.A06;
            C23271U A0y = abstractC4476b52.A0y();
            c4337Yn = this.A00.A07;
            C23271U.A07(A0y, c4337Yn);
            c4337Yn2 = this.A00.A07;
            c4337Yn2.A0E().A2k();
            abstractC4476b53 = this.A00.A06;
            AbstractC23832O.A00(abstractC4476b53.A0N());
            interfaceC3560MC = this.A00.A0C;
            if (interfaceC3560MC != null) {
                interfaceC3560MC2 = this.A00.A0C;
                interfaceC3593Mj = this.A00.A0D;
                interfaceC3560MC2.A43(interfaceC3593Mj.A7B());
            }
        }
    }
}
