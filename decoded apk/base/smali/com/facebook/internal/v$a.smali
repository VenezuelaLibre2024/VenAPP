.class public final enum Lcom/facebook/internal/v$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/internal/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/internal/v$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/internal/v$a;

.field public static final enum ERROR:Lcom/facebook/internal/v$a;

.field public static final enum LOADING:Lcom/facebook/internal/v$a;

.field public static final enum NOT_LOADED:Lcom/facebook/internal/v$a;

.field public static final enum SUCCESS:Lcom/facebook/internal/v$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/internal/v$a;

    const-string v1, "NOT_LOADED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/internal/v$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/internal/v$a;->NOT_LOADED:Lcom/facebook/internal/v$a;

    new-instance v0, Lcom/facebook/internal/v$a;

    const-string v1, "LOADING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/internal/v$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/internal/v$a;->LOADING:Lcom/facebook/internal/v$a;

    new-instance v0, Lcom/facebook/internal/v$a;

    const-string v1, "SUCCESS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/facebook/internal/v$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/internal/v$a;->SUCCESS:Lcom/facebook/internal/v$a;

    new-instance v0, Lcom/facebook/internal/v$a;

    const-string v1, "ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/facebook/internal/v$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/internal/v$a;->ERROR:Lcom/facebook/internal/v$a;

    invoke-static {}, Lcom/facebook/internal/v$a;->b()[Lcom/facebook/internal/v$a;

    move-result-object v0

    sput-object v0, Lcom/facebook/internal/v$a;->$VALUES:[Lcom/facebook/internal/v$a;

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

.method private static final synthetic b()[Lcom/facebook/internal/v$a;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/internal/v$a;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/internal/v$a;->NOT_LOADED:Lcom/facebook/internal/v$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/internal/v$a;->LOADING:Lcom/facebook/internal/v$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/facebook/internal/v$a;->SUCCESS:Lcom/facebook/internal/v$a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/facebook/internal/v$a;->ERROR:Lcom/facebook/internal/v$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/internal/v$a;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/facebook/internal/v$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/internal/v$a;

    return-object p0
.end method

.method public static values()[Lcom/facebook/internal/v$a;
    .locals 2

    sget-object v0, Lcom/facebook/internal/v$a;->$VALUES:[Lcom/facebook/internal/v$a;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/internal/v$a;

    return-object v0
.end method
