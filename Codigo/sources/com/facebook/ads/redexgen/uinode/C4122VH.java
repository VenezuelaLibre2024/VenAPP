package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.VH */
/* loaded from: assets/audience_network.dex */
public class C4122VH implements InterfaceC3653Nh {
    public static String[] A01 = {"PnhhxO44eyGR", "6RYeLXmAClA1SiGKn201px", "WqNcg2MFF", "kFMGwY5yNNV", "mQRpAL1oxGJgw", "Eqf6jMIzeI3tCjJb", "9imsVe3tjkVzhTosgYrmf1lKW7QE2MSM", "NRYl8cTHkwcGHXULnCD2cakkWnkUWd4e"};
    public final /* synthetic */ C4119VE A00;

    public C4122VH(C4119VE c4119ve) {
        this.A00 = c4119ve;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3653Nh
    public final void ABh(boolean z10) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        InterfaceC3387JK interfaceC3387JK;
        InterfaceC3387JK interfaceC3387JK2;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(z10);
        atomicBoolean2 = this.A00.A0E;
        if (atomicBoolean2.get()) {
            interfaceC3387JK = this.A00.A02;
            if (interfaceC3387JK != null) {
                C4119VE c4119ve = this.A00;
                String[] strArr = A01;
                if (strArr[5].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                A01[2] = "moHDWw2Q1";
                interfaceC3387JK2 = c4119ve.A02;
                interfaceC3387JK2.ACX(z10);
            }
        }
    }
}
