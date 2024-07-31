package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.VF */
/* loaded from: assets/audience_network.dex */
public class C4120VF implements InterfaceC3387JK {
    public WeakReference<C4107V2> A00;

    public C4120VF(C4107V2 c4107v2) {
        this.A00 = new WeakReference<>(c4107v2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3387JK
    public final void ACX(boolean z10) {
        if (this.A00.get() != null) {
            this.A00.get().A1c(z10, false);
        }
    }
}
