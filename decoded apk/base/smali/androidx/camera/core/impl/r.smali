.class public final enum Landroidx/camera/core/impl/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/impl/r;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/camera/core/impl/r;

.field public static final enum FIRED:Landroidx/camera/core/impl/r;

.field public static final enum NONE:Landroidx/camera/core/impl/r;

.field public static final enum READY:Landroidx/camera/core/impl/r;

.field public static final enum UNKNOWN:Landroidx/camera/core/impl/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/core/impl/r;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/r;->UNKNOWN:Landroidx/camera/core/impl/r;

    new-instance v0, Landroidx/camera/core/impl/r;

    const-string v1, "NONE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/r;->NONE:Landroidx/camera/core/impl/r;

    new-instance v0, Landroidx/camera/core/impl/r;

    const-string v1, "READY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/r;->READY:Landroidx/camera/core/impl/r;

    new-instance v0, Landroidx/camera/core/impl/r;

    const-string v1, "FIRED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/r;->FIRED:Landroidx/camera/core/impl/r;

    invoke-static {}, Landroidx/camera/core/impl/r;->b()[Landroidx/camera/core/impl/r;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/r;->$VALUES:[Landroidx/camera/core/impl/r;

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

.method private static synthetic b()[Landroidx/camera/core/impl/r;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Landroidx/camera/core/impl/r;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/core/impl/r;->UNKNOWN:Landroidx/camera/core/impl/r;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/core/impl/r;->NONE:Landroidx/camera/core/impl/r;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/camera/core/impl/r;->READY:Landroidx/camera/core/impl/r;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/camera/core/impl/r;->FIRED:Landroidx/camera/core/impl/r;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/impl/r;
    .locals 1

    const-class v0, Landroidx/camera/core/impl/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/impl/r;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/impl/r;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/r;->$VALUES:[Landroidx/camera/core/impl/r;

    invoke-virtual {v0}, [Landroidx/camera/core/impl/r;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/impl/r;

    return-object v0
.end method
