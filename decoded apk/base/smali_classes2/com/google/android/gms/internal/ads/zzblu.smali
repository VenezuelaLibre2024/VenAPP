.class public final Lcom/google/android/gms/internal/ads/zzblu;
.super Lcom/google/android/gms/internal/ads/zzbkz;
.source "SourceFile"


# instance fields
.field private final zza:La9/p;


# direct methods
.method public constructor <init>(La9/p;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbkz;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzblu;->zza:La9/p;

    return-void
.end method


# virtual methods
.method public final zze(Lcom/google/android/gms/internal/ads/zzblj;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzblk;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzblk;-><init>(Lcom/google/android/gms/internal/ads/zzblj;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzblu;->zza:La9/p;

    invoke-interface {p1, v0}, La9/p;->a(La9/h;)V

    return-void
.end method
