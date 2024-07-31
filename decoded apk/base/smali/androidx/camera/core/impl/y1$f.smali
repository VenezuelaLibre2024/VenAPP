.class public final enum Landroidx/camera/core/impl/y1$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/y1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/impl/y1$f;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/camera/core/impl/y1$f;

.field public static final enum SESSION_ERROR_SURFACE_NEEDS_RESET:Landroidx/camera/core/impl/y1$f;

.field public static final enum SESSION_ERROR_UNKNOWN:Landroidx/camera/core/impl/y1$f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/core/impl/y1$f;

    const-string v1, "SESSION_ERROR_SURFACE_NEEDS_RESET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/y1$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/y1$f;->SESSION_ERROR_SURFACE_NEEDS_RESET:Landroidx/camera/core/impl/y1$f;

    new-instance v0, Landroidx/camera/core/impl/y1$f;

    const-string v1, "SESSION_ERROR_UNKNOWN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/y1$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/y1$f;->SESSION_ERROR_UNKNOWN:Landroidx/camera/core/impl/y1$f;

    invoke-static {}, Landroidx/camera/core/impl/y1$f;->b()[Landroidx/camera/core/impl/y1$f;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/y1$f;->$VALUES:[Landroidx/camera/core/impl/y1$f;

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

.method private static synthetic b()[Landroidx/camera/core/impl/y1$f;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Landroidx/camera/core/impl/y1$f;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/core/impl/y1$f;->SESSION_ERROR_SURFACE_NEEDS_RESET:Landroidx/camera/core/impl/y1$f;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/core/impl/y1$f;->SESSION_ERROR_UNKNOWN:Landroidx/camera/core/impl/y1$f;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/impl/y1$f;
    .locals 1

    const-class v0, Landroidx/camera/core/impl/y1$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/impl/y1$f;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/impl/y1$f;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/y1$f;->$VALUES:[Landroidx/camera/core/impl/y1$f;

    invoke-virtual {v0}, [Landroidx/camera/core/impl/y1$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/impl/y1$f;

    return-object v0
.end method
