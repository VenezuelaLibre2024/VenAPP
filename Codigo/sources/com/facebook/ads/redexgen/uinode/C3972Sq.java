package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Sq */
/* loaded from: assets/audience_network.dex */
public class C3972Sq implements InterfaceC3773Pd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C3970So A01;

    public C3972Sq(C3970So c3970So, int i10) {
        this.A01 = c3970So;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3773Pd
    public final void AAu() {
        this.A01.A0R(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3773Pd
    public final void ABH(int i10) {
        C3970So.A02(this.A01, i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3773Pd
    public final void ABY(float f10) {
        boolean z10;
        z10 = this.A01.A08;
        if (!z10) {
            this.A01.A0G(f10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3773Pd
    public final void AD7(boolean z10) {
        this.A01.A0Q(z10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3773Pd
    public final void ADX(String str) {
        C4337Yn c4337Yn;
        InterfaceC3560MC interfaceC3560MC;
        InterfaceC3593Mj interfaceC3593Mj;
        c4337Yn = this.A01.A0D;
        c4337Yn.A0E().A2z(str);
        interfaceC3560MC = this.A01.A0H;
        interfaceC3593Mj = this.A01.A0J;
        interfaceC3560MC.A43(interfaceC3593Mj.A6y());
        this.A01.A0H(3);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3773Pd
    public final void AGq() {
        FullScreenAdToolbar fullScreenAdToolbar;
        FullScreenAdToolbar fullScreenAdToolbar2;
        this.A01.A09 = false;
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgressImmediate(0.0f);
        fullScreenAdToolbar2 = this.A01.A0I;
        fullScreenAdToolbar2.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3773Pd
    public final void AGr(float f10) {
        FullScreenAdToolbar fullScreenAdToolbar;
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgress(100.0f * f10);
    }
}
