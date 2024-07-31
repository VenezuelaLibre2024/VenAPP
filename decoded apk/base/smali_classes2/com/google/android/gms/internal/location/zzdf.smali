.class public final Lcom/google/android/gms/internal/location/zzdf;
.super Lea/a;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/location/zzdf;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zza:I

.field private final zzb:Lcom/google/android/gms/internal/location/zzdd;

.field private final zzc:Lcom/google/android/gms/location/u0;

.field private final zzd:Lcom/google/android/gms/location/r0;

.field private final zze:Landroid/app/PendingIntent;

.field private final zzf:Lcom/google/android/gms/internal/location/zzk;

.field private final zzg:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/location/zzdg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzdg;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/location/zzdf;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/internal/location/zzdd;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/location/zzdf;->zza:I

    iput-object p2, p0, Lcom/google/android/gms/internal/location/zzdf;->zzb:Lcom/google/android/gms/internal/location/zzdd;

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    invoke-static {p3}, Lcom/google/android/gms/location/t0;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/location/u0;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/internal/location/zzdf;->zzc:Lcom/google/android/gms/location/u0;

    iput-object p5, p0, Lcom/google/android/gms/internal/location/zzdf;->zze:Landroid/app/PendingIntent;

    if-eqz p4, :cond_1

    invoke-static {p4}, Lcom/google/android/gms/location/q0;->zzb(Landroid/os/IBinder;)Lcom/google/android/gms/location/r0;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, p1

    :goto_1
    iput-object p2, p0, Lcom/google/android/gms/internal/location/zzdf;->zzd:Lcom/google/android/gms/location/r0;

    if-eqz p6, :cond_3

    const-string p1, "com.google.android.gms.location.internal.IFusedLocationProviderCallback"

    invoke-interface {p6, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p1

    instance-of p2, p1, Lcom/google/android/gms/internal/location/zzk;

    if-eqz p2, :cond_2

    check-cast p1, Lcom/google/android/gms/internal/location/zzk;

    goto :goto_2

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/location/zzi;

    invoke-direct {p1, p6}, Lcom/google/android/gms/internal/location/zzi;-><init>(Landroid/os/IBinder;)V

    :cond_3
    :goto_2
    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzdf;->zzf:Lcom/google/android/gms/internal/location/zzk;

    iput-object p7, p0, Lcom/google/android/gms/internal/location/zzdf;->zzg:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/location/zzdf;->zza:I

    invoke-static {p1, v1, v2}, Lea/c;->u(Landroid/os/Parcel;II)V

    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzdf;->zzb:Lcom/google/android/gms/internal/location/zzdd;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzdf;->zzc:Lcom/google/android/gms/location/u0;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v1

    :goto_0
    const/4 v4, 0x3

    invoke-static {p1, v4, v1, v3}, Lea/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/4 v1, 0x4

    iget-object v4, p0, Lcom/google/android/gms/internal/location/zzdf;->zze:Landroid/app/PendingIntent;

    invoke-static {p1, v1, v4, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/location/zzdf;->zzd:Lcom/google/android/gms/location/r0;

    if-nez p2, :cond_1

    move-object p2, v2

    goto :goto_1

    :cond_1
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    :goto_1
    const/4 v1, 0x5

    invoke-static {p1, v1, p2, v3}, Lea/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    iget-object p2, p0, Lcom/google/android/gms/internal/location/zzdf;->zzf:Lcom/google/android/gms/internal/location/zzk;

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    :goto_2
    const/4 p2, 0x6

    invoke-static {p1, p2, v2, v3}, Lea/c;->t(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    const/16 p2, 0x8

    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzdf;->zzg:Ljava/lang/String;

    invoke-static {p1, p2, v1, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
