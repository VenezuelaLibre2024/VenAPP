.class public final enum Landroidx/camera/core/impl/p;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/impl/p;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/camera/core/impl/p;

.field public static final enum INACTIVE:Landroidx/camera/core/impl/p;

.field public static final enum LOCKED_FOCUSED:Landroidx/camera/core/impl/p;

.field public static final enum LOCKED_NOT_FOCUSED:Landroidx/camera/core/impl/p;

.field public static final enum PASSIVE_FOCUSED:Landroidx/camera/core/impl/p;

.field public static final enum PASSIVE_NOT_FOCUSED:Landroidx/camera/core/impl/p;

.field public static final enum SCANNING:Landroidx/camera/core/impl/p;

.field public static final enum UNKNOWN:Landroidx/camera/core/impl/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/core/impl/p;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/p;->UNKNOWN:Landroidx/camera/core/impl/p;

    new-instance v0, Landroidx/camera/core/impl/p;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/p;->INACTIVE:Landroidx/camera/core/impl/p;

    new-instance v0, Landroidx/camera/core/impl/p;

    const-string v1, "SCANNING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/p;->SCANNING:Landroidx/camera/core/impl/p;

    new-instance v0, Landroidx/camera/core/impl/p;

    const-string v1, "PASSIVE_FOCUSED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/p;->PASSIVE_FOCUSED:Landroidx/camera/core/impl/p;

    new-instance v0, Landroidx/camera/core/impl/p;

    const-string v1, "PASSIVE_NOT_FOCUSED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/p;->PASSIVE_NOT_FOCUSED:Landroidx/camera/core/impl/p;

    new-instance v0, Landroidx/camera/core/impl/p;

    const-string v1, "LOCKED_FOCUSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/p;->LOCKED_FOCUSED:Landroidx/camera/core/impl/p;

    new-instance v0, Landroidx/camera/core/impl/p;

    const-string v1, "LOCKED_NOT_FOCUSED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/p;->LOCKED_NOT_FOCUSED:Landroidx/camera/core/impl/p;

    invoke-static {}, Landroidx/camera/core/impl/p;->b()[Landroidx/camera/core/impl/p;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/p;->$VALUES:[Landroidx/camera/core/impl/p;

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

.method private static synthetic b()[Landroidx/camera/core/impl/p;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Landroidx/camera/core/impl/p;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/core/impl/p;->UNKNOWN:Landroidx/camera/core/impl/p;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/core/impl/p;->INACTIVE:Landroidx/camera/core/impl/p;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/camera/core/impl/p;->SCANNING:Landroidx/camera/core/impl/p;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/camera/core/impl/p;->PASSIVE_FOCUSED:Landroidx/camera/core/impl/p;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Landroidx/camera/core/impl/p;->PASSIVE_NOT_FOCUSED:Landroidx/camera/core/impl/p;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Landroidx/camera/core/impl/p;->LOCKED_FOCUSED:Landroidx/camera/core/impl/p;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Landroidx/camera/core/impl/p;->LOCKED_NOT_FOCUSED:Landroidx/camera/core/impl/p;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/impl/p;
    .locals 1

    const-class v0, Landroidx/camera/core/impl/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/impl/p;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/impl/p;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/p;->$VALUES:[Landroidx/camera/core/impl/p;

    invoke-virtual {v0}, [Landroidx/camera/core/impl/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/impl/p;

    return-object v0
.end method
