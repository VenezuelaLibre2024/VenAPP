package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.9a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C07689a extends AbstractC1174Ps {
    public final /* synthetic */ C1257Sx A00;

    public C07689a(C1257Sx c1257Sx) {
        this.A00 = c1257Sx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1175Pt c1175Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1156Pa(this));
    }
}
