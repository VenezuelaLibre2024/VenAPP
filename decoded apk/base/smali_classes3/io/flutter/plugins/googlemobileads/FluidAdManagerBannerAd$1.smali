.class Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;->onAdLoaded()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;


# direct methods
.method constructor <init>(Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd$1;->this$0:Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iget-object p2, p0, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd$1;->this$0:Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;

    invoke-static {p2}, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;->access$000(Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;)I

    move-result p2

    if-eq p1, p2, :cond_0

    iget-object p2, p0, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd$1;->this$0:Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;

    iget-object p3, p2, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget p2, p2, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    invoke-virtual {p3, p2, p1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onFluidAdHeightChanged(II)V

    :cond_0
    iget-object p2, p0, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd$1;->this$0:Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;

    invoke-static {p2, p1}, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;->access$002(Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;I)I

    return-void
.end method
