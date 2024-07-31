package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.nativead.NativeAdView;
import e9.b;
import e9.c;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterAdSize;
import io.flutter.plugins.googlemobileads.FlutterNativeAd;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateStyle;
import io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x8.d;
import x8.i;
import x8.s;
import x8.y;

/* loaded from: classes3.dex */
public class GoogleMobileAdsPlugin implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler {
    private static final String TAG = "GoogleMobileAdsPlugin";
    private AdMessageCodec adMessageCodec;
    private AppStateNotifier appStateNotifier;
    private final FlutterMobileAdsWrapper flutterMobileAds;
    private AdInstanceManager instanceManager;
    private MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
    private final Map<String, NativeAdFactory> nativeAdFactories;
    private FlutterPlugin.FlutterPluginBinding pluginBinding;
    private UserMessagingPlatformManager userMessagingPlatformManager;

    /* renamed from: io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin$1 */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements s {
        final /* synthetic */ MethodChannel.Result val$result;

        AnonymousClass1(MethodChannel.Result result) {
            r2 = result;
        }

        @Override // x8.s
        public void onAdInspectorClosed(d dVar) {
            if (dVar == null) {
                r2.success(null);
            } else {
                r2.error(Integer.toString(dVar.a()), dVar.c(), dVar.b());
            }
        }
    }

    /* loaded from: classes3.dex */
    private static final class FlutterInitializationListener implements c {
        private boolean isInitializationCompleted;
        private final MethodChannel.Result result;

        private FlutterInitializationListener(MethodChannel.Result result) {
            this.result = result;
            this.isInitializationCompleted = false;
        }

        /* synthetic */ FlutterInitializationListener(MethodChannel.Result result, AnonymousClass1 anonymousClass1) {
            this(result);
        }

        @Override // e9.c
        public void onInitializationComplete(b bVar) {
            if (this.isInitializationCompleted) {
                return;
            }
            try {
                Method declaredMethod = MobileAds.class.getDeclaredMethod("setPlugin", String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, Constants.REQUEST_AGENT_PREFIX_VERSIONED);
            } catch (Exception unused) {
            }
            this.result.success(new FlutterInitializationStatus(bVar));
            this.isInitializationCompleted = true;
        }
    }

    /* loaded from: classes3.dex */
    public interface NativeAdFactory {
        NativeAdView createNativeAd(com.google.android.gms.ads.nativead.b bVar, Map<String, Object> map);
    }

    public GoogleMobileAdsPlugin() {
        this.nativeAdFactories = new HashMap();
        this.flutterMobileAds = new FlutterMobileAdsWrapper();
    }

    protected GoogleMobileAdsPlugin(FlutterPlugin.FlutterPluginBinding flutterPluginBinding, AdInstanceManager adInstanceManager, FlutterMobileAdsWrapper flutterMobileAdsWrapper) {
        this.nativeAdFactories = new HashMap();
        this.pluginBinding = flutterPluginBinding;
        this.instanceManager = adInstanceManager;
        this.flutterMobileAds = flutterMobileAdsWrapper;
    }

    protected GoogleMobileAdsPlugin(AppStateNotifier appStateNotifier) {
        this.nativeAdFactories = new HashMap();
        this.appStateNotifier = appStateNotifier;
        this.flutterMobileAds = new FlutterMobileAdsWrapper();
    }

    private boolean addNativeAdFactory(String str, NativeAdFactory nativeAdFactory) {
        if (this.nativeAdFactories.containsKey(str)) {
            Log.e(GoogleMobileAdsPlugin.class.getSimpleName(), String.format("A NativeAdFactory with the following factoryId already exists: %s", str));
            return false;
        }
        this.nativeAdFactories.put(str, nativeAdFactory);
        return true;
    }

    @Deprecated
    public static boolean registerMediationNetworkExtrasProvider(FlutterEngine flutterEngine, MediationNetworkExtrasProvider mediationNetworkExtrasProvider) {
        GoogleMobileAdsPlugin googleMobileAdsPlugin = (GoogleMobileAdsPlugin) flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class);
        if (googleMobileAdsPlugin == null) {
            return false;
        }
        googleMobileAdsPlugin.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider;
        AdMessageCodec adMessageCodec = googleMobileAdsPlugin.adMessageCodec;
        if (adMessageCodec == null) {
            return true;
        }
        adMessageCodec.setMediationNetworkExtrasProvider(mediationNetworkExtrasProvider);
        return true;
    }

    public static boolean registerNativeAdFactory(FlutterEngine flutterEngine, String str, NativeAdFactory nativeAdFactory) {
        return registerNativeAdFactory((GoogleMobileAdsPlugin) flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class), str, nativeAdFactory);
    }

    private static boolean registerNativeAdFactory(GoogleMobileAdsPlugin googleMobileAdsPlugin, String str, NativeAdFactory nativeAdFactory) {
        if (googleMobileAdsPlugin != null) {
            return googleMobileAdsPlugin.addNativeAdFactory(str, nativeAdFactory);
        }
        throw new IllegalStateException(String.format("Could not find a %s instance. The plugin may have not been registered.", GoogleMobileAdsPlugin.class.getSimpleName()));
    }

    private NativeAdFactory removeNativeAdFactory(String str) {
        return this.nativeAdFactories.remove(str);
    }

    private static <T> T requireNonNull(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public static void unregisterMediationNetworkExtrasProvider(FlutterEngine flutterEngine) {
        GoogleMobileAdsPlugin googleMobileAdsPlugin = (GoogleMobileAdsPlugin) flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class);
        if (googleMobileAdsPlugin == null) {
            return;
        }
        AdMessageCodec adMessageCodec = googleMobileAdsPlugin.adMessageCodec;
        if (adMessageCodec != null) {
            adMessageCodec.setMediationNetworkExtrasProvider(null);
        }
        googleMobileAdsPlugin.mediationNetworkExtrasProvider = null;
    }

    public static NativeAdFactory unregisterNativeAdFactory(FlutterEngine flutterEngine, String str) {
        FlutterPlugin flutterPlugin = flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class);
        if (flutterPlugin != null) {
            return ((GoogleMobileAdsPlugin) flutterPlugin).removeNativeAdFactory(str);
        }
        return null;
    }

    BannerAdCreator getBannerAdCreator(Context context) {
        return new BannerAdCreator(context);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(activityPluginBinding.getActivity());
        }
        AdMessageCodec adMessageCodec = this.adMessageCodec;
        if (adMessageCodec != null) {
            adMessageCodec.setContext(activityPluginBinding.getActivity());
        }
        UserMessagingPlatformManager userMessagingPlatformManager = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager != null) {
            userMessagingPlatformManager.setActivity(activityPluginBinding.getActivity());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
        AdMessageCodec adMessageCodec = new AdMessageCodec(flutterPluginBinding.getApplicationContext(), new FlutterRequestAgentProvider(flutterPluginBinding.getApplicationContext()));
        this.adMessageCodec = adMessageCodec;
        MediationNetworkExtrasProvider mediationNetworkExtrasProvider = this.mediationNetworkExtrasProvider;
        if (mediationNetworkExtrasProvider != null) {
            adMessageCodec.setMediationNetworkExtrasProvider(mediationNetworkExtrasProvider);
        }
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "plugins.flutter.io/google_mobile_ads", new StandardMethodCodec(this.adMessageCodec));
        methodChannel.setMethodCallHandler(this);
        this.instanceManager = new AdInstanceManager(methodChannel);
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("plugins.flutter.io/google_mobile_ads/ad_widget", new GoogleMobileAdsViewFactory(this.instanceManager));
        this.appStateNotifier = new AppStateNotifier(flutterPluginBinding.getBinaryMessenger());
        this.userMessagingPlatformManager = new UserMessagingPlatformManager(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
        AdMessageCodec adMessageCodec = this.adMessageCodec;
        if (adMessageCodec != null && (flutterPluginBinding = this.pluginBinding) != null) {
            adMessageCodec.setContext(flutterPluginBinding.getApplicationContext());
        }
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(null);
        }
        UserMessagingPlatformManager userMessagingPlatformManager = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager != null) {
            userMessagingPlatformManager.setActivity(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
        AdMessageCodec adMessageCodec = this.adMessageCodec;
        if (adMessageCodec != null && (flutterPluginBinding = this.pluginBinding) != null) {
            adMessageCodec.setContext(flutterPluginBinding.getApplicationContext());
        }
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(null);
        }
        UserMessagingPlatformManager userMessagingPlatformManager = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager != null) {
            userMessagingPlatformManager.setActivity(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AppStateNotifier appStateNotifier = this.appStateNotifier;
        if (appStateNotifier != null) {
            appStateNotifier.stop();
            this.appStateNotifier = null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:89:0x0196. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        FlutterRewardedAd flutterRewardedAd;
        Object requestConfiguration;
        String format;
        String str;
        String str2;
        FlutterRewardedInterstitialAd flutterRewardedInterstitialAd;
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager == null || this.pluginBinding == null) {
            Log.e(TAG, "method call received before instanceManager initialized: " + methodCall.method);
            return;
        }
        Context activity = adInstanceManager.getActivity() != null ? this.instanceManager.getActivity() : this.pluginBinding.getApplicationContext();
        String str3 = methodCall.method;
        str3.hashCode();
        char c10 = 65535;
        switch (str3.hashCode()) {
            case -1959534605:
                if (str3.equals("MobileAds#openDebugMenu")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1941808395:
                if (str3.equals("loadInterstitialAd")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1826439721:
                if (str3.equals("MobileAds#setAppMuted")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1771320504:
                if (str3.equals("loadAppOpenAd")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1557947903:
                if (str3.equals("MobileAds#registerWebView")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1548893609:
                if (str3.equals("loadRewardedAd")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1395015128:
                if (str3.equals("MobileAds#getRequestConfiguration")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1273455673:
                if (str3.equals("loadFluidAd")) {
                    c10 = 7;
                    break;
                }
                break;
            case -965504608:
                if (str3.equals("loadNativeAd")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -918684377:
                if (str3.equals("setServerSideVerificationOptions")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -768079951:
                if (str3.equals("AdSize#getAnchoredAdaptiveBannerAdSize")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -676596397:
                if (str3.equals("loadAdManagerInterstitialAd")) {
                    c10 = 11;
                    break;
                }
                break;
            case -572043403:
                if (str3.equals("loadBannerAd")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -533157842:
                if (str3.equals("MobileAds#setAppVolume")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -436783448:
                if (str3.equals("MobileAds#getVersionString")) {
                    c10 = 14;
                    break;
                }
                break;
            case -172783533:
                if (str3.equals("loadAdManagerBannerAd")) {
                    c10 = 15;
                    break;
                }
                break;
            case 90971631:
                if (str3.equals("_init")) {
                    c10 = 16;
                    break;
                }
                break;
            case 250880674:
                if (str3.equals("disposeAd")) {
                    c10 = 17;
                    break;
                }
                break;
            case 273004986:
                if (str3.equals("getAdSize")) {
                    c10 = 18;
                    break;
                }
                break;
            case 288452133:
                if (str3.equals("MobileAds#updateRequestConfiguration")) {
                    c10 = 19;
                    break;
                }
                break;
            case 316173893:
                if (str3.equals("MobileAds#disableMediationInitialization")) {
                    c10 = 20;
                    break;
                }
                break;
            case 1064076149:
                if (str3.equals("MobileAds#openAdInspector")) {
                    c10 = 21;
                    break;
                }
                break;
            case 1355848557:
                if (str3.equals("showAdWithoutView")) {
                    c10 = 22;
                    break;
                }
                break;
            case 1403601573:
                if (str3.equals("MobileAds#initialize")) {
                    c10 = 23;
                    break;
                }
                break;
            case 1661969852:
                if (str3.equals("setImmersiveMode")) {
                    c10 = 24;
                    break;
                }
                break;
            case 1882741923:
                if (str3.equals("loadRewardedInterstitialAd")) {
                    c10 = 25;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.flutterMobileAds.openDebugMenu(activity, (String) methodCall.argument("adUnitId"));
                result.success(null);
                return;
            case 1:
                FlutterInterstitialAd flutterInterstitialAd = new FlutterInterstitialAd(((Integer) methodCall.argument("adId")).intValue(), this.instanceManager, (String) methodCall.argument("adUnitId"), (FlutterAdRequest) methodCall.argument("request"), new FlutterAdLoader(activity));
                this.instanceManager.trackAd(flutterInterstitialAd, ((Integer) methodCall.argument("adId")).intValue());
                flutterInterstitialAd.load();
                result.success(null);
                return;
            case 2:
                this.flutterMobileAds.setAppMuted(((Boolean) methodCall.argument("muted")).booleanValue());
                result.success(null);
                return;
            case 3:
                FlutterAppOpenAd flutterAppOpenAd = new FlutterAppOpenAd(((Integer) methodCall.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), (String) requireNonNull((String) methodCall.argument("adUnitId")), (FlutterAdRequest) methodCall.argument("request"), (FlutterAdManagerAdRequest) methodCall.argument("adManagerRequest"), new FlutterAdLoader(activity));
                this.instanceManager.trackAd(flutterAppOpenAd, ((Integer) methodCall.argument("adId")).intValue());
                flutterAppOpenAd.load();
                result.success(null);
                return;
            case 4:
                this.flutterMobileAds.registerWebView(((Integer) methodCall.argument("webViewId")).intValue(), this.pluginBinding.getFlutterEngine());
                result.success(null);
                return;
            case 5:
                String str4 = (String) requireNonNull((String) methodCall.argument("adUnitId"));
                FlutterAdRequest flutterAdRequest = (FlutterAdRequest) methodCall.argument("request");
                FlutterAdManagerAdRequest flutterAdManagerAdRequest = (FlutterAdManagerAdRequest) methodCall.argument("adManagerRequest");
                if (flutterAdRequest == null) {
                    if (flutterAdManagerAdRequest != null) {
                        flutterRewardedAd = new FlutterRewardedAd(((Integer) methodCall.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str4, flutterAdManagerAdRequest, new FlutterAdLoader(activity));
                    }
                    result.error("InvalidRequest", "A null or invalid ad request was provided.", null);
                    return;
                }
                flutterRewardedAd = new FlutterRewardedAd(((Integer) methodCall.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str4, flutterAdRequest, new FlutterAdLoader(activity));
                this.instanceManager.trackAd(flutterRewardedAd, ((Integer) requireNonNull((Integer) methodCall.argument("adId"))).intValue());
                flutterRewardedAd.load();
                result.success(null);
                return;
            case 6:
                requestConfiguration = this.flutterMobileAds.getRequestConfiguration();
                result.success(requestConfiguration);
                return;
            case 7:
                FluidAdManagerBannerAd fluidAdManagerBannerAd = new FluidAdManagerBannerAd(((Integer) methodCall.argument("adId")).intValue(), this.instanceManager, (String) methodCall.argument("adUnitId"), (FlutterAdManagerAdRequest) methodCall.argument("request"), getBannerAdCreator(activity));
                this.instanceManager.trackAd(fluidAdManagerBannerAd, ((Integer) methodCall.argument("adId")).intValue());
                fluidAdManagerBannerAd.load();
                result.success(null);
                return;
            case '\b':
                String str5 = (String) methodCall.argument("factoryId");
                NativeAdFactory nativeAdFactory = this.nativeAdFactories.get(str5);
                FlutterNativeTemplateStyle flutterNativeTemplateStyle = (FlutterNativeTemplateStyle) methodCall.argument("nativeTemplateStyle");
                if (nativeAdFactory == null && flutterNativeTemplateStyle == null) {
                    format = String.format("No NativeAdFactory with id: %s or nativeTemplateStyle", str5);
                    str = "NativeAdError";
                    result.error(str, format, null);
                    return;
                } else {
                    FlutterNativeAd build = new FlutterNativeAd.Builder(activity).setManager(this.instanceManager).setAdUnitId((String) methodCall.argument("adUnitId")).setAdFactory(nativeAdFactory).setRequest((FlutterAdRequest) methodCall.argument("request")).setAdManagerRequest((FlutterAdManagerAdRequest) methodCall.argument("adManagerRequest")).setCustomOptions((Map) methodCall.argument("customOptions")).setId(((Integer) methodCall.argument("adId")).intValue()).setNativeAdOptions((FlutterNativeAdOptions) methodCall.argument("nativeAdOptions")).setFlutterAdLoader(new FlutterAdLoader(activity)).setNativeTemplateStyle((FlutterNativeTemplateStyle) methodCall.argument("nativeTemplateStyle")).build();
                    this.instanceManager.trackAd(build, ((Integer) methodCall.argument("adId")).intValue());
                    build.load();
                    result.success(null);
                    return;
                }
            case '\t':
                FlutterAd adForId = this.instanceManager.adForId(((Integer) methodCall.argument("adId")).intValue());
                FlutterServerSideVerificationOptions flutterServerSideVerificationOptions = (FlutterServerSideVerificationOptions) methodCall.argument("serverSideVerificationOptions");
                if (adForId != null) {
                    if (adForId instanceof FlutterRewardedAd) {
                        ((FlutterRewardedAd) adForId).setServerSideVerificationOptions(flutterServerSideVerificationOptions);
                    } else if (adForId instanceof FlutterRewardedInterstitialAd) {
                        ((FlutterRewardedInterstitialAd) adForId).setServerSideVerificationOptions(flutterServerSideVerificationOptions);
                    } else {
                        str2 = "Error - setServerSideVerificationOptions called on non-rewarded ad";
                    }
                    result.success(null);
                    return;
                }
                str2 = "Error - null ad in setServerSideVerificationOptions";
                Log.w(TAG, str2);
                result.success(null);
                return;
            case '\n':
                FlutterAdSize.AnchoredAdaptiveBannerAdSize anchoredAdaptiveBannerAdSize = new FlutterAdSize.AnchoredAdaptiveBannerAdSize(activity, new FlutterAdSize.AdSizeFactory(), (String) methodCall.argument("orientation"), ((Integer) methodCall.argument("width")).intValue());
                if (!i.f30686q.equals(anchoredAdaptiveBannerAdSize.size)) {
                    requestConfiguration = Integer.valueOf(anchoredAdaptiveBannerAdSize.height);
                    result.success(requestConfiguration);
                    return;
                }
                result.success(null);
                return;
            case 11:
                FlutterAdManagerInterstitialAd flutterAdManagerInterstitialAd = new FlutterAdManagerInterstitialAd(((Integer) methodCall.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), (String) requireNonNull((String) methodCall.argument("adUnitId")), (FlutterAdManagerAdRequest) methodCall.argument("request"), new FlutterAdLoader(activity));
                this.instanceManager.trackAd(flutterAdManagerInterstitialAd, ((Integer) requireNonNull((Integer) methodCall.argument("adId"))).intValue());
                flutterAdManagerInterstitialAd.load();
                result.success(null);
                return;
            case '\f':
                FlutterBannerAd flutterBannerAd = new FlutterBannerAd(((Integer) methodCall.argument("adId")).intValue(), this.instanceManager, (String) methodCall.argument("adUnitId"), (FlutterAdRequest) methodCall.argument("request"), (FlutterAdSize) methodCall.argument("size"), getBannerAdCreator(activity));
                this.instanceManager.trackAd(flutterBannerAd, ((Integer) methodCall.argument("adId")).intValue());
                flutterBannerAd.load();
                result.success(null);
                return;
            case '\r':
                this.flutterMobileAds.setAppVolume(((Double) methodCall.argument("volume")).doubleValue());
                result.success(null);
                return;
            case 14:
                requestConfiguration = this.flutterMobileAds.getVersionString();
                result.success(requestConfiguration);
                return;
            case 15:
                FlutterAdManagerBannerAd flutterAdManagerBannerAd = new FlutterAdManagerBannerAd(((Integer) methodCall.argument("adId")).intValue(), this.instanceManager, (String) methodCall.argument("adUnitId"), (List) methodCall.argument("sizes"), (FlutterAdManagerAdRequest) methodCall.argument("request"), getBannerAdCreator(activity));
                this.instanceManager.trackAd(flutterAdManagerBannerAd, ((Integer) methodCall.argument("adId")).intValue());
                flutterAdManagerBannerAd.load();
                result.success(null);
                return;
            case 16:
                this.instanceManager.disposeAllAds();
                result.success(null);
                return;
            case 17:
                this.instanceManager.disposeAd(((Integer) methodCall.argument("adId")).intValue());
                result.success(null);
                return;
            case 18:
                FlutterAd adForId2 = this.instanceManager.adForId(((Integer) methodCall.argument("adId")).intValue());
                if (adForId2 != null) {
                    if (adForId2 instanceof FlutterBannerAd) {
                        requestConfiguration = ((FlutterBannerAd) adForId2).getAdSize();
                    } else {
                        if (!(adForId2 instanceof FlutterAdManagerBannerAd)) {
                            format = "Unexpected ad type for getAdSize: " + adForId2;
                            str = "unexpected_ad_type";
                            result.error(str, format, null);
                            return;
                        }
                        requestConfiguration = ((FlutterAdManagerBannerAd) adForId2).getAdSize();
                    }
                    result.success(requestConfiguration);
                    return;
                }
                result.success(null);
                return;
            case 19:
                y.a f10 = MobileAds.b().f();
                String str6 = (String) methodCall.argument("maxAdContentRating");
                Integer num = (Integer) methodCall.argument("tagForChildDirectedTreatment");
                Integer num2 = (Integer) methodCall.argument("tagForUnderAgeOfConsent");
                List<String> list = (List) methodCall.argument("testDeviceIds");
                if (str6 != null) {
                    f10.b(str6);
                }
                if (num != null) {
                    f10.c(num.intValue());
                }
                if (num2 != null) {
                    f10.d(num2.intValue());
                }
                if (list != null) {
                    f10.e(list);
                }
                MobileAds.k(f10.a());
                result.success(null);
                return;
            case 20:
                this.flutterMobileAds.disableMediationInitialization(activity);
                result.success(null);
                return;
            case 21:
                this.flutterMobileAds.openAdInspector(activity, new s() { // from class: io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin.1
                    final /* synthetic */ MethodChannel.Result val$result;

                    AnonymousClass1(MethodChannel.Result result2) {
                        r2 = result2;
                    }

                    @Override // x8.s
                    public void onAdInspectorClosed(d dVar) {
                        if (dVar == null) {
                            r2.success(null);
                        } else {
                            r2.error(Integer.toString(dVar.a()), dVar.c(), dVar.b());
                        }
                    }
                });
                return;
            case 22:
                if (!this.instanceManager.showAdWithId(((Integer) methodCall.argument("adId")).intValue())) {
                    result2.error("AdShowError", "Ad failed to show.", null);
                    return;
                }
                result2.success(null);
                return;
            case 23:
                this.flutterMobileAds.initialize(activity, new FlutterInitializationListener(result2));
                return;
            case 24:
                ((FlutterAd.FlutterOverlayAd) this.instanceManager.adForId(((Integer) methodCall.argument("adId")).intValue())).setImmersiveMode(((Boolean) methodCall.argument("immersiveModeEnabled")).booleanValue());
                result2.success(null);
                return;
            case 25:
                String str7 = (String) requireNonNull((String) methodCall.argument("adUnitId"));
                FlutterAdRequest flutterAdRequest2 = (FlutterAdRequest) methodCall.argument("request");
                FlutterAdManagerAdRequest flutterAdManagerAdRequest2 = (FlutterAdManagerAdRequest) methodCall.argument("adManagerRequest");
                if (flutterAdRequest2 == null) {
                    if (flutterAdManagerAdRequest2 != null) {
                        flutterRewardedInterstitialAd = new FlutterRewardedInterstitialAd(((Integer) methodCall.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str7, flutterAdManagerAdRequest2, new FlutterAdLoader(activity));
                    }
                    result2.error("InvalidRequest", "A null or invalid ad request was provided.", null);
                    return;
                }
                flutterRewardedInterstitialAd = new FlutterRewardedInterstitialAd(((Integer) methodCall.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str7, flutterAdRequest2, new FlutterAdLoader(activity));
                this.instanceManager.trackAd(flutterRewardedInterstitialAd, ((Integer) requireNonNull((Integer) methodCall.argument("adId"))).intValue());
                flutterRewardedInterstitialAd.load();
                result2.success(null);
                return;
            default:
                result2.notImplemented();
                return;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(activityPluginBinding.getActivity());
        }
        AdMessageCodec adMessageCodec = this.adMessageCodec;
        if (adMessageCodec != null) {
            adMessageCodec.setContext(activityPluginBinding.getActivity());
        }
        UserMessagingPlatformManager userMessagingPlatformManager = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager != null) {
            userMessagingPlatformManager.setActivity(activityPluginBinding.getActivity());
        }
    }
}
