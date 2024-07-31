.class public final Lcom/google/android/gms/internal/ads/zzeir;
.super Lcom/google/android/gms/internal/ads/zzead;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/ads/internal/client/c3;


# direct methods
.method public constructor <init>(ILcom/google/android/gms/ads/internal/client/c3;)V
    .locals 1

    iget-object v0, p2, Lcom/google/android/gms/ads/internal/client/c3;->b:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzead;-><init>(ILjava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeir;->zza:Lcom/google/android/gms/ads/internal/client/c3;

    return-void
.end method


# virtual methods
.method public final zzb()Lcom/google/android/gms/ads/internal/client/c3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeir;->zza:Lcom/google/android/gms/ads/internal/client/c3;

    return-object v0
.end method
