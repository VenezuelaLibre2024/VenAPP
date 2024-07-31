package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.DE */
/* loaded from: assets/audience_network.dex */
public final class C3027DE {
    public final int A00;
    public final long A01;

    public C3027DE(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public static C3027DE A00(InterfaceC2951Bt interfaceC2951Bt, C3306Hz c3306Hz) throws IOException, InterruptedException {
        interfaceC2951Bt.ADv(c3306Hz.A00, 0, 8);
        c3306Hz.A0Y(0);
        int A08 = c3306Hz.A08();
        long size = c3306Hz.A0K();
        return new C3027DE(A08, size);
    }
}
