package com.facebook.ads.redexgen.uinode;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.ER */
/* loaded from: assets/audience_network.dex */
public final class C3090ER extends C4366ZG {
    public InterfaceC3807QB A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A04(NativeAdLayout nativeAdLayout, C4337Yn c4337Yn, NativeAd nativeAd, C3394JR c3394jr) {
        C3675O3 c3675o3 = new C3675O3(c4337Yn);
        MediaView mediaView = new MediaView(c4337Yn);
        AdOptionsView adOptionsView = new AdOptionsView(c4337Yn, nativeAd, nativeAdLayout);
        c3394jr.A09(adOptionsView, 28);
        this.A00 = new C3937SH(c4337Yn, nativeAd, c3394jr, C4107V2.A0L(nativeAd.getInternalNativeAd()).A17(), c3675o3, mediaView, adOptionsView);
        AbstractC3536Lo.A0M(nativeAdLayout, c3394jr.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c3675o3, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.uinode.C25785a, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
