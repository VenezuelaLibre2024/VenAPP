.class public final Lcom/google/android/gms/internal/ads/zzbym;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/zzbym;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:Ljava/lang/String;

.field public final zzb:I

.field public final zzc:Landroid/os/Bundle;

.field public final zzd:[B

.field public final zze:Z

.field public final zzf:Ljava/lang/String;

.field public final zzg:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbyn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbyn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbym;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILandroid/os/Bundle;[BZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbym;->zza:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzbym;->zzb:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbym;->zzc:Landroid/os/Bundle;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzbym;->zzd:[B

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/zzbym;->zze:Z

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzbym;->zzf:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzbym;->zzg:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzbym;->zza:Ljava/lang/String;

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x2

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbym;->zzb:I

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 p2, 0x3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbym;->zzc:Landroid/os/Bundle;

    invoke-static {p1, p2, v1, v2}, Lea/c;->j(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    const/4 p2, 0x4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbym;->zzd:[B

    invoke-static {p1, p2, v1, v2}, Lea/c;->l(Landroid/os/Parcel;I[BZ)V

    const/4 p2, 0x5

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzbym;->zze:Z

    invoke-static {p1, p2, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/4 p2, 0x6

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbym;->zzf:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x7

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbym;->zzg:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
