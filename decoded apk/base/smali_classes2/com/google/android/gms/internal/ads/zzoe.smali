.class public final synthetic Lcom/google/android/gms/internal/ads/zzoe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzez;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzmq;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzdp;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzmq;Lcom/google/android/gms/internal/ads/zzdp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzoe;->zza:Lcom/google/android/gms/internal/ads/zzmq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzoe;->zzb:Lcom/google/android/gms/internal/ads/zzdp;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/zzms;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoe;->zza:Lcom/google/android/gms/internal/ads/zzmq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoe;->zzb:Lcom/google/android/gms/internal/ads/zzdp;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzms;->zzq(Lcom/google/android/gms/internal/ads/zzmq;Lcom/google/android/gms/internal/ads/zzdp;)V

    iget p1, v1, Lcom/google/android/gms/internal/ads/zzdp;->zzc:I

    return-void
.end method