package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Sq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1250Sq implements InterfaceC1159Pd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1248So A01;

    public C1250Sq(C1248So c1248So, int i10) {
        this.A01 = c1248So;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1159Pd
    public final void AAu() {
        this.A01.A0R(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1159Pd
    public final void ABH(int i10) {
        C1248So.A02(this.A01, i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1159Pd
    public final void ABY(float f10) {
        boolean z10;
        z10 = this.A01.A08;
        if (!z10) {
            this.A01.A0G(f10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1159Pd
    public final void AD7(boolean z10) {
        this.A01.A0Q(z10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1159Pd
    public final void ADX(String str) {
        C1399Yn c1399Yn;
        MC mc2;
        InterfaceC1087Mj interfaceC1087Mj;
        c1399Yn = this.A01.A0D;
        c1399Yn.A0E().A2z(str);
        mc2 = this.A01.A0H;
        interfaceC1087Mj = this.A01.A0J;
        mc2.A43(interfaceC1087Mj.A6y());
        this.A01.A0H(3);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1159Pd
    public final void AGq() {
        FullScreenAdToolbar fullScreenAdToolbar;
        FullScreenAdToolbar fullScreenAdToolbar2;
        this.A01.A09 = false;
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgressImmediate(0.0f);
        fullScreenAdToolbar2 = this.A01.A0I;
        fullScreenAdToolbar2.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1159Pd
    public final void AGr(float f10) {
        FullScreenAdToolbar fullScreenAdToolbar;
        fullScreenAdToolbar = this.A01.A0I;
        fullScreenAdToolbar.setProgress(100.0f * f10);
    }
}
