package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.HN */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3268HN implements InterfaceC3921S1 {
    public final C3303Hw A00;
    public final EnumC3926S6 A01;

    public AbstractC3268HN(C3303Hw c3303Hw, EnumC3926S6 enumC3926S6) {
        this.A00 = c3303Hw;
        this.A01 = enumC3926S6;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3921S1
    public void A3Z(Map<InterfaceC3903Rj, EnumC3926S6> map, Map<SyncModifiableBundle, EnumC3913Rt> map2) {
        map.put(this.A00, this.A01);
    }
}
