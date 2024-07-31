package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YX implements KJ {
    @Override // com.facebook.ads.redexgen.uinode.KJ
    public final void AFC(Throwable th2, Object obj) {
        if (obj instanceof InterfaceC07237b) {
            C1399Yn adContext = ((InterfaceC07237b) obj).A5t();
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
        if (!(context instanceof C1399Yn)) {
            return;
        }
        ((C1399Yn) context).A0O(th2);
    }
}
