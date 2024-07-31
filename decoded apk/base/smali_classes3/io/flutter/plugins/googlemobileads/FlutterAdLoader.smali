.class public Lio/flutter/plugins/googlemobileads/FlutterAdLoader;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public loadAdManagerAppOpen(Ljava/lang/String;Ly8/a;Lz8/a$a;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lz8/a;->load(Landroid/content/Context;Ljava/lang/String;Lx8/h;Lz8/a$a;)V

    return-void
.end method

.method public loadAdManagerInterstitial(Ljava/lang/String;Ly8/a;Ly8/d;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Ly8/c;->load(Landroid/content/Context;Ljava/lang/String;Ly8/a;Ly8/d;)V

    return-void
.end method

.method public loadAdManagerNativeAd(Ljava/lang/String;Lcom/google/android/gms/ads/nativead/b$c;Lcom/google/android/gms/ads/nativead/c;Lx8/e;Ly8/a;)V
    .locals 2

    new-instance v0, Lx8/g$a;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lx8/g$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lx8/g$a;->b(Lcom/google/android/gms/ads/nativead/b$c;)Lx8/g$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lx8/g$a;->d(Lcom/google/android/gms/ads/nativead/c;)Lx8/g$a;

    move-result-object p1

    invoke-virtual {p1, p4}, Lx8/g$a;->c(Lx8/e;)Lx8/g$a;

    move-result-object p1

    invoke-virtual {p1}, Lx8/g$a;->a()Lx8/g;

    move-result-object p1

    invoke-virtual {p1, p5}, Lx8/g;->b(Ly8/a;)V

    return-void
.end method

.method public loadAdManagerRewarded(Ljava/lang/String;Ly8/a;Ln9/d;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Ln9/c;->load(Landroid/content/Context;Ljava/lang/String;Ly8/a;Ln9/d;)V

    return-void
.end method

.method public loadAdManagerRewardedInterstitial(Ljava/lang/String;Ly8/a;Lo9/b;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lo9/a;->load(Landroid/content/Context;Ljava/lang/String;Ly8/a;Lo9/b;)V

    return-void
.end method

.method public loadAppOpen(Ljava/lang/String;Lx8/h;Lz8/a$a;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lz8/a;->load(Landroid/content/Context;Ljava/lang/String;Lx8/h;Lz8/a$a;)V

    return-void
.end method

.method public loadInterstitial(Ljava/lang/String;Lx8/h;Lh9/b;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lh9/a;->load(Landroid/content/Context;Ljava/lang/String;Lx8/h;Lh9/b;)V

    return-void
.end method

.method public loadNativeAd(Ljava/lang/String;Lcom/google/android/gms/ads/nativead/b$c;Lcom/google/android/gms/ads/nativead/c;Lx8/e;Lx8/h;)V
    .locals 2

    new-instance v0, Lx8/g$a;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lx8/g$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Lx8/g$a;->b(Lcom/google/android/gms/ads/nativead/b$c;)Lx8/g$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lx8/g$a;->d(Lcom/google/android/gms/ads/nativead/c;)Lx8/g$a;

    move-result-object p1

    invoke-virtual {p1, p4}, Lx8/g$a;->c(Lx8/e;)Lx8/g$a;

    move-result-object p1

    invoke-virtual {p1}, Lx8/g$a;->a()Lx8/g;

    move-result-object p1

    invoke-virtual {p1, p5}, Lx8/g;->a(Lx8/h;)V

    return-void
.end method

.method public loadRewarded(Ljava/lang/String;Lx8/h;Ln9/d;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Ln9/c;->load(Landroid/content/Context;Ljava/lang/String;Lx8/h;Ln9/d;)V

    return-void
.end method

.method public loadRewardedInterstitial(Ljava/lang/String;Lx8/h;Lo9/b;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->context:Landroid/content/Context;

    invoke-static {v0, p1, p2, p3}, Lo9/a;->load(Landroid/content/Context;Ljava/lang/String;Lx8/h;Lo9/b;)V

    return-void
.end method
