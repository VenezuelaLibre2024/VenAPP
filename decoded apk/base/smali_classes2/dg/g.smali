.class public final enum Ldg/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldg/g;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ldg/g;

.field public static final enum AZTEC_LAYERS:Ldg/g;

.field public static final enum CHARACTER_SET:Ldg/g;

.field public static final enum CODE128_COMPACT:Ldg/g;

.field public static final enum DATA_MATRIX_COMPACT:Ldg/g;

.field public static final enum DATA_MATRIX_SHAPE:Ldg/g;

.field public static final enum ERROR_CORRECTION:Ldg/g;

.field public static final enum FORCE_C40:Ldg/g;

.field public static final enum FORCE_CODE_SET:Ldg/g;

.field public static final enum GS1_FORMAT:Ldg/g;

.field public static final enum MARGIN:Ldg/g;

.field public static final enum MAX_SIZE:Ldg/g;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum MIN_SIZE:Ldg/g;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum PDF417_AUTO_ECI:Ldg/g;

.field public static final enum PDF417_COMPACT:Ldg/g;

.field public static final enum PDF417_COMPACTION:Ldg/g;

.field public static final enum PDF417_DIMENSIONS:Ldg/g;

.field public static final enum QR_COMPACT:Ldg/g;

.field public static final enum QR_MASK_PATTERN:Ldg/g;

.field public static final enum QR_VERSION:Ldg/g;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    new-instance v0, Ldg/g;

    const-string v1, "ERROR_CORRECTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg/g;->ERROR_CORRECTION:Ldg/g;

    new-instance v1, Ldg/g;

    const-string v3, "CHARACTER_SET"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ldg/g;->CHARACTER_SET:Ldg/g;

    new-instance v3, Ldg/g;

    const-string v5, "DATA_MATRIX_SHAPE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ldg/g;->DATA_MATRIX_SHAPE:Ldg/g;

    new-instance v5, Ldg/g;

    const-string v7, "DATA_MATRIX_COMPACT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ldg/g;->DATA_MATRIX_COMPACT:Ldg/g;

    new-instance v7, Ldg/g;

    const-string v9, "MIN_SIZE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v7, Ldg/g;->MIN_SIZE:Ldg/g;

    new-instance v9, Ldg/g;

    const-string v11, "MAX_SIZE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v9, Ldg/g;->MAX_SIZE:Ldg/g;

    new-instance v11, Ldg/g;

    const-string v13, "MARGIN"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v11, Ldg/g;->MARGIN:Ldg/g;

    new-instance v13, Ldg/g;

    const-string v15, "PDF417_COMPACT"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v13, Ldg/g;->PDF417_COMPACT:Ldg/g;

    new-instance v15, Ldg/g;

    const-string v14, "PDF417_COMPACTION"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v15, Ldg/g;->PDF417_COMPACTION:Ldg/g;

    new-instance v14, Ldg/g;

    const-string v12, "PDF417_DIMENSIONS"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v14, Ldg/g;->PDF417_DIMENSIONS:Ldg/g;

    new-instance v12, Ldg/g;

    const-string v10, "PDF417_AUTO_ECI"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v12, Ldg/g;->PDF417_AUTO_ECI:Ldg/g;

    new-instance v10, Ldg/g;

    const-string v8, "AZTEC_LAYERS"

    const/16 v6, 0xb

    invoke-direct {v10, v8, v6}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v10, Ldg/g;->AZTEC_LAYERS:Ldg/g;

    new-instance v8, Ldg/g;

    const-string v6, "QR_VERSION"

    const/16 v4, 0xc

    invoke-direct {v8, v6, v4}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v8, Ldg/g;->QR_VERSION:Ldg/g;

    new-instance v6, Ldg/g;

    const-string v4, "QR_MASK_PATTERN"

    const/16 v2, 0xd

    invoke-direct {v6, v4, v2}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v6, Ldg/g;->QR_MASK_PATTERN:Ldg/g;

    new-instance v4, Ldg/g;

    const-string v2, "QR_COMPACT"

    move-object/from16 v17, v6

    const/16 v6, 0xe

    invoke-direct {v4, v2, v6}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v4, Ldg/g;->QR_COMPACT:Ldg/g;

    new-instance v2, Ldg/g;

    const-string v6, "GS1_FORMAT"

    move-object/from16 v18, v4

    const/16 v4, 0xf

    invoke-direct {v2, v6, v4}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ldg/g;->GS1_FORMAT:Ldg/g;

    new-instance v6, Ldg/g;

    const-string v4, "FORCE_CODE_SET"

    move-object/from16 v19, v2

    const/16 v2, 0x10

    invoke-direct {v6, v4, v2}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v6, Ldg/g;->FORCE_CODE_SET:Ldg/g;

    new-instance v4, Ldg/g;

    const-string v2, "FORCE_C40"

    move-object/from16 v20, v6

    const/16 v6, 0x11

    invoke-direct {v4, v2, v6}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v4, Ldg/g;->FORCE_C40:Ldg/g;

    new-instance v2, Ldg/g;

    const-string v6, "CODE128_COMPACT"

    move-object/from16 v21, v4

    const/16 v4, 0x12

    invoke-direct {v2, v6, v4}, Ldg/g;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ldg/g;->CODE128_COMPACT:Ldg/g;

    const/16 v6, 0x13

    new-array v6, v6, [Ldg/g;

    const/16 v16, 0x0

    aput-object v0, v6, v16

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

    aput-object v8, v6, v0

    const/16 v0, 0xd

    aput-object v17, v6, v0

    const/16 v0, 0xe

    aput-object v18, v6, v0

    const/16 v0, 0xf

    aput-object v19, v6, v0

    const/16 v0, 0x10

    aput-object v20, v6, v0

    const/16 v0, 0x11

    aput-object v21, v6, v0

    aput-object v2, v6, v4

    sput-object v6, Ldg/g;->$VALUES:[Ldg/g;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldg/g;
    .locals 1

    const-class v0, Ldg/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldg/g;

    return-object p0
.end method

.method public static values()[Ldg/g;
    .locals 1

    sget-object v0, Ldg/g;->$VALUES:[Ldg/g;

    invoke-virtual {v0}, [Ldg/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldg/g;

    return-object v0
.end method
