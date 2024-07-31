package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: com.facebook.ads.redexgen.X.YZ */
/* loaded from: assets/audience_network.dex */
public class C4323YZ extends AbstractRunnableC3455KT {
    public final /* synthetic */ C4336Ym A00;

    public C4323YZ(C4336Ym c4336Ym) {
        this.A00 = c4336Ym;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
