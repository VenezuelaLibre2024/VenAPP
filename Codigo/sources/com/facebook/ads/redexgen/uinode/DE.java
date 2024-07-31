package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class DE {
    public final int A00;
    public final long A01;

    public DE(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public static DE A00(InterfaceC0838Bt interfaceC0838Bt, C0980Hz c0980Hz) throws IOException, InterruptedException {
        interfaceC0838Bt.ADv(c0980Hz.A00, 0, 8);
        c0980Hz.A0Y(0);
        int A08 = c0980Hz.A08();
        long size = c0980Hz.A0K();
        return new DE(A08, size);
    }
}
