.class public final enum Landroidx/camera/core/impl/m$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/impl/m$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/camera/core/impl/m$a;

.field public static final enum ERROR:Landroidx/camera/core/impl/m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/core/impl/m$a;

    const-string v1, "ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/core/impl/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/camera/core/impl/m$a;->ERROR:Landroidx/camera/core/impl/m$a;

    invoke-static {}, Landroidx/camera/core/impl/m$a;->b()[Landroidx/camera/core/impl/m$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/m$a;->$VALUES:[Landroidx/camera/core/impl/m$a;

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

.method private static synthetic b()[Landroidx/camera/core/impl/m$a;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Landroidx/camera/core/impl/m$a;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/core/impl/m$a;->ERROR:Landroidx/camera/core/impl/m$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/impl/m$a;
    .locals 1

    const-class v0, Landroidx/camera/core/impl/m$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/impl/m$a;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/impl/m$a;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/m$a;->$VALUES:[Landroidx/camera/core/impl/m$a;

    invoke-virtual {v0}, [Landroidx/camera/core/impl/m$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/impl/m$a;

    return-object v0
.end method
