.class public final synthetic Lio/flutter/plugins/webviewflutter/q3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply;


# instance fields
.field public final synthetic a:Landroid/webkit/JsResult;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/JsResult;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Landroid/webkit/JsResult;

    return-void
.end method


# virtual methods
.method public final reply(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q3;->a:Landroid/webkit/JsResult;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->f(Landroid/webkit/JsResult;Ljava/lang/Boolean;)V

    return-void
.end method
