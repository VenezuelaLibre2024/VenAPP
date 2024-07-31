.class public final Ly8/b;
.super Lx8/m;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lx8/m;-><init>(Landroid/content/Context;I)V

    const-string v0, "Context cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public e(Ly8/a;)V
    .locals 2

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/s;->e(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbgc;->zza(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhy;->zzf:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzkG:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzcdr;->zzb:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ly8/g;

    invoke-direct {v1, p0, p1}, Ly8/g;-><init>(Ly8/b;Ly8/a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {p1}, Lx8/h;->a()Lcom/google/android/gms/ads/internal/client/z2;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/d3;->p(Lcom/google/android/gms/ads/internal/client/z2;)V

    return-void
.end method

.method final synthetic f(Ly8/a;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {p1}, Lx8/h;->a()Lcom/google/android/gms/ads/internal/client/z2;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/d3;->p(Lcom/google/android/gms/ads/internal/client/z2;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbxw;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzbxy;

    move-result-object v0

    const-string v1, "AdManagerAdView.loadAd"

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzbxy;->zzg(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public final g(Lcom/google/android/gms/ads/internal/client/u0;)Z
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/d3;->B(Lcom/google/android/gms/ads/internal/client/u0;)Z

    move-result p1

    return p1
.end method

.method public getAdSizes()[Lx8/i;
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->a()[Lx8/i;

    move-result-object v0

    return-object v0
.end method

.method public getAppEventListener()Ly8/e;
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->k()Ly8/e;

    move-result-object v0

    return-object v0
.end method

.method public getVideoController()Lx8/b0;
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->i()Lx8/b0;

    move-result-object v0

    return-object v0
.end method

.method public getVideoOptions()Lx8/c0;
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->j()Lx8/c0;

    move-result-object v0

    return-object v0
.end method

.method public varargs setAdSizes([Lx8/i;)V
    .locals 1

    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/d3;->v([Lx8/i;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The supported ad sizes must contain at least one valid ad size."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAppEventListener(Ly8/e;)V
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/d3;->x(Ly8/e;)V

    return-void
.end method

.method public setManualImpressionsEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/d3;->y(Z)V

    return-void
.end method

.method public setVideoOptions(Lx8/c0;)V
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/d3;->A(Lx8/c0;)V

    return-void
.end method
