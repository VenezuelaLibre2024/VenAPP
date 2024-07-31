.class public final Lcom/google/android/gms/internal/ads/zzbxk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static zza:Lcom/google/android/gms/internal/ads/zzcct;


# instance fields
.field private final zzb:Landroid/content/Context;

.field private final zzc:Lx8/c;

.field private final zzd:Lcom/google/android/gms/ads/internal/client/z2;

.field private final zze:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lx8/c;Lcom/google/android/gms/ads/internal/client/z2;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbxk;->zzb:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbxk;->zzc:Lx8/c;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbxk;->zzd:Lcom/google/android/gms/ads/internal/client/z2;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzbxk;->zze:Ljava/lang/String;

    return-void
.end method

.method public static zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcct;
    .locals 3

    const-class v0, Lcom/google/android/gms/internal/ads/zzbxk;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbxk;->zza:Lcom/google/android/gms/internal/ads/zzcct;

    if-nez v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->a()Lcom/google/android/gms/ads/internal/client/v;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/zzbsr;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzbsr;-><init>()V

    invoke-virtual {v1, p0, v2}, Lcom/google/android/gms/ads/internal/client/v;->p(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbsv;)Lcom/google/android/gms/internal/ads/zzcct;

    move-result-object p0

    sput-object p0, Lcom/google/android/gms/internal/ads/zzbxk;->zza:Lcom/google/android/gms/internal/ads/zzcct;

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/ads/zzbxk;->zza:Lcom/google/android/gms/internal/ads/zzcct;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final zzb(Lm9/b;)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbxk;->zzb:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbxk;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcct;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "Internal Error, query info generator is null."

    :goto_0
    invoke-virtual {p1, v0}, Lm9/b;->onFailure(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbxk;->zzb:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbxk;->zzd:Lcom/google/android/gms/ads/internal/client/z2;

    invoke-static {v1}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object v1

    if-nez v2, :cond_1

    new-instance v2, Lcom/google/android/gms/ads/internal/client/v4;

    invoke-direct {v2}, Lcom/google/android/gms/ads/internal/client/v4;-><init>()V

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/client/v4;->a()Lcom/google/android/gms/ads/internal/client/u4;

    move-result-object v2

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzbxk;->zzb:Landroid/content/Context;

    sget-object v4, Lcom/google/android/gms/ads/internal/client/y4;->a:Lcom/google/android/gms/ads/internal/client/y4;

    invoke-virtual {v4, v3, v2}, Lcom/google/android/gms/ads/internal/client/y4;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/z2;)Lcom/google/android/gms/ads/internal/client/u4;

    move-result-object v2

    :goto_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzbxk;->zze:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzbxk;->zzc:Lx8/c;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzccx;

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    invoke-direct {v5, v3, v4, v6, v2}, Lcom/google/android/gms/internal/ads/zzccx;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/z4;Lcom/google/android/gms/ads/internal/client/u4;)V

    :try_start_0
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbxj;

    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/internal/ads/zzbxj;-><init>(Lcom/google/android/gms/internal/ads/zzbxk;Lm9/b;)V

    invoke-interface {v0, v1, v5, v2}, Lcom/google/android/gms/internal/ads/zzcct;->zzf(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzccx;Lcom/google/android/gms/internal/ads/zzccq;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "Internal Error."

    goto :goto_0
.end method
