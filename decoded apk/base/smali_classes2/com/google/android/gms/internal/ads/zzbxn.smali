.class final Lcom/google/android/gms/internal/ads/zzbxn;
.super Lcom/google/android/gms/internal/ads/zzbxh;
.source "SourceFile"


# instance fields
.field final synthetic zza:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbxq;Ljava/util/List;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbxn;->zza:Ljava/util/List;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbxh;-><init>()V

    return-void
.end method


# virtual methods
.method public final zze(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Error recording impression urls: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzg(Ljava/lang/String;)V

    return-void
.end method

.method public final zzf(Ljava/util/List;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbxn;->zza:Ljava/util/List;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Recorded impression urls: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzi(Ljava/lang/String;)V

    return-void
.end method
