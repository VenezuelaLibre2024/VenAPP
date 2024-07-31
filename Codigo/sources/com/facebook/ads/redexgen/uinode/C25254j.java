package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4j */
/* loaded from: assets/audience_network.dex */
public class C25254j {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C25254j A00(AbstractC254856 abstractC254856, int i10) {
        View view = abstractC254856.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C25254j A01(AbstractC254856 abstractC254856) {
        return A00(abstractC254856, 0);
    }
}
