package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.YX */
/* loaded from: assets/audience_network.dex */
public class C4321YX implements InterfaceC3445KJ {
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3445KJ
    public final void AFC(Throwable th2, Object obj) {
        if (obj instanceof InterfaceC26897b) {
            C4337Yn adContext = ((InterfaceC26897b) obj).A5t();
            if (adContext != null) {
                adContext.A0O(th2);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C4337Yn)) {
            return;
        }
        ((C4337Yn) context).A0O(th2);
    }
}
