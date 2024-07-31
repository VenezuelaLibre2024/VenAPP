.class public final enum Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field public static final enum zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field public static final enum zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field public static final enum zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field public static final enum zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field public static final enum zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field public static final enum zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field public static final enum zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field public static final enum zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field public static final enum zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field public static final enum zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field public static final enum zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field public static final enum zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field public static final enum zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

.field private static final synthetic zzo:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;


# instance fields
.field private final zzp:I


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const-string v1, "FORMAT_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const-string v3, "FORMAT_CODE_128"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const-string v5, "FORMAT_CODE_39"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const-string v7, "FORMAT_CODE_93"

    const/4 v8, 0x3

    const/4 v9, 0x4

    invoke-direct {v5, v7, v8, v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    new-instance v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const-string v10, "FORMAT_CODABAR"

    const/16 v11, 0x8

    invoke-direct {v7, v10, v9, v11}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    new-instance v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v12, 0x10

    const-string v13, "FORMAT_DATA_MATRIX"

    const/4 v14, 0x5

    invoke-direct {v10, v13, v14, v12}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    new-instance v12, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v13, 0x20

    const-string v15, "FORMAT_EAN_13"

    const/4 v14, 0x6

    invoke-direct {v12, v15, v14, v13}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    new-instance v13, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v15, 0x40

    const-string v14, "FORMAT_EAN_8"

    const/4 v9, 0x7

    invoke-direct {v13, v14, v9, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    new-instance v14, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const-string v15, "FORMAT_ITF"

    const/16 v9, 0x80

    invoke-direct {v14, v15, v11, v9}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    new-instance v9, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v15, 0x100

    const-string v11, "FORMAT_QR_CODE"

    const/16 v8, 0x9

    invoke-direct {v9, v11, v8, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v15, 0x200

    const-string v8, "FORMAT_UPC_A"

    const/16 v6, 0xa

    invoke-direct {v11, v8, v6, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v15, 0x400

    const-string v6, "FORMAT_UPC_E"

    const/16 v4, 0xb

    invoke-direct {v8, v6, v4, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    new-instance v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v15, 0x800

    const-string v4, "FORMAT_PDF417"

    const/16 v2, 0xc

    invoke-direct {v6, v4, v2, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v15, 0x1000

    const-string v2, "FORMAT_AZTEC"

    move-object/from16 v16, v6

    const/16 v6, 0xd

    invoke-direct {v4, v2, v6, v15}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/16 v2, 0xe

    new-array v2, v2, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    const/4 v15, 0x0

    aput-object v0, v2, v15

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v3, v2, v0

    const/4 v0, 0x3

    aput-object v5, v2, v0

    const/4 v0, 0x4

    aput-object v7, v2, v0

    const/4 v0, 0x5

    aput-object v10, v2, v0

    const/4 v0, 0x6

    aput-object v12, v2, v0

    const/4 v0, 0x7

    aput-object v13, v2, v0

    const/16 v0, 0x8

    aput-object v14, v2, v0

    const/16 v0, 0x9

    aput-object v9, v2, v0

    const/16 v0, 0xa

    aput-object v11, v2, v0

    const/16 v0, 0xb

    aput-object v8, v2, v0

    const/16 v0, 0xc

    aput-object v16, v2, v0

    aput-object v4, v2, v6

    sput-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzo:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzp:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzo:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzpv;->zzp:I

    return v0
.end method
