.class final Lcom/google/android/gms/ads/internal/client/w3;
.super Lcom/google/android/gms/ads/internal/client/m0;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/android/gms/ads/internal/client/x3;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/ads/internal/client/x3;Lcom/google/android/gms/ads/internal/client/v3;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/w3;->a:Lcom/google/android/gms/ads/internal/client/x3;

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/m0;-><init>()V

    return-void
.end method


# virtual methods
.method public final zze()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzg(Lcom/google/android/gms/ads/internal/client/u4;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/ads/internal/client/w3;->zzh(Lcom/google/android/gms/ads/internal/client/u4;I)V

    return-void
.end method

.method public final zzh(Lcom/google/android/gms/ads/internal/client/u4;I)V
    .locals 0

    const-string p1, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzg(Ljava/lang/String;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/zzcdv;->zza:Landroid/os/Handler;

    new-instance p2, Lcom/google/android/gms/ads/internal/client/u3;

    invoke-direct {p2, p0}, Lcom/google/android/gms/ads/internal/client/u3;-><init>(Lcom/google/android/gms/ads/internal/client/w3;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final zzi()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
