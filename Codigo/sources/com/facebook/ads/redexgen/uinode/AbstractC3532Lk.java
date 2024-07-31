package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.VideoStartReason;

/* renamed from: com.facebook.ads.redexgen.X.Lk */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3532Lk {
    public static EnumC3818QM A00(VideoStartReason videoStartReason) {
        switch (C3531Lj.A00[videoStartReason.ordinal()]) {
            case 1:
                return EnumC3818QM.A02;
            case 2:
                return EnumC3818QM.A03;
            case 3:
                return EnumC3818QM.A04;
            default:
                return EnumC3818QM.A03;
        }
    }
}
