.class Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;
.super Lio/flutter/plugins/googlemobileads/FlutterAdSize;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlemobileads/FlutterAdSize;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AnchoredAdaptiveBannerAdSize"
.end annotation


# instance fields
.field final orientation:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;Ljava/lang/String;I)V
    .locals 0

    invoke-static {p1, p2, p3, p4}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;->getAdSize(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;Ljava/lang/String;I)Lx8/i;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize;-><init>(Lx8/i;)V

    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AnchoredAdaptiveBannerAdSize;->orientation:Ljava/lang/String;

    return-void
.end method

.method private static getAdSize(Landroid/content/Context;Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;Ljava/lang/String;I)Lx8/i;
    .locals 1

    if-nez p2, :cond_0

    invoke-virtual {p1, p0, p3}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;->getCurrentOrientationAnchoredAdaptiveBannerAdSize(Landroid/content/Context;I)Lx8/i;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string v0, "portrait"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, p0, p3}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;->getPortraitAnchoredAdaptiveBannerAdSize(Landroid/content/Context;I)Lx8/i;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-string v0, "landscape"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1, p0, p3}, Lio/flutter/plugins/googlemobileads/FlutterAdSize$AdSizeFactory;->getLandscapeAnchoredAdaptiveBannerAdSize(Landroid/content/Context;I)Lx8/i;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unexpected value for orientation: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
