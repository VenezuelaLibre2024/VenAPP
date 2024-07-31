.class public final enum Landroidx/camera/core/impl/d2$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/d2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/impl/d2$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/camera/core/impl/d2$b;

.field public static final enum JPEG:Landroidx/camera/core/impl/d2$b;

.field public static final enum PRIV:Landroidx/camera/core/impl/d2$b;

.field public static final enum RAW:Landroidx/camera/core/impl/d2$b;

.field public static final enum YUV:Landroidx/camera/core/impl/d2$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/core/impl/d2$b;

    const-string v1, "PRIV"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/d2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    new-instance v0, Landroidx/camera/core/impl/d2$b;

    const-string v1, "YUV"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/d2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/d2$b;->YUV:Landroidx/camera/core/impl/d2$b;

    new-instance v0, Landroidx/camera/core/impl/d2$b;

    const-string v1, "JPEG"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/d2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/d2$b;->JPEG:Landroidx/camera/core/impl/d2$b;

    new-instance v0, Landroidx/camera/core/impl/d2$b;

    const-string v1, "RAW"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/d2$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/d2$b;->RAW:Landroidx/camera/core/impl/d2$b;

    invoke-static {}, Landroidx/camera/core/impl/d2$b;->b()[Landroidx/camera/core/impl/d2$b;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/d2$b;->$VALUES:[Landroidx/camera/core/impl/d2$b;

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

.method private static synthetic b()[Landroidx/camera/core/impl/d2$b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Landroidx/camera/core/impl/d2$b;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/core/impl/d2$b;->PRIV:Landroidx/camera/core/impl/d2$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/core/impl/d2$b;->YUV:Landroidx/camera/core/impl/d2$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/camera/core/impl/d2$b;->JPEG:Landroidx/camera/core/impl/d2$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/camera/core/impl/d2$b;->RAW:Landroidx/camera/core/impl/d2$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/impl/d2$b;
    .locals 1

    const-class v0, Landroidx/camera/core/impl/d2$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/impl/d2$b;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/impl/d2$b;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/d2$b;->$VALUES:[Landroidx/camera/core/impl/d2$b;

    invoke-virtual {v0}, [Landroidx/camera/core/impl/d2$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/impl/d2$b;

    return-object v0
.end method
