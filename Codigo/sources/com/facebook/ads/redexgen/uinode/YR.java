package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class YR implements InterfaceC07297i {
    public final C07277f A00;

    public YR(C07277f c07277f) {
        this.A00 = c07277f;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07297i
    public final Map<String, String> A4n() {
        return C07468d.A01(this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07297i
    public final Map<String, String> A61() {
        return C8J.A02();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07297i
    public final String A7F() {
        return C8J.A00();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07297i
    public final String A7H() {
        return C6E.A00().A03();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07297i
    public final boolean A94() {
        return C1041Kp.A00().A03();
    }
}
