.class public final synthetic Lcom/google/android/gms/internal/ads/zzgdl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzgdm;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfzv;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgdm;Lcom/google/android/gms/internal/ads/zzfzv;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgdl;->zza:Lcom/google/android/gms/internal/ads/zzgdm;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgdl;->zzb:Lcom/google/android/gms/internal/ads/zzfzv;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgdl;->zza:Lcom/google/android/gms/internal/ads/zzgdm;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgdl;->zzb:Lcom/google/android/gms/internal/ads/zzfzv;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgdm;->zzx(Lcom/google/android/gms/internal/ads/zzfzv;)V

    return-void
.end method