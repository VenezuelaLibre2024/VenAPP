package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.C6 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2964C6 {
    public final InterfaceC2962C4 A00;

    public abstract void A0B(C3306Hz c3306Hz, long j10) throws C28319v;

    public abstract boolean A0C(C3306Hz c3306Hz) throws C28319v;

    public AbstractC2964C6(InterfaceC2962C4 interfaceC2962C4) {
        this.A00 = interfaceC2962C4;
    }

    public final void A00(C3306Hz c3306Hz, long j10) throws C28319v {
        if (A0C(c3306Hz)) {
            A0B(c3306Hz, j10);
        }
    }
}
