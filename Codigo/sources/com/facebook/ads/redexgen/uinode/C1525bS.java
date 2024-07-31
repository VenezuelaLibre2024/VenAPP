package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1525bS implements AnonymousClass61 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1520bN A01;
    public final /* synthetic */ C1520bN A02;
    public final /* synthetic */ C8T A03;

    public C1525bS(C1520bN c1520bN, int i10, C8T c8t, C1520bN c1520bN2) {
        this.A01 = c1520bN;
        this.A00 = i10;
        this.A03 = c8t;
        this.A02 = c1520bN2;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAl() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAm() {
        InterfaceC05710x interfaceC05710x;
        interfaceC05710x = this.A01.A00;
        interfaceC05710x.ABw(this.A02, C1005Jb.A00(AdErrorType.NO_FILL));
    }
}
