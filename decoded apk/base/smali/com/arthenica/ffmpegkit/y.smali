.class public final enum Lcom/arthenica/ffmpegkit/y;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/arthenica/ffmpegkit/y;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/arthenica/ffmpegkit/y;

.field public static final enum COMPLETED:Lcom/arthenica/ffmpegkit/y;

.field public static final enum CREATED:Lcom/arthenica/ffmpegkit/y;

.field public static final enum FAILED:Lcom/arthenica/ffmpegkit/y;

.field public static final enum RUNNING:Lcom/arthenica/ffmpegkit/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/arthenica/ffmpegkit/y;

    const-string v1, "CREATED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/arthenica/ffmpegkit/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/arthenica/ffmpegkit/y;->CREATED:Lcom/arthenica/ffmpegkit/y;

    new-instance v0, Lcom/arthenica/ffmpegkit/y;

    const-string v1, "RUNNING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/arthenica/ffmpegkit/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/arthenica/ffmpegkit/y;->RUNNING:Lcom/arthenica/ffmpegkit/y;

    new-instance v0, Lcom/arthenica/ffmpegkit/y;

    const-string v1, "FAILED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/arthenica/ffmpegkit/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/arthenica/ffmpegkit/y;->FAILED:Lcom/arthenica/ffmpegkit/y;

    new-instance v0, Lcom/arthenica/ffmpegkit/y;

    const-string v1, "COMPLETED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/arthenica/ffmpegkit/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/arthenica/ffmpegkit/y;->COMPLETED:Lcom/arthenica/ffmpegkit/y;

    invoke-static {}, Lcom/arthenica/ffmpegkit/y;->b()[Lcom/arthenica/ffmpegkit/y;

    move-result-object v0

    sput-object v0, Lcom/arthenica/ffmpegkit/y;->$VALUES:[Lcom/arthenica/ffmpegkit/y;

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

.method private static synthetic b()[Lcom/arthenica/ffmpegkit/y;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/arthenica/ffmpegkit/y;

    const/4 v1, 0x0

    sget-object v2, Lcom/arthenica/ffmpegkit/y;->CREATED:Lcom/arthenica/ffmpegkit/y;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/arthenica/ffmpegkit/y;->RUNNING:Lcom/arthenica/ffmpegkit/y;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/arthenica/ffmpegkit/y;->FAILED:Lcom/arthenica/ffmpegkit/y;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/arthenica/ffmpegkit/y;->COMPLETED:Lcom/arthenica/ffmpegkit/y;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/arthenica/ffmpegkit/y;
    .locals 1

    const-class v0, Lcom/arthenica/ffmpegkit/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/arthenica/ffmpegkit/y;

    return-object p0
.end method

.method public static values()[Lcom/arthenica/ffmpegkit/y;
    .locals 1

    sget-object v0, Lcom/arthenica/ffmpegkit/y;->$VALUES:[Lcom/arthenica/ffmpegkit/y;

    invoke-virtual {v0}, [Lcom/arthenica/ffmpegkit/y;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/arthenica/ffmpegkit/y;

    return-object v0
.end method
