package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.bE */
/* loaded from: assets/audience_network.dex */
public class C4485bE implements InterfaceC23491q {
    public final /* synthetic */ C3157FY A00;

    public C4485bE(C3157FY c3157fy) {
        this.A00 = c3157fy;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23491q
    public final void ACZ(AdError adError) {
        InterfaceC230518 interfaceC230518;
        interfaceC230518 = this.A00.A01;
        interfaceC230518.AD1(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23491q
    public final void ACa() {
        AtomicBoolean atomicBoolean;
        InterfaceC230518 interfaceC230518;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        interfaceC230518 = this.A00.A01;
        interfaceC230518.ACy(this.A00);
    }
}
