.class public Lio/flutter/plugins/googlemobileads/BannerAdCreator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/BannerAdCreator;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public createAdManagerAdView()Ly8/b;
    .locals 2

    new-instance v0, Ly8/b;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/BannerAdCreator;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Ly8/b;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public createAdView()Lx8/k;
    .locals 2

    new-instance v0, Lx8/k;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/BannerAdCreator;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lx8/k;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
