package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.facebook.ads.redexgen.X.VU */
/* loaded from: assets/audience_network.dex */
public class C4135VU extends AbstractRunnableC3455KT {
    public final /* synthetic */ C4134VT A00;

    public C4135VU(C4134VT c4134vt) {
        this.A00 = c4134vt;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        ThreadPoolExecutor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        Runnable runnable;
        this.A00.A0C = false;
        threadPoolExecutor = this.A00.A0B;
        if (threadPoolExecutor.getQueue().isEmpty()) {
            threadPoolExecutor2 = this.A00.A0B;
            runnable = this.A00.A0A;
            threadPoolExecutor2.execute(runnable);
        }
    }
}
