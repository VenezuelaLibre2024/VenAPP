package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.cY */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4556cY {
    public InterfaceC4557cZ A00;

    public final void A00() {
        InterfaceC4557cZ interfaceC4557cZ = this.A00;
        if (interfaceC4557cZ != null) {
            interfaceC4557cZ.onStart();
        }
    }

    public final void A01() {
        InterfaceC4557cZ interfaceC4557cZ = this.A00;
        if (interfaceC4557cZ != null) {
            interfaceC4557cZ.onStop();
        }
    }

    public final void A02(InterfaceC4557cZ interfaceC4557cZ) {
        this.A00 = interfaceC4557cZ;
    }
}
