.class public final enum Lcom/facebook/login/u$f$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/u$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/login/u$f$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/login/u$f$a;

.field public static final enum CANCEL:Lcom/facebook/login/u$f$a;

.field public static final enum ERROR:Lcom/facebook/login/u$f$a;

.field public static final enum SUCCESS:Lcom/facebook/login/u$f$a;


# instance fields
.field private final loggingValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/facebook/login/u$f$a;

    const/4 v1, 0x0

    const-string v2, "success"

    const-string v3, "SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/login/u$f$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/login/u$f$a;->SUCCESS:Lcom/facebook/login/u$f$a;

    new-instance v0, Lcom/facebook/login/u$f$a;

    const/4 v1, 0x1

    const-string v2, "cancel"

    const-string v3, "CANCEL"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/login/u$f$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/login/u$f$a;->CANCEL:Lcom/facebook/login/u$f$a;

    new-instance v0, Lcom/facebook/login/u$f$a;

    const/4 v1, 0x2

    const-string v2, "error"

    const-string v3, "ERROR"

    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/login/u$f$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/login/u$f$a;->ERROR:Lcom/facebook/login/u$f$a;

    invoke-static {}, Lcom/facebook/login/u$f$a;->b()[Lcom/facebook/login/u$f$a;

    move-result-object v0

    sput-object v0, Lcom/facebook/login/u$f$a;->$VALUES:[Lcom/facebook/login/u$f$a;

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

    iput-object p3, p0, Lcom/facebook/login/u$f$a;->loggingValue:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Lcom/facebook/login/u$f$a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/login/u$f$a;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/login/u$f$a;->SUCCESS:Lcom/facebook/login/u$f$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/login/u$f$a;->CANCEL:Lcom/facebook/login/u$f$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/facebook/login/u$f$a;->ERROR:Lcom/facebook/login/u$f$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/login/u$f$a;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/facebook/login/u$f$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/login/u$f$a;

    return-object p0
.end method

.method public static values()[Lcom/facebook/login/u$f$a;
    .locals 2

    sget-object v0, Lcom/facebook/login/u$f$a;->$VALUES:[Lcom/facebook/login/u$f$a;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/login/u$f$a;

    return-object v0
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/login/u$f$a;->loggingValue:Ljava/lang/String;

    return-object v0
.end method
