package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.UW */
/* loaded from: assets/audience_network.dex */
public class C4075UW implements InterfaceC25715T {
    public final /* synthetic */ C4072UT A00;

    public C4075UW(C4072UT c4072ut) {
        this.A00 = c4072ut;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC25715T
    public final boolean A8u() {
        if (this.A00.A0E.canGoBack()) {
            this.A00.A0E.goBack();
            return true;
        }
        return false;
    }
}
