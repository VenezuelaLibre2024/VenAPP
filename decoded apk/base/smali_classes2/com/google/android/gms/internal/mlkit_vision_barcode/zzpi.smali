.class public final enum Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

.field public static final enum zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

.field public static final enum zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

.field public static final enum zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

.field private static final synthetic zze:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;


# instance fields
.field private final zzf:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    const-string v1, "TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    const-string v3, "TYPE_THIN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    const-string v5, "TYPE_THICK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    const-string v7, "TYPE_GMV"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;->zze:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;->zzf:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;->zze:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpi;->zzf:I

    return v0
.end method