.class public final enum Lw/q$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw/q$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lw/q$b;

.field public static final enum CLOSED:Lw/q$b;

.field public static final enum CLOSING:Lw/q$b;

.field public static final enum OPEN:Lw/q$b;

.field public static final enum OPENING:Lw/q$b;

.field public static final enum PENDING_OPEN:Lw/q$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw/q$b;

    const-string v1, "PENDING_OPEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw/q$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/q$b;->PENDING_OPEN:Lw/q$b;

    new-instance v0, Lw/q$b;

    const-string v1, "OPENING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lw/q$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/q$b;->OPENING:Lw/q$b;

    new-instance v0, Lw/q$b;

    const-string v1, "OPEN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lw/q$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/q$b;->OPEN:Lw/q$b;

    new-instance v0, Lw/q$b;

    const-string v1, "CLOSING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lw/q$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/q$b;->CLOSING:Lw/q$b;

    new-instance v0, Lw/q$b;

    const-string v1, "CLOSED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lw/q$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw/q$b;->CLOSED:Lw/q$b;

    invoke-static {}, Lw/q$b;->b()[Lw/q$b;

    move-result-object v0

    sput-object v0, Lw/q$b;->$VALUES:[Lw/q$b;

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

.method private static synthetic b()[Lw/q$b;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lw/q$b;

    const/4 v1, 0x0

    sget-object v2, Lw/q$b;->PENDING_OPEN:Lw/q$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lw/q$b;->OPENING:Lw/q$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lw/q$b;->OPEN:Lw/q$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lw/q$b;->CLOSING:Lw/q$b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lw/q$b;->CLOSED:Lw/q$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lw/q$b;
    .locals 1

    const-class v0, Lw/q$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw/q$b;

    return-object p0
.end method

.method public static values()[Lw/q$b;
    .locals 1

    sget-object v0, Lw/q$b;->$VALUES:[Lw/q$b;

    invoke-virtual {v0}, [Lw/q$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw/q$b;

    return-object v0
.end method
