.class public final synthetic Lcom/google/android/gms/internal/ads/zzebk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgdu;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzebl;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzebl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzebk;->zza:Lcom/google/android/gms/internal/ads/zzebl;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzebk;->zza:Lcom/google/android/gms/internal/ads/zzebl;

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzebl;->zzb(Lorg/json/JSONObject;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method