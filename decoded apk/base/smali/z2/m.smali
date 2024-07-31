.class public final enum Lz2/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lz2/m;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lz2/m;

.field public static final enum best:Lz2/m;

.field public static final enum bestForNavigation:Lz2/m;

.field public static final enum high:Lz2/m;

.field public static final enum low:Lz2/m;

.field public static final enum lowest:Lz2/m;

.field public static final enum medium:Lz2/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz2/m;

    const-string v1, "lowest"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz2/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz2/m;->lowest:Lz2/m;

    new-instance v0, Lz2/m;

    const-string v1, "low"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz2/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz2/m;->low:Lz2/m;

    new-instance v0, Lz2/m;

    const-string v1, "medium"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lz2/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz2/m;->medium:Lz2/m;

    new-instance v0, Lz2/m;

    const-string v1, "high"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lz2/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz2/m;->high:Lz2/m;

    new-instance v0, Lz2/m;

    const-string v1, "best"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lz2/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz2/m;->best:Lz2/m;

    new-instance v0, Lz2/m;

    const-string v1, "bestForNavigation"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lz2/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz2/m;->bestForNavigation:Lz2/m;

    invoke-static {}, Lz2/m;->b()[Lz2/m;

    move-result-object v0

    sput-object v0, Lz2/m;->$VALUES:[Lz2/m;

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

.method private static synthetic b()[Lz2/m;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lz2/m;

    const/4 v1, 0x0

    sget-object v2, Lz2/m;->lowest:Lz2/m;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lz2/m;->low:Lz2/m;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lz2/m;->medium:Lz2/m;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lz2/m;->high:Lz2/m;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lz2/m;->best:Lz2/m;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lz2/m;->bestForNavigation:Lz2/m;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lz2/m;
    .locals 1

    const-class v0, Lz2/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz2/m;

    return-object p0
.end method

.method public static values()[Lz2/m;
    .locals 1

    sget-object v0, Lz2/m;->$VALUES:[Lz2/m;

    invoke-virtual {v0}, [Lz2/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz2/m;

    return-object v0
.end method
