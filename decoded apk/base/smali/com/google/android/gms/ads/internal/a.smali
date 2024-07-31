.class public final Lcom/google/android/gms/ads/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/zzcfs;

.field public final b:Lcom/google/android/gms/internal/ads/zzchi;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzchi;Lcom/google/android/gms/internal/ads/zzcfs;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/a;->b:Lcom/google/android/gms/internal/ads/zzchi;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/a;->a:Lcom/google/android/gms/internal/ads/zzcfs;

    return-void
.end method

.method public static a()Lcom/google/android/gms/ads/internal/a;
    .locals 3

    new-instance v0, Lcom/google/android/gms/ads/internal/a;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzchi;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzchi;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzcgd;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzcgd;-><init>()V

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/ads/internal/a;-><init>(Lcom/google/android/gms/internal/ads/zzchi;Lcom/google/android/gms/internal/ads/zzcfs;)V

    return-object v0
.end method
