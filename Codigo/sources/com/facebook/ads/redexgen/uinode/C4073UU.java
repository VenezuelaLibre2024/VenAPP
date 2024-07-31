package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.UU */
/* loaded from: assets/audience_network.dex */
public class C4073UU implements InterfaceC3638NS {
    public final /* synthetic */ C4072UT A00;

    public C4073UU(C4072UT c4072ut) {
        this.A00 = c4072ut;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACT(String str) {
        this.A00.A0C.setProgress(100);
        this.A00.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACV(String str) {
        this.A00.A05 = true;
        this.A00.A0B.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACn(int i10) {
        if (this.A00.A05) {
            this.A00.A0C.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACq(String str) {
        this.A00.A0B.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3638NS
    public final void ACs() {
        this.A00.A0A.AB0(14);
    }
}
