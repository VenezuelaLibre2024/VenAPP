package com.facebook.ads.redexgen.uinode;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* loaded from: assets/audience_network.dex */
public final class ER extends ZG {
    public QB A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A04(NativeAdLayout nativeAdLayout, C1399Yn c1399Yn, NativeAd nativeAd, JR jr) {
        O3 o32 = new O3(c1399Yn);
        MediaView mediaView = new MediaView(c1399Yn);
        AdOptionsView adOptionsView = new AdOptionsView(c1399Yn, nativeAd, nativeAdLayout);
        jr.A09(adOptionsView, 28);
        this.A00 = new SH(c1399Yn, nativeAd, jr, V2.A0L(nativeAd.getInternalNativeAd()).A17(), o32, mediaView, adOptionsView);
        AbstractC1066Lo.A0M(nativeAdLayout, jr.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, o32, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.uinode.C06765a, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
