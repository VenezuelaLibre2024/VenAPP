.class public final enum Ldg/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldg/r;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ldg/r;

.field public static final enum BYTE_SEGMENTS:Ldg/r;

.field public static final enum ERROR_CORRECTION_LEVEL:Ldg/r;

.field public static final enum ISSUE_NUMBER:Ldg/r;

.field public static final enum ORIENTATION:Ldg/r;

.field public static final enum OTHER:Ldg/r;

.field public static final enum PDF417_EXTRA_METADATA:Ldg/r;

.field public static final enum POSSIBLE_COUNTRY:Ldg/r;

.field public static final enum STRUCTURED_APPEND_PARITY:Ldg/r;

.field public static final enum STRUCTURED_APPEND_SEQUENCE:Ldg/r;

.field public static final enum SUGGESTED_PRICE:Ldg/r;

.field public static final enum SYMBOLOGY_IDENTIFIER:Ldg/r;

.field public static final enum UPC_EAN_EXTENSION:Ldg/r;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Ldg/r;

    const-string v1, "OTHER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldg/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldg/r;->OTHER:Ldg/r;

    new-instance v1, Ldg/r;

    const-string v3, "ORIENTATION"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ldg/r;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ldg/r;->ORIENTATION:Ldg/r;

    new-instance v3, Ldg/r;

    const-string v5, "BYTE_SEGMENTS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ldg/r;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ldg/r;->BYTE_SEGMENTS:Ldg/r;

    new-instance v5, Ldg/r;

    const-string v7, "ERROR_CORRECTION_LEVEL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ldg/r;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ldg/r;->ERROR_CORRECTION_LEVEL:Ldg/r;

    new-instance v7, Ldg/r;

    const-string v9, "ISSUE_NUMBER"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Ldg/r;-><init>(Ljava/lang/String;I)V

    sput-object v7, Ldg/r;->ISSUE_NUMBER:Ldg/r;

    new-instance v9, Ldg/r;

    const-string v11, "SUGGESTED_PRICE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Ldg/r;-><init>(Ljava/lang/String;I)V

    sput-object v9, Ldg/r;->SUGGESTED_PRICE:Ldg/r;

    new-instance v11, Ldg/r;

    const-string v13, "POSSIBLE_COUNTRY"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Ldg/r;-><init>(Ljava/lang/String;I)V

    sput-object v11, Ldg/r;->POSSIBLE_COUNTRY:Ldg/r;

    new-instance v13, Ldg/r;

    const-string v15, "UPC_EAN_EXTENSION"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Ldg/r;-><init>(Ljava/lang/String;I)V

    sput-object v13, Ldg/r;->UPC_EAN_EXTENSION:Ldg/r;

    new-instance v15, Ldg/r;

    const-string v14, "PDF417_EXTRA_METADATA"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Ldg/r;-><init>(Ljava/lang/String;I)V

    sput-object v15, Ldg/r;->PDF417_EXTRA_METADATA:Ldg/r;

    new-instance v14, Ldg/r;

    const-string v12, "STRUCTURED_APPEND_SEQUENCE"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Ldg/r;-><init>(Ljava/lang/String;I)V

    sput-object v14, Ldg/r;->STRUCTURED_APPEND_SEQUENCE:Ldg/r;

    new-instance v12, Ldg/r;

    const-string v10, "STRUCTURED_APPEND_PARITY"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8}, Ldg/r;-><init>(Ljava/lang/String;I)V

    sput-object v12, Ldg/r;->STRUCTURED_APPEND_PARITY:Ldg/r;

    new-instance v10, Ldg/r;

    const-string v8, "SYMBOLOGY_IDENTIFIER"

    const/16 v6, 0xb

    invoke-direct {v10, v8, v6}, Ldg/r;-><init>(Ljava/lang/String;I)V

    sput-object v10, Ldg/r;->SYMBOLOGY_IDENTIFIER:Ldg/r;

    const/16 v8, 0xc

    new-array v8, v8, [Ldg/r;

    aput-object v0, v8, v2

    aput-object v1, v8, v4

    const/4 v0, 0x2

    aput-object v3, v8, v0

    const/4 v0, 0x3

    aput-object v5, v8, v0

    const/4 v0, 0x4

    aput-object v7, v8, v0

    const/4 v0, 0x5

    aput-object v9, v8, v0

    const/4 v0, 0x6

    aput-object v11, v8, v0

    const/4 v0, 0x7

    aput-object v13, v8, v0

    const/16 v0, 0x8

    aput-object v15, v8, v0

    const/16 v0, 0x9

    aput-object v14, v8, v0

    const/16 v0, 0xa

    aput-object v12, v8, v0

    aput-object v10, v8, v6

    sput-object v8, Ldg/r;->$VALUES:[Ldg/r;

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

.method public static valueOf(Ljava/lang/String;)Ldg/r;
    .locals 1

    const-class v0, Ldg/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldg/r;

    return-object p0
.end method

.method public static values()[Ldg/r;
    .locals 1

    sget-object v0, Ldg/r;->$VALUES:[Ldg/r;

    invoke-virtual {v0}, [Ldg/r;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldg/r;

    return-object v0
.end method
