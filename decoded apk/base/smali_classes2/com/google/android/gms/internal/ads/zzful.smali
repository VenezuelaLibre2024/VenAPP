.class public abstract Lcom/google/android/gms/internal/ads/zzful;
.super Lcom/google/android/gms/internal/ads/zzayh;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfum;


# direct methods
.method public static zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzfum;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.play.core.lmd.protocol.ILmdOverlayService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzfum;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzfum;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfuk;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzfuk;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
