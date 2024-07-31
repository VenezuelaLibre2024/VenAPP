.class public final enum Lcom/facebook/internal/w;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/internal/w;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/internal/w;

.field public static final enum ContextChoose:Lcom/facebook/internal/w;

.field public static final enum JoinTournament:Lcom/facebook/internal/w;


# instance fields
.field private final rawValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/facebook/internal/w;

    const/4 v1, 0x0

    const-string v2, "context_choose"

    const-string v3, "ContextChoose"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/w;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/internal/w;->ContextChoose:Lcom/facebook/internal/w;

    new-instance v0, Lcom/facebook/internal/w;

    const/4 v1, 0x1

    const-string v2, "join_tournament"

    const-string v3, "JoinTournament"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/internal/w;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/internal/w;->JoinTournament:Lcom/facebook/internal/w;

    invoke-static {}, Lcom/facebook/internal/w;->b()[Lcom/facebook/internal/w;

    move-result-object v0

    sput-object v0, Lcom/facebook/internal/w;->$VALUES:[Lcom/facebook/internal/w;

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

    iput-object p3, p0, Lcom/facebook/internal/w;->rawValue:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Lcom/facebook/internal/w;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/internal/w;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/internal/w;->ContextChoose:Lcom/facebook/internal/w;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/internal/w;->JoinTournament:Lcom/facebook/internal/w;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/internal/w;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/facebook/internal/w;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/internal/w;

    return-object p0
.end method

.method public static values()[Lcom/facebook/internal/w;
    .locals 2

    sget-object v0, Lcom/facebook/internal/w;->$VALUES:[Lcom/facebook/internal/w;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/internal/w;

    return-object v0
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/internal/w;->rawValue:Ljava/lang/String;

    return-object v0
.end method
