.class public final synthetic Lio/flutter/plugins/webviewflutter/l3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientFlutterApi$Reply;


# instance fields
.field public final synthetic a:Landroid/webkit/JsPromptResult;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/JsPromptResult;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/l3;->a:Landroid/webkit/JsPromptResult;

    return-void
.end method


# virtual methods
.method public final reply(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/l3;->a:Landroid/webkit/JsPromptResult;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lio/flutter/plugins/webviewflutter/WebChromeClientHostApiImpl$WebChromeClientImpl;->a(Landroid/webkit/JsPromptResult;Ljava/lang/String;)V

    return-void
.end method
