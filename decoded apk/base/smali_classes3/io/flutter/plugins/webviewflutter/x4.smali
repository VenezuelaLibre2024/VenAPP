.class public final synthetic Lio/flutter/plugins/webviewflutter/x4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/webviewflutter/WebViewHostApiImpl$WebViewPlatformView$AndroidSdkChecker;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final sdkIsAtLeast(I)Z
    .locals 0

    invoke-static {p1}, Lio/flutter/plugins/webviewflutter/WebViewHostApiImpl$WebViewPlatformView;->a(I)Z

    move-result p1

    return p1
.end method