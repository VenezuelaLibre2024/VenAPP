.class public Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$JavaScriptChannelHostApi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl$JavaScriptChannelCreator;
    }
.end annotation


# instance fields
.field private final flutterApi:Lio/flutter/plugins/webviewflutter/JavaScriptChannelFlutterApiImpl;

.field private final instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

.field private final javaScriptChannelCreator:Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl$JavaScriptChannelCreator;

.field private platformThreadHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/InstanceManager;Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl$JavaScriptChannelCreator;Lio/flutter/plugins/webviewflutter/JavaScriptChannelFlutterApiImpl;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;->javaScriptChannelCreator:Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl$JavaScriptChannelCreator;

    iput-object p3, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/JavaScriptChannelFlutterApiImpl;

    iput-object p4, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;->platformThreadHandler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Long;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;->javaScriptChannelCreator:Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl$JavaScriptChannelCreator;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/JavaScriptChannelFlutterApiImpl;

    iget-object v2, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;->platformThreadHandler:Landroid/os/Handler;

    invoke-virtual {v0, v1, p2, v2}, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl$JavaScriptChannelCreator;->createJavaScriptChannel(Lio/flutter/plugins/webviewflutter/JavaScriptChannelFlutterApiImpl;Ljava/lang/String;Landroid/os/Handler;)Lio/flutter/plugins/webviewflutter/JavaScriptChannel;

    move-result-object p2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, p2, v1, v2}, Lio/flutter/plugins/webviewflutter/InstanceManager;->addDartCreatedInstance(Ljava/lang/Object;J)V

    return-void
.end method

.method public setPlatformThreadHandler(Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/JavaScriptChannelHostApiImpl;->platformThreadHandler:Landroid/os/Handler;

    return-void
.end method