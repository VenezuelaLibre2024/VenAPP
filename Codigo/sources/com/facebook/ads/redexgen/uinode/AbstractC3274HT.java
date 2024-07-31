package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.HT */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3274HT implements InterfaceC3921S1 {
    public final EnumC3913Rt A00;
    public final AbstractC266374 A01;

    public AbstractC3274HT(AbstractC266374 abstractC266374, EnumC3913Rt enumC3913Rt) {
        this.A01 = abstractC266374;
        this.A00 = enumC3913Rt;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3921S1
    public void A3Z(Map<InterfaceC3903Rj, EnumC3926S6> map, Map<SyncModifiableBundle, EnumC3913Rt> map2) {
        map2.put(null, this.A00);
    }
}
