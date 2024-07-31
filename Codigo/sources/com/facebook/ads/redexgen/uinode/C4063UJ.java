package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.UJ */
/* loaded from: assets/audience_network.dex */
public class C4063UJ implements InterfaceC3672O0 {
    public final /* synthetic */ C4057UD A00;

    public C4063UJ(C4057UD c4057ud) {
        this.A00 = c4057ud;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3672O0
    public final void AAh() {
        boolean A0V;
        A0V = this.A00.A0V();
        if (A0V) {
            this.A00.A0L();
            this.A00.A0W.setToolbarActionMessage("");
            this.A00.A0W.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3672O0
    public final void ACB() {
        C3495L9 c3495l9;
        this.A00.A0C = false;
        c3495l9 = this.A00.A0L;
        c3495l9.A07();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3672O0
    public final void ACC() {
        C3495L9 c3495l9;
        this.A00.A0C = true;
        c3495l9 = this.A00.A0L;
        c3495l9.A06();
    }
}
