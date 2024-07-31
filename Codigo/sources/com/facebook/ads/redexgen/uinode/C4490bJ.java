package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.bJ */
/* loaded from: assets/audience_network.dex */
public class C4490bJ implements InterfaceC26336U {
    public final /* synthetic */ C3157FY A00;

    public C4490bJ(C3157FY c3157fy) {
        this.A00 = c3157fy;
    }

    private void A00(boolean z10) {
        InterfaceC230518 interfaceC230518;
        AtomicBoolean atomicBoolean;
        InterfaceC230518 interfaceC2305182;
        if (!z10) {
            interfaceC230518 = this.A00.A01;
            interfaceC230518.AD1(this.A00, AdError.CACHE_ERROR);
        } else {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            interfaceC2305182 = this.A00.A01;
            interfaceC2305182.ACy(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26336U
    public final void AB2() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26336U
    public final void ABB() {
        A00(true);
    }
}
