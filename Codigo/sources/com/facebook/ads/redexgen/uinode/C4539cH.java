package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.cH */
/* loaded from: assets/audience_network.dex */
public final class C4539cH {
    public static C4539cH A02 = null;
    public final C4551cT A00;
    public final C4549cR A01;

    public C4539cH(AbstractC4556cY abstractC4556cY, C4549cR c4549cR, C4551cT c4551cT) {
        this.A00 = c4551cT;
        this.A01 = c4549cR;
        abstractC4556cY.A02(new C3247H2(c4549cR));
    }

    public static C4539cH A00(AbstractC4556cY abstractC4556cY, InterfaceC4560cc interfaceC4560cc, InterfaceC3256HB interfaceC3256HB) {
        C4539cH localsTestInstance = A02;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        C4551cT c4551cT = new C4551cT();
        return new C4539cH(abstractC4556cY, new C4549cR(interfaceC4560cc, new C3266HL(), interfaceC3256HB, c4551cT, new Handler(Looper.getMainLooper())), c4551cT);
    }

    public final void A01(InterfaceC4555cX interfaceC4555cX) {
        this.A01.A09(interfaceC4555cX);
    }

    public final void A02(InterfaceC4553cV interfaceC4553cV) {
        this.A01.A0A(interfaceC4553cV);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        this.A00.A01(dspViewableNode);
    }

    public final void A04(DspViewableNode dspViewableNode, C4558ca c4558ca) {
        this.A00.A02(dspViewableNode, c4558ca);
    }
}
