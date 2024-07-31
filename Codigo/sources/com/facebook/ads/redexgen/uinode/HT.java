package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class HT implements S1 {
    public final EnumC1227Rt A00;
    public final AnonymousClass74 A01;

    public HT(AnonymousClass74 anonymousClass74, EnumC1227Rt enumC1227Rt) {
        this.A01 = anonymousClass74;
        this.A00 = enumC1227Rt;
    }

    @Override // com.facebook.ads.redexgen.uinode.S1
    public void A3Z(Map<InterfaceC1217Rj, S6> map, Map<SyncModifiableBundle, EnumC1227Rt> map2) {
        map2.put(null, this.A00);
    }
}
