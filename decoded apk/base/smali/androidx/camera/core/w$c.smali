.class final enum Landroidx/camera/core/w$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/w$c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/camera/core/w$c;

.field public static final enum ACTIVE:Landroidx/camera/core/w$c;

.field public static final enum INACTIVE:Landroidx/camera/core/w$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/core/w$c;

    const-string v1, "ACTIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/w$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/w$c;->ACTIVE:Landroidx/camera/core/w$c;

    new-instance v0, Landroidx/camera/core/w$c;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/w$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/w$c;->INACTIVE:Landroidx/camera/core/w$c;

    invoke-static {}, Landroidx/camera/core/w$c;->b()[Landroidx/camera/core/w$c;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/w$c;->$VALUES:[Landroidx/camera/core/w$c;

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

.method private static synthetic b()[Landroidx/camera/core/w$c;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Landroidx/camera/core/w$c;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/core/w$c;->ACTIVE:Landroidx/camera/core/w$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/core/w$c;->INACTIVE:Landroidx/camera/core/w$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/w$c;
    .locals 1

    const-class v0, Landroidx/camera/core/w$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/w$c;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/w$c;
    .locals 1

    sget-object v0, Landroidx/camera/core/w$c;->$VALUES:[Landroidx/camera/core/w$c;

    invoke-virtual {v0}, [Landroidx/camera/core/w$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/w$c;

    return-object v0
.end method
