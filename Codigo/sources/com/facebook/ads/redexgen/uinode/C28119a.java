package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.9a */
/* loaded from: assets/audience_network.dex */
public class C28119a extends AbstractC3788Ps {
    public final /* synthetic */ C3979Sx A00;

    public C28119a(C3979Sx c3979Sx) {
        this.A00 = c3979Sx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C3789Pt c3789Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC3770Pa(this));
    }
}
