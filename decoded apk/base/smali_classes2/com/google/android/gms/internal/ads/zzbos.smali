.class public final Lcom/google/android/gms/internal/ads/zzbos;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/ads/zzbos;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final zza:Z

.field public final zzb:Ljava/lang/String;

.field public final zzc:I

.field public final zzd:[B

.field public final zze:[Ljava/lang/String;

.field public final zzf:[Ljava/lang/String;

.field public final zzg:Z

.field public final zzh:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbot;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbot;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzbos;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ZLjava/lang/String;I[B[Ljava/lang/String;[Ljava/lang/String;ZJ)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzbos;->zza:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbos;->zzb:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzbos;->zzc:I

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzbos;->zzd:[B

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzbos;->zze:[Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzbos;->zzf:[Ljava/lang/String;

    iput-boolean p7, p0, Lcom/google/android/gms/internal/ads/zzbos;->zzg:Z

    iput-wide p8, p0, Lcom/google/android/gms/internal/ads/zzbos;->zzh:J

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzbos;->zza:Z

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v1, p2}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzbos;->zzb:Ljava/lang/String;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v1, p2, v2}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 p2, 0x3

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbos;->zzc:I

    invoke-static {p1, p2, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 p2, 0x4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbos;->zzd:[B

    invoke-static {p1, p2, v1, v2}, Lea/c;->l(Landroid/os/Parcel;I[BZ)V

    const/4 p2, 0x5

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbos;->zze:[Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lea/c;->H(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    const/4 p2, 0x6

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbos;->zzf:[Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Lea/c;->H(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    const/4 p2, 0x7

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzbos;->zzg:Z

    invoke-static {p1, p2, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    const/16 p2, 0x8

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzbos;->zzh:J

    invoke-static {p1, p2, v1, v2}, Lea/c;->z(Landroid/os/Parcel;IJ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
