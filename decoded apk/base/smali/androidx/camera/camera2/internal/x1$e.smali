.class final enum Landroidx/camera/camera2/internal/x1$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/x1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/camera2/internal/x1$e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/camera/camera2/internal/x1$e;

.field public static final enum CLOSED:Landroidx/camera/camera2/internal/x1$e;

.field public static final enum GET_SURFACE:Landroidx/camera/camera2/internal/x1$e;

.field public static final enum INITIALIZED:Landroidx/camera/camera2/internal/x1$e;

.field public static final enum OPENED:Landroidx/camera/camera2/internal/x1$e;

.field public static final enum OPENING:Landroidx/camera/camera2/internal/x1$e;

.field public static final enum RELEASED:Landroidx/camera/camera2/internal/x1$e;

.field public static final enum RELEASING:Landroidx/camera/camera2/internal/x1$e;

.field public static final enum UNINITIALIZED:Landroidx/camera/camera2/internal/x1$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/camera2/internal/x1$e;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/x1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/x1$e;->UNINITIALIZED:Landroidx/camera/camera2/internal/x1$e;

    new-instance v0, Landroidx/camera/camera2/internal/x1$e;

    const-string v1, "INITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/x1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/x1$e;->INITIALIZED:Landroidx/camera/camera2/internal/x1$e;

    new-instance v0, Landroidx/camera/camera2/internal/x1$e;

    const-string v1, "GET_SURFACE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/x1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/x1$e;->GET_SURFACE:Landroidx/camera/camera2/internal/x1$e;

    new-instance v0, Landroidx/camera/camera2/internal/x1$e;

    const-string v1, "OPENING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/x1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/x1$e;->OPENING:Landroidx/camera/camera2/internal/x1$e;

    new-instance v0, Landroidx/camera/camera2/internal/x1$e;

    const-string v1, "OPENED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/x1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/x1$e;->OPENED:Landroidx/camera/camera2/internal/x1$e;

    new-instance v0, Landroidx/camera/camera2/internal/x1$e;

    const-string v1, "CLOSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/x1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/x1$e;->CLOSED:Landroidx/camera/camera2/internal/x1$e;

    new-instance v0, Landroidx/camera/camera2/internal/x1$e;

    const-string v1, "RELEASING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/x1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/x1$e;->RELEASING:Landroidx/camera/camera2/internal/x1$e;

    new-instance v0, Landroidx/camera/camera2/internal/x1$e;

    const-string v1, "RELEASED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/x1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/x1$e;->RELEASED:Landroidx/camera/camera2/internal/x1$e;

    invoke-static {}, Landroidx/camera/camera2/internal/x1$e;->b()[Landroidx/camera/camera2/internal/x1$e;

    move-result-object v0

    sput-object v0, Landroidx/camera/camera2/internal/x1$e;->$VALUES:[Landroidx/camera/camera2/internal/x1$e;

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

.method private static synthetic b()[Landroidx/camera/camera2/internal/x1$e;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Landroidx/camera/camera2/internal/x1$e;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/camera2/internal/x1$e;->UNINITIALIZED:Landroidx/camera/camera2/internal/x1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/camera2/internal/x1$e;->INITIALIZED:Landroidx/camera/camera2/internal/x1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/camera/camera2/internal/x1$e;->GET_SURFACE:Landroidx/camera/camera2/internal/x1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/camera/camera2/internal/x1$e;->OPENING:Landroidx/camera/camera2/internal/x1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Landroidx/camera/camera2/internal/x1$e;->OPENED:Landroidx/camera/camera2/internal/x1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Landroidx/camera/camera2/internal/x1$e;->CLOSED:Landroidx/camera/camera2/internal/x1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Landroidx/camera/camera2/internal/x1$e;->RELEASING:Landroidx/camera/camera2/internal/x1$e;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Landroidx/camera/camera2/internal/x1$e;->RELEASED:Landroidx/camera/camera2/internal/x1$e;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/camera2/internal/x1$e;
    .locals 1

    const-class v0, Landroidx/camera/camera2/internal/x1$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/camera2/internal/x1$e;

    return-object p0
.end method

.method public static values()[Landroidx/camera/camera2/internal/x1$e;
    .locals 1

    sget-object v0, Landroidx/camera/camera2/internal/x1$e;->$VALUES:[Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v0}, [Landroidx/camera/camera2/internal/x1$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/camera2/internal/x1$e;

    return-object v0
.end method
