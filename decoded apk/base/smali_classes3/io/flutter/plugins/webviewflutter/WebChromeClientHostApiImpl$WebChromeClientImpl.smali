.class public Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;
.super Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$SecureWebChromeClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WebChromeClientImpl"
.end annotation


# instance fields
.field private final flutterApi:Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

.field private returnValueForOnConsoleMessage:Z

.field private returnValueForOnJsAlert:Z

.field private returnValueForOnJsConfirm:Z

.field private returnValueForOnJsPrompt:Z

.field private returnValueForOnShowFileChooser:Z


# direct methods
.method public constructor <init>(Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;)V
    .locals 1

    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$SecureWebChromeClient;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnShowFileChooser:Z

    iput-boolean v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnConsoleMessage:Z

    iput-boolean v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnJsAlert:Z

    iput-boolean v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnJsConfirm:Z

    iput-boolean v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnJsPrompt:Z

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

    return-void
.end method

.method public static synthetic a(Landroid/webkit/JsPromptResult;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->lambda$onJsPrompt$10(Landroid/webkit/JsPromptResult;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->lambda$onShowCustomView$1(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->lambda$onProgressChanged$0(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->lambda$onHideCustomView$2(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic e(ZLandroid/webkit/ValueCallback;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->lambda$onShowFileChooser$5(ZLandroid/webkit/ValueCallback;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic f(Landroid/webkit/JsResult;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->lambda$onJsConfirm$9(Landroid/webkit/JsResult;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic g(Landroid/webkit/JsResult;Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->lambda$onJsAlert$8(Landroid/webkit/JsResult;Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic h(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->lambda$onConsoleMessage$7(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic i(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->lambda$onPermissionRequest$6(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic j(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->lambda$onGeolocationPermissionsShowPrompt$3(Ljava/lang/Void;)V

    return-void
.end method

.method public static synthetic k(Ljava/lang/Void;)V
    .locals 0

    invoke-static {p0}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->lambda$onGeolocationPermissionsHidePrompt$4(Ljava/lang/Void;)V

    return-void
.end method

.method private static synthetic lambda$onConsoleMessage$7(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic lambda$onGeolocationPermissionsHidePrompt$4(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic lambda$onGeolocationPermissionsShowPrompt$3(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic lambda$onHideCustomView$2(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic lambda$onJsAlert$8(Landroid/webkit/JsResult;Ljava/lang/Void;)V
    .locals 0

    invoke-virtual {p0}, Landroid/webkit/JsResult;->confirm()V

    return-void
.end method

.method private static synthetic lambda$onJsConfirm$9(Landroid/webkit/JsResult;Ljava/lang/Boolean;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/webkit/JsResult;->confirm()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/webkit/JsResult;->cancel()V

    :goto_0
    return-void
.end method

.method private static synthetic lambda$onJsPrompt$10(Landroid/webkit/JsPromptResult;Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Landroid/webkit/JsPromptResult;->confirm(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/webkit/JsResult;->cancel()V

    :goto_0
    return-void
.end method

.method private static synthetic lambda$onPermissionRequest$6(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic lambda$onProgressChanged$0(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic lambda$onShowCustomView$1(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method private static synthetic lambda$onShowFileChooser$5(ZLandroid/webkit/ValueCallback;Ljava/util/List;)V
    .locals 2

    if-eqz p0, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    new-array p0, p0, [Landroid/net/Uri;

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    aput-object v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1, p0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

    new-instance v1, Lio/flutter/plugins/webviewflutter/j3;

    invoke-direct {v1}, Lio/flutter/plugins/webviewflutter/j3;-><init>()V

    invoke-virtual {v0, p0, p1, v1}, Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;->onConsoleMessage(Landroid/webkit/WebChromeClient;Landroid/webkit/ConsoleMessage;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply;)V

    iget-boolean p1, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnConsoleMessage:Z

    return p1
.end method

.method public onGeolocationPermissionsHidePrompt()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

    new-instance v1, Lio/flutter/plugins/webviewflutter/k3;

    invoke-direct {v1}, Lio/flutter/plugins/webviewflutter/k3;-><init>()V

    invoke-virtual {v0, p0, v1}, Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;->onGeolocationPermissionsHidePrompt(Landroid/webkit/WebChromeClient;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply;)V

    return-void
.end method

.method public onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

    new-instance v1, Lio/flutter/plugins/webviewflutter/m3;

    invoke-direct {v1}, Lio/flutter/plugins/webviewflutter/m3;-><init>()V

    invoke-virtual {v0, p0, p1, p2, v1}, Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;->onGeolocationPermissionsShowPrompt(Landroid/webkit/WebChromeClient;Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply;)V

    return-void
.end method

.method public onHideCustomView()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

    new-instance v1, Lio/flutter/plugins/webviewflutter/n3;

    invoke-direct {v1}, Lio/flutter/plugins/webviewflutter/n3;-><init>()V

    invoke-virtual {v0, p0, v1}, Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;->onHideCustomView(Landroid/webkit/WebChromeClient;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply;)V

    return-void
.end method

.method public onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    iget-boolean p1, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnJsAlert:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

    new-instance v0, Lio/flutter/plugins/webviewflutter/r3;

    invoke-direct {v0, p4}, Lio/flutter/plugins/webviewflutter/r3;-><init>(Landroid/webkit/JsResult;)V

    invoke-virtual {p1, p0, p2, p3, v0}, Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;->onJsAlert(Landroid/webkit/WebChromeClient;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 1

    iget-boolean p1, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnJsConfirm:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

    new-instance v0, Lio/flutter/plugins/webviewflutter/q3;

    invoke-direct {v0, p4}, Lio/flutter/plugins/webviewflutter/q3;-><init>(Landroid/webkit/JsResult;)V

    invoke-virtual {p1, p0, p2, p3, v0}, Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;->onJsConfirm(Landroid/webkit/WebChromeClient;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onJsPrompt(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsPromptResult;)Z
    .locals 6

    iget-boolean p1, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnJsPrompt:Z

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

    new-instance v5, Lio/flutter/plugins/webviewflutter/l3;

    invoke-direct {v5, p5}, Lio/flutter/plugins/webviewflutter/l3;-><init>(Landroid/webkit/JsPromptResult;)V

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;->onJsPrompt(Landroid/webkit/WebChromeClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

    new-instance v1, Lio/flutter/plugins/webviewflutter/s3;

    invoke-direct {v1}, Lio/flutter/plugins/webviewflutter/s3;-><init>()V

    invoke-virtual {v0, p0, p1, v1}, Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;->onPermissionRequest(Landroid/webkit/WebChromeClient;Landroid/webkit/PermissionRequest;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply;)V

    return-void
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

    int-to-long v1, p2

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    new-instance v1, Lio/flutter/plugins/webviewflutter/o3;

    invoke-direct {v1}, Lio/flutter/plugins/webviewflutter/o3;-><init>()V

    invoke-virtual {v0, p0, p1, p2, v1}, Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;->onProgressChanged(Landroid/webkit/WebChromeClient;Landroid/webkit/WebView;Ljava/lang/Long;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply;)V

    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

    new-instance v1, Lio/flutter/plugins/webviewflutter/p3;

    invoke-direct {v1}, Lio/flutter/plugins/webviewflutter/p3;-><init>()V

    invoke-virtual {v0, p0, p1, p2, v1}, Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;->onShowCustomView(Landroid/webkit/WebChromeClient;Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply;)V

    return-void
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/webkit/WebView;",
            "Landroid/webkit/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;",
            "Landroid/webkit/WebChromeClient$FileChooserParams;",
            ")Z"
        }
    .end annotation

    iget-boolean v0, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnShowFileChooser:Z

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->flutterApi:Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;

    new-instance v2, Lio/flutter/plugins/webviewflutter/i3;

    invoke-direct {v2, v0, p2}, Lio/flutter/plugins/webviewflutter/i3;-><init>(ZLandroid/webkit/ValueCallback;)V

    invoke-virtual {v1, p0, p1, p3, v2}, Lio/flutter/plugins/webviewflutter/WebChromeClientFlutterApiImpl;->onShowFileChooser(Landroid/webkit/WebChromeClient;Landroid/webkit/WebView;Landroid/webkit/WebChromeClient$FileChooserParams;Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply;)V

    return v0
.end method

.method public setReturnValueForOnConsoleMessage(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnConsoleMessage:Z

    return-void
.end method

.method public setReturnValueForOnJsAlert(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnJsAlert:Z

    return-void
.end method

.method public setReturnValueForOnJsConfirm(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnJsConfirm:Z

    return-void
.end method

.method public setReturnValueForOnJsPrompt(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnJsPrompt:Z

    return-void
.end method

.method public setReturnValueForOnShowFileChooser(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->returnValueForOnShowFileChooser:Z

    return-void
.end method
