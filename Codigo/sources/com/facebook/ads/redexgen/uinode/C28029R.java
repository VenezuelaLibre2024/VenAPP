package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.9R */
/* loaded from: assets/audience_network.dex */
public class C28029R extends AbstractC3788Ps {
    public final /* synthetic */ C28019Q A00;

    public C28029R(C28019Q c28019q) {
        this.A00 = c28019q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C3789Pt c3789Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC3777Ph(this));
    }
}
