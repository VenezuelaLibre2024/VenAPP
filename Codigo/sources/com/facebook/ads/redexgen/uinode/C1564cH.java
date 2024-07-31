package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.cH */
/* loaded from: assets/audience_network.dex */
public final class C1564cH {
    public static C1564cH A02 = null;
    public final C1576cT A00;
    public final C1574cR A01;

    public C1564cH(AbstractC1580cY abstractC1580cY, C1574cR c1574cR, C1576cT c1576cT) {
        this.A00 = c1576cT;
        this.A01 = c1574cR;
        abstractC1580cY.A02(new H2(c1574cR));
    }

    public static C1564cH A00(AbstractC1580cY abstractC1580cY, InterfaceC1584cc interfaceC1584cc, HB hb2) {
        C1564cH localsTestInstance = A02;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        C1576cT c1576cT = new C1576cT();
        return new C1564cH(abstractC1580cY, new C1574cR(interfaceC1584cc, new HL(), hb2, c1576cT, new Handler(Looper.getMainLooper())), c1576cT);
    }

    public final void A01(cX cXVar) {
        this.A01.A09(cXVar);
    }

    public final void A02(InterfaceC1578cV interfaceC1578cV) {
        this.A01.A0A(interfaceC1578cV);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        this.A00.A01(dspViewableNode);
    }

    public final void A04(DspViewableNode dspViewableNode, C1582ca c1582ca) {
        this.A00.A02(dspViewableNode, c1582ca);
    }
}
