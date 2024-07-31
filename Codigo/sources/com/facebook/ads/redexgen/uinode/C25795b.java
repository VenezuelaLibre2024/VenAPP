package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* renamed from: com.facebook.ads.redexgen.X.5b */
/* loaded from: assets/audience_network.dex */
public final class C25795b implements BidderTokenProviderApi {
    public final C26326T A00 = new C26326T();

    public final C26326T A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C25805c.A09(context));
    }
}
