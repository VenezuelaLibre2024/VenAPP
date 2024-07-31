.class final Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$FlutterInitializationListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "FlutterInitializationListener"
.end annotation


# instance fields
.field private isInitializationCompleted:Z

.field private final result:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method private constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$FlutterInitializationListener;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$FlutterInitializationListener;->isInitializationCompleted:Z

    return-void
.end method

.method synthetic constructor <init>(Lio/flutter/plugin/common/MethodChannel$Result;Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$FlutterInitializationListener;-><init>(Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method


# virtual methods
.method public onInitializationComplete(Le9/b;)V
    .locals 6

    iget-boolean v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$FlutterInitializationListener;->isInitializationCompleted:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_0
    const-class v1, Lcom/google/android/gms/ads/MobileAds;

    const-string v2, "setPlugin"

    new-array v3, v0, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-array v2, v0, [Ljava/lang/Object;

    const-string v3, "Flutter-GMA-5.1.0"

    aput-object v3, v2, v5

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$FlutterInitializationListener;->result:Lio/flutter/plugin/common/MethodChannel$Result;

    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;

    invoke-direct {v2, p1}, Lio/flutter/plugins/googlemobileads/FlutterInitializationStatus;-><init>(Le9/b;)V

    invoke-interface {v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    iput-boolean v0, p0, Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$FlutterInitializationListener;->isInitializationCompleted:Z

    return-void
.end method
