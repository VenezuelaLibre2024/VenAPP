package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.SS */
/* loaded from: assets/audience_network.dex */
public class C3948SS extends AbstractC3871RD {
    public final /* synthetic */ C28009P A00;

    public C3948SS(C28009P c28009p) {
        this.A00 = c28009p;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3871RD
    public final void A03() {
        C3528Lg c3528Lg;
        C3528Lg c3528Lg2;
        String str;
        C3872RE c3872re;
        C3528Lg c3528Lg3;
        AbstractC4476b5 abstractC4476b5;
        InterfaceC3369J2 interfaceC3369J2;
        String str2;
        AbstractC4476b5 abstractC4476b52;
        C4337Yn c4337Yn;
        C4337Yn c4337Yn2;
        AbstractC4476b5 abstractC4476b53;
        c3528Lg = this.A00.A0E;
        if (!c3528Lg.A07()) {
            C28009P c28009p = this.A00;
            c3528Lg2 = c28009p.A0E;
            c28009p.setImpressionRecordingFlag(c3528Lg2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                C3654Ni c3654Ni = new C3654Ni();
                c3872re = this.A00.A09;
                C3654Ni A03 = c3654Ni.A03(c3872re);
                c3528Lg3 = this.A00.A0E;
                C3654Ni A02 = A03.A02(c3528Lg3);
                abstractC4476b5 = ((AbstractC4065UL) ((AbstractC4065UL) this.A00)).A0A;
                Map<String, String> A05 = A02.A04(abstractC4476b5.A0O()).A05();
                interfaceC3369J2 = ((AbstractC4065UL) ((AbstractC4065UL) this.A00)).A0C;
                str2 = this.A00.A0A;
                interfaceC3369J2.A9g(str2, A05);
                abstractC4476b52 = ((AbstractC4065UL) ((AbstractC4065UL) this.A00)).A0A;
                C23271U A0y = abstractC4476b52.A0y();
                c4337Yn = this.A00.A0D;
                C23271U.A07(A0y, c4337Yn);
                c4337Yn2 = this.A00.A0D;
                c4337Yn2.A0E().A2k();
                abstractC4476b53 = this.A00.A03;
                AbstractC23832O.A00(abstractC4476b53.A0N());
            }
        }
    }
}
