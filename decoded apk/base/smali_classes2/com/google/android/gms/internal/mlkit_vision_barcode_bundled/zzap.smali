.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zza:I

.field private final zzb:I

.field private final zzc:I

.field private final zzd:I

.field private final zze:I

.field private final zzf:I

.field private final zzg:Z

.field private final zzh:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzbe;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzbe;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIIIIIZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zza:I

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zzb:I

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zzc:I

    iput p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zzd:I

    iput p5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zze:I

    iput p6, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zzf:I

    iput-boolean p7, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zzg:Z

    iput-object p8, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zzh:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zza:I

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zzb:I

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zzc:I

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x4

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zzd:I

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x5

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zze:I

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x6

    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zzf:I

    invoke-static {p1, v0, v1}, Lea/c;->u(Landroid/os/Parcel;II)V

    const/4 v0, 0x7

    iget-boolean v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zzg:Z

    invoke-static {p1, v0, v1}, Lea/c;->g(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzap;->zzh:Ljava/lang/String;

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-static {p1, v2, v0, v1}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method