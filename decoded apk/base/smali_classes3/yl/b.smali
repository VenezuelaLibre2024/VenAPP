.class public final enum Lyl/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyl/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyl/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lyl/b;

.field public static final enum CANCEL:Lyl/b;

.field public static final enum COMPRESSION_ERROR:Lyl/b;

.field public static final enum CONNECT_ERROR:Lyl/b;

.field public static final Companion:Lyl/b$a;

.field public static final enum ENHANCE_YOUR_CALM:Lyl/b;

.field public static final enum FLOW_CONTROL_ERROR:Lyl/b;

.field public static final enum FRAME_SIZE_ERROR:Lyl/b;

.field public static final enum HTTP_1_1_REQUIRED:Lyl/b;

.field public static final enum INADEQUATE_SECURITY:Lyl/b;

.field public static final enum INTERNAL_ERROR:Lyl/b;

.field public static final enum NO_ERROR:Lyl/b;

.field public static final enum PROTOCOL_ERROR:Lyl/b;

.field public static final enum REFUSED_STREAM:Lyl/b;

.field public static final enum SETTINGS_TIMEOUT:Lyl/b;

.field public static final enum STREAM_CLOSED:Lyl/b;


# instance fields
.field private final httpCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lyl/b;

    const-string v1, "NO_ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->NO_ERROR:Lyl/b;

    new-instance v0, Lyl/b;

    const-string v1, "PROTOCOL_ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->PROTOCOL_ERROR:Lyl/b;

    new-instance v0, Lyl/b;

    const-string v1, "INTERNAL_ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->INTERNAL_ERROR:Lyl/b;

    new-instance v0, Lyl/b;

    const-string v1, "FLOW_CONTROL_ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->FLOW_CONTROL_ERROR:Lyl/b;

    new-instance v0, Lyl/b;

    const-string v1, "SETTINGS_TIMEOUT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->SETTINGS_TIMEOUT:Lyl/b;

    new-instance v0, Lyl/b;

    const-string v1, "STREAM_CLOSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->STREAM_CLOSED:Lyl/b;

    new-instance v0, Lyl/b;

    const-string v1, "FRAME_SIZE_ERROR"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->FRAME_SIZE_ERROR:Lyl/b;

    new-instance v0, Lyl/b;

    const-string v1, "REFUSED_STREAM"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->REFUSED_STREAM:Lyl/b;

    new-instance v0, Lyl/b;

    const-string v1, "CANCEL"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->CANCEL:Lyl/b;

    new-instance v0, Lyl/b;

    const-string v1, "COMPRESSION_ERROR"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->COMPRESSION_ERROR:Lyl/b;

    new-instance v0, Lyl/b;

    const-string v1, "CONNECT_ERROR"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->CONNECT_ERROR:Lyl/b;

    new-instance v0, Lyl/b;

    const-string v1, "ENHANCE_YOUR_CALM"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->ENHANCE_YOUR_CALM:Lyl/b;

    new-instance v0, Lyl/b;

    const-string v1, "INADEQUATE_SECURITY"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->INADEQUATE_SECURITY:Lyl/b;

    new-instance v0, Lyl/b;

    const-string v1, "HTTP_1_1_REQUIRED"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2, v2}, Lyl/b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lyl/b;->HTTP_1_1_REQUIRED:Lyl/b;

    invoke-static {}, Lyl/b;->b()[Lyl/b;

    move-result-object v0

    sput-object v0, Lyl/b;->$VALUES:[Lyl/b;

    new-instance v0, Lyl/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lyl/b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lyl/b;->Companion:Lyl/b$a;

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

    iput p3, p0, Lyl/b;->httpCode:I

    return-void
.end method

.method private static final synthetic b()[Lyl/b;
    .locals 3

    const/16 v0, 0xe

    new-array v0, v0, [Lyl/b;

    const/4 v1, 0x0

    sget-object v2, Lyl/b;->NO_ERROR:Lyl/b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lyl/b;->PROTOCOL_ERROR:Lyl/b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lyl/b;->INTERNAL_ERROR:Lyl/b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lyl/b;->FLOW_CONTROL_ERROR:Lyl/b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lyl/b;->SETTINGS_TIMEOUT:Lyl/b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lyl/b;->STREAM_CLOSED:Lyl/b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lyl/b;->FRAME_SIZE_ERROR:Lyl/b;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lyl/b;->REFUSED_STREAM:Lyl/b;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lyl/b;->CANCEL:Lyl/b;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lyl/b;->COMPRESSION_ERROR:Lyl/b;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lyl/b;->CONNECT_ERROR:Lyl/b;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lyl/b;->ENHANCE_YOUR_CALM:Lyl/b;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lyl/b;->INADEQUATE_SECURITY:Lyl/b;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lyl/b;->HTTP_1_1_REQUIRED:Lyl/b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyl/b;
    .locals 1

    const-class v0, Lyl/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyl/b;

    return-object p0
.end method

.method public static values()[Lyl/b;
    .locals 1

    sget-object v0, Lyl/b;->$VALUES:[Lyl/b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyl/b;

    return-object v0
.end method


# virtual methods
.method public final h()I
    .locals 1

    iget v0, p0, Lyl/b;->httpCode:I

    return v0
.end method
