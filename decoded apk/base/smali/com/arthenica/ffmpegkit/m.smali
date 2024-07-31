.class public final enum Lcom/arthenica/ffmpegkit/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/arthenica/ffmpegkit/m;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/arthenica/ffmpegkit/m;

.field public static final enum AV_LOG_DEBUG:Lcom/arthenica/ffmpegkit/m;

.field public static final enum AV_LOG_ERROR:Lcom/arthenica/ffmpegkit/m;

.field public static final enum AV_LOG_FATAL:Lcom/arthenica/ffmpegkit/m;

.field public static final enum AV_LOG_INFO:Lcom/arthenica/ffmpegkit/m;

.field public static final enum AV_LOG_PANIC:Lcom/arthenica/ffmpegkit/m;

.field public static final enum AV_LOG_QUIET:Lcom/arthenica/ffmpegkit/m;

.field public static final enum AV_LOG_STDERR:Lcom/arthenica/ffmpegkit/m;

.field public static final enum AV_LOG_TRACE:Lcom/arthenica/ffmpegkit/m;

.field public static final enum AV_LOG_VERBOSE:Lcom/arthenica/ffmpegkit/m;

.field public static final enum AV_LOG_WARNING:Lcom/arthenica/ffmpegkit/m;


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/arthenica/ffmpegkit/m;

    const/16 v1, -0x10

    const-string v2, "AV_LOG_STDERR"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/arthenica/ffmpegkit/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_STDERR:Lcom/arthenica/ffmpegkit/m;

    new-instance v0, Lcom/arthenica/ffmpegkit/m;

    const/4 v1, 0x1

    const/4 v2, -0x8

    const-string v4, "AV_LOG_QUIET"

    invoke-direct {v0, v4, v1, v2}, Lcom/arthenica/ffmpegkit/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_QUIET:Lcom/arthenica/ffmpegkit/m;

    new-instance v0, Lcom/arthenica/ffmpegkit/m;

    const-string v1, "AV_LOG_PANIC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/arthenica/ffmpegkit/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_PANIC:Lcom/arthenica/ffmpegkit/m;

    new-instance v0, Lcom/arthenica/ffmpegkit/m;

    const-string v1, "AV_LOG_FATAL"

    const/4 v2, 0x3

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, v3}, Lcom/arthenica/ffmpegkit/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_FATAL:Lcom/arthenica/ffmpegkit/m;

    new-instance v0, Lcom/arthenica/ffmpegkit/m;

    const/4 v1, 0x4

    const/16 v2, 0x10

    const-string v4, "AV_LOG_ERROR"

    invoke-direct {v0, v4, v1, v2}, Lcom/arthenica/ffmpegkit/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_ERROR:Lcom/arthenica/ffmpegkit/m;

    new-instance v0, Lcom/arthenica/ffmpegkit/m;

    const/4 v1, 0x5

    const/16 v2, 0x18

    const-string v4, "AV_LOG_WARNING"

    invoke-direct {v0, v4, v1, v2}, Lcom/arthenica/ffmpegkit/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_WARNING:Lcom/arthenica/ffmpegkit/m;

    new-instance v0, Lcom/arthenica/ffmpegkit/m;

    const/4 v1, 0x6

    const/16 v2, 0x20

    const-string v4, "AV_LOG_INFO"

    invoke-direct {v0, v4, v1, v2}, Lcom/arthenica/ffmpegkit/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_INFO:Lcom/arthenica/ffmpegkit/m;

    new-instance v0, Lcom/arthenica/ffmpegkit/m;

    const/4 v1, 0x7

    const/16 v2, 0x28

    const-string v4, "AV_LOG_VERBOSE"

    invoke-direct {v0, v4, v1, v2}, Lcom/arthenica/ffmpegkit/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_VERBOSE:Lcom/arthenica/ffmpegkit/m;

    new-instance v0, Lcom/arthenica/ffmpegkit/m;

    const-string v1, "AV_LOG_DEBUG"

    const/16 v2, 0x30

    invoke-direct {v0, v1, v3, v2}, Lcom/arthenica/ffmpegkit/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_DEBUG:Lcom/arthenica/ffmpegkit/m;

    new-instance v0, Lcom/arthenica/ffmpegkit/m;

    const/16 v1, 0x9

    const/16 v2, 0x38

    const-string v3, "AV_LOG_TRACE"

    invoke-direct {v0, v3, v1, v2}, Lcom/arthenica/ffmpegkit/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_TRACE:Lcom/arthenica/ffmpegkit/m;

    invoke-static {}, Lcom/arthenica/ffmpegkit/m;->b()[Lcom/arthenica/ffmpegkit/m;

    move-result-object v0

    sput-object v0, Lcom/arthenica/ffmpegkit/m;->$VALUES:[Lcom/arthenica/ffmpegkit/m;

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

    iput p3, p0, Lcom/arthenica/ffmpegkit/m;->value:I

    return-void
.end method

.method private static synthetic b()[Lcom/arthenica/ffmpegkit/m;
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Lcom/arthenica/ffmpegkit/m;

    const/4 v1, 0x0

    sget-object v2, Lcom/arthenica/ffmpegkit/m;->AV_LOG_STDERR:Lcom/arthenica/ffmpegkit/m;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/arthenica/ffmpegkit/m;->AV_LOG_QUIET:Lcom/arthenica/ffmpegkit/m;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/arthenica/ffmpegkit/m;->AV_LOG_PANIC:Lcom/arthenica/ffmpegkit/m;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/arthenica/ffmpegkit/m;->AV_LOG_FATAL:Lcom/arthenica/ffmpegkit/m;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/arthenica/ffmpegkit/m;->AV_LOG_ERROR:Lcom/arthenica/ffmpegkit/m;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/arthenica/ffmpegkit/m;->AV_LOG_WARNING:Lcom/arthenica/ffmpegkit/m;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/arthenica/ffmpegkit/m;->AV_LOG_INFO:Lcom/arthenica/ffmpegkit/m;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/arthenica/ffmpegkit/m;->AV_LOG_VERBOSE:Lcom/arthenica/ffmpegkit/m;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/arthenica/ffmpegkit/m;->AV_LOG_DEBUG:Lcom/arthenica/ffmpegkit/m;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/arthenica/ffmpegkit/m;->AV_LOG_TRACE:Lcom/arthenica/ffmpegkit/m;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static h(I)Lcom/arthenica/ffmpegkit/m;
    .locals 2

    sget-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_STDERR:Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/m;->i()I

    move-result v1

    if-ne p0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_QUIET:Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/m;->i()I

    move-result v1

    if-ne p0, v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_PANIC:Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/m;->i()I

    move-result v1

    if-ne p0, v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_FATAL:Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/m;->i()I

    move-result v1

    if-ne p0, v1, :cond_3

    return-object v0

    :cond_3
    sget-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_ERROR:Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/m;->i()I

    move-result v1

    if-ne p0, v1, :cond_4

    return-object v0

    :cond_4
    sget-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_WARNING:Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/m;->i()I

    move-result v1

    if-ne p0, v1, :cond_5

    return-object v0

    :cond_5
    sget-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_INFO:Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/m;->i()I

    move-result v1

    if-ne p0, v1, :cond_6

    return-object v0

    :cond_6
    sget-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_VERBOSE:Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/m;->i()I

    move-result v1

    if-ne p0, v1, :cond_7

    return-object v0

    :cond_7
    sget-object v0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_DEBUG:Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {v0}, Lcom/arthenica/ffmpegkit/m;->i()I

    move-result v1

    if-ne p0, v1, :cond_8

    return-object v0

    :cond_8
    sget-object p0, Lcom/arthenica/ffmpegkit/m;->AV_LOG_TRACE:Lcom/arthenica/ffmpegkit/m;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/arthenica/ffmpegkit/m;
    .locals 1

    const-class v0, Lcom/arthenica/ffmpegkit/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/arthenica/ffmpegkit/m;

    return-object p0
.end method

.method public static values()[Lcom/arthenica/ffmpegkit/m;
    .locals 1

    sget-object v0, Lcom/arthenica/ffmpegkit/m;->$VALUES:[Lcom/arthenica/ffmpegkit/m;

    invoke-virtual {v0}, [Lcom/arthenica/ffmpegkit/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/arthenica/ffmpegkit/m;

    return-object v0
.end method


# virtual methods
.method public i()I
    .locals 1

    iget v0, p0, Lcom/arthenica/ffmpegkit/m;->value:I

    return v0
.end method
