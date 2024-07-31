.class public final enum Landroidx/camera/core/impl/d2$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/d2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/core/impl/d2$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/camera/core/impl/d2$a;

.field public static final enum MAXIMUM:Landroidx/camera/core/impl/d2$a;

.field public static final enum NOT_SUPPORT:Landroidx/camera/core/impl/d2$a;

.field public static final enum PREVIEW:Landroidx/camera/core/impl/d2$a;

.field public static final enum RECORD:Landroidx/camera/core/impl/d2$a;

.field public static final enum ULTRA_MAXIMUM:Landroidx/camera/core/impl/d2$a;

.field public static final enum VGA:Landroidx/camera/core/impl/d2$a;

.field public static final enum s1440p:Landroidx/camera/core/impl/d2$a;

.field public static final enum s720p:Landroidx/camera/core/impl/d2$a;


# instance fields
.field final mId:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/camera/core/impl/d2$a;

    const-string v1, "VGA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Landroidx/camera/core/impl/d2$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Landroidx/camera/core/impl/d2$a;->VGA:Landroidx/camera/core/impl/d2$a;

    new-instance v0, Landroidx/camera/core/impl/d2$a;

    const-string v1, "s720p"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Landroidx/camera/core/impl/d2$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Landroidx/camera/core/impl/d2$a;->s720p:Landroidx/camera/core/impl/d2$a;

    new-instance v0, Landroidx/camera/core/impl/d2$a;

    const-string v1, "PREVIEW"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Landroidx/camera/core/impl/d2$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Landroidx/camera/core/impl/d2$a;->PREVIEW:Landroidx/camera/core/impl/d2$a;

    new-instance v0, Landroidx/camera/core/impl/d2$a;

    const-string v1, "s1440p"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Landroidx/camera/core/impl/d2$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Landroidx/camera/core/impl/d2$a;->s1440p:Landroidx/camera/core/impl/d2$a;

    new-instance v0, Landroidx/camera/core/impl/d2$a;

    const-string v1, "RECORD"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Landroidx/camera/core/impl/d2$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Landroidx/camera/core/impl/d2$a;->RECORD:Landroidx/camera/core/impl/d2$a;

    new-instance v0, Landroidx/camera/core/impl/d2$a;

    const-string v1, "MAXIMUM"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Landroidx/camera/core/impl/d2$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Landroidx/camera/core/impl/d2$a;->MAXIMUM:Landroidx/camera/core/impl/d2$a;

    new-instance v0, Landroidx/camera/core/impl/d2$a;

    const-string v1, "ULTRA_MAXIMUM"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, Landroidx/camera/core/impl/d2$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Landroidx/camera/core/impl/d2$a;->ULTRA_MAXIMUM:Landroidx/camera/core/impl/d2$a;

    new-instance v0, Landroidx/camera/core/impl/d2$a;

    const-string v1, "NOT_SUPPORT"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Landroidx/camera/core/impl/d2$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Landroidx/camera/core/impl/d2$a;->NOT_SUPPORT:Landroidx/camera/core/impl/d2$a;

    invoke-static {}, Landroidx/camera/core/impl/d2$a;->b()[Landroidx/camera/core/impl/d2$a;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/d2$a;->$VALUES:[Landroidx/camera/core/impl/d2$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Landroidx/camera/core/impl/d2$a;->mId:I

    return-void
.end method

.method private static synthetic b()[Landroidx/camera/core/impl/d2$a;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Landroidx/camera/core/impl/d2$a;

    const/4 v1, 0x0

    sget-object v2, Landroidx/camera/core/impl/d2$a;->VGA:Landroidx/camera/core/impl/d2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/camera/core/impl/d2$a;->s720p:Landroidx/camera/core/impl/d2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/camera/core/impl/d2$a;->PREVIEW:Landroidx/camera/core/impl/d2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/camera/core/impl/d2$a;->s1440p:Landroidx/camera/core/impl/d2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Landroidx/camera/core/impl/d2$a;->RECORD:Landroidx/camera/core/impl/d2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Landroidx/camera/core/impl/d2$a;->MAXIMUM:Landroidx/camera/core/impl/d2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Landroidx/camera/core/impl/d2$a;->ULTRA_MAXIMUM:Landroidx/camera/core/impl/d2$a;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Landroidx/camera/core/impl/d2$a;->NOT_SUPPORT:Landroidx/camera/core/impl/d2$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/core/impl/d2$a;
    .locals 1

    const-class v0, Landroidx/camera/core/impl/d2$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/impl/d2$a;

    return-object p0
.end method

.method public static values()[Landroidx/camera/core/impl/d2$a;
    .locals 1

    sget-object v0, Landroidx/camera/core/impl/d2$a;->$VALUES:[Landroidx/camera/core/impl/d2$a;

    invoke-virtual {v0}, [Landroidx/camera/core/impl/d2$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/core/impl/d2$a;

    return-object v0
.end method


# virtual methods
.method h()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/impl/d2$a;->mId:I

    return v0
.end method
