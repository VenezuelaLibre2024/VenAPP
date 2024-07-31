.class public final Lcom/google/android/gms/internal/ads/zzbae;
.super Lcom/google/android/gms/internal/ads/zzbal;
.source "SourceFile"


# instance fields
.field private final zza:Lz8/a$a;

.field private final zzb:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lz8/a$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbal;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbae;->zza:Lz8/a$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbae;->zzb:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zzb(I)V
    .locals 0

    return-void
.end method

.method public final zzc(Lcom/google/android/gms/ads/internal/client/c3;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbae;->zza:Lz8/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/client/c3;->v1()Lx8/o;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbae;->zza:Lz8/a$a;

    invoke-virtual {v0, p1}, Lx8/f;->onAdFailedToLoad(Lx8/o;)V

    :cond_0
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzbaj;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbae;->zza:Lz8/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbae;->zzb:Ljava/lang/String;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbaf;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzbaf;-><init>(Lcom/google/android/gms/internal/ads/zzbaj;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbae;->zza:Lz8/a$a;

    invoke-virtual {p1, v1}, Lx8/f;->onAdLoaded(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
