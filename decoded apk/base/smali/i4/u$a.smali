.class public final enum Li4/u$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li4/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li4/u$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Li4/u$a;

.field public static final enum LOGIN_RECOVERABLE:Li4/u$a;

.field public static final enum OTHER:Li4/u$a;

.field public static final enum TRANSIENT:Li4/u$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li4/u$a;

    const-string v1, "LOGIN_RECOVERABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li4/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li4/u$a;->LOGIN_RECOVERABLE:Li4/u$a;

    new-instance v0, Li4/u$a;

    const-string v1, "OTHER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Li4/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li4/u$a;->OTHER:Li4/u$a;

    new-instance v0, Li4/u$a;

    const-string v1, "TRANSIENT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Li4/u$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li4/u$a;->TRANSIENT:Li4/u$a;

    invoke-static {}, Li4/u$a;->b()[Li4/u$a;

    move-result-object v0

    sput-object v0, Li4/u$a;->$VALUES:[Li4/u$a;

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

.method private static final synthetic b()[Li4/u$a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Li4/u$a;

    const/4 v1, 0x0

    sget-object v2, Li4/u$a;->LOGIN_RECOVERABLE:Li4/u$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Li4/u$a;->OTHER:Li4/u$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Li4/u$a;->TRANSIENT:Li4/u$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Li4/u$a;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Li4/u$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li4/u$a;

    return-object p0
.end method

.method public static values()[Li4/u$a;
    .locals 2

    sget-object v0, Li4/u$a;->$VALUES:[Li4/u$a;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li4/u$a;

    return-object v0
.end method
