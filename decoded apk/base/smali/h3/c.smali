.class public final enum Lh3/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lh3/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lh3/c;

.field public static final enum NONE:Lh3/c;

.field public static final enum SOURCE:Lh3/c;

.field public static final enum TRANSFORMED:Lh3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lh3/c;

    const-string v1, "SOURCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lh3/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh3/c;->SOURCE:Lh3/c;

    new-instance v1, Lh3/c;

    const-string v3, "TRANSFORMED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lh3/c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lh3/c;->TRANSFORMED:Lh3/c;

    new-instance v3, Lh3/c;

    const-string v5, "NONE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lh3/c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lh3/c;->NONE:Lh3/c;

    const/4 v5, 0x3

    new-array v5, v5, [Lh3/c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lh3/c;->$VALUES:[Lh3/c;

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

.method public static valueOf(Ljava/lang/String;)Lh3/c;
    .locals 1

    const-class v0, Lh3/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh3/c;

    return-object p0
.end method

.method public static values()[Lh3/c;
    .locals 1

    sget-object v0, Lh3/c;->$VALUES:[Lh3/c;

    invoke-virtual {v0}, [Lh3/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh3/c;

    return-object v0
.end method
