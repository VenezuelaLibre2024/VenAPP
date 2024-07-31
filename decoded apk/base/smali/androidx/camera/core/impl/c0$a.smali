.class public final enum Landroidx/camera/core/impl/c0$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/impl/c0$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/camera/core/impl/c0$a;

.field public static final enum CLOSED:Landroidx/camera/core/impl/c0$a;

.field public static final enum CLOSING:Landroidx/camera/core/impl/c0$a;

.field public static final enum CONFIGURED:Landroidx/camera/core/impl/c0$a;

.field public static final enum OPEN:Landroidx/camera/core/impl/c0$a;

.field public static final enum OPENING:Landroidx/camera/core/impl/c0$a;

.field public static final enum PENDING_OPEN:Landroidx/camera/core/impl/c0$a;

.field public static final enum RELEASED:Landroidx/camera/core/impl/c0$a;

.field public static final enum RELEASING:Landroidx/camera/core/impl/c0$a;


# instance fields
.field private final mHoldsCameraSlot:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Landroidx/camera/core/impl/c0$a;

    const-string v1, "PENDING_OPEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Landroidx/camera/core/impl/c0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Landroidx/camera/core/impl/c0$a;->PENDING_OPEN:Landroidx/camera/core/impl/c0$a;

    new-instance v0, Landroidx/camera/core/impl/c0$a;

    const-string v1, "OPENING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Landroidx/camera/core/impl/c0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Landroidx/camera/core/impl/c0$a;->OPENING:Landroidx/camera/core/impl/c0$a;

    new-instance v0, Landroidx/camera/core/impl/c0$a;

    const-string v1, "OPEN"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v3}, Landroidx/camera/core/impl/c0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Landroidx/camera/core/impl/c0$a;->OPEN:Landroidx/camera/core/impl/c0$a;

    new-instance v0, Landroidx/camera/core/impl/c0$a;

    const-string v1, "CONFIGURED"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v4, v3}, Landroidx/camera/core/impl/c0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Landroidx/camera/core/impl/c0$a;->CONFIGURED:Landroidx/camera/core/impl/c0$a;

    new-instance v0, Landroidx/camera/core/impl/c0$a;

    const-string v1, "CLOSING"

    const/4 v4, 0x4

    invoke-direct {v0, v1, v4, v3}, Landroidx/camera/core/impl/c0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Landroidx/camera/core/impl/c0$a;->CLOSING:Landroidx/camera/core/impl/c0$a;

    new-instance v0, Landroidx/camera/core/impl/c0$a;

    const-string v1, "CLOSED"

    const/4 v4, 0x5

    invoke-direct {v0, v1, v4, v2}, Landroidx/camera/core/impl/c0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Landroidx/camera/core/impl/c0$a;->CLOSED:Landroidx/camera/core/impl/c0$a;

    new-instance v0, Landroidx/camera/core/impl/c0$a;

    const-string v1, "RELEASING"

    const/4 v4, 0x6

    invoke-direct {v0, v1, v4, v3}, Landroidx/camera/core/impl/c0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Landroidx/camera/core/impl/c0$a;->RELEASING:Landroidx/camera/core/impl/c0$a;

    new-instance v0, Landroidx/camera/core/impl/c0$a;

    const-string v1, "RELEASED"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v3, v2}, Landroidx/camera/core/impl/c0$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Landroidx/camera/core/impl/c0$a;->RELEASED:Landroidx/camera/core/impl/c0$a;

    invoke-static {}, Landroidx/camera/core/impl/c0$a;->b()[Landroidx/camera/core/impl/c0$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/c0$a;->$VALUES:[Landroidx/camera/core/impl/c0$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Landroidx/camera/core/impl/c0$a;->mHoldsCameraSlot:Z

    return-void
.end method

.method private static synthetic b()[Landroidx/camera/core/impl/c0$a;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Landroidx/camera/core/impl/c0$a;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/core/impl/c0$a;->PENDING_OPEN:Landroidx/camera/core/impl/c0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/core/impl/c0$a;->OPENING:Landroidx/camera/core/impl/c0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/camera/core/impl/c0$a;->OPEN:Landroidx/camera/core/impl/c0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/camera/core/impl/c0$a;->CONFIGURED:Landroidx/camera/core/impl/c0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Landroidx/camera/core/impl/c0$a;->CLOSING:Landroidx/camera/core/impl/c0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Landroidx/camera/core/impl/c0$a;->CLOSED:Landroidx/camera/core/impl/c0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Landroidx/camera/core/impl/c0$a;->RELEASING:Landroidx/camera/core/impl/c0$a;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Landroidx/camera/core/impl/c0$a;->RELEASED:Landroidx/camera/core/impl/c0$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/impl/c0$a;
    .locals 1

    const-class v0, Landroidx/camera/core/impl/c0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/impl/c0$a;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/impl/c0$a;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/c0$a;->$VALUES:[Landroidx/camera/core/impl/c0$a;

    invoke-virtual {v0}, [Landroidx/camera/core/impl/c0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/impl/c0$a;

    return-object v0
.end method


# virtual methods
.method h()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/core/impl/c0$a;->mHoldsCameraSlot:Z

    return v0
.end method
