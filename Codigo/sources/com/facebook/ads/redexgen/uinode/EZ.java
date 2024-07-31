package com.facebook.ads.redexgen.uinode;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;

/* loaded from: assets/audience_network.dex */
public final class EZ extends ZG {
    public QB A00;

    public final void A04(C1399Yn c1399Yn, NativeBannerAd nativeBannerAd, JR jr, NativeAdLayout nativeAdLayout) {
        MediaView mediaView = new MediaView(nativeAdLayout.getContext());
        AdOptionsView adOptionsView = new AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd, nativeAdLayout);
        jr.A09(adOptionsView, 20);
        this.A00 = new SI(c1399Yn, nativeBannerAd, jr, V2.A0L(nativeBannerAd.getInternalNativeAd()).A17(), mediaView, adOptionsView);
        AbstractC1066Lo.A0M(nativeAdLayout, jr.A00());
        nativeBannerAd.registerViewForInteraction(nativeAdLayout, mediaView, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams contentParams = new FrameLayout.LayoutParams(-1, -1);
        contentParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), contentParams);
    }

    @Override // com.facebook.ads.redexgen.uinode.C06765a, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
