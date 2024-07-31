.class public Lx8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx8/g$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/ads/internal/client/y4;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/ads/internal/client/n0;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/n0;Lcom/google/android/gms/ads/internal/client/y4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx8/g;->b:Landroid/content/Context;

    iput-object p2, p0, Lx8/g;->c:Lcom/google/android/gms/ads/internal/client/n0;

    iput-object p3, p0, Lx8/g;->a:Lcom/google/android/gms/ads/internal/client/y4;

    return-void
.end method

.method private final d(Lcom/google/android/gms/ads/internal/client/z2;)V
    .locals 3

    iget-object v0, p0, Lx8/g;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbgc;->zza(Landroid/content/Context;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbhy;->zzc:Lcom/google/android/gms/internal/ads/zzbhm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbhm;->zze()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbgc;->zzkG:Lcom/google/android/gms/internal/ads/zzbfu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/a0;->c()Lcom/google/android/gms/internal/ads/zzbga;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbga;->zza(Lcom/google/android/gms/internal/ads/zzbfu;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcdr;->zzb:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lx8/d0;

    invoke-direct {v1, p0, p1}, Lx8/d0;-><init>(Lx8/g;Lcom/google/android/gms/ads/internal/client/z2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lx8/g;->c:Lcom/google/android/gms/ads/internal/client/n0;

    iget-object v1, p0, Lx8/g;->a:Lcom/google/android/gms/ads/internal/client/y4;

    iget-object v2, p0, Lx8/g;->b:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/ads/internal/client/y4;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/z2;)Lcom/google/android/gms/ads/internal/client/u4;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/internal/client/n0;->zzg(Lcom/google/android/gms/ads/internal/client/u4;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Failed to load ad."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public a(Lx8/h;)V
    .locals 0

    iget-object p1, p1, Lx8/h;->a:Lcom/google/android/gms/ads/internal/client/z2;

    invoke-direct {p0, p1}, Lx8/g;->d(Lcom/google/android/gms/ads/internal/client/z2;)V

    return-void
.end method

.method public b(Ly8/a;)V
    .locals 0

    iget-object p1, p1, Lx8/h;->a:Lcom/google/android/gms/ads/internal/client/z2;

    invoke-direct {p0, p1}, Lx8/g;->d(Lcom/google/android/gms/ads/internal/client/z2;)V

    return-void
.end method

.method final synthetic c(Lcom/google/android/gms/ads/internal/client/z2;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lx8/g;->c:Lcom/google/android/gms/ads/internal/client/n0;

    iget-object v1, p0, Lx8/g;->a:Lcom/google/android/gms/ads/internal/client/y4;

    iget-object v2, p0, Lx8/g;->b:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/ads/internal/client/y4;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/z2;)Lcom/google/android/gms/ads/internal/client/u4;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/internal/client/n0;->zzg(Lcom/google/android/gms/ads/internal/client/u4;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Failed to load ad."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
