.class public final synthetic Lcom/google/android/gms/internal/ads/zzdpw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgdu;


# instance fields
.field public final synthetic zza:Lcom/google/common/util/concurrent/f;


# direct methods
.method public synthetic constructor <init>(Lcom/google/common/util/concurrent/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdpw;->zza:Lcom/google/common/util/concurrent/f;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcjk;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzdpw;->zza:Lcom/google/common/util/concurrent/f;

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzeml;

    const/4 v0, 0x1

    const-string v1, "Retrieve Web View from image ad response failed."

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzeml;-><init>(ILjava/lang/String;)V

    throw p1
.end method
