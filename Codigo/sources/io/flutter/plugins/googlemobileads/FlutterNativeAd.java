package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.nativead.b;
import com.google.android.gms.ads.nativead.c;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateStyle;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FlutterNativeAd extends FlutterAd {
    private static final String TAG = "FlutterNativeAd";
    private final GoogleMobileAdsPlugin.NativeAdFactory adFactory;
    private FlutterAdManagerAdRequest adManagerRequest;
    private final String adUnitId;
    private final Context context;
    private Map<String, Object> customOptions;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterNativeAdOptions nativeAdOptions;
    private NativeAdView nativeAdView;
    private final FlutterNativeTemplateStyle nativeTemplateStyle;
    private FlutterAdRequest request;
    private TemplateView templateView;

    /* loaded from: classes3.dex */
    static class Builder {
        private GoogleMobileAdsPlugin.NativeAdFactory adFactory;
        private FlutterAdManagerAdRequest adManagerRequest;
        private String adUnitId;
        private final Context context;
        private Map<String, Object> customOptions;
        private FlutterAdLoader flutterAdLoader;

        /* renamed from: id, reason: collision with root package name */
        private Integer f18290id;
        private AdInstanceManager manager;
        private FlutterNativeAdOptions nativeAdOptions;
        private FlutterNativeTemplateStyle nativeTemplateStyle;
        private FlutterAdRequest request;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(Context context) {
            this.context = context;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public FlutterNativeAd build() {
            if (this.manager == null) {
                throw new IllegalStateException("AdInstanceManager cannot be null.");
            }
            if (this.adUnitId == null) {
                throw new IllegalStateException("AdUnitId cannot be null.");
            }
            if (this.adFactory == null && this.nativeTemplateStyle == null) {
                throw new IllegalStateException("NativeAdFactory and nativeTemplateStyle cannot be null.");
            }
            FlutterAdRequest flutterAdRequest = this.request;
            if (flutterAdRequest == null && this.adManagerRequest == null) {
                throw new IllegalStateException("adRequest or addManagerRequest must be non-null.");
            }
            return flutterAdRequest == null ? new FlutterNativeAd(this.context, this.f18290id.intValue(), this.manager, this.adUnitId, this.adFactory, this.adManagerRequest, this.flutterAdLoader, this.customOptions, this.nativeAdOptions, this.nativeTemplateStyle) : new FlutterNativeAd(this.context, this.f18290id.intValue(), this.manager, this.adUnitId, this.adFactory, this.request, this.flutterAdLoader, this.customOptions, this.nativeAdOptions, this.nativeTemplateStyle);
        }

        public Builder setAdFactory(GoogleMobileAdsPlugin.NativeAdFactory nativeAdFactory) {
            this.adFactory = nativeAdFactory;
            return this;
        }

        public Builder setAdManagerRequest(FlutterAdManagerAdRequest flutterAdManagerAdRequest) {
            this.adManagerRequest = flutterAdManagerAdRequest;
            return this;
        }

        public Builder setAdUnitId(String str) {
            this.adUnitId = str;
            return this;
        }

        public Builder setCustomOptions(Map<String, Object> map) {
            this.customOptions = map;
            return this;
        }

        public Builder setFlutterAdLoader(FlutterAdLoader flutterAdLoader) {
            this.flutterAdLoader = flutterAdLoader;
            return this;
        }

        public Builder setId(int i10) {
            this.f18290id = Integer.valueOf(i10);
            return this;
        }

        public Builder setManager(AdInstanceManager adInstanceManager) {
            this.manager = adInstanceManager;
            return this;
        }

        public Builder setNativeAdOptions(FlutterNativeAdOptions flutterNativeAdOptions) {
            this.nativeAdOptions = flutterNativeAdOptions;
            return this;
        }

        public Builder setNativeTemplateStyle(FlutterNativeTemplateStyle flutterNativeTemplateStyle) {
            this.nativeTemplateStyle = flutterNativeTemplateStyle;
            return this;
        }

        public Builder setRequest(FlutterAdRequest flutterAdRequest) {
            this.request = flutterAdRequest;
            return this;
        }
    }

    protected FlutterNativeAd(Context context, int i10, AdInstanceManager adInstanceManager, String str, GoogleMobileAdsPlugin.NativeAdFactory nativeAdFactory, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader, Map<String, Object> map, FlutterNativeAdOptions flutterNativeAdOptions, FlutterNativeTemplateStyle flutterNativeTemplateStyle) {
        super(i10);
        this.context = context;
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adFactory = nativeAdFactory;
        this.adManagerRequest = flutterAdManagerAdRequest;
        this.flutterAdLoader = flutterAdLoader;
        this.customOptions = map;
        this.nativeAdOptions = flutterNativeAdOptions;
        this.nativeTemplateStyle = flutterNativeTemplateStyle;
    }

    protected FlutterNativeAd(Context context, int i10, AdInstanceManager adInstanceManager, String str, GoogleMobileAdsPlugin.NativeAdFactory nativeAdFactory, FlutterAdRequest flutterAdRequest, FlutterAdLoader flutterAdLoader, Map<String, Object> map, FlutterNativeAdOptions flutterNativeAdOptions, FlutterNativeTemplateStyle flutterNativeTemplateStyle) {
        super(i10);
        this.context = context;
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adFactory = nativeAdFactory;
        this.request = flutterAdRequest;
        this.flutterAdLoader = flutterAdLoader;
        this.customOptions = map;
        this.nativeAdOptions = flutterNativeAdOptions;
        this.nativeTemplateStyle = flutterNativeTemplateStyle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        NativeAdView nativeAdView = this.nativeAdView;
        if (nativeAdView != null) {
            nativeAdView.a();
            this.nativeAdView = null;
        }
        TemplateView templateView = this.templateView;
        if (templateView != null) {
            templateView.c();
            this.templateView = null;
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public PlatformView getPlatformView() {
        NativeAdView nativeAdView = this.nativeAdView;
        if (nativeAdView != null) {
            return new FlutterPlatformView(nativeAdView);
        }
        TemplateView templateView = this.templateView;
        if (templateView != null) {
            return new FlutterPlatformView(templateView);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        FlutterNativeAdLoadedListener flutterNativeAdLoadedListener = new FlutterNativeAdLoadedListener(this);
        FlutterNativeAdListener flutterNativeAdListener = new FlutterNativeAdListener(this.adId, this.manager);
        FlutterNativeAdOptions flutterNativeAdOptions = this.nativeAdOptions;
        c a10 = flutterNativeAdOptions == null ? new c.a().a() : flutterNativeAdOptions.asNativeAdOptions();
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader.loadNativeAd(str, flutterNativeAdLoadedListener, a10, flutterNativeAdListener, flutterAdRequest.asAdRequest(str));
        } else {
            FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerRequest;
            if (flutterAdManagerAdRequest != null) {
                this.flutterAdLoader.loadAdManagerNativeAd(this.adUnitId, flutterNativeAdLoadedListener, a10, flutterNativeAdListener, flutterAdManagerAdRequest.asAdManagerAdRequest(this.adUnitId));
            } else {
                Log.e(TAG, "A null or invalid ad request was provided.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onNativeAdLoaded(b bVar) {
        FlutterNativeTemplateStyle flutterNativeTemplateStyle = this.nativeTemplateStyle;
        if (flutterNativeTemplateStyle != null) {
            TemplateView asTemplateView = flutterNativeTemplateStyle.asTemplateView(this.context);
            this.templateView = asTemplateView;
            asTemplateView.setNativeAd(bVar);
        } else {
            this.nativeAdView = this.adFactory.createNativeAd(bVar, this.customOptions);
        }
        bVar.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, bVar.getResponseInfo());
    }
}
