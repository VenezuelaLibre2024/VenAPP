.class public final synthetic Lx8/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx8/m;

.field public final synthetic b:Lx8/h;


# direct methods
.method public synthetic constructor <init>(Lx8/m;Lx8/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx8/i0;->a:Lx8/m;

    iput-object p2, p0, Lx8/i0;->b:Lx8/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lx8/i0;->a:Lx8/m;

    iget-object v1, p0, Lx8/i0;->b:Lx8/h;

    :try_start_0
    iget-object v2, v0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    iget-object v1, v1, Lx8/h;->a:Lcom/google/android/gms/ads/internal/client/z2;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/internal/client/d3;->p(Lcom/google/android/gms/ads/internal/client/z2;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbxw;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzbxy;

    move-result-object v0

    const-string v2, "BaseAdView.loadAd"

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzbxy;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method
