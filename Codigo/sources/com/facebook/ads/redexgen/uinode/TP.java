package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class TP extends RD {
    public final /* synthetic */ B3 A00;

    public TP(B3 b32) {
        this.A00 = b32;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        C1058Lg c1058Lg;
        C1058Lg c1058Lg2;
        RE re2;
        C1058Lg c1058Lg3;
        J2 j22;
        AbstractC1502b5 abstractC1502b5;
        AbstractC1502b5 abstractC1502b52;
        C1399Yn c1399Yn;
        C1399Yn c1399Yn2;
        AbstractC1502b5 abstractC1502b53;
        MC mc2;
        MC mc3;
        InterfaceC1087Mj interfaceC1087Mj;
        c1058Lg = this.A00.A0B;
        if (!c1058Lg.A07()) {
            c1058Lg2 = this.A00.A0B;
            c1058Lg2.A05();
            C1112Ni c1112Ni = new C1112Ni();
            re2 = this.A00.A0H;
            C1112Ni A03 = c1112Ni.A03(re2);
            c1058Lg3 = this.A00.A0B;
            Map<String, String> A05 = A03.A02(c1058Lg3).A05();
            j22 = this.A00.A08;
            abstractC1502b5 = this.A00.A06;
            j22.A9g(abstractC1502b5.A12(), A05);
            abstractC1502b52 = this.A00.A06;
            C1U A0y = abstractC1502b52.A0y();
            c1399Yn = this.A00.A07;
            C1U.A07(A0y, c1399Yn);
            c1399Yn2 = this.A00.A07;
            c1399Yn2.A0E().A2k();
            abstractC1502b53 = this.A00.A06;
            C2O.A00(abstractC1502b53.A0N());
            mc2 = this.A00.A0C;
            if (mc2 != null) {
                mc3 = this.A00.A0C;
                interfaceC1087Mj = this.A00.A0D;
                mc3.A43(interfaceC1087Mj.A7B());
            }
        }
    }
}
