.class public final enum Lcom/facebook/login/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/login/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/login/e;

.field public static final enum EVERYONE:Lcom/facebook/login/e;

.field public static final enum FRIENDS:Lcom/facebook/login/e;

.field public static final enum NONE:Lcom/facebook/login/e;

.field public static final enum ONLY_ME:Lcom/facebook/login/e;


# instance fields
.field private final nativeProtocolAudience:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/facebook/login/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "NONE"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/login/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/login/e;->NONE:Lcom/facebook/login/e;

    new-instance v0, Lcom/facebook/login/e;

    const/4 v1, 0x1

    const-string v2, "only_me"

    const-string v3, "ONLY_ME"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/login/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/login/e;->ONLY_ME:Lcom/facebook/login/e;

    new-instance v0, Lcom/facebook/login/e;

    const/4 v1, 0x2

    const-string v2, "friends"

    const-string v3, "FRIENDS"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/login/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/login/e;->FRIENDS:Lcom/facebook/login/e;

    new-instance v0, Lcom/facebook/login/e;

    const/4 v1, 0x3

    const-string v2, "everyone"

    const-string v3, "EVERYONE"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/login/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/login/e;->EVERYONE:Lcom/facebook/login/e;

    invoke-static {}, Lcom/facebook/login/e;->b()[Lcom/facebook/login/e;

    move-result-object v0

    sput-object v0, Lcom/facebook/login/e;->$VALUES:[Lcom/facebook/login/e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/facebook/login/e;->nativeProtocolAudience:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Lcom/facebook/login/e;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/login/e;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/login/e;->NONE:Lcom/facebook/login/e;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/login/e;->ONLY_ME:Lcom/facebook/login/e;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/facebook/login/e;->FRIENDS:Lcom/facebook/login/e;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/facebook/login/e;->EVERYONE:Lcom/facebook/login/e;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/login/e;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/facebook/login/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/login/e;

    return-object p0
.end method

.method public static values()[Lcom/facebook/login/e;
    .locals 2

    sget-object v0, Lcom/facebook/login/e;->$VALUES:[Lcom/facebook/login/e;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/login/e;

    return-object v0
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/e;->nativeProtocolAudience:Ljava/lang/String;

    return-object v0
.end method
