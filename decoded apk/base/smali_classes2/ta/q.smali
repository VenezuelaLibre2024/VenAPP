.class public abstract Lta/q;
.super Lcom/google/android/gms/internal/maps/zzb;
.source "SourceFile"

# interfaces
.implements Lta/r;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.maps.internal.IOnMarkerDragListener"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/maps/zzb;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final zza(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 1

    const/4 p4, 0x1

    if-eq p1, p4, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/maps/zzac;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/maps/zzad;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/maps/zzc;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lta/r;->B(Lcom/google/android/gms/internal/maps/zzad;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/maps/zzac;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/maps/zzad;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/maps/zzc;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lta/r;->a(Lcom/google/android/gms/internal/maps/zzad;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/maps/zzac;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/internal/maps/zzad;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/maps/zzc;->zzc(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Lta/r;->G1(Lcom/google/android/gms/internal/maps/zzad;)V

    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    return p4
.end method
