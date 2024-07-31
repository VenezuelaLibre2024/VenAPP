package io.flutter.plugins.googlemobileads;

import android.view.ViewGroup;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.util.Preconditions;
import java.util.List;
import x8.i;
import y8.b;
import y8.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FlutterAdManagerBannerAd extends FlutterAd implements FlutterAdLoadedListener {
    private final String adUnitId;
    protected b adView;
    private final BannerAdCreator bannerAdCreator;
    protected final AdInstanceManager manager;
    private final FlutterAdManagerAdRequest request;
    private final List<FlutterAdSize> sizes;

    public FlutterAdManagerBannerAd(int i10, AdInstanceManager adInstanceManager, String str, List<FlutterAdSize> list, FlutterAdManagerAdRequest flutterAdManagerAdRequest, BannerAdCreator bannerAdCreator) {
        super(i10);
        Preconditions.checkNotNull(adInstanceManager);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(flutterAdManagerAdRequest);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.sizes = list;
        this.request = flutterAdManagerAdRequest;
        this.bannerAdCreator = bannerAdCreator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        b bVar = this.adView;
        if (bVar != null) {
            bVar.a();
            this.adView = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterAdSize getAdSize() {
        b bVar = this.adView;
        if (bVar == null || bVar.getAdSize() == null) {
            return null;
        }
        return new FlutterAdSize(this.adView.getAdSize());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public PlatformView getPlatformView() {
        b bVar = this.adView;
        if (bVar == null) {
            return null;
        }
        return new FlutterPlatformView(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        b createAdManagerAdView = this.bannerAdCreator.createAdManagerAdView();
        this.adView = createAdManagerAdView;
        if (this instanceof FluidAdManagerBannerAd) {
            createAdManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        this.adView.setAdUnitId(this.adUnitId);
        this.adView.setAppEventListener(new e() { // from class: io.flutter.plugins.googlemobileads.FlutterAdManagerBannerAd.1
            @Override // y8.e
            public void onAppEvent(String str, String str2) {
                FlutterAdManagerBannerAd flutterAdManagerBannerAd = FlutterAdManagerBannerAd.this;
                flutterAdManagerBannerAd.manager.onAppEvent(flutterAdManagerBannerAd.adId, str, str2);
            }
        });
        i[] iVarArr = new i[this.sizes.size()];
        for (int i10 = 0; i10 < this.sizes.size(); i10++) {
            iVarArr[i10] = this.sizes.get(i10).getAdSize();
        }
        this.adView.setAdSizes(iVarArr);
        this.adView.setAdListener(new FlutterBannerAdListener(this.adId, this.manager, this));
        this.adView.e(this.request.asAdManagerAdRequest(this.adUnitId));
    }

    public void onAdLoaded() {
        b bVar = this.adView;
        if (bVar != null) {
            this.manager.onAdLoaded(this.adId, bVar.getResponseInfo());
        }
    }
}
