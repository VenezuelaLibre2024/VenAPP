.class final enum Landroidx/camera/camera2/internal/t2$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/t2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/camera2/internal/t2$e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/camera/camera2/internal/t2$e;

.field public static final enum DE_INITIALIZED:Landroidx/camera/camera2/internal/t2$e;

.field public static final enum ON_CAPTURE_SESSION_ENDED:Landroidx/camera/camera2/internal/t2$e;

.field public static final enum ON_CAPTURE_SESSION_STARTED:Landroidx/camera/camera2/internal/t2$e;

.field public static final enum SESSION_INITIALIZED:Landroidx/camera/camera2/internal/t2$e;

.field public static final enum UNINITIALIZED:Landroidx/camera/camera2/internal/t2$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/camera2/internal/t2$e;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/t2$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/t2$e;->UNINITIALIZED:Landroidx/camera/camera2/internal/t2$e;

    new-instance v0, Landroidx/camera/camera2/internal/t2$e;

    const-string v1, "SESSION_INITIALIZED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/t2$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/t2$e;->SESSION_INITIALIZED:Landroidx/camera/camera2/internal/t2$e;

    new-instance v0, Landroidx/camera/camera2/internal/t2$e;

    const-string v1, "ON_CAPTURE_SESSION_STARTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/t2$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/t2$e;->ON_CAPTURE_SESSION_STARTED:Landroidx/camera/camera2/internal/t2$e;

    new-instance v0, Landroidx/camera/camera2/internal/t2$e;

    const-string v1, "ON_CAPTURE_SESSION_ENDED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/t2$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/t2$e;->ON_CAPTURE_SESSION_ENDED:Landroidx/camera/camera2/internal/t2$e;

    new-instance v0, Landroidx/camera/camera2/internal/t2$e;

    const-string v1, "DE_INITIALIZED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/t2$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/camera2/internal/t2$e;->DE_INITIALIZED:Landroidx/camera/camera2/internal/t2$e;

    invoke-static {}, Landroidx/camera/camera2/internal/t2$e;->b()[Landroidx/camera/camera2/internal/t2$e;

    move-result-object v0

    sput-object v0, Landroidx/camera/camera2/internal/t2$e;->$VALUES:[Landroidx/camera/camera2/internal/t2$e;

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

.method private static synthetic b()[Landroidx/camera/camera2/internal/t2$e;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Landroidx/camera/camera2/internal/t2$e;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/camera2/internal/t2$e;->UNINITIALIZED:Landroidx/camera/camera2/internal/t2$e;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/camera2/internal/t2$e;->SESSION_INITIALIZED:Landroidx/camera/camera2/internal/t2$e;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/camera/camera2/internal/t2$e;->ON_CAPTURE_SESSION_STARTED:Landroidx/camera/camera2/internal/t2$e;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/camera/camera2/internal/t2$e;->ON_CAPTURE_SESSION_ENDED:Landroidx/camera/camera2/internal/t2$e;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Landroidx/camera/camera2/internal/t2$e;->DE_INITIALIZED:Landroidx/camera/camera2/internal/t2$e;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/camera2/internal/t2$e;
    .locals 1

    const-class v0, Landroidx/camera/camera2/internal/t2$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/camera2/internal/t2$e;

    return-object p0
.end method

.method public static values()[Landroidx/camera/camera2/internal/t2$e;
    .locals 1

    sget-object v0, Landroidx/camera/camera2/internal/t2$e;->$VALUES:[Landroidx/camera/camera2/internal/t2$e;

    invoke-virtual {v0}, [Landroidx/camera/camera2/internal/t2$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/camera2/internal/t2$e;

    return-object v0
.end method
