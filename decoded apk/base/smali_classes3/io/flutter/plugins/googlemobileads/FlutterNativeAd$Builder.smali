.class Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlemobileads/FlutterNativeAd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "Builder"
.end annotation


# instance fields
.field private adFactory:Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;

.field private adManagerRequest:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

.field private adUnitId:Ljava/lang/String;

.field private final context:Landroid/content/Context;

.field private customOptions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

.field private id:Ljava/lang/Integer;

.field private manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

.field private nativeAdOptions:Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;

.field private nativeTemplateStyle:Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

.field private request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method build()Lio/flutter/plugins/googlemobileads/FlutterNativeAd;
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    if-eqz v1, :cond_6

    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->adUnitId:Ljava/lang/String;

    if-eqz v1, :cond_5

    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->adFactory:Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;

    if-nez v1, :cond_1

    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->nativeTemplateStyle:Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "NativeAdFactory and nativeTemplateStyle cannot be null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v1, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    if-nez v1, :cond_3

    iget-object v2, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->adManagerRequest:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "adRequest or addManagerRequest must be non-null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterNativeAd;

    iget-object v4, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->context:Landroid/content/Context;

    iget-object v2, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->id:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v6, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget-object v7, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->adUnitId:Ljava/lang/String;

    iget-object v8, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->adFactory:Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;

    iget-object v9, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->adManagerRequest:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    iget-object v10, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    iget-object v11, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->customOptions:Ljava/util/Map;

    iget-object v12, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->nativeAdOptions:Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;

    iget-object v13, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->nativeTemplateStyle:Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    move-object v3, v1

    invoke-direct/range {v3 .. v13}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd;-><init>(Landroid/content/Context;ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;Ljava/util/Map;Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;)V

    goto :goto_2

    :cond_4
    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterNativeAd;

    iget-object v15, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->context:Landroid/content/Context;

    iget-object v2, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->id:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v2, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget-object v3, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->adUnitId:Ljava/lang/String;

    iget-object v4, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->adFactory:Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;

    iget-object v5, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    iget-object v6, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    iget-object v7, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->customOptions:Ljava/util/Map;

    iget-object v8, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->nativeAdOptions:Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;

    iget-object v9, v0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->nativeTemplateStyle:Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    move-object v14, v1

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move-object/from16 v20, v5

    move-object/from16 v21, v6

    move-object/from16 v22, v7

    move-object/from16 v23, v8

    move-object/from16 v24, v9

    invoke-direct/range {v14 .. v24}, Lio/flutter/plugins/googlemobileads/FlutterNativeAd;-><init>(Landroid/content/Context;ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;Ljava/util/Map;Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;)V

    :goto_2
    return-object v1

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "AdUnitId cannot be null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "AdInstanceManager cannot be null."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public setAdFactory(Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->adFactory:Lio/flutter/plugins/googlemobileads/GoogleMobileAdsPlugin$NativeAdFactory;

    return-object p0
.end method

.method public setAdManagerRequest(Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->adManagerRequest:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    return-object p0
.end method

.method public setAdUnitId(Ljava/lang/String;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->adUnitId:Ljava/lang/String;

    return-object p0
.end method

.method public setCustomOptions(Ljava/util/Map;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->customOptions:Ljava/util/Map;

    return-object p0
.end method

.method public setFlutterAdLoader(Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    return-object p0
.end method

.method public setId(I)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->id:Ljava/lang/Integer;

    return-object p0
.end method

.method public setManager(Lio/flutter/plugins/googlemobileads/AdInstanceManager;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    return-object p0
.end method

.method public setNativeAdOptions(Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->nativeAdOptions:Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;

    return-object p0
.end method

.method public setNativeTemplateStyle(Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->nativeTemplateStyle:Lio/flutter/plugins/googlemobileads/nativetemplates/FlutterNativeTemplateStyle;

    return-object p0
.end method

.method public setRequest(Lio/flutter/plugins/googlemobileads/FlutterAdRequest;)Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAd$Builder;->request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    return-object p0
.end method
