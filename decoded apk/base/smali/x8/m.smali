.class public abstract Lx8/m;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field protected final a:Lcom/google/android/gms/ads/internal/client/d3;


# direct methods
.method protected constructor <init>(Landroid/content/Context;I)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    new-instance p1, Lcom/google/android/gms/ads/internal/client/d3;

    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/ads/internal/client/d3;-><init>(Landroid/view/ViewGroup;I)V

    iput-object p1, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbgc;->zza(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhy;->zze:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzkD:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzcdr;->zzb:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lx8/g0;

    invoke-direct {v1, p0}, Lx8/g0;-><init>(Lx8/m;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->n()V

    return-void
.end method

.method public b(Lx8/h;)V
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

    new-instance v1, Lx8/i0;

    invoke-direct {v1, p0, p1}, Lx8/i0;-><init>(Lx8/m;Lx8/h;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    iget-object p1, p1, Lx8/h;->a:Lcom/google/android/gms/ads/internal/client/z2;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/d3;->p(Lcom/google/android/gms/ads/internal/client/z2;)V

    return-void
.end method

.method public c()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbgc;->zza(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhy;->zzg:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzkE:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzcdr;->zzb:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lx8/h0;

    invoke-direct {v1, p0}, Lx8/h0;-><init>(Lx8/m;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->q()V

    return-void
.end method

.method public d()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbgc;->zza(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhy;->zzh:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzkC:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzcdr;->zzb:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lx8/f0;

    invoke-direct {v1, p0}, Lx8/f0;-><init>(Lx8/m;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->r()V

    return-void
.end method

.method public getAdListener()Lx8/e;
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->d()Lx8/e;

    move-result-object v0

    return-object v0
.end method

.method public getAdSize()Lx8/i;
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->e()Lx8/i;

    move-result-object v0

    return-object v0
.end method

.method public getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->m()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOnPaidEventListener()Lx8/t;
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->f()Lx8/t;

    move-result-object v0

    return-object v0
.end method

.method public getResponseInfo()Lx8/z;
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/d3;->g()Lx8/z;

    move-result-object v0

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    sub-int/2addr p4, p2

    sub-int/2addr p4, v0

    sub-int/2addr p5, p3

    sub-int/2addr p5, v1

    div-int/lit8 p4, p4, 0x2

    div-int/lit8 p5, p5, 0x2

    add-int/2addr v0, p4

    add-int/2addr v1, p5

    invoke-virtual {p1, p4, p5, v0, v1}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_0

    invoke-virtual {p0, v1, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lx8/m;->getAdSize()Lx8/i;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Unable to retrieve ad size."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v0}, Lx8/i;->k(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v1, v0}, Lx8/i;->d(Landroid/content/Context;)I

    move-result v0

    move v1, v0

    move v0, v2

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    move-result p1

    invoke-static {v1, p2}, Landroid/view/View;->resolveSize(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setAdListener(Lx8/e;)V
    .locals 2

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/d3;->t(Lx8/e;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/client/d3;->s(Lcom/google/android/gms/ads/internal/client/a;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/ads/internal/client/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/ads/internal/client/a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/client/d3;->s(Lcom/google/android/gms/ads/internal/client/a;)V

    :cond_1
    instance-of v0, p1, Ly8/e;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    check-cast p1, Ly8/e;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/d3;->x(Ly8/e;)V

    :cond_2
    return-void
.end method

.method public setAdSize(Lx8/i;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Lx8/i;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iget-object p1, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/client/d3;->u([Lx8/i;)V

    return-void
.end method

.method public setAdUnitId(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/d3;->w(Ljava/lang/String;)V

    return-void
.end method

.method public setOnPaidEventListener(Lx8/t;)V
    .locals 1

    iget-object v0, p0, Lx8/m;->a:Lcom/google/android/gms/ads/internal/client/d3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/client/d3;->z(Lx8/t;)V

    return-void
.end method
