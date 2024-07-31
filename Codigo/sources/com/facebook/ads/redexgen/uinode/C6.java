package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public abstract class C6 {
    public final C4 A00;

    public abstract void A0B(C0980Hz c0980Hz, long j10) throws C07889v;

    public abstract boolean A0C(C0980Hz c0980Hz) throws C07889v;

    public C6(C4 c42) {
        this.A00 = c42;
    }

    public final void A00(C0980Hz c0980Hz, long j10) throws C07889v {
        if (A0C(c0980Hz)) {
            A0B(c0980Hz, j10);
        }
    }
}
