.class public Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebViewClientHostApi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientCreator;,
        Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientCompatImpl;,
        Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientImpl;
    }
.end annotation


# instance fields
.field private final flutterApi:Lio/flutter/plugins/webviewflutter/WebViewClientFlutterApiImpl;

.field private final instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

.field private final webViewClientCreator:Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientCreator;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/InstanceManager;Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientCreator;Lio/flutter/plugins/webviewflutter/WebViewClientFlutterApiImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    iput-object p2, p0, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl;->webViewClientCreator:Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientCreator;

    iput-object p3, p0, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebViewClientFlutterApiImpl;

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Long;)V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl;->webViewClientCreator:Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientCreator;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebViewClientFlutterApiImpl;

    invoke-virtual {v0, v1}, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientCreator;->createWebViewClient(Lio/flutter/plugins/webviewflutter/WebViewClientFlutterApiImpl;)Landroid/webkit/WebViewClient;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lio/flutter/plugins/webviewflutter/InstanceManager;->addDartCreatedInstance(Ljava/lang/Object;J)V

    return-void
.end method

.method public setSynchronousReturnValueForShouldOverrideUrlLoading(Ljava/lang/Long;Ljava/lang/Boolean;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl;->instanceManager:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/webviewflutter/InstanceManager;->getInstance(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/webkit/WebViewClient;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p1, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientCompatImpl;

    if-eqz v0, :cond_0

    check-cast p1, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientCompatImpl;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientCompatImpl;->setReturnValueForShouldOverrideUrlLoading(Z)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientImpl;

    if-eqz v0, :cond_1

    check-cast p1, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientImpl;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Lio/flutter/plugins/webviewflutter/WebViewClientHostApiImpl$WebViewClientImpl;->setReturnValueForShouldOverrideUrlLoading(Z)V

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This WebViewClient doesn\'t support setting the returnValueForShouldOverrideUrlLoading."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method