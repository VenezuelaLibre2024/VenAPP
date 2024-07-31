package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.QR */
/* loaded from: assets/audience_network.dex */
public final class C3823QR implements InterfaceC3816QK {
    public final View A00;
    public final C4337Yn A01;

    public C3823QR(C4337Yn c4337Yn, View view) {
        this.A01 = c4337Yn;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3816QK
    public final double A8K() {
        C3873RF result = C3872RE.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
