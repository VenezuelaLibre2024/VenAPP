.class public final enum Ldg/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldg/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ldg/e;

.field public static final enum ALLOWED_EAN_EXTENSIONS:Ldg/e;

.field public static final enum ALLOWED_LENGTHS:Ldg/e;

.field public static final enum ALSO_INVERTED:Ldg/e;

.field public static final enum ASSUME_CODE_39_CHECK_DIGIT:Ldg/e;

.field public static final enum ASSUME_GS1:Ldg/e;

.field public static final enum CHARACTER_SET:Ldg/e;

.field public static final enum NEED_RESULT_POINT_CALLBACK:Ldg/e;

.field public static final enum OTHER:Ldg/e;

.field public static final enum POSSIBLE_FORMATS:Ldg/e;

.field public static final enum PURE_BARCODE:Ldg/e;

.field public static final enum RETURN_CODABAR_START_END:Ldg/e;

.field public static final enum TRY_HARDER:Ldg/e;


# instance fields
.field private final valueType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Ldg/e;

    const-class v1, Ljava/lang/Object;

    const-string v2, "OTHER"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Ldg/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v0, Ldg/e;->OTHER:Ldg/e;

    new-instance v1, Ldg/e;

    const-string v2, "PURE_BARCODE"

    const/4 v4, 0x1

    const-class v5, Ljava/lang/Void;

    invoke-direct {v1, v2, v4, v5}, Ldg/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v1, Ldg/e;->PURE_BARCODE:Ldg/e;

    new-instance v2, Ldg/e;

    const-class v6, Ljava/util/List;

    const-string v7, "POSSIBLE_FORMATS"

    const/4 v8, 0x2

    invoke-direct {v2, v7, v8, v6}, Ldg/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v2, Ldg/e;->POSSIBLE_FORMATS:Ldg/e;

    new-instance v6, Ldg/e;

    const-string v7, "TRY_HARDER"

    const/4 v9, 0x3

    invoke-direct {v6, v7, v9, v5}, Ldg/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v6, Ldg/e;->TRY_HARDER:Ldg/e;

    new-instance v7, Ldg/e;

    const-class v10, Ljava/lang/String;

    const-string v11, "CHARACTER_SET"

    const/4 v12, 0x4

    invoke-direct {v7, v11, v12, v10}, Ldg/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v7, Ldg/e;->CHARACTER_SET:Ldg/e;

    new-instance v10, Ldg/e;

    const-string v11, "ALLOWED_LENGTHS"

    const/4 v13, 0x5

    const-class v14, [I

    invoke-direct {v10, v11, v13, v14}, Ldg/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v10, Ldg/e;->ALLOWED_LENGTHS:Ldg/e;

    new-instance v11, Ldg/e;

    const-string v15, "ASSUME_CODE_39_CHECK_DIGIT"

    const/4 v13, 0x6

    invoke-direct {v11, v15, v13, v5}, Ldg/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v11, Ldg/e;->ASSUME_CODE_39_CHECK_DIGIT:Ldg/e;

    new-instance v15, Ldg/e;

    const-string v13, "ASSUME_GS1"

    const/4 v12, 0x7

    invoke-direct {v15, v13, v12, v5}, Ldg/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v15, Ldg/e;->ASSUME_GS1:Ldg/e;

    new-instance v13, Ldg/e;

    const-string v12, "RETURN_CODABAR_START_END"

    const/16 v9, 0x8

    invoke-direct {v13, v12, v9, v5}, Ldg/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v13, Ldg/e;->RETURN_CODABAR_START_END:Ldg/e;

    new-instance v12, Ldg/e;

    const-class v9, Ldg/t;

    const-string v8, "NEED_RESULT_POINT_CALLBACK"

    const/16 v4, 0x9

    invoke-direct {v12, v8, v4, v9}, Ldg/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v12, Ldg/e;->NEED_RESULT_POINT_CALLBACK:Ldg/e;

    new-instance v8, Ldg/e;

    const-string v9, "ALLOWED_EAN_EXTENSIONS"

    const/16 v4, 0xa

    invoke-direct {v8, v9, v4, v14}, Ldg/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v8, Ldg/e;->ALLOWED_EAN_EXTENSIONS:Ldg/e;

    new-instance v9, Ldg/e;

    const-string v14, "ALSO_INVERTED"

    const/16 v4, 0xb

    invoke-direct {v9, v14, v4, v5}, Ldg/e;-><init>(Ljava/lang/String;ILjava/lang/Class;)V

    sput-object v9, Ldg/e;->ALSO_INVERTED:Ldg/e;

    const/16 v5, 0xc

    new-array v5, v5, [Ldg/e;

    aput-object v0, v5, v3

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v6, v5, v0

    const/4 v0, 0x4

    aput-object v7, v5, v0

    const/4 v0, 0x5

    aput-object v10, v5, v0

    const/4 v0, 0x6

    aput-object v11, v5, v0

    const/4 v0, 0x7

    aput-object v15, v5, v0

    const/16 v0, 0x8

    aput-object v13, v5, v0

    const/16 v0, 0x9

    aput-object v12, v5, v0

    const/16 v0, 0xa

    aput-object v8, v5, v0

    aput-object v9, v5, v4

    sput-object v5, Ldg/e;->$VALUES:[Ldg/e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ldg/e;->valueType:Ljava/lang/Class;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldg/e;
    .locals 1

    const-class v0, Ldg/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldg/e;

    return-object p0
.end method

.method public static values()[Ldg/e;
    .locals 1

    sget-object v0, Ldg/e;->$VALUES:[Ldg/e;

    invoke-virtual {v0}, [Ldg/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldg/e;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Ldg/e;->valueType:Ljava/lang/Class;

    return-object v0
.end method
