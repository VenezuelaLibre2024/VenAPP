package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.bS */
/* loaded from: assets/audience_network.dex */
public class C4499bS implements InterfaceC260561 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C4494bN A01;
    public final /* synthetic */ C4494bN A02;
    public final /* synthetic */ C27438T A03;

    public C4499bS(C4494bN c4494bN, int i10, C27438T c27438t, C4494bN c4494bN2) {
        this.A01 = c4494bN;
        this.A00 = i10;
        this.A03 = c27438t;
        this.A02 = c4494bN2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC260561
    public final void AAl() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC260561
    public final void AAm() {
        InterfaceC22940x interfaceC22940x;
        interfaceC22940x = this.A01.A00;
        interfaceC22940x.ABw(this.A02, C3403Jb.A00(AdErrorType.NO_FILL));
    }
}
