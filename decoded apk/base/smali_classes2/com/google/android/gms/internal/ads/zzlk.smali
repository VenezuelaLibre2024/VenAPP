.class public final synthetic Lcom/google/android/gms/internal/ads/zzlk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzll;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfzx;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzur;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzll;Lcom/google/android/gms/internal/ads/zzfzx;Lcom/google/android/gms/internal/ads/zzur;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzlk;->zza:Lcom/google/android/gms/internal/ads/zzll;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzlk;->zzb:Lcom/google/android/gms/internal/ads/zzfzx;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzlk;->zzc:Lcom/google/android/gms/internal/ads/zzur;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzlk;->zza:Lcom/google/android/gms/internal/ads/zzll;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzlk;->zzb:Lcom/google/android/gms/internal/ads/zzfzx;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzlk;->zzc:Lcom/google/android/gms/internal/ads/zzur;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzll;->zzk(Lcom/google/android/gms/internal/ads/zzfzx;Lcom/google/android/gms/internal/ads/zzur;)V

    return-void
.end method