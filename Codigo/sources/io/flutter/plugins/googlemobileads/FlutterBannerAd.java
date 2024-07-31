package io.flutter.plugins.googlemobileads;

import io.flutter.plugin.platform.PlatformView;
import io.flutter.util.Preconditions;
import x8.k;

/* loaded from: classes3.dex */
class FlutterBannerAd extends FlutterAd implements FlutterAdLoadedListener {
    private final String adUnitId;
    private k adView;
    private final BannerAdCreator bannerAdCreator;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;
    private final FlutterAdSize size;

    public FlutterBannerAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdSize flutterAdSize, BannerAdCreator bannerAdCreator) {
        super(i10);
        Preconditions.checkNotNull(adInstanceManager);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(flutterAdRequest);
        Preconditions.checkNotNull(flutterAdSize);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.size = flutterAdSize;
        this.bannerAdCreator = bannerAdCreator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        k kVar = this.adView;
        if (kVar != null) {
            kVar.a();
            this.adView = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterAdSize getAdSize() {
        k kVar = this.adView;
        if (kVar == null || kVar.getAdSize() == null) {
            return null;
        }
        return new FlutterAdSize(this.adView.getAdSize());
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public PlatformView getPlatformView() {
        k kVar = this.adView;
        if (kVar == null) {
            return null;
        }
        return new FlutterPlatformView(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        k createAdView = this.bannerAdCreator.createAdView();
        this.adView = createAdView;
        createAdView.setAdUnitId(this.adUnitId);
        this.adView.setAdSize(this.size.getAdSize());
        this.adView.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.adView.setAdListener(new FlutterBannerAdListener(this.adId, this.manager, this));
        this.adView.b(this.request.asAdRequest(this.adUnitId));
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdLoadedListener
    public void onAdLoaded() {
        k kVar = this.adView;
        if (kVar != null) {
            this.manager.onAdLoaded(this.adId, kVar.getResponseInfo());
        }
    }
}
