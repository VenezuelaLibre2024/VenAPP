.class public final synthetic Lcom/google/android/gms/internal/ads/zzcss;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzcst;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcst;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcss;->zza:Lcom/google/android/gms/internal/ads/zzcst;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcss;->zza:Lcom/google/android/gms/internal/ads/zzcst;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzcst;->zza:Lcom/google/android/gms/internal/ads/zzcsw;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcsw;->zza(Lcom/google/android/gms/internal/ads/zzcsw;)Lcom/google/android/gms/internal/ads/zzctb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzctb;->zzg()V

    return-void
.end method
