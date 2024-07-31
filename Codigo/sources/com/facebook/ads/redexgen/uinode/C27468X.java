package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AudienceNetworkAds;

/* renamed from: com.facebook.ads.redexgen.X.8X */
/* loaded from: assets/audience_network.dex */
public class C27468X implements AudienceNetworkAds.InitResult {
    public final String A00;
    public final boolean A01;

    public C27468X(boolean z10, String str) {
        this.A01 = z10;
        this.A00 = str;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final String getMessage() {
        return this.A00;
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitResult
    public final boolean isSuccess() {
        return this.A01;
    }
}
