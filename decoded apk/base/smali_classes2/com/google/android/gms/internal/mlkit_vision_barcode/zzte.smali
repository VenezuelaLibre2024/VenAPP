.class public final enum Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfe;


# static fields
.field public static final enum zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzo:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field public static final enum zzp:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

.field private static final synthetic zzq:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;


# instance fields
.field private final zzr:I


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v1, "UNRECOGNIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v3, "CODE_128"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v5, "CODE_39"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzc:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v7, "CODE_93"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzd:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v9, "CODABAR"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zze:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v9, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v11, "DATA_MATRIX"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzf:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v13, "EAN_13"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzg:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v13, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v15, "EAN_8"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14, v14}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzh:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v15, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v14, "ITF"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12, v12}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzi:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v14, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v12, "QR_CODE"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10, v10}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v12, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v10, "UPC_A"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8, v8}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v8, "UPC_E"

    const/16 v6, 0xb

    invoke-direct {v10, v8, v6, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzl:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v6, "PDF417"

    const/16 v4, 0xc

    invoke-direct {v8, v6, v4, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzm:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v4, "AZTEC"

    const/16 v2, 0xd

    invoke-direct {v6, v4, v2, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzn:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v2, "DATABAR"

    move-object/from16 v16, v6

    const/16 v6, 0xe

    invoke-direct {v4, v2, v6, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzo:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const-string v6, "TEZ_CODE"

    move-object/from16 v17, v4

    const/16 v4, 0xf

    move-object/from16 v18, v8

    const/16 v8, 0x10

    invoke-direct {v2, v6, v4, v8}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzp:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    new-array v6, v8, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    const/4 v8, 0x0

    aput-object v0, v6, v8

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v0, 0x2

    aput-object v3, v6, v0

    const/4 v0, 0x3

    aput-object v5, v6, v0

    const/4 v0, 0x4

    aput-object v7, v6, v0

    const/4 v0, 0x5

    aput-object v9, v6, v0

    const/4 v0, 0x6

    aput-object v11, v6, v0

    const/4 v0, 0x7

    aput-object v13, v6, v0

    const/16 v0, 0x8

    aput-object v15, v6, v0

    const/16 v0, 0x9

    aput-object v14, v6, v0

    const/16 v0, 0xa

    aput-object v12, v6, v0

    const/16 v0, 0xb

    aput-object v10, v6, v0

    const/16 v0, 0xc

    aput-object v18, v6, v0

    const/16 v0, 0xd

    aput-object v16, v6, v0

    const/16 v0, 0xe

    aput-object v17, v6, v0

    aput-object v2, v6, v4

    sput-object v6, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzq:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzr:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzq:[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzte;->zzr:I

    return v0
.end method
