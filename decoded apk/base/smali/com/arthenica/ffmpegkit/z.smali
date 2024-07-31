.class public final enum Lcom/arthenica/ffmpegkit/z;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/arthenica/ffmpegkit/z;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/arthenica/ffmpegkit/z;

.field public static final enum SIGINT:Lcom/arthenica/ffmpegkit/z;

.field public static final enum SIGPIPE:Lcom/arthenica/ffmpegkit/z;

.field public static final enum SIGQUIT:Lcom/arthenica/ffmpegkit/z;

.field public static final enum SIGTERM:Lcom/arthenica/ffmpegkit/z;

.field public static final enum SIGXCPU:Lcom/arthenica/ffmpegkit/z;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/arthenica/ffmpegkit/z;

    const-string v1, "SIGINT"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/arthenica/ffmpegkit/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/z;->SIGINT:Lcom/arthenica/ffmpegkit/z;

    new-instance v0, Lcom/arthenica/ffmpegkit/z;

    const-string v1, "SIGQUIT"

    const/4 v2, 0x1

    const/4 v4, 0x3

    invoke-direct {v0, v1, v2, v4}, Lcom/arthenica/ffmpegkit/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/z;->SIGQUIT:Lcom/arthenica/ffmpegkit/z;

    new-instance v0, Lcom/arthenica/ffmpegkit/z;

    const-string v1, "SIGPIPE"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v3, v2}, Lcom/arthenica/ffmpegkit/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/z;->SIGPIPE:Lcom/arthenica/ffmpegkit/z;

    new-instance v0, Lcom/arthenica/ffmpegkit/z;

    const-string v1, "SIGTERM"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v4, v2}, Lcom/arthenica/ffmpegkit/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/z;->SIGTERM:Lcom/arthenica/ffmpegkit/z;

    new-instance v0, Lcom/arthenica/ffmpegkit/z;

    const/4 v1, 0x4

    const/16 v2, 0x18

    const-string v3, "SIGXCPU"

    invoke-direct {v0, v3, v1, v2}, Lcom/arthenica/ffmpegkit/z;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/z;->SIGXCPU:Lcom/arthenica/ffmpegkit/z;

    invoke-static {}, Lcom/arthenica/ffmpegkit/z;->b()[Lcom/arthenica/ffmpegkit/z;

    move-result-object v0

    sput-object v0, Lcom/arthenica/ffmpegkit/z;->$VALUES:[Lcom/arthenica/ffmpegkit/z;

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

    iput p3, p0, Lcom/arthenica/ffmpegkit/z;->value:I

    return-void
.end method

.method private static synthetic b()[Lcom/arthenica/ffmpegkit/z;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/arthenica/ffmpegkit/z;

    const/4 v1, 0x0

    sget-object v2, Lcom/arthenica/ffmpegkit/z;->SIGINT:Lcom/arthenica/ffmpegkit/z;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/arthenica/ffmpegkit/z;->SIGQUIT:Lcom/arthenica/ffmpegkit/z;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/arthenica/ffmpegkit/z;->SIGPIPE:Lcom/arthenica/ffmpegkit/z;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/arthenica/ffmpegkit/z;->SIGTERM:Lcom/arthenica/ffmpegkit/z;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/arthenica/ffmpegkit/z;->SIGXCPU:Lcom/arthenica/ffmpegkit/z;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/arthenica/ffmpegkit/z;
    .locals 1

    const-class v0, Lcom/arthenica/ffmpegkit/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/arthenica/ffmpegkit/z;

    return-object p0
.end method

.method public static values()[Lcom/arthenica/ffmpegkit/z;
    .locals 1

    sget-object v0, Lcom/arthenica/ffmpegkit/z;->$VALUES:[Lcom/arthenica/ffmpegkit/z;

    invoke-virtual {v0}, [Lcom/arthenica/ffmpegkit/z;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/arthenica/ffmpegkit/z;

    return-object v0
.end method


# virtual methods
.method public h()I
    .locals 1

    iget v0, p0, Lcom/arthenica/ffmpegkit/z;->value:I

    return v0
.end method
