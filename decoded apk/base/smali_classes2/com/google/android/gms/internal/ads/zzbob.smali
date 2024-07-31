.class public final Lcom/google/android/gms/internal/ads/zzbob;
.super Lcom/google/android/gms/internal/ads/zzbod;
.source "SourceFile"


# instance fields
.field private final zza:Lb9/b;


# direct methods
.method public constructor <init>(Lb9/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbod;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbob;->zza:Lb9/b;

    return-void
.end method


# virtual methods
.method public final zzb(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbob;->zza:Lb9/b;

    invoke-interface {v0, p1}, Lb9/b;->onH5AdsEvent(Ljava/lang/String;)V

    return-void
.end method
