.class public final synthetic Lio/flutter/plugins/webviewflutter/q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebViewHostApi;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebViewHostApi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/q2;->a:Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebViewHostApi;

    return-void
.end method


# virtual methods
.method public final onMessage(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/q2;->a:Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebViewHostApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebViewHostApi;->m(Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebViewHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method
