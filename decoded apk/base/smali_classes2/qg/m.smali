.class public final enum Lqg/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqg/m;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lqg/m;

.field public static final enum FORCE_NONE:Lqg/m;

.field public static final enum FORCE_RECTANGLE:Lqg/m;

.field public static final enum FORCE_SQUARE:Lqg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lqg/m;

    const-string v1, "FORCE_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqg/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqg/m;->FORCE_NONE:Lqg/m;

    new-instance v1, Lqg/m;

    const-string v3, "FORCE_SQUARE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lqg/m;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lqg/m;->FORCE_SQUARE:Lqg/m;

    new-instance v3, Lqg/m;

    const-string v5, "FORCE_RECTANGLE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lqg/m;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lqg/m;->FORCE_RECTANGLE:Lqg/m;

    const/4 v5, 0x3

    new-array v5, v5, [Lqg/m;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lqg/m;->$VALUES:[Lqg/m;

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

.method public static valueOf(Ljava/lang/String;)Lqg/m;
    .locals 1

    const-class v0, Lqg/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqg/m;

    return-object p0
.end method

.method public static values()[Lqg/m;
    .locals 1

    sget-object v0, Lqg/m;->$VALUES:[Lqg/m;

    invoke-virtual {v0}, [Lqg/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqg/m;

    return-object v0
.end method
