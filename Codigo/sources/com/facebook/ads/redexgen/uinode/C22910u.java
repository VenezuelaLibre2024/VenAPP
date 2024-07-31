package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0u */
/* loaded from: assets/audience_network.dex */
public final class C22910u {
    public static InterfaceC22860p A00;

    public final InterfaceC22860p A00(C4337Yn c4337Yn, AdPlacementType adPlacementType) {
        InterfaceC22860p interfaceC22860p = A00;
        if (interfaceC22860p != null) {
            return interfaceC22860p;
        }
        switch (C22900t.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C4494bN();
            case 2:
                return new C4493bM();
            case 3:
                return new C4491bK(c4337Yn);
            case 4:
                return new C3160Fb(c4337Yn);
            case 5:
                return new C3157FY();
            default:
                return null;
        }
    }
}
