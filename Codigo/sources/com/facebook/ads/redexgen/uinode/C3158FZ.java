package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.FZ */
/* loaded from: assets/audience_network.dex */
public class C3158FZ extends AbstractC4461aq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C3157FY A01;
    public final /* synthetic */ C4474b3 A02;
    public final /* synthetic */ C3151FS A03;
    public final /* synthetic */ C4337Yn A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3158FZ(C3157FY c3157fy, boolean z10, C4337Yn c4337Yn, C3151FS c3151fs, C4474b3 c4474b3, int i10) {
        super(z10);
        this.A01 = c3157fy;
        this.A04 = c4337Yn;
        this.A03 = c3151fs;
        this.A02 = c4474b3;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4461aq
    public final void A00() {
        InterfaceC230518 interfaceC230518;
        interfaceC230518 = this.A01.A01;
        interfaceC230518.AD1(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4461aq
    public final void A01(boolean z10) {
        AtomicBoolean atomicBoolean;
        InterfaceC230518 interfaceC230518;
        C3157FY.A0D = null;
        if (z10) {
            this.A04.A00().AFq(this.A03.A12(), this.A02.A0w());
        }
        if (this.A00 == 0) {
            atomicBoolean = this.A01.A0C;
            atomicBoolean.set(true);
            interfaceC230518 = this.A01.A01;
            interfaceC230518.ACy(this.A01);
        }
        this.A01.A0B(this.A04, this.A02, this.A00 + 1);
    }
}
