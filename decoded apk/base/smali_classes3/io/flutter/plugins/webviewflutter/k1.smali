.class public final synthetic Lio/flutter/plugins/webviewflutter/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebStorageHostApi;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebStorageHostApi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/k1;->a:Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebStorageHostApi;

    return-void
.end method


# virtual methods
.method public final onMessage(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/k1;->a:Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebStorageHostApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebStorageHostApi;->a(Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$WebStorageHostApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method
