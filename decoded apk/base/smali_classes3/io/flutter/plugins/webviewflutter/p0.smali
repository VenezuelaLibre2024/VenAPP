.class public final synthetic Lio/flutter/plugins/webviewflutter/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientHostApi;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientHostApi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/p0;->a:Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientHostApi;

    return-void
.end method


# virtual methods
.method public final onMessage(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/p0;->a:Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientHostApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientHostApi;->a(Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebChromeClientHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method