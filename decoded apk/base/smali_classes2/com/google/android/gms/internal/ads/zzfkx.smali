.class public final synthetic Lcom/google/android/gms/internal/ads/zzfkx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgdu;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzfkp;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfkp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfkx;->zza:Lcom/google/android/gms/internal/ads/zzfkp;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    check-cast p1, Ljava/lang/Exception;

    const-string p1, ""

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzgen;->zzh(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
