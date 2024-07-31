.class public final Lcom/google/android/gms/ads/internal/client/s3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/p;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/zzbjj;

.field private final b:Lx8/b0;

.field private final c:Lcom/google/android/gms/internal/ads/zzbkg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzbjj;Lcom/google/android/gms/internal/ads/zzbkg;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lx8/b0;

    invoke-direct {v0}, Lx8/b0;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/s3;->b:Lx8/b0;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/s3;->a:Lcom/google/android/gms/internal/ads/zzbjj;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/client/s3;->c:Lcom/google/android/gms/internal/ads/zzbkg;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/s3;->a:Lcom/google/android/gms/internal/ads/zzbjj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbjj;->zzl()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return v0
.end method

.method public final b()Lcom/google/android/gms/internal/ads/zzbjj;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/s3;->a:Lcom/google/android/gms/internal/ads/zzbjj;

    return-object v0
.end method

.method public final zza()Lcom/google/android/gms/internal/ads/zzbkg;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/s3;->c:Lcom/google/android/gms/internal/ads/zzbkg;

    return-object v0
.end method

.method public final zzb()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/s3;->a:Lcom/google/android/gms/internal/ads/zzbjj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbjj;->zzk()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return v0
.end method
