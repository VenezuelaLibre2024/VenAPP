.class public final synthetic Lcom/google/android/gms/internal/ads/zzph;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzpt;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzir;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzpt;Lcom/google/android/gms/internal/ads/zzir;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzph;->zza:Lcom/google/android/gms/internal/ads/zzpt;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzph;->zzb:Lcom/google/android/gms/internal/ads/zzir;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzph;->zza:Lcom/google/android/gms/internal/ads/zzpt;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzph;->zzb:Lcom/google/android/gms/internal/ads/zzir;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzpt;->zzq(Lcom/google/android/gms/internal/ads/zzir;)V

    return-void
.end method
