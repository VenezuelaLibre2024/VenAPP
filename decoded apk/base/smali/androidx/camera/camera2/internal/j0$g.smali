.class final enum Landroidx/camera/camera2/internal/j0$g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/camera2/internal/j0$g;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/camera/camera2/internal/j0$g;

.field public static final enum CLOSING:Landroidx/camera/camera2/internal/j0$g;

.field public static final enum CONFIGURED:Landroidx/camera/camera2/internal/j0$g;

.field public static final enum INITIALIZED:Landroidx/camera/camera2/internal/j0$g;

.field public static final enum OPENED:Landroidx/camera/camera2/internal/j0$g;

.field public static final enum OPENING:Landroidx/camera/camera2/internal/j0$g;

.field public static final enum PENDING_OPEN:Landroidx/camera/camera2/internal/j0$g;

.field public static final enum RELEASED:Landroidx/camera/camera2/internal/j0$g;

.field public static final enum RELEASING:Landroidx/camera/camera2/internal/j0$g;

.field public static final enum REOPENING:Landroidx/camera/camera2/internal/j0$g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/camera2/internal/j0$g;

    const-string v1, "INITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/j0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/j0$g;->INITIALIZED:Landroidx/camera/camera2/internal/j0$g;

    new-instance v0, Landroidx/camera/camera2/internal/j0$g;

    const-string v1, "PENDING_OPEN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/j0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/j0$g;->PENDING_OPEN:Landroidx/camera/camera2/internal/j0$g;

    new-instance v0, Landroidx/camera/camera2/internal/j0$g;

    const-string v1, "OPENING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/j0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/j0$g;->OPENING:Landroidx/camera/camera2/internal/j0$g;

    new-instance v0, Landroidx/camera/camera2/internal/j0$g;

    const-string v1, "OPENED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/j0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/j0$g;->OPENED:Landroidx/camera/camera2/internal/j0$g;

    new-instance v0, Landroidx/camera/camera2/internal/j0$g;

    const-string v1, "CONFIGURED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/j0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/j0$g;->CONFIGURED:Landroidx/camera/camera2/internal/j0$g;

    new-instance v0, Landroidx/camera/camera2/internal/j0$g;

    const-string v1, "CLOSING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/j0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/j0$g;->CLOSING:Landroidx/camera/camera2/internal/j0$g;

    new-instance v0, Landroidx/camera/camera2/internal/j0$g;

    const-string v1, "REOPENING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/j0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/j0$g;->REOPENING:Landroidx/camera/camera2/internal/j0$g;

    new-instance v0, Landroidx/camera/camera2/internal/j0$g;

    const-string v1, "RELEASING"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/j0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/j0$g;->RELEASING:Landroidx/camera/camera2/internal/j0$g;

    new-instance v0, Landroidx/camera/camera2/internal/j0$g;

    const-string v1, "RELEASED"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/j0$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/j0$g;->RELEASED:Landroidx/camera/camera2/internal/j0$g;

    invoke-static {}, Landroidx/camera/camera2/internal/j0$g;->b()[Landroidx/camera/camera2/internal/j0$g;

    move-result-object v0

    sput-object v0, Landroidx/camera/camera2/internal/j0$g;->$VALUES:[Landroidx/camera/camera2/internal/j0$g;

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

.method private static synthetic b()[Landroidx/camera/camera2/internal/j0$g;
    .locals 3

    const/16 v0, 0x9

    new-array v0, v0, [Landroidx/camera/camera2/internal/j0$g;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/camera2/internal/j0$g;->INITIALIZED:Landroidx/camera/camera2/internal/j0$g;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/camera2/internal/j0$g;->PENDING_OPEN:Landroidx/camera/camera2/internal/j0$g;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/camera/camera2/internal/j0$g;->OPENING:Landroidx/camera/camera2/internal/j0$g;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/camera/camera2/internal/j0$g;->OPENED:Landroidx/camera/camera2/internal/j0$g;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Landroidx/camera/camera2/internal/j0$g;->CONFIGURED:Landroidx/camera/camera2/internal/j0$g;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Landroidx/camera/camera2/internal/j0$g;->CLOSING:Landroidx/camera/camera2/internal/j0$g;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Landroidx/camera/camera2/internal/j0$g;->REOPENING:Landroidx/camera/camera2/internal/j0$g;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Landroidx/camera/camera2/internal/j0$g;->RELEASING:Landroidx/camera/camera2/internal/j0$g;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Landroidx/camera/camera2/internal/j0$g;->RELEASED:Landroidx/camera/camera2/internal/j0$g;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/camera2/internal/j0$g;
    .locals 1

    const-class v0, Landroidx/camera/camera2/internal/j0$g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/camera2/internal/j0$g;

    return-object p0
.end method

.method public static values()[Landroidx/camera/camera2/internal/j0$g;
    .locals 1

    sget-object v0, Landroidx/camera/camera2/internal/j0$g;->$VALUES:[Landroidx/camera/camera2/internal/j0$g;

    invoke-virtual {v0}, [Landroidx/camera/camera2/internal/j0$g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/camera2/internal/j0$g;

    return-object v0
.end method
