.class public final synthetic Lcom/google/android/gms/internal/ads/zzetr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzets;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzets;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzetr;->zza:Lcom/google/android/gms/internal/ads/zzets;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/ads/zzett;

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->b()Lla/f;

    move-result-object v1

    invoke-interface {v1}, Lla/f;->a()J

    move-result-wide v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/t;->q()Lcom/google/android/gms/internal/ads/zzcdl;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzcdl;->zzi()Lcom/google/android/gms/ads/internal/util/w1;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/ads/internal/util/w1;->zzh()Lcom/google/android/gms/internal/ads/zzcdf;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzcdf;->zza()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzett;-><init>(J)V

    return-object v0
.end method
