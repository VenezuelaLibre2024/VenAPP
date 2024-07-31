package io.flutter.plugins.googlemobileads;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import io.flutter.plugin.platform.PlatformView;
import java.util.Collections;
import x8.i;
import y8.b;

/* loaded from: classes3.dex */
public final class FluidAdManagerBannerAd extends FlutterAdManagerBannerAd {
    private static final String TAG = "FluidAdManagerBannerAd";
    private ViewGroup containerView;
    private int height;

    /* renamed from: io.flutter.plugins.googlemobileads.FluidAdManagerBannerAd$1 */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements View.OnLayoutChangeListener {
        AnonymousClass1() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight != FluidAdManagerBannerAd.this.height) {
                FluidAdManagerBannerAd fluidAdManagerBannerAd = FluidAdManagerBannerAd.this;
                fluidAdManagerBannerAd.manager.onFluidAdHeightChanged(fluidAdManagerBannerAd.adId, measuredHeight);
            }
            FluidAdManagerBannerAd.this.height = measuredHeight;
        }
    }

    public FluidAdManagerBannerAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdManagerAdRequest flutterAdManagerAdRequest, BannerAdCreator bannerAdCreator) {
        super(i10, adInstanceManager, str, Collections.singletonList(new FlutterAdSize(i.f30685p)), flutterAdManagerAdRequest, bannerAdCreator);
        this.height = -1;
    }

    ScrollView createContainerView() {
        if (this.manager.getActivity() != null) {
            return new ScrollView(this.manager.getActivity());
        }
        Log.e(TAG, "Tried to create container view before plugin is attached to an activity.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAdManagerBannerAd, io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        b bVar = this.adView;
        if (bVar != null) {
            bVar.a();
            this.adView = null;
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.containerView = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAdManagerBannerAd, io.flutter.plugins.googlemobileads.FlutterAd
    public PlatformView getPlatformView() {
        if (this.adView == null) {
            return null;
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            return new FlutterPlatformView(viewGroup);
        }
        ScrollView createContainerView = createContainerView();
        if (createContainerView == null) {
            return null;
        }
        createContainerView.setClipChildren(false);
        createContainerView.setVerticalScrollBarEnabled(false);
        createContainerView.setHorizontalScrollBarEnabled(false);
        this.containerView = createContainerView;
        createContainerView.addView(this.adView);
        return new FlutterPlatformView(this.adView);
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdManagerBannerAd, io.flutter.plugins.googlemobileads.FlutterAdLoadedListener
    public void onAdLoaded() {
        b bVar = this.adView;
        if (bVar != null) {
            bVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: io.flutter.plugins.googlemobileads.FluidAdManagerBannerAd.1
                AnonymousClass1() {
                }

                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredHeight != FluidAdManagerBannerAd.this.height) {
                        FluidAdManagerBannerAd fluidAdManagerBannerAd = FluidAdManagerBannerAd.this;
                        fluidAdManagerBannerAd.manager.onFluidAdHeightChanged(fluidAdManagerBannerAd.adId, measuredHeight);
                    }
                    FluidAdManagerBannerAd.this.height = measuredHeight;
                }
            });
            this.manager.onAdLoaded(this.adId, this.adView.getResponseInfo());
        }
    }
}
