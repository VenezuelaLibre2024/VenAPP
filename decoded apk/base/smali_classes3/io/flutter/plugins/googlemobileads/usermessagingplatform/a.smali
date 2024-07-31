.class public final synthetic Lio/flutter/plugins/googlemobileads/usermessagingplatform/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/b$a;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/usermessagingplatform/a;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public final onConsentFormDismissed(Lcb/e;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/usermessagingplatform/a;->a:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v0, p1}, Lio/flutter/plugins/googlemobileads/usermessagingplatform/UserMessagingPlatformManager;->a(Lio/flutter/plugin/common/MethodChannel$Result;Lcb/e;)V

    return-void
.end method
