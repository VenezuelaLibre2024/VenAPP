.class public final enum Ljh/i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljh/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljh/i$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ljh/i$a;

.field public static final enum AUTO:Ljh/i$a;

.field public static final enum CONTINUOUS:Ljh/i$a;

.field public static final enum INFINITY:Ljh/i$a;

.field public static final enum MACRO:Ljh/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljh/i$a;

    const-string v1, "AUTO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljh/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljh/i$a;->AUTO:Ljh/i$a;

    new-instance v0, Ljh/i$a;

    const-string v1, "CONTINUOUS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljh/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljh/i$a;->CONTINUOUS:Ljh/i$a;

    new-instance v0, Ljh/i$a;

    const-string v1, "INFINITY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljh/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljh/i$a;->INFINITY:Ljh/i$a;

    new-instance v0, Ljh/i$a;

    const-string v1, "MACRO"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ljh/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljh/i$a;->MACRO:Ljh/i$a;

    invoke-static {}, Ljh/i$a;->b()[Ljh/i$a;

    move-result-object v0

    sput-object v0, Ljh/i$a;->$VALUES:[Ljh/i$a;

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

.method private static synthetic b()[Ljh/i$a;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljh/i$a;

    const/4 v1, 0x0

    sget-object v2, Ljh/i$a;->AUTO:Ljh/i$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ljh/i$a;->CONTINUOUS:Ljh/i$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ljh/i$a;->INFINITY:Ljh/i$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ljh/i$a;->MACRO:Ljh/i$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljh/i$a;
    .locals 1

    const-class v0, Ljh/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljh/i$a;

    return-object p0
.end method

.method public static values()[Ljh/i$a;
    .locals 1

    sget-object v0, Ljh/i$a;->$VALUES:[Ljh/i$a;

    invoke-virtual {v0}, [Ljh/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljh/i$a;

    return-object v0
.end method
