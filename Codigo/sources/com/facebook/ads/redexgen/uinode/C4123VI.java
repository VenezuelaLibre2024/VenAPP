package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* renamed from: com.facebook.ads.redexgen.X.VI */
/* loaded from: assets/audience_network.dex */
public class C4123VI implements InterfaceC3389JM {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ C4119VE A01;

    public C4123VI(C4119VE c4119ve, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = c4119ve;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3389JM
    public final void AG3() {
        this.A00.setVolume(0.0f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3389JM
    public final void AG8(NativeAd nativeAd) {
        this.A01.A0I(C4107V2.A0L(nativeAd.getInternalNativeAd()), null);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3389JM
    public final void AGn() {
        this.A01.A0D();
    }
}
