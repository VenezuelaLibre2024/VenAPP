package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.UG */
/* loaded from: assets/audience_network.dex */
public class C4060UG implements InterfaceC3558MA {
    public final /* synthetic */ C4057UD A00;

    public C4060UG(C4057UD c4057ud) {
        this.A00 = c4057ud;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3558MA
    public final void AB6() {
        boolean A0W;
        boolean z10;
        C3377JA c3377ja;
        InterfaceC3560MC interfaceC3560MC;
        InterfaceC3593Mj interfaceC3593Mj;
        AtomicBoolean atomicBoolean;
        boolean A0V;
        AtomicBoolean atomicBoolean2;
        C3673O1 c3673o1;
        A0W = this.A00.A0W();
        if (A0W) {
            atomicBoolean2 = this.A00.A0S;
            if (!atomicBoolean2.get()) {
                c3673o1 = this.A00.A0Q;
                c3673o1.A07(this.A00);
                return;
            }
        }
        z10 = this.A00.A0U;
        if (z10) {
            atomicBoolean = this.A00.A0S;
            if (!atomicBoolean.get()) {
                A0V = this.A00.A0V();
                if (A0V) {
                    this.A00.A0W.setToolbarActionMode(0);
                    this.A00.A0L();
                    return;
                }
            }
        }
        c3377ja = this.A00.A0K;
        c3377ja.A04(EnumC3376J9.A07, null);
        interfaceC3560MC = this.A00.A0N;
        interfaceC3593Mj = this.A00.A0O;
        interfaceC3560MC.A43(interfaceC3593Mj.A6u());
    }
}
