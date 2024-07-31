package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.bF */
/* loaded from: assets/audience_network.dex */
public class C4486bF implements InterfaceC260561 {
    public final /* synthetic */ C3157FY A00;

    public C4486bF(C3157FY c3157fy) {
        this.A00 = c3157fy;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC260561
    public final void AAl() {
        AtomicBoolean atomicBoolean;
        InterfaceC230518 interfaceC230518;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        interfaceC230518 = this.A00.A01;
        interfaceC230518.ACy(this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC260561
    public final void AAm() {
        InterfaceC230518 interfaceC230518;
        interfaceC230518 = this.A00.A01;
        interfaceC230518.AD1(this.A00, AdError.CACHE_ERROR);
    }
}
