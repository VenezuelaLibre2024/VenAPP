.class public final Lcom/google/android/gms/internal/ads/zzcbg;
.super Lcom/google/android/gms/internal/ads/zzcat;
.source "SourceFile"


# instance fields
.field private final zza:Lo9/b;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcbh;


# direct methods
.method public constructor <init>(Lo9/b;Lcom/google/android/gms/internal/ads/zzcbh;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcat;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbg;->zza:Lo9/b;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcbg;->zzb:Lcom/google/android/gms/internal/ads/zzcbh;

    return-void
.end method


# virtual methods
.method public final zze(I)V
    .locals 0

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/ads/internal/client/c3;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbg;->zza:Lo9/b;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/client/c3;->v1()Lx8/o;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx8/f;->onAdFailedToLoad(Lx8/o;)V

    :cond_0
    return-void
.end method

.method public final zzg()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbg;->zza:Lo9/b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcbg;->zzb:Lcom/google/android/gms/internal/ads/zzcbh;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lx8/f;->onAdLoaded(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
