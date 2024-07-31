.class Ld6/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/ads/MediaViewListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld6/c;->T(Landroid/content/Context;Ld6/c$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld6/c;


# direct methods
.method constructor <init>(Ld6/c;)V
    .locals 0

    iput-object p1, p0, Ld6/c$a;->a:Ld6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Lcom/facebook/ads/MediaView;)V
    .locals 0

    iget-object p1, p0, Ld6/c$a;->a:Ld6/c;

    invoke-static {p1}, Ld6/c;->Q(Ld6/c;)Li9/t;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ld6/c$a;->a:Ld6/c;

    invoke-static {p1}, Ld6/c;->Q(Ld6/c;)Li9/t;

    move-result-object p1

    invoke-interface {p1}, Li9/t;->onVideoComplete()V

    :cond_0
    return-void
.end method

.method public onEnterFullscreen(Lcom/facebook/ads/MediaView;)V
    .locals 0

    return-void
.end method

.method public onExitFullscreen(Lcom/facebook/ads/MediaView;)V
    .locals 0

    return-void
.end method

.method public onFullscreenBackground(Lcom/facebook/ads/MediaView;)V
    .locals 0

    return-void
.end method

.method public onFullscreenForeground(Lcom/facebook/ads/MediaView;)V
    .locals 0

    return-void
.end method

.method public onPause(Lcom/facebook/ads/MediaView;)V
    .locals 0

    return-void
.end method

.method public onPlay(Lcom/facebook/ads/MediaView;)V
    .locals 0

    return-void
.end method

.method public onVolumeChange(Lcom/facebook/ads/MediaView;F)V
    .locals 0

    return-void
.end method
