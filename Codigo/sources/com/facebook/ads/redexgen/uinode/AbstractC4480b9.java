package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.b9 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4480b9 implements InterfaceC22860p {
    public int A00;
    public long A01;
    public RewardData A02;

    public abstract int A0G();

    public abstract AbstractC23121F A0H();

    public abstract boolean A0I();

    public final void A00(int i10) {
        this.A00 = i10;
    }

    public final void A01(long j10) {
        this.A01 = j10;
    }

    public final void A02(RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC22860p
    public final AdPlacementType A7e() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
