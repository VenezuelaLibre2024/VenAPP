.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Ljava/lang/String;

.field private final zzd:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvf;

.field private final zze:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;

.field private final zzf:[Ljava/lang/String;

.field private final zzg:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzux;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvp;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;Ljava/lang/String;Ljava/lang/String;[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvf;[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;[Ljava/lang/String;[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzux;)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzc:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzd:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvf;

    iput-object p5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zze:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;

    iput-object p6, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzf:[Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzg:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzux;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lea/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Lea/c;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzb:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzc:Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lea/c;->G(Landroid/os/Parcel;ILjava/lang/String;Z)V

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzd:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvf;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->J(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zze:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->J(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzf:[Ljava/lang/String;

    invoke-static {p1, v1, v2, v3}, Lea/c;->H(Landroid/os/Parcel;I[Ljava/lang/String;Z)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzg:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzux;

    invoke-static {p1, v1, v2, p2, v3}, Lea/c;->J(Landroid/os/Parcel;I[Landroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lea/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzve;

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzc:Ljava/lang/String;

    return-object v0
.end method

.method public final zzd()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzux;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzg:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzux;

    return-object v0
.end method

.method public final zze()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zze:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvc;

    return-object v0
.end method

.method public final zzf()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzd:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvf;

    return-object v0
.end method

.method public final zzg()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzva;->zzf:[Ljava/lang/String;

    return-object v0
.end method
