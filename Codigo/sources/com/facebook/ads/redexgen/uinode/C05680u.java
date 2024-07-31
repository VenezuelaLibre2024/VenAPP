package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05680u {
    public static InterfaceC05630p A00;

    public final InterfaceC05630p A00(C1399Yn c1399Yn, AdPlacementType adPlacementType) {
        InterfaceC05630p interfaceC05630p = A00;
        if (interfaceC05630p != null) {
            return interfaceC05630p;
        }
        switch (C05670t.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C1520bN();
            case 2:
                return new C1519bM();
            case 3:
                return new C1517bK(c1399Yn);
            case 4:
                return new C0908Fb(c1399Yn);
            case 5:
                return new FY();
            default:
                return null;
        }
    }
}
