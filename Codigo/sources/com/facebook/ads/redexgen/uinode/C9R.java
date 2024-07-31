package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.9R */
/* loaded from: assets/audience_network.dex */
public class C9R extends AbstractC1174Ps {
    public final /* synthetic */ C9Q A00;

    public C9R(C9Q c9q) {
        this.A00 = c9q;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
    /* renamed from: A00 */
    public final void A03(C1175Pt c1175Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1163Ph(this));
    }
}
