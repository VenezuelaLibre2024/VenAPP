.class public final enum Ldg/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldg/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ldg/a;

.field public static final enum AZTEC:Ldg/a;

.field public static final enum CODABAR:Ldg/a;

.field public static final enum CODE_128:Ldg/a;

.field public static final enum CODE_39:Ldg/a;

.field public static final enum CODE_93:Ldg/a;

.field public static final enum DATA_MATRIX:Ldg/a;

.field public static final enum EAN_13:Ldg/a;

.field public static final enum EAN_8:Ldg/a;

.field public static final enum ITF:Ldg/a;

.field public static final enum MAXICODE:Ldg/a;

.field public static final enum PDF_417:Ldg/a;

.field public static final enum QR_CODE:Ldg/a;

.field public static final enum RSS_14:Ldg/a;

.field public static final enum RSS_EXPANDED:Ldg/a;

.field public static final enum UPC_A:Ldg/a;

.field public static final enum UPC_E:Ldg/a;

.field public static final enum UPC_EAN_EXTENSION:Ldg/a;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Ldg/a;

    const-string v1, "AZTEC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg/a;->AZTEC:Ldg/a;

    new-instance v1, Ldg/a;

    const-string v3, "CODABAR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ldg/a;->CODABAR:Ldg/a;

    new-instance v3, Ldg/a;

    const-string v5, "CODE_39"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ldg/a;->CODE_39:Ldg/a;

    new-instance v5, Ldg/a;

    const-string v7, "CODE_93"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ldg/a;->CODE_93:Ldg/a;

    new-instance v7, Ldg/a;

    const-string v9, "CODE_128"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v7, Ldg/a;->CODE_128:Ldg/a;

    new-instance v9, Ldg/a;

    const-string v11, "DATA_MATRIX"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v9, Ldg/a;->DATA_MATRIX:Ldg/a;

    new-instance v11, Ldg/a;

    const-string v13, "EAN_8"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v11, Ldg/a;->EAN_8:Ldg/a;

    new-instance v13, Ldg/a;

    const-string v15, "EAN_13"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v13, Ldg/a;->EAN_13:Ldg/a;

    new-instance v15, Ldg/a;

    const-string v14, "ITF"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v15, Ldg/a;->ITF:Ldg/a;

    new-instance v14, Ldg/a;

    const-string v12, "MAXICODE"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v14, Ldg/a;->MAXICODE:Ldg/a;

    new-instance v12, Ldg/a;

    const-string v10, "PDF_417"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v12, Ldg/a;->PDF_417:Ldg/a;

    new-instance v10, Ldg/a;

    const-string v8, "QR_CODE"

    const/16 v6, 0xb

    invoke-direct {v10, v8, v6}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v10, Ldg/a;->QR_CODE:Ldg/a;

    new-instance v8, Ldg/a;

    const-string v6, "RSS_14"

    const/16 v4, 0xc

    invoke-direct {v8, v6, v4}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v8, Ldg/a;->RSS_14:Ldg/a;

    new-instance v6, Ldg/a;

    const-string v4, "RSS_EXPANDED"

    const/16 v2, 0xd

    invoke-direct {v6, v4, v2}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v6, Ldg/a;->RSS_EXPANDED:Ldg/a;

    new-instance v4, Ldg/a;

    const-string v2, "UPC_A"

    move-object/from16 v17, v6

    const/16 v6, 0xe

    invoke-direct {v4, v2, v6}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v4, Ldg/a;->UPC_A:Ldg/a;

    new-instance v2, Ldg/a;

    const-string v6, "UPC_E"

    move-object/from16 v18, v4

    const/16 v4, 0xf

    invoke-direct {v2, v6, v4}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ldg/a;->UPC_E:Ldg/a;

    new-instance v6, Ldg/a;

    const-string v4, "UPC_EAN_EXTENSION"

    move-object/from16 v19, v2

    const/16 v2, 0x10

    invoke-direct {v6, v4, v2}, Ldg/a;-><init>(Ljava/lang/String;I)V

    sput-object v6, Ldg/a;->UPC_EAN_EXTENSION:Ldg/a;

    const/16 v4, 0x11

    new-array v4, v4, [Ldg/a;

    const/16 v16, 0x0

    aput-object v0, v4, v16

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v3, v4, v0

    const/4 v0, 0x3

    aput-object v5, v4, v0

    const/4 v0, 0x4

    aput-object v7, v4, v0

    const/4 v0, 0x5

    aput-object v9, v4, v0

    const/4 v0, 0x6

    aput-object v11, v4, v0

    const/4 v0, 0x7

    aput-object v13, v4, v0

    const/16 v0, 0x8

    aput-object v15, v4, v0

    const/16 v0, 0x9

    aput-object v14, v4, v0

    const/16 v0, 0xa

    aput-object v12, v4, v0

    const/16 v0, 0xb

    aput-object v10, v4, v0

    const/16 v0, 0xc

    aput-object v8, v4, v0

    const/16 v0, 0xd

    aput-object v17, v4, v0

    const/16 v0, 0xe

    aput-object v18, v4, v0

    const/16 v0, 0xf

    aput-object v19, v4, v0

    aput-object v6, v4, v2

    sput-object v4, Ldg/a;->$VALUES:[Ldg/a;

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

.method public static valueOf(Ljava/lang/String;)Ldg/a;
    .locals 1

    const-class v0, Ldg/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldg/a;

    return-object p0
.end method

.method public static values()[Ldg/a;
    .locals 1

    sget-object v0, Ldg/a;->$VALUES:[Ldg/a;

    invoke-virtual {v0}, [Ldg/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldg/a;

    return-object v0
.end method
