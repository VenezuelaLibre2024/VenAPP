package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.bH */
/* loaded from: assets/audience_network.dex */
public class C4488bH implements InterfaceC260561 {
    public final /* synthetic */ C3157FY A00;
    public final /* synthetic */ boolean A01;

    public C4488bH(C3157FY c3157fy, boolean z10) {
        this.A00 = c3157fy;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC260561
    public final void AAl() {
        C4337Yn c4337Yn;
        AtomicBoolean atomicBoolean;
        InterfaceC230518 interfaceC230518;
        C4337Yn c4337Yn2;
        AbstractC23121F abstractC23121F;
        c4337Yn = this.A00.A04;
        if (!C3348Ih.A1R(c4337Yn) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            interfaceC230518 = this.A00.A01;
            interfaceC230518.ACy(this.A00);
            return;
        }
        C3157FY c3157fy = this.A00;
        c4337Yn2 = c3157fy.A04;
        abstractC23121F = this.A00.A03;
        c3157fy.A06 = AbstractC3746PC.A01(c4337Yn2, (C3151FS) abstractC23121F, 0, new C4489bI(this));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC260561
    public final void AAm() {
        InterfaceC230518 interfaceC230518;
        interfaceC230518 = this.A00.A01;
        interfaceC230518.AD1(this.A00, AdError.CACHE_ERROR);
    }
}
