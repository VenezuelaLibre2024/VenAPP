.class public final synthetic Lio/flutter/plugins/webviewflutter/v4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/v4;->a:Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$Result;

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/v4;->a:Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$Result;

    check-cast p1, Ljava/lang/String;

    invoke-interface {v0, p1}, Lio/flutter/plugins/webviewflutter/GeneratedAndroidWebView$Result;->success(Ljava/lang/Object;)V

    return-void
.end method
