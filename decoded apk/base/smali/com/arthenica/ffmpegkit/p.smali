.class public final enum Lcom/arthenica/ffmpegkit/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/arthenica/ffmpegkit/p;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/arthenica/ffmpegkit/p;

.field public static final enum ALWAYS_PRINT_LOGS:Lcom/arthenica/ffmpegkit/p;

.field public static final enum NEVER_PRINT_LOGS:Lcom/arthenica/ffmpegkit/p;

.field public static final enum PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED:Lcom/arthenica/ffmpegkit/p;

.field public static final enum PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED:Lcom/arthenica/ffmpegkit/p;

.field public static final enum PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED:Lcom/arthenica/ffmpegkit/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/arthenica/ffmpegkit/p;

    const-string v1, "ALWAYS_PRINT_LOGS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/arthenica/ffmpegkit/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/arthenica/ffmpegkit/p;->ALWAYS_PRINT_LOGS:Lcom/arthenica/ffmpegkit/p;

    new-instance v0, Lcom/arthenica/ffmpegkit/p;

    const-string v1, "PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/arthenica/ffmpegkit/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/arthenica/ffmpegkit/p;->PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED:Lcom/arthenica/ffmpegkit/p;

    new-instance v0, Lcom/arthenica/ffmpegkit/p;

    const-string v1, "PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/arthenica/ffmpegkit/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/arthenica/ffmpegkit/p;->PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED:Lcom/arthenica/ffmpegkit/p;

    new-instance v0, Lcom/arthenica/ffmpegkit/p;

    const-string v1, "PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/arthenica/ffmpegkit/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/arthenica/ffmpegkit/p;->PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED:Lcom/arthenica/ffmpegkit/p;

    new-instance v0, Lcom/arthenica/ffmpegkit/p;

    const-string v1, "NEVER_PRINT_LOGS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/arthenica/ffmpegkit/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/arthenica/ffmpegkit/p;->NEVER_PRINT_LOGS:Lcom/arthenica/ffmpegkit/p;

    invoke-static {}, Lcom/arthenica/ffmpegkit/p;->b()[Lcom/arthenica/ffmpegkit/p;

    move-result-object v0

    sput-object v0, Lcom/arthenica/ffmpegkit/p;->$VALUES:[Lcom/arthenica/ffmpegkit/p;

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

.method private static synthetic b()[Lcom/arthenica/ffmpegkit/p;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/arthenica/ffmpegkit/p;

    const/4 v1, 0x0

    sget-object v2, Lcom/arthenica/ffmpegkit/p;->ALWAYS_PRINT_LOGS:Lcom/arthenica/ffmpegkit/p;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/arthenica/ffmpegkit/p;->PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED:Lcom/arthenica/ffmpegkit/p;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/arthenica/ffmpegkit/p;->PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED:Lcom/arthenica/ffmpegkit/p;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/arthenica/ffmpegkit/p;->PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED:Lcom/arthenica/ffmpegkit/p;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/arthenica/ffmpegkit/p;->NEVER_PRINT_LOGS:Lcom/arthenica/ffmpegkit/p;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/arthenica/ffmpegkit/p;
    .locals 1

    const-class v0, Lcom/arthenica/ffmpegkit/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/arthenica/ffmpegkit/p;

    return-object p0
.end method

.method public static values()[Lcom/arthenica/ffmpegkit/p;
    .locals 1

    sget-object v0, Lcom/arthenica/ffmpegkit/p;->$VALUES:[Lcom/arthenica/ffmpegkit/p;

    invoke-virtual {v0}, [Lcom/arthenica/ffmpegkit/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/arthenica/ffmpegkit/p;

    return-object v0
.end method
