package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network.dex */
public class A2 extends AbstractC1174Ps {
    public final /* synthetic */ T4 A00;

    public A2(T4 t42) {
        this.A00 = t42;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1175Pt c1175Pt) {
        new Handler(Looper.getMainLooper()).post(new PS(this));
    }
}
