.class public final Lcom/google/android/gms/internal/ads/zzblr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:La9/n;

.field private final zzb:La9/m;

.field private zzc:Lcom/google/android/gms/internal/ads/zzbkh;


# direct methods
.method public constructor <init>(La9/n;La9/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzblr;->zza:La9/n;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzblr;->zzb:La9/m;

    return-void
.end method

.method static bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzblr;)La9/m;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzblr;->zzb:La9/m;

    return-object p0
.end method

.method static bridge synthetic zzb(Lcom/google/android/gms/internal/ads/zzblr;)La9/n;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzblr;->zza:La9/n;

    return-object p0
.end method

.method static bridge synthetic zze(Lcom/google/android/gms/internal/ads/zzblr;Lcom/google/android/gms/internal/ads/zzbkg;)Lcom/google/android/gms/internal/ads/zzbkh;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzblr;->zzf(Lcom/google/android/gms/internal/ads/zzbkg;)Lcom/google/android/gms/internal/ads/zzbkh;

    move-result-object p0

    return-object p0
.end method

.method private final declared-synchronized zzf(Lcom/google/android/gms/internal/ads/zzbkg;)Lcom/google/android/gms/internal/ads/zzbkh;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzblr;->zzc:Lcom/google/android/gms/internal/ads/zzbkh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbkh;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzbkh;-><init>(Lcom/google/android/gms/internal/ads/zzbkg;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzblr;->zzc:Lcom/google/android/gms/internal/ads/zzbkh;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final zzc()Lcom/google/android/gms/internal/ads/zzbkq;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzblr;->zzb:La9/m;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzblo;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzblo;-><init>(Lcom/google/android/gms/internal/ads/zzblr;Lcom/google/android/gms/internal/ads/zzbln;)V

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzbkt;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzblq;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/zzblq;-><init>(Lcom/google/android/gms/internal/ads/zzblr;Lcom/google/android/gms/internal/ads/zzblp;)V

    return-object v0
.end method
