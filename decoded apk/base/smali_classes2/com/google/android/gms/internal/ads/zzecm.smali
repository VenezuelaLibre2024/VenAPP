.class public final synthetic Lcom/google/android/gms/internal/ads/zzecm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzecp;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzecq;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzecq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzecm;->zza:Lcom/google/android/gms/internal/ads/zzecq;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzbze;)Lcom/google/common/util/concurrent/f;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzecm;->zza:Lcom/google/android/gms/internal/ads/zzecq;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzecq;->zzd(Lcom/google/android/gms/internal/ads/zzbze;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method