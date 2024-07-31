.class public final enum Li4/q0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li4/q0;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Li4/q0;

.field public static final enum APP_EVENTS:Li4/q0;

.field public static final enum CACHE:Li4/q0;

.field public static final enum DEVELOPER_ERRORS:Li4/q0;

.field public static final enum GRAPH_API_DEBUG_INFO:Li4/q0;

.field public static final enum GRAPH_API_DEBUG_WARNING:Li4/q0;

.field public static final enum INCLUDE_ACCESS_TOKENS:Li4/q0;

.field public static final enum INCLUDE_RAW_RESPONSES:Li4/q0;

.field public static final enum REQUESTS:Li4/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li4/q0;

    const-string v1, "REQUESTS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li4/q0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li4/q0;->REQUESTS:Li4/q0;

    new-instance v0, Li4/q0;

    const-string v1, "INCLUDE_ACCESS_TOKENS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Li4/q0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li4/q0;->INCLUDE_ACCESS_TOKENS:Li4/q0;

    new-instance v0, Li4/q0;

    const-string v1, "INCLUDE_RAW_RESPONSES"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Li4/q0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li4/q0;->INCLUDE_RAW_RESPONSES:Li4/q0;

    new-instance v0, Li4/q0;

    const-string v1, "CACHE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Li4/q0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li4/q0;->CACHE:Li4/q0;

    new-instance v0, Li4/q0;

    const-string v1, "APP_EVENTS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Li4/q0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li4/q0;->APP_EVENTS:Li4/q0;

    new-instance v0, Li4/q0;

    const-string v1, "DEVELOPER_ERRORS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Li4/q0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li4/q0;->DEVELOPER_ERRORS:Li4/q0;

    new-instance v0, Li4/q0;

    const-string v1, "GRAPH_API_DEBUG_WARNING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Li4/q0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li4/q0;->GRAPH_API_DEBUG_WARNING:Li4/q0;

    new-instance v0, Li4/q0;

    const-string v1, "GRAPH_API_DEBUG_INFO"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Li4/q0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li4/q0;->GRAPH_API_DEBUG_INFO:Li4/q0;

    invoke-static {}, Li4/q0;->b()[Li4/q0;

    move-result-object v0

    sput-object v0, Li4/q0;->$VALUES:[Li4/q0;

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

.method private static final synthetic b()[Li4/q0;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Li4/q0;

    const/4 v1, 0x0

    sget-object v2, Li4/q0;->REQUESTS:Li4/q0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Li4/q0;->INCLUDE_ACCESS_TOKENS:Li4/q0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Li4/q0;->INCLUDE_RAW_RESPONSES:Li4/q0;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Li4/q0;->CACHE:Li4/q0;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Li4/q0;->APP_EVENTS:Li4/q0;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Li4/q0;->DEVELOPER_ERRORS:Li4/q0;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Li4/q0;->GRAPH_API_DEBUG_WARNING:Li4/q0;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Li4/q0;->GRAPH_API_DEBUG_INFO:Li4/q0;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Li4/q0;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Li4/q0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li4/q0;

    return-object p0
.end method

.method public static values()[Li4/q0;
    .locals 2

    sget-object v0, Li4/q0;->$VALUES:[Li4/q0;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li4/q0;

    return-object v0
.end method
