.class public final synthetic Lcom/google/android/gms/internal/ads/zzeeb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/common/util/concurrent/f;

.field public final synthetic zzb:Lcom/google/common/util/concurrent/f;


# direct methods
.method public synthetic constructor <init>(Lcom/google/common/util/concurrent/f;Lcom/google/common/util/concurrent/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeeb;->zza:Lcom/google/common/util/concurrent/f;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeeb;->zzb:Lcom/google/common/util/concurrent/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeeb;->zza:Lcom/google/common/util/concurrent/f;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzefc;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzeeb;->zzb:Lcom/google/common/util/concurrent/f;

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzbzh;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzefc;-><init>(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzbzh;)V

    return-object v1
.end method
