.class public Lio/flutter/plugins/webviewflutter/JavaScriptChannel;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final flutterApi:Lio/flutter/plugins/webviewflutter/JavaScriptChannelFlutterApiImpl;

.field final javaScriptChannelName:Ljava/lang/String;

.field private final platformThreadHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/JavaScriptChannelFlutterApiImpl;Ljava/lang/String;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannel;->flutterApi:Lio/flutter/plugins/webviewflutter/JavaScriptChannelFlutterApiImpl;

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannel;->javaScriptChannelName:Ljava/lang/String;

    iput-object p3, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannel;->platformThreadHandler:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/JavaScriptChannel;->lambda$postMessage$0(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic b(Lio/flutter/plugins/webviewflutter/JavaScriptChannel;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/webviewflutter/JavaScriptChannel;->lambda$postMessage$1(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic lambda$postMessage$0(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private synthetic lambda$postMessage$1(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannel;->flutterApi:Lio/flutter/plugins/webviewflutter/JavaScriptChannelFlutterApiImpl;

    new-instance v1, Lio/flutter/plugins/webviewflutter/z2;

    invoke-direct {v1}, Lio/flutter/plugins/webviewflutter/z2;-><init>()V

    invoke-virtual {v0, p0, p1, v1}, Lio/flutter/plugins/webviewflutter/JavaScriptChannelFlutterApiImpl;->postMessage(Lio/flutter/plugins/webviewflutter/JavaScriptChannel;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$JavaScriptChannelFlutterApi$Reply;)V

    return-void
.end method


# virtual methods
.method public postMessage(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    new-instance v0, Lio/flutter/plugins/webviewflutter/a3;

    invoke-direct {v0, p0, p1}, Lio/flutter/plugins/webviewflutter/a3;-><init>(Lio/flutter/plugins/webviewflutter/JavaScriptChannel;Ljava/lang/String;)V

    iget-object p1, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannel;->platformThreadHandler:Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p1, v1, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannel;->platformThreadHandler:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method
