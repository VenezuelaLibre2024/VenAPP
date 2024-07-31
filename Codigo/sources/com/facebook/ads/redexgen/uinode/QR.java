package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class QR implements QK {
    public final View A00;
    public final C1399Yn A01;

    public QR(C1399Yn c1399Yn, View view) {
        this.A01 = c1399Yn;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.uinode.QK
    public final double A8K() {
        RF result = RE.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
