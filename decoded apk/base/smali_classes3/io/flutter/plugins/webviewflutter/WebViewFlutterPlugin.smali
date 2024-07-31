.class public Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;


# instance fields
.field private instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

.field private javaScriptChannelHostApi:Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;

.field private pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

.field private webViewHostApi:Lio/flutter/plugins/webviewflutter/WebViewHostApiImpl;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugin/common/BinaryMessenger;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->lambda$setUp$1(Lio/flutter/plugin/common/BinaryMessenger;J)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->lambda$setUp$2()V

    return-void
.end method

.method public static synthetic c(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->lambda$setUp$0(Ljava/lang/Void;)V

    return-void
.end method

.method private static synthetic lambda$setUp$0(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic lambda$setUp$1(Lio/flutter/plugin/common/BinaryMessenger;J)V
    .locals 1

    new-instance v0, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$JavaObjectFlutterApi;

    invoke-direct {v0, p0}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$JavaObjectFlutterApi;-><init>(Lio/flutter/plugin/common/BinaryMessenger;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    new-instance p1, Lio/flutter/plugins/webviewflutter/s4;

    invoke-direct {p1}, Lio/flutter/plugins/webviewflutter/s4;-><init>()V

    invoke-virtual {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$JavaObjectFlutterApi;->dispose(Ljava/lang/Long;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$JavaObjectFlutterApi$Reply;)V

    return-void
.end method

.method private synthetic lambda$setUp$2()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-virtual {v0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->clear()V

    return-void
.end method

.method public static registerWith(Lio/flutter/plugin/common/PluginRegistry$Registrar;)V
    .locals 6

    new-instance v0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;

    invoke-direct {v0}, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;-><init>()V

    invoke-interface {p0}, Lio/flutter/plugin/common/PluginRegistry$Registrar;->messenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v1

    invoke-interface {p0}, Lio/flutter/plugin/common/PluginRegistry$Registrar;->platformViewRegistry()Lio/flutter/plugin/platform/PlatformViewRegistry;

    move-result-object v2

    invoke-interface {p0}, Lio/flutter/plugin/common/PluginRegistry$Registrar;->activity()Landroid/app/Activity;

    move-result-object v3

    new-instance v4, Lio/flutter/plugins/webviewflutter/FlutterAssetManager$RegistrarFlutterAssetManager;

    invoke-interface {p0}, Lio/flutter/plugin/common/PluginRegistry$Registrar;->context()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v5

    invoke-direct {v4, v5, p0}, Lio/flutter/plugins/webviewflutter/FlutterAssetManager$RegistrarFlutterAssetManager;-><init>(Landroid/content/res/AssetManager;Lio/flutter/plugin/common/PluginRegistry$Registrar;)V

    invoke-direct {v0, v1, v2, v3, v4}, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->setUp(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugin/platform/PlatformViewRegistry;Landroid/content/Context;Lio/flutter/plugins/webviewflutter/FlutterAssetManager;)V

    return-void
.end method

.method private setUp(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugin/platform/PlatformViewRegistry;Landroid/content/Context;Lio/flutter/plugins/webviewflutter/FlutterAssetManager;)V
    .locals 4

    new-instance v0, Lio/flutter/plugins/webviewflutter/t4;

    invoke-direct {v0, p1}, Lio/flutter/plugins/webviewflutter/t4;-><init>(Lio/flutter/plugin/common/BinaryMessenger;)V

    invoke-static {v0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->create(Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;)Lio/flutter/plugins/webviewflutter/InstanceManager;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    new-instance v0, Lio/flutter/plugins/webviewflutter/u4;

    invoke-direct {v0, p0}, Lio/flutter/plugins/webviewflutter/u4;-><init>(Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;)V

    invoke-static {p1, v0}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$InstanceManagerHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$InstanceManagerHostApi;)V

    new-instance v0, Lio/flutter/plugins/webviewflutter/FlutterViewFactory;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-direct {v0, v1}, Lio/flutter/plugins/webviewflutter/FlutterViewFactory;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    const-string v1, "plugins.flutter.io/webview"

    invoke-interface {p2, v1, v0}, Lio/flutter/plugin/platform/PlatformViewRegistry;->registerViewFactory(Ljava/lang/String;Lio/flutter/plugin/platform/PlatformViewFactory;)Z

    new-instance p2, Lio/flutter/plugins/webviewflutter/WebViewHostApiImpl;

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    new-instance v1, Lio/flutter/plugins/webviewflutter/WebViewHostApiImpl$WebViewProxy;

    invoke-direct {v1}, Lio/flutter/plugins/webviewflutter/WebViewHostApiImpl$WebViewProxy;-><init>()V

    invoke-direct {p2, v0, p1, v1, p3}, Lio/flutter/plugins/webviewflutter/WebViewHostApiImpl;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/WebViewHostApiImpl$WebViewProxy;Landroid/content/Context;)V

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->webViewHostApi:Lio/flutter/plugins/webviewflutter/WebViewHostApiImpl;

    new-instance p2, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    new-instance v1, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl$JavaScriptChannelCreator;

    invoke-direct {v1}, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl$JavaScriptChannelCreator;-><init>()V

    new-instance v2, Lio/flutter/plugins/webviewflutter/JavaScriptChannelFlutterApiImpl;

    iget-object v3, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-direct {v2, p1, v3}, Lio/flutter/plugins/webviewflutter/JavaScriptChannelFlutterApiImpl;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    new-instance v3, Landroid/os/Handler;

    invoke-virtual {p3}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {v3, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {p2, v0, v1, v2, v3}, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl$JavaScriptChannelCreator;Lio/flutter/plugins/webviewflutter/JavaScriptChannelFlutterApiImpl;Landroid/os/Handler;)V

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->javaScriptChannelHostApi:Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;

    new-instance p2, Lio/flutter/plugins/webviewflutter/JavaObjectHostApiImpl;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-direct {p2, p3}, Lio/flutter/plugins/webviewflutter/JavaObjectHostApiImpl;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$JavaObjectHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$JavaObjectHostApi;)V

    iget-object p2, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->webViewHostApi:Lio/flutter/plugins/webviewflutter/WebViewHostApiImpl;

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebViewHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebViewHostApi;)V

    iget-object p2, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->javaScriptChannelHostApi:Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$JavaScriptChannelHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$JavaScriptChannelHostApi;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    new-instance v0, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientCreator;

    invoke-direct {v0}, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientCreator;-><init>()V

    new-instance v1, Lio/flutter/plugins/webviewflutter/WebViewClientFlutterApiImpl;

    iget-object v2, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-direct {v1, p1, v2}, Lio/flutter/plugins/webviewflutter/WebViewClientFlutterApiImpl;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    invoke-direct {p2, p3, v0, v1}, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientCreator;Lio/flutter/plugins/webviewflutter/WebViewClientFlutterApiImpl;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebViewClientHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebViewClientHostApi;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    new-instance v0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientCreator;

    invoke-direct {v0}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientCreator;-><init>()V

    new-instance v1, Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

    iget-object v2, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-direct {v1, p1, v2}, Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    invoke-direct {p2, p3, v0, v1}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientCreator;Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientHostApi;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/DownloadListenerHostApiImpl;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    new-instance v0, Lio/flutter/plugins/webviewflutter/DownloadListenerHostApiImpl$DownloadListenerCreator;

    invoke-direct {v0}, Lio/flutter/plugins/webviewflutter/DownloadListenerHostApiImpl$DownloadListenerCreator;-><init>()V

    new-instance v1, Lio/flutter/plugins/webviewflutter/DownloadListenerFlutterApiImpl;

    iget-object v2, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-direct {v1, p1, v2}, Lio/flutter/plugins/webviewflutter/DownloadListenerFlutterApiImpl;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    invoke-direct {p2, p3, v0, v1}, Lio/flutter/plugins/webviewflutter/DownloadListenerHostApiImpl;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;Lio/flutter/plugins/webviewflutter/DownloadListenerHostApiImpl$DownloadListenerCreator;Lio/flutter/plugins/webviewflutter/DownloadListenerFlutterApiImpl;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$DownloadListenerHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$DownloadListenerHostApi;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/WebSettingsHostApiImpl;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    new-instance v0, Lio/flutter/plugins/webviewflutter/WebSettingsHostApiImpl$WebSettingsCreator;

    invoke-direct {v0}, Lio/flutter/plugins/webviewflutter/WebSettingsHostApiImpl$WebSettingsCreator;-><init>()V

    invoke-direct {p2, p3, v0}, Lio/flutter/plugins/webviewflutter/WebSettingsHostApiImpl;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;Lio/flutter/plugins/webviewflutter/WebSettingsHostApiImpl$WebSettingsCreator;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebSettingsHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebSettingsHostApi;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/FlutterAssetManagerHostApiImpl;

    invoke-direct {p2, p4}, Lio/flutter/plugins/webviewflutter/FlutterAssetManagerHostApiImpl;-><init>(Lio/flutter/plugins/webviewflutter/FlutterAssetManager;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$FlutterAssetManagerHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$FlutterAssetManagerHostApi;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/CookieManagerHostApiImpl;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-direct {p2, p1, p3}, Lio/flutter/plugins/webviewflutter/CookieManagerHostApiImpl;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$CookieManagerHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$CookieManagerHostApi;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/WebStorageHostApiImpl;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    new-instance p4, Lio/flutter/plugins/webviewflutter/WebStorageHostApiImpl$WebStorageCreator;

    invoke-direct {p4}, Lio/flutter/plugins/webviewflutter/WebStorageHostApiImpl$WebStorageCreator;-><init>()V

    invoke-direct {p2, p3, p4}, Lio/flutter/plugins/webviewflutter/WebStorageHostApiImpl;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;Lio/flutter/plugins/webviewflutter/WebStorageHostApiImpl$WebStorageCreator;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebStorageHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebStorageHostApi;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/PermissionRequestHostApiImpl;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-direct {p2, p1, p3}, Lio/flutter/plugins/webviewflutter/PermissionRequestHostApiImpl;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$PermissionRequestHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$PermissionRequestHostApi;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/GeolocationPermissionsCallbackHostApiImpl;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-direct {p2, p1, p3}, Lio/flutter/plugins/webviewflutter/GeolocationPermissionsCallbackHostApiImpl;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$GeolocationPermissionsCallbackHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$GeolocationPermissionsCallbackHostApi;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/CustomViewCallbackHostApiImpl;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-direct {p2, p1, p3}, Lio/flutter/plugins/webviewflutter/CustomViewCallbackHostApiImpl;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$CustomViewCallbackHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$CustomViewCallbackHostApi;)V

    new-instance p2, Lio/flutter/plugins/webviewflutter/HttpAuthHandlerHostApiImpl;

    iget-object p3, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-direct {p2, p1, p3}, Lio/flutter/plugins/webviewflutter/HttpAuthHandlerHostApiImpl;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    invoke-static {p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$HttpAuthHandlerHostApi;->setup(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$HttpAuthHandlerHostApi;)V

    return-void
.end method

.method private updateContext(Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->webViewHostApi:Lio/flutter/plugins/webviewflutter/WebViewHostApiImpl;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/webviewflutter/WebViewHostApiImpl;->setContext(Landroid/content/Context;)V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->javaScriptChannelHostApi:Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;->setPlatformThreadHandler(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public getInstanceManager()Lio/flutter/plugins/webviewflutter/InstanceManager;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    return-object v0
.end method

.method public onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->updateContext(Landroid/content/Context;)V

    return-void
.end method

.method public onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 5

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v0

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getPlatformViewRegistry()Lio/flutter/plugin/platform/PlatformViewRegistry;

    move-result-object v1

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lio/flutter/plugins/webviewflutter/FlutterAssetManager$PluginBindingFlutterAssetManager;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getFlutterAssets()Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterAssets;

    move-result-object p1

    invoke-direct {v3, v4, p1}, Lio/flutter/plugins/webviewflutter/FlutterAssetManager$PluginBindingFlutterAssetManager;-><init>(Landroid/content/res/AssetManager;Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterAssets;)V

    invoke-direct {p0, v0, v1, v2, v3}, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->setUp(Lio/flutter/plugin/common/BinaryMessenger;Lio/flutter/plugin/platform/PlatformViewRegistry;Landroid/content/Context;Lio/flutter/plugins/webviewflutter/FlutterAssetManager;)V

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->updateContext(Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->pluginBinding:Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;

    invoke-virtual {v0}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->updateContext(Landroid/content/Context;)V

    return-void
.end method

.method public onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/flutter/plugins/webviewflutter/InstanceManager;->stopFinalizationListener()V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    :cond_0
    return-void
.end method

.method public onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 0

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/WebViewFlutterPlugin;->updateContext(Landroid/content/Context;)V

    return-void
.end method
