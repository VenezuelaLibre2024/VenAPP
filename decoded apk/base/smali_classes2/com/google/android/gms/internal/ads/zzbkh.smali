.class public final Lcom/google/android/gms/internal/ads/zzbkh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzbkg;

.field private final zzb:La9/b;

.field private final zzc:Lx8/b0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzbkg;)V
    .locals 4

    const-string v0, ""

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lx8/b0;

    invoke-direct {v1}, Lx8/b0;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzbkh;->zzc:Lx8/b0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbkh;->zza:Lcom/google/android/gms/internal/ads/zzbkg;

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzbkg;->zzh()Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->g2(Lcom/google/android/gms/dynamic/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_1

    new-instance v2, La9/b;

    invoke-direct {v2, p1}, La9/b;-><init>(Landroid/content/Context;)V

    :try_start_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbkh;->zza:Lcom/google/android/gms/internal/ads/zzbkg;

    invoke-static {v2}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object v3

    invoke-interface {p1, v3}, Lcom/google/android/gms/internal/ads/zzbkg;->zzs(Lcom/google/android/gms/dynamic/b;)Z

    move-result p1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2

    const/4 v0, 0x1

    if-eq v0, p1, :cond_0

    goto :goto_2

    :cond_0
    move-object v1, v2

    goto :goto_2

    :catch_2
    move-exception p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_2
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzbkh;->zzb:La9/b;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzbkg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbkh;->zza:Lcom/google/android/gms/internal/ads/zzbkg;

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbkh;->zza:Lcom/google/android/gms/internal/ads/zzbkg;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbkg;->zzi()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method
