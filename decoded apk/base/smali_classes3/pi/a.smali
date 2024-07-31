.class public final enum Lpi/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpi/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpi/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lik/a;

.field private static final synthetic $VALUES:[Lpi/a;

.field public static final enum ALL_FORMATS:Lpi/a;

.field public static final enum AZTEC:Lpi/a;

.field public static final enum CODABAR:Lpi/a;

.field public static final enum CODE_128:Lpi/a;

.field public static final enum CODE_39:Lpi/a;

.field public static final enum CODE_93:Lpi/a;

.field public static final Companion:Lpi/a$a;

.field public static final enum DATA_MATRIX:Lpi/a;

.field public static final enum EAN_13:Lpi/a;

.field public static final enum EAN_8:Lpi/a;

.field public static final enum ITF:Lpi/a;

.field public static final enum PDF417:Lpi/a;

.field public static final enum QR_CODE:Lpi/a;

.field public static final enum UNKNOWN:Lpi/a;

.field public static final enum UPC_A:Lpi/a;

.field public static final enum UPC_E:Lpi/a;


# instance fields
.field private final intValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lpi/a;

    const/4 v1, -0x1

    const-string v2, "UNKNOWN"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->UNKNOWN:Lpi/a;

    new-instance v0, Lpi/a;

    const-string v1, "ALL_FORMATS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->ALL_FORMATS:Lpi/a;

    new-instance v0, Lpi/a;

    const-string v1, "CODE_128"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->CODE_128:Lpi/a;

    new-instance v0, Lpi/a;

    const-string v1, "CODE_39"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v3}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->CODE_39:Lpi/a;

    new-instance v0, Lpi/a;

    const-string v1, "CODE_93"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->CODE_93:Lpi/a;

    new-instance v0, Lpi/a;

    const-string v1, "CODABAR"

    const/4 v2, 0x5

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, v3}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->CODABAR:Lpi/a;

    new-instance v0, Lpi/a;

    const/4 v1, 0x6

    const/16 v2, 0x10

    const-string v4, "DATA_MATRIX"

    invoke-direct {v0, v4, v1, v2}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->DATA_MATRIX:Lpi/a;

    new-instance v0, Lpi/a;

    const/4 v1, 0x7

    const/16 v2, 0x20

    const-string v4, "EAN_13"

    invoke-direct {v0, v4, v1, v2}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->EAN_13:Lpi/a;

    new-instance v0, Lpi/a;

    const-string v1, "EAN_8"

    const/16 v2, 0x40

    invoke-direct {v0, v1, v3, v2}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->EAN_8:Lpi/a;

    new-instance v0, Lpi/a;

    const/16 v1, 0x9

    const/16 v2, 0x80

    const-string v3, "ITF"

    invoke-direct {v0, v3, v1, v2}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->ITF:Lpi/a;

    new-instance v0, Lpi/a;

    const/16 v1, 0xa

    const/16 v2, 0x100

    const-string v3, "QR_CODE"

    invoke-direct {v0, v3, v1, v2}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->QR_CODE:Lpi/a;

    new-instance v0, Lpi/a;

    const/16 v1, 0xb

    const/16 v2, 0x200

    const-string v3, "UPC_A"

    invoke-direct {v0, v3, v1, v2}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->UPC_A:Lpi/a;

    new-instance v0, Lpi/a;

    const/16 v1, 0xc

    const/16 v2, 0x400

    const-string v3, "UPC_E"

    invoke-direct {v0, v3, v1, v2}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->UPC_E:Lpi/a;

    new-instance v0, Lpi/a;

    const/16 v1, 0xd

    const/16 v2, 0x800

    const-string v3, "PDF417"

    invoke-direct {v0, v3, v1, v2}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->PDF417:Lpi/a;

    new-instance v0, Lpi/a;

    const/16 v1, 0xe

    const/16 v2, 0x1000

    const-string v3, "AZTEC"

    invoke-direct {v0, v3, v1, v2}, Lpi/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lpi/a;->AZTEC:Lpi/a;

    invoke-static {}, Lpi/a;->b()[Lpi/a;

    move-result-object v0

    sput-object v0, Lpi/a;->$VALUES:[Lpi/a;

    invoke-static {v0}, Lik/b;->a([Ljava/lang/Enum;)Lik/a;

    move-result-object v0

    sput-object v0, Lpi/a;->$ENTRIES:Lik/a;

    new-instance v0, Lpi/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpi/a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lpi/a;->Companion:Lpi/a$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lpi/a;->intValue:I

    return-void
.end method

.method private static final synthetic b()[Lpi/a;
    .locals 3

    const/16 v0, 0xf

    new-array v0, v0, [Lpi/a;

    const/4 v1, 0x0

    sget-object v2, Lpi/a;->UNKNOWN:Lpi/a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lpi/a;->ALL_FORMATS:Lpi/a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lpi/a;->CODE_128:Lpi/a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lpi/a;->CODE_39:Lpi/a;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lpi/a;->CODE_93:Lpi/a;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lpi/a;->CODABAR:Lpi/a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lpi/a;->DATA_MATRIX:Lpi/a;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lpi/a;->EAN_13:Lpi/a;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lpi/a;->EAN_8:Lpi/a;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lpi/a;->ITF:Lpi/a;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lpi/a;->QR_CODE:Lpi/a;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lpi/a;->UPC_A:Lpi/a;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lpi/a;->UPC_E:Lpi/a;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lpi/a;->PDF417:Lpi/a;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lpi/a;->AZTEC:Lpi/a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpi/a;
    .locals 1

    const-class v0, Lpi/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpi/a;

    return-object p0
.end method

.method public static values()[Lpi/a;
    .locals 1

    sget-object v0, Lpi/a;->$VALUES:[Lpi/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpi/a;

    return-object v0
.end method


# virtual methods
.method public final h()I
    .locals 1

    iget v0, p0, Lpi/a;->intValue:I

    return v0
.end method
