.class public final enum Ldf/s;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lld/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldf/s;",
        ">;",
        "Lld/f;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ldf/s;

.field public static final enum LOG_ENVIRONMENT_AUTOPUSH:Ldf/s;

.field public static final enum LOG_ENVIRONMENT_PROD:Ldf/s;

.field public static final enum LOG_ENVIRONMENT_STAGING:Ldf/s;

.field public static final enum LOG_ENVIRONMENT_UNKNOWN:Ldf/s;


# instance fields
.field private final number:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldf/s;

    const-string v1, "LOG_ENVIRONMENT_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ldf/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldf/s;->LOG_ENVIRONMENT_UNKNOWN:Ldf/s;

    new-instance v0, Ldf/s;

    const-string v1, "LOG_ENVIRONMENT_AUTOPUSH"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ldf/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldf/s;->LOG_ENVIRONMENT_AUTOPUSH:Ldf/s;

    new-instance v0, Ldf/s;

    const-string v1, "LOG_ENVIRONMENT_STAGING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Ldf/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldf/s;->LOG_ENVIRONMENT_STAGING:Ldf/s;

    new-instance v0, Ldf/s;

    const-string v1, "LOG_ENVIRONMENT_PROD"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Ldf/s;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldf/s;->LOG_ENVIRONMENT_PROD:Ldf/s;

    invoke-static {}, Ldf/s;->b()[Ldf/s;

    move-result-object v0

    sput-object v0, Ldf/s;->$VALUES:[Ldf/s;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Ldf/s;->number:I

    return-void
.end method

.method private static final synthetic b()[Ldf/s;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ldf/s;

    const/4 v1, 0x0

    sget-object v2, Ldf/s;->LOG_ENVIRONMENT_UNKNOWN:Ldf/s;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ldf/s;->LOG_ENVIRONMENT_AUTOPUSH:Ldf/s;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ldf/s;->LOG_ENVIRONMENT_STAGING:Ldf/s;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ldf/s;->LOG_ENVIRONMENT_PROD:Ldf/s;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldf/s;
    .locals 1

    const-class v0, Ldf/s;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldf/s;

    return-object p0
.end method

.method public static values()[Ldf/s;
    .locals 1

    sget-object v0, Ldf/s;->$VALUES:[Ldf/s;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldf/s;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Ldf/s;->number:I

    return v0
.end method
