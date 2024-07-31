.class public final enum Landroidx/camera/core/impl/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/impl/n;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/camera/core/impl/n;

.field public static final enum CONVERGED:Landroidx/camera/core/impl/n;

.field public static final enum FLASH_REQUIRED:Landroidx/camera/core/impl/n;

.field public static final enum INACTIVE:Landroidx/camera/core/impl/n;

.field public static final enum LOCKED:Landroidx/camera/core/impl/n;

.field public static final enum SEARCHING:Landroidx/camera/core/impl/n;

.field public static final enum UNKNOWN:Landroidx/camera/core/impl/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/core/impl/n;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/n;->UNKNOWN:Landroidx/camera/core/impl/n;

    new-instance v0, Landroidx/camera/core/impl/n;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/n;->INACTIVE:Landroidx/camera/core/impl/n;

    new-instance v0, Landroidx/camera/core/impl/n;

    const-string v1, "SEARCHING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/n;->SEARCHING:Landroidx/camera/core/impl/n;

    new-instance v0, Landroidx/camera/core/impl/n;

    const-string v1, "FLASH_REQUIRED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/n;->FLASH_REQUIRED:Landroidx/camera/core/impl/n;

    new-instance v0, Landroidx/camera/core/impl/n;

    const-string v1, "CONVERGED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/n;->CONVERGED:Landroidx/camera/core/impl/n;

    new-instance v0, Landroidx/camera/core/impl/n;

    const-string v1, "LOCKED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/n;->LOCKED:Landroidx/camera/core/impl/n;

    invoke-static {}, Landroidx/camera/core/impl/n;->b()[Landroidx/camera/core/impl/n;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/n;->$VALUES:[Landroidx/camera/core/impl/n;

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

.method private static synthetic b()[Landroidx/camera/core/impl/n;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Landroidx/camera/core/impl/n;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/core/impl/n;->UNKNOWN:Landroidx/camera/core/impl/n;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/core/impl/n;->INACTIVE:Landroidx/camera/core/impl/n;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/camera/core/impl/n;->SEARCHING:Landroidx/camera/core/impl/n;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/camera/core/impl/n;->FLASH_REQUIRED:Landroidx/camera/core/impl/n;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Landroidx/camera/core/impl/n;->CONVERGED:Landroidx/camera/core/impl/n;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Landroidx/camera/core/impl/n;->LOCKED:Landroidx/camera/core/impl/n;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/impl/n;
    .locals 1

    const-class v0, Landroidx/camera/core/impl/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/impl/n;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/impl/n;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/n;->$VALUES:[Landroidx/camera/core/impl/n;

    invoke-virtual {v0}, [Landroidx/camera/core/impl/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/impl/n;

    return-object v0
.end method
