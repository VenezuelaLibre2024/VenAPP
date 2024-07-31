.class public Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;,
        Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$FlutterInitializationListener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "GoogleMobileAdsPlugin"


# instance fields
.field private adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

.field private appStateNotifier:Lio/flutter/plugins/googlemobileads/AppStateNotifier;

.field private final flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

.field private instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

.field private mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

.field private final nativeAdFactories:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;",
            ">;"
        }
    .end annotation
.end field

.field private pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

.field private userMessagingPlatformManager:Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-direct {v0}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    return-void
.end method

.method protected constructor <init>(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;Lio/flutter/plugins/googlemobileads/AdInstanceManager;Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    return-void
.end method

.method protected constructor <init>(Lio/flutter/plugins/googlemobileads/AppStateNotifier;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->appStateNotifier:Lio/flutter/plugins/googlemobileads/AppStateNotifier;

    new-instance p1, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-direct {p1}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    return-void
.end method

.method private addNativeAdFactory(Ljava/lang/String;Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;)Z
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    new-array p2, v1, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p1, p2, v0

    const-string p1, "A NativeAdFactory with the following factoryId already exists: %s"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-class p2, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1
.end method

.method public static registerMediationNetworkExtrasProvider(Lio/flutter/embedding/engine/FlutterEngine;Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getPlugins()Lio/flutter/embedding/engine/plugins/PluginRegistry;

    move-result-object p0

    const-class v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    invoke-interface {p0, v0}, Lio/flutter/embedding/engine/plugins/PluginRegistry;->get(Ljava/lang/Class;)Lio/flutter/embedding/engine/plugins/FlutterPlugin;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    iget-object p0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setMediationNetworkExtrasProvider(Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)V

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static registerNativeAdFactory(Lio/flutter/embedding/engine/FlutterEngine;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;)Z
    .locals 1

    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getPlugins()Lio/flutter/embedding/engine/plugins/PluginRegistry;

    move-result-object p0

    const-class v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    invoke-interface {p0, v0}, Lio/flutter/embedding/engine/plugins/PluginRegistry;->get(Ljava/lang/Class;)Lio/flutter/embedding/engine/plugins/FlutterPlugin;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    invoke-static {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->registerNativeAdFactory(Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;)Z

    move-result p0

    return p0
.end method

.method private static registerNativeAdFactory(Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->addNativeAdFactory(Ljava/lang/String;Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x1

    new-array p0, p0, [Ljava/lang/Object;

    const-class p1, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    aput-object p1, p0, p2

    const-string p1, "Could not find a %s instance. The plugin may have not been registered."

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private removeNativeAdFactory(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;

    return-object p1
.end method

.method private static requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)TT;"
        }
    .end annotation

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static unregisterMediationNetworkExtrasProvider(Lio/flutter/embedding/engine/FlutterEngine;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getPlugins()Lio/flutter/embedding/engine/plugins/PluginRegistry;

    move-result-object p0

    const-class v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    invoke-interface {p0, v0}, Lio/flutter/embedding/engine/plugins/PluginRegistry;->get(Ljava/lang/Class;)Lio/flutter/embedding/engine/plugins/FlutterPlugin;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    if-nez p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setMediationNetworkExtrasProvider(Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)V

    :cond_1
    iput-object v1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    return-void
.end method

.method public static unregisterNativeAdFactory(Lio/flutter/embedding/engine/FlutterEngine;Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;
    .locals 1

    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getPlugins()Lio/flutter/embedding/engine/plugins/PluginRegistry;

    move-result-object p0

    const-class v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    invoke-interface {p0, v0}, Lio/flutter/embedding/engine/plugins/PluginRegistry;->get(Ljava/lang/Class;)Lio/flutter/embedding/engine/plugins/FlutterPlugin;

    move-result-object p0

    if-eqz p0, :cond_0

    check-cast p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->removeNativeAdFactory(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method getBannerAdCreator(Landroid/content/Context;)Lio/flutter/plugins/googlemobileads/BannerAdCreator;
    .locals 1

    new-instance v0, Lio/flutter/plugins/googlemobileads/BannerAdCreator;

    invoke-direct {v0, p1}, Lio/flutter/plugins/googlemobileads/BannerAdCreator;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->setActivity(Landroid/app/Activity;)V

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setContext(Landroid/content/Context;)V

    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->userMessagingPlatformManager:Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;->setActivity(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 4

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    new-instance v0, Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;-><init>(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterRequestAgentProvider;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->mediationNetworkExtrasProvider:Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setMediationNetworkExtrasProvider(Lio/flutter/plugins/googlemobileads/MediationNetworkExtrasProvider;)V

    :cond_0
    new-instance v0, Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    new-instance v2, Lio/flutter/plugin/common/StandardMethodCodec;

    iget-object v3, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    invoke-direct {v2, v3}, Lio/flutter/plugin/common/StandardMethodCodec;-><init>(Lio/flutter/plugin/common/StandardMessageCodec;)V

    const-string v3, "plugins.flutter.io/google_mobile_ads"

    invoke-direct {v0, v1, v3, v2}, Lio/flutter/plugin/common/MethodChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;Lio/flutter/plugin/common/MethodCodec;)V

    invoke-virtual {v0, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    new-instance v1, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-direct {v1, v0}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;-><init>(Lio/flutter/plugin/common/MethodChannel;)V

    iput-object v1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getPlatformViewRegistry()Lio/flutter/plugin/platform/PlatformViewRegistry;

    move-result-object v0

    new-instance v1, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsViewFactory;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-direct {v1, v2}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsViewFactory;-><init>(Lio/flutter/plugins/googlemobileads/AdInstanceManager;)V

    const-string v2, "plugins.flutter.io/google_mobile_ads/ad_widget"

    invoke-interface {v0, v2, v1}, Lio/flutter/plugin/platform/PlatformViewRegistry;->registerViewFactory(Ljava/lang/String;Lio/flutter/plugin/platform/PlatformViewFactory;)Z

    new-instance v0, Lio/flutter/plugins/googlemobileads/AppStateNotifier;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/flutter/plugins/googlemobileads/AppStateNotifier;-><init>(Lio/flutter/plugin/common/BinaryMessenger;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->appStateNotifier:Lio/flutter/plugins/googlemobileads/AppStateNotifier;

    new-instance v0, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Landroid/content/Context;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->userMessagingPlatformManager:Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setContext(Landroid/content/Context;)V

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->setActivity(Landroid/app/Activity;)V

    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->userMessagingPlatformManager:Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;->setActivity(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setContext(Landroid/content/Context;)V

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->setActivity(Landroid/app/Activity;)V

    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->userMessagingPlatformManager:Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;->setActivity(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->appStateNotifier:Lio/flutter/plugins/googlemobileads/AppStateNotifier;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/flutter/plugins/googlemobileads/AppStateNotifier;->stop()V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->appStateNotifier:Lio/flutter/plugins/googlemobileads/AppStateNotifier;

    :cond_0
    return-void
.end method

.method public onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    const-string v4, "GoogleMobileAdsPlugin"

    if-eqz v3, :cond_2c

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    if-nez v5, :cond_0

    goto/16 :goto_9

    :cond_0
    invoke-virtual {v3}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->getActivity()Landroid/app/Activity;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v3}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->getActivity()Landroid/app/Activity;

    move-result-object v3

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    invoke-virtual {v3}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    :goto_0
    iget-object v5, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, -0x1

    sparse-switch v6, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v6, "loadRewardedInterstitialAd"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v9, 0x19

    goto/16 :goto_1

    :sswitch_1
    const-string v6, "setImmersiveMode"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v9, 0x18

    goto/16 :goto_1

    :sswitch_2
    const-string v6, "MobileAds#initialize"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v9, 0x17

    goto/16 :goto_1

    :sswitch_3
    const-string v6, "showAdWithoutView"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v9, 0x16

    goto/16 :goto_1

    :sswitch_4
    const-string v6, "MobileAds#openAdInspector"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v9, 0x15

    goto/16 :goto_1

    :sswitch_5
    const-string v6, "MobileAds#disableMediationInitialization"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v9, 0x14

    goto/16 :goto_1

    :sswitch_6
    const-string v6, "MobileAds#updateRequestConfiguration"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v9, 0x13

    goto/16 :goto_1

    :sswitch_7
    const-string v6, "getAdSize"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    goto/16 :goto_1

    :cond_9
    const/16 v9, 0x12

    goto/16 :goto_1

    :sswitch_8
    const-string v6, "disposeAd"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    goto/16 :goto_1

    :cond_a
    const/16 v9, 0x11

    goto/16 :goto_1

    :sswitch_9
    const-string v6, "_init"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_1

    :cond_b
    const/16 v9, 0x10

    goto/16 :goto_1

    :sswitch_a
    const-string v6, "loadAdManagerBannerAd"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    goto/16 :goto_1

    :cond_c
    const/16 v9, 0xf

    goto/16 :goto_1

    :sswitch_b
    const-string v6, "MobileAds#getVersionString"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    goto/16 :goto_1

    :cond_d
    const/16 v9, 0xe

    goto/16 :goto_1

    :sswitch_c
    const-string v6, "MobileAds#setAppVolume"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    goto/16 :goto_1

    :cond_e
    const/16 v9, 0xd

    goto/16 :goto_1

    :sswitch_d
    const-string v6, "loadBannerAd"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    goto/16 :goto_1

    :cond_f
    const/16 v9, 0xc

    goto/16 :goto_1

    :sswitch_e
    const-string v6, "loadAdManagerInterstitialAd"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    goto/16 :goto_1

    :cond_10
    const/16 v9, 0xb

    goto/16 :goto_1

    :sswitch_f
    const-string v6, "AdSize#getAnchoredAdaptiveBannerAdSize"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    goto/16 :goto_1

    :cond_11
    const/16 v9, 0xa

    goto/16 :goto_1

    :sswitch_10
    const-string v6, "setServerSideVerificationOptions"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    goto/16 :goto_1

    :cond_12
    const/16 v9, 0x9

    goto/16 :goto_1

    :sswitch_11
    const-string v6, "loadNativeAd"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    goto/16 :goto_1

    :cond_13
    const/16 v9, 0x8

    goto/16 :goto_1

    :sswitch_12
    const-string v6, "loadFluidAd"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    goto :goto_1

    :cond_14
    const/4 v9, 0x7

    goto :goto_1

    :sswitch_13
    const-string v6, "MobileAds#getRequestConfiguration"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    goto :goto_1

    :cond_15
    const/4 v9, 0x6

    goto :goto_1

    :sswitch_14
    const-string v6, "loadRewardedAd"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    goto :goto_1

    :cond_16
    const/4 v9, 0x5

    goto :goto_1

    :sswitch_15
    const-string v6, "MobileAds#registerWebView"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_17

    goto :goto_1

    :cond_17
    const/4 v9, 0x4

    goto :goto_1

    :sswitch_16
    const-string v6, "loadAppOpenAd"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_18

    goto :goto_1

    :cond_18
    const/4 v9, 0x3

    goto :goto_1

    :sswitch_17
    const-string v6, "MobileAds#setAppMuted"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_19

    goto :goto_1

    :cond_19
    const/4 v9, 0x2

    goto :goto_1

    :sswitch_18
    const-string v6, "loadInterstitialAd"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1a

    goto :goto_1

    :cond_1a
    move v9, v7

    goto :goto_1

    :sswitch_19
    const-string v6, "MobileAds#openDebugMenu"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1b

    goto :goto_1

    :cond_1b
    move v9, v8

    :goto_1
    const-string v5, "A null or invalid ad request was provided."

    const-string v6, "InvalidRequest"

    const-string v10, "adManagerRequest"

    const-string v11, "request"

    const-string v12, "adUnitId"

    const-string v13, "adId"

    const/4 v14, 0x0

    packed-switch v9, :pswitch_data_0

    invoke-interface/range {p2 .. p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    goto/16 :goto_8

    :pswitch_0
    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v18, v4

    check-cast v18, Ljava/lang/String;

    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v19, v4

    check-cast v19, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    invoke-virtual {v1, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    if-eqz v19, :cond_1c

    new-instance v4, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-static {v5}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v17, v5

    check-cast v17, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    new-instance v5, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v5, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move-object v15, v4

    move-object/from16 v20, v5

    invoke-direct/range {v15 .. v20}, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    goto :goto_2

    :cond_1c
    if-eqz v4, :cond_2b

    new-instance v5, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v6, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-static {v6}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v17, v6

    check-cast v17, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    new-instance v6, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v6, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move-object v15, v5

    move-object/from16 v19, v4

    move-object/from16 v20, v6

    invoke-direct/range {v15 .. v20}, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    move-object v4, v5

    :goto_2
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v4, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    invoke-virtual {v4}, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->load()V

    goto/16 :goto_3

    :pswitch_1
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v3, v4}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->adForId(I)Lio/flutter/plugins/googlemobileads/FlutterAd;

    move-result-object v3

    check-cast v3, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterOverlayAd;

    const-string v4, "immersiveModeEnabled"

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v3, v1}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterOverlayAd;->setImmersiveMode(Z)V

    goto/16 :goto_3

    :pswitch_2
    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    new-instance v4, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$FlutterInitializationListener;

    invoke-direct {v4, v2, v14}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$FlutterInitializationListener;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$1;)V

    invoke-virtual {v1, v3, v4}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->initialize(Landroid/content/Context;Le9/c;)V

    goto/16 :goto_8

    :pswitch_3
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->showAdWithId(I)Z

    move-result v1

    if-nez v1, :cond_24

    const-string v1, "AdShowError"

    const-string v3, "Ad failed to show."

    invoke-interface {v2, v1, v3, v14}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_4
    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    new-instance v4, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$1;

    invoke-direct {v4, v0, v2}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$1;-><init>(Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;Lio/flutter/plugin/common/MethodChannel$Result;)V

    invoke-virtual {v1, v3, v4}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->openAdInspector(Landroid/content/Context;Lx8/s;)V

    goto/16 :goto_8

    :pswitch_5
    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-virtual {v1, v3}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->disableMediationInitialization(Landroid/content/Context;)V

    goto/16 :goto_3

    :pswitch_6
    invoke-static {}, Lcom/google/android/gms/ads/MobileAds;->b()Lx8/y;

    move-result-object v3

    invoke-virtual {v3}, Lx8/y;->f()Lx8/y$a;

    move-result-object v3

    const-string v4, "maxAdContentRating"

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "tagForChildDirectedTreatment"

    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    const-string v6, "tagForUnderAgeOfConsent"

    invoke-virtual {v1, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    const-string v7, "testDeviceIds"

    invoke-virtual {v1, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v4, :cond_1d

    invoke-virtual {v3, v4}, Lx8/y$a;->b(Ljava/lang/String;)Lx8/y$a;

    :cond_1d
    if-eqz v5, :cond_1e

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v3, v4}, Lx8/y$a;->c(I)Lx8/y$a;

    :cond_1e
    if-eqz v6, :cond_1f

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v3, v4}, Lx8/y$a;->d(I)Lx8/y$a;

    :cond_1f
    if-eqz v1, :cond_20

    invoke-virtual {v3, v1}, Lx8/y$a;->e(Ljava/util/List;)Lx8/y$a;

    :cond_20
    invoke-virtual {v3}, Lx8/y$a;->a()Lx8/y;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/ads/MobileAds;->k(Lx8/y;)V

    goto :goto_3

    :pswitch_7
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->adForId(I)Lio/flutter/plugins/googlemobileads/FlutterAd;

    move-result-object v1

    if-nez v1, :cond_21

    goto :goto_3

    :cond_21
    instance-of v3, v1, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;

    if-eqz v3, :cond_22

    check-cast v1, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->getAdSize()Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    move-result-object v1

    goto/16 :goto_6

    :cond_22
    instance-of v3, v1, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;

    if-eqz v3, :cond_23

    check-cast v1, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->getAdSize()Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    move-result-object v1

    goto/16 :goto_6

    :cond_23
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected ad type for getAdSize: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "unexpected_ad_type"

    goto/16 :goto_5

    :pswitch_8
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->disposeAd(I)V

    goto :goto_3

    :pswitch_9
    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->disposeAllAds()V

    :cond_24
    :goto_3
    invoke-interface {v2, v14}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_a
    new-instance v10, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "sizes"

    invoke-virtual {v1, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    invoke-virtual {v0, v3}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->getBannerAdCreator(Landroid/content/Context;)Lio/flutter/plugins/googlemobileads/BannerAdCreator;

    move-result-object v9

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Ljava/util/List;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/BannerAdCreator;)V

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v10, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    invoke-virtual {v10}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->load()V

    goto :goto_3

    :pswitch_b
    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->getVersionString()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_6

    :pswitch_c
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    const-string v4, "volume"

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->setAppVolume(D)V

    goto :goto_3

    :pswitch_d
    new-instance v4, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v8, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    const-string v5, "size"

    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    invoke-virtual {v0, v3}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->getBannerAdCreator(Landroid/content/Context;)Lio/flutter/plugins/googlemobileads/BannerAdCreator;

    move-result-object v12

    move-object v6, v4

    invoke-direct/range {v6 .. v12}, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdSize;Lio/flutter/plugins/googlemobileads/BannerAdCreator;)V

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v4, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    invoke-virtual {v4}, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->load()V

    goto/16 :goto_3

    :pswitch_e
    new-instance v4, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-static {v5}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    new-instance v10, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v10, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move-object v5, v4

    invoke-direct/range {v5 .. v10}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v4, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    invoke-virtual {v4}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->load()V

    goto/16 :goto_3

    :pswitch_f
    new-instance v4, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;

    new-instance v5, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;

    invoke-direct {v5}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;-><init>()V

    const-string v6, "orientation"

    invoke-virtual {v1, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "width"

    invoke-virtual {v1, v7}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v4, v3, v5, v6, v1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;-><init>(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;Ljava/lang/String;I)V

    sget-object v1, Lx8/i;->q:Lx8/i;

    iget-object v3, v4, Lio/flutter/plugins/googlemobileads/FlutterAdSize;->size:Lx8/i;

    invoke-virtual {v1, v3}, Lx8/i;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_25

    goto/16 :goto_3

    :cond_25
    iget v1, v4, Lio/flutter/plugins/googlemobileads/FlutterAdSize;->height:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_6

    :pswitch_10
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v3, v5}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->adForId(I)Lio/flutter/plugins/googlemobileads/FlutterAd;

    move-result-object v3

    const-string v5, "serverSideVerificationOptions"

    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;

    if-nez v3, :cond_26

    const-string v1, "Error - null ad in setServerSideVerificationOptions"

    :goto_4
    invoke-static {v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_3

    :cond_26
    instance-of v5, v3, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;

    if-eqz v5, :cond_27

    check-cast v3, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;

    invoke-virtual {v3, v1}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;->setServerSideVerificationOptions(Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;)V

    goto/16 :goto_3

    :cond_27
    instance-of v5, v3, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;

    if-eqz v5, :cond_28

    check-cast v3, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;

    invoke-virtual {v3, v1}, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->setServerSideVerificationOptions(Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;)V

    goto/16 :goto_3

    :cond_28
    const-string v1, "Error - setServerSideVerificationOptions called on non-rewarded ad"

    goto :goto_4

    :pswitch_11
    const-string v4, "factoryId"

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->nativeAdFactories:Ljava/util/Map;

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;

    const-string v6, "nativeTemplateStyle"

    invoke-virtual {v1, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    if-nez v5, :cond_29

    if-nez v9, :cond_29

    new-array v1, v7, [Ljava/lang/Object;

    aput-object v4, v1, v8

    const-string v3, "No NativeAdFactory with id: %s or nativeTemplateStyle"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "NativeAdError"

    :goto_5
    invoke-interface {v2, v3, v1, v14}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_29
    new-instance v4, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    invoke-direct {v4, v3}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;-><init>(Landroid/content/Context;)V

    iget-object v7, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v4, v7}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setManager(Lio/flutter/plugins/googlemobileads/AdInstanceManager;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v4

    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v4, v7}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setAdUnitId(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v4

    invoke-virtual {v4, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setAdFactory(Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v4

    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    invoke-virtual {v4, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setRequest(Lio/flutter/plugins/googlemobileads/FlutterAdRequest;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v4

    invoke-virtual {v1, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    invoke-virtual {v4, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setAdManagerRequest(Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v4

    const-string v5, "customOptions"

    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    invoke-virtual {v4, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setCustomOptions(Ljava/util/Map;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v4

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setId(I)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v4

    const-string v5, "nativeAdOptions"

    invoke-virtual {v1, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;

    invoke-virtual {v4, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setNativeAdOptions(Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v4

    new-instance v5, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v5, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v5}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setFlutterAdLoader(Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v3

    invoke-virtual {v1, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    invoke-virtual {v3, v4}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->setNativeTemplateStyle(Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;

    move-result-object v3

    invoke-virtual {v3}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->build()Lio/flutter/plugins/googlemobileads/FlutterNativeAd;

    move-result-object v3

    iget-object v4, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v3, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    invoke-virtual {v3}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd;->load()V

    goto/16 :goto_3

    :pswitch_12
    new-instance v4, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v7, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    invoke-virtual {v0, v3}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->getBannerAdCreator(Landroid/content/Context;)Lio/flutter/plugins/googlemobileads/BannerAdCreator;

    move-result-object v10

    move-object v5, v4

    invoke-direct/range {v5 .. v10}, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/BannerAdCreator;)V

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v4, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    invoke-virtual {v4}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->load()V

    goto/16 :goto_3

    :pswitch_13
    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->getRequestConfiguration()Lx8/y;

    move-result-object v1

    :goto_6
    invoke-interface {v2, v1}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_14
    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v18, v4

    check-cast v18, Ljava/lang/String;

    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v19, v4

    check-cast v19, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    invoke-virtual {v1, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    if-eqz v19, :cond_2a

    new-instance v4, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-static {v5}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v17, v5

    check-cast v17, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    new-instance v5, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v5, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move-object v15, v4

    move-object/from16 v20, v5

    invoke-direct/range {v15 .. v20}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    goto :goto_7

    :cond_2a
    if-eqz v4, :cond_2b

    new-instance v5, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v6, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-static {v6}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v17, v6

    check-cast v17, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    new-instance v6, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v6, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move-object v15, v5

    move-object/from16 v19, v4

    move-object/from16 v20, v6

    invoke-direct/range {v15 .. v20}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    move-object v4, v5

    :goto_7
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v4, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    invoke-virtual {v4}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;->load()V

    goto/16 :goto_3

    :cond_2b
    invoke-interface {v2, v6, v5, v14}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_15
    const-string v3, "webViewId"

    invoke-virtual {v1, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v4, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    invoke-virtual {v4}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getFlutterEngine()Lio/flutter/embedding/engine/FlutterEngine;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->registerWebView(ILio/flutter/embedding/engine/FlutterEngine;)V

    goto/16 :goto_3

    :pswitch_16
    new-instance v4, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-static {v5}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    invoke-virtual {v1, v10}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    new-instance v11, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v11, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move-object v5, v4

    invoke-direct/range {v5 .. v11}, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v4, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    invoke-virtual {v4}, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->load()V

    goto/16 :goto_3

    :pswitch_17
    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    const-string v4, "muted"

    invoke-virtual {v1, v4}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v3, v1}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->setAppMuted(Z)V

    goto/16 :goto_3

    :pswitch_18
    new-instance v10, Lio/flutter/plugins/googlemobileads/FlutterInterstitialAd;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v6, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v1, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    new-instance v9, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    invoke-direct {v9, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;-><init>(Landroid/content/Context;)V

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, Lio/flutter/plugins/googlemobileads/FlutterInterstitialAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1, v13}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v3, v10, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->trackAd(Lio/flutter/plugins/googlemobileads/FlutterAd;I)V

    invoke-virtual {v10}, Lio/flutter/plugins/googlemobileads/FlutterInterstitialAd;->load()V

    goto/16 :goto_3

    :pswitch_19
    invoke-virtual {v1, v12}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v4, v0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->flutterMobileAds:Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;

    invoke-virtual {v4, v3, v1}, Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;->openDebugMenu(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_3

    :goto_8
    return-void

    :cond_2c
    :goto_9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "method call received before instanceManager initialized: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74cc200d -> :sswitch_19
        -0x73bda50b -> :sswitch_18
        -0x6cdd4229 -> :sswitch_17
        -0x699434b8 -> :sswitch_16
        -0x5cdc65ff -> :sswitch_15
        -0x5c523da9 -> :sswitch_14
        -0x53263dd8 -> :sswitch_13
        -0x4be76439 -> :sswitch_12
        -0x398c6e60 -> :sswitch_11
        -0x36c202d9 -> :sswitch_10
        -0x2dc7f84f -> :sswitch_f
        -0x28540aad -> :sswitch_e
        -0x2218b08b -> :sswitch_d
        -0x1fc757d2 -> :sswitch_c
        -0x1a08c958 -> :sswitch_b
        -0xa4c77ad -> :sswitch_a
        0x56c1def -> :sswitch_9
        0xef422a2 -> :sswitch_8
        0x1045b9ba -> :sswitch_7
        0x11316e25 -> :sswitch_6
        0x12d86e45 -> :sswitch_5
        0x3f6c8375 -> :sswitch_4
        0x50d09b6d -> :sswitch_3
        0x53a942a5 -> :sswitch_2
        0x630fa5bc -> :sswitch_1
        0x70385ca3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->instanceManager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->setActivity(Landroid/app/Activity;)V

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->adMessageCodec:Lio/flutter/plugins/googlemobileads/AdMessageCodec;

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdMessageCodec;->setContext(Landroid/content/Context;)V

    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;->userMessagingPlatformManager:Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;->setActivity(Landroid/app/Activity;)V

    :cond_2
    return-void
.end method
