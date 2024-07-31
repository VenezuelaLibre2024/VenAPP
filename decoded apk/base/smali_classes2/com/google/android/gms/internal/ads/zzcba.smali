.class public final Lcom/google/android/gms/internal/ads/zzcba;
.super Lcom/google/android/gms/internal/ads/zzcat;
.source "SourceFile"


# instance fields
.field private final zza:Ln9/d;

.field private final zzb:Ln9/c;


# direct methods
.method public constructor <init>(Ln9/d;Ln9/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcat;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcba;->zza:Ln9/d;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcba;->zzb:Ln9/c;

    return-void
.end method


# virtual methods
.method public final zze(I)V
    .locals 0

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/ads/internal/client/c3;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcba;->zza:Ln9/d;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/client/c3;->v1()Lx8/o;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcba;->zza:Ln9/d;

    invoke-virtual {v0, p1}, Lx8/f;->onAdFailedToLoad(Lx8/o;)V

    :cond_0
    return-void
.end method

.method public final zzg()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcba;->zza:Ln9/d;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcba;->zzb:Ln9/c;

    invoke-virtual {v0, v1}, Lx8/f;->onAdLoaded(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
