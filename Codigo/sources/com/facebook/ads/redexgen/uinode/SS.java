package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class SS extends RD {
    public final /* synthetic */ C9P A00;

    public SS(C9P c9p) {
        this.A00 = c9p;
    }

    @Override // com.facebook.ads.redexgen.uinode.RD
    public final void A03() {
        C1058Lg c1058Lg;
        C1058Lg c1058Lg2;
        String str;
        RE re2;
        C1058Lg c1058Lg3;
        AbstractC1502b5 abstractC1502b5;
        J2 j22;
        String str2;
        AbstractC1502b5 abstractC1502b52;
        C1399Yn c1399Yn;
        C1399Yn c1399Yn2;
        AbstractC1502b5 abstractC1502b53;
        c1058Lg = this.A00.A0E;
        if (!c1058Lg.A07()) {
            C9P c9p = this.A00;
            c1058Lg2 = c9p.A0E;
            c9p.setImpressionRecordingFlag(c1058Lg2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                C1112Ni c1112Ni = new C1112Ni();
                re2 = this.A00.A09;
                C1112Ni A03 = c1112Ni.A03(re2);
                c1058Lg3 = this.A00.A0E;
                C1112Ni A02 = A03.A02(c1058Lg3);
                abstractC1502b5 = ((UL) ((UL) this.A00)).A0A;
                Map<String, String> A05 = A02.A04(abstractC1502b5.A0O()).A05();
                j22 = ((UL) ((UL) this.A00)).A0C;
                str2 = this.A00.A0A;
                j22.A9g(str2, A05);
                abstractC1502b52 = ((UL) ((UL) this.A00)).A0A;
                C1U A0y = abstractC1502b52.A0y();
                c1399Yn = this.A00.A0D;
                C1U.A07(A0y, c1399Yn);
                c1399Yn2 = this.A00.A0D;
                c1399Yn2.A0E().A2k();
                abstractC1502b53 = this.A00.A03;
                C2O.A00(abstractC1502b53.A0N());
            }
        }
    }
}
