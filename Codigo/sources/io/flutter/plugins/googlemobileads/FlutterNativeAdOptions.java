package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.nativead.c;

/* loaded from: classes3.dex */
class FlutterNativeAdOptions {
    final Integer adChoicesPlacement;
    final Integer mediaAspectRatio;
    final Boolean requestCustomMuteThisAd;
    final Boolean shouldRequestMultipleImages;
    final Boolean shouldReturnUrlsForImageAssets;
    final FlutterVideoOptions videoOptions;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterNativeAdOptions(Integer num, Integer num2, FlutterVideoOptions flutterVideoOptions, Boolean bool, Boolean bool2, Boolean bool3) {
        this.adChoicesPlacement = num;
        this.mediaAspectRatio = num2;
        this.videoOptions = flutterVideoOptions;
        this.requestCustomMuteThisAd = bool;
        this.shouldRequestMultipleImages = bool2;
        this.shouldReturnUrlsForImageAssets = bool3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c asNativeAdOptions() {
        c.a aVar = new c.a();
        Integer num = this.adChoicesPlacement;
        if (num != null) {
            aVar.c(num.intValue());
        }
        Integer num2 = this.mediaAspectRatio;
        if (num2 != null) {
            aVar.d(num2.intValue());
        }
        FlutterVideoOptions flutterVideoOptions = this.videoOptions;
        if (flutterVideoOptions != null) {
            aVar.h(flutterVideoOptions.asVideoOptions());
        }
        Boolean bool = this.requestCustomMuteThisAd;
        if (bool != null) {
            aVar.e(bool.booleanValue());
        }
        Boolean bool2 = this.shouldRequestMultipleImages;
        if (bool2 != null) {
            aVar.f(bool2.booleanValue());
        }
        Boolean bool3 = this.shouldReturnUrlsForImageAssets;
        if (bool3 != null) {
            aVar.g(bool3.booleanValue());
        }
        return aVar.a();
    }
}
