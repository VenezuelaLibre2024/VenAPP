.class public final synthetic Lcom/google/android/gms/internal/ads/zzdzm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/ads/nativead/b$c;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzdzx;

.field public final synthetic zzb:Ljava/lang/String;

.field public final synthetic zzc:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzdzx;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdzm;->zza:Lcom/google/android/gms/internal/ads/zzdzx;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdzm;->zzb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdzm;->zzc:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onNativeAdLoaded(Lcom/google/android/gms/ads/nativead/b;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdzm;->zza:Lcom/google/android/gms/internal/ads/zzdzx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdzm;->zzb:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdzm;->zzc:Ljava/lang/String;

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/ads/zzdzx;->zzg(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
