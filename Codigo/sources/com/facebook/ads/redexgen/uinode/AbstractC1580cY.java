package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.cY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1580cY {
    public InterfaceC1581cZ A00;

    public final void A00() {
        InterfaceC1581cZ interfaceC1581cZ = this.A00;
        if (interfaceC1581cZ != null) {
            interfaceC1581cZ.onStart();
        }
    }

    public final void A01() {
        InterfaceC1581cZ interfaceC1581cZ = this.A00;
        if (interfaceC1581cZ != null) {
            interfaceC1581cZ.onStop();
        }
    }

    public final void A02(InterfaceC1581cZ interfaceC1581cZ) {
        this.A00 = interfaceC1581cZ;
    }
}
