.class public final enum Ldf/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lld/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldf/d;",
        ">;",
        "Lld/f;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ldf/d;

.field public static final enum COLLECTION_DISABLED:Ldf/d;

.field public static final enum COLLECTION_DISABLED_REMOTE:Ldf/d;

.field public static final enum COLLECTION_ENABLED:Ldf/d;

.field public static final enum COLLECTION_SAMPLED:Ldf/d;

.field public static final enum COLLECTION_SDK_NOT_INSTALLED:Ldf/d;

.field public static final enum COLLECTION_UNKNOWN:Ldf/d;


# instance fields
.field private final number:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldf/d;

    const-string v1, "COLLECTION_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ldf/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldf/d;->COLLECTION_UNKNOWN:Ldf/d;

    new-instance v0, Ldf/d;

    const-string v1, "COLLECTION_SDK_NOT_INSTALLED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ldf/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldf/d;->COLLECTION_SDK_NOT_INSTALLED:Ldf/d;

    new-instance v0, Ldf/d;

    const-string v1, "COLLECTION_ENABLED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Ldf/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldf/d;->COLLECTION_ENABLED:Ldf/d;

    new-instance v0, Ldf/d;

    const-string v1, "COLLECTION_DISABLED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Ldf/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldf/d;->COLLECTION_DISABLED:Ldf/d;

    new-instance v0, Ldf/d;

    const-string v1, "COLLECTION_DISABLED_REMOTE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Ldf/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldf/d;->COLLECTION_DISABLED_REMOTE:Ldf/d;

    new-instance v0, Ldf/d;

    const-string v1, "COLLECTION_SAMPLED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Ldf/d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldf/d;->COLLECTION_SAMPLED:Ldf/d;

    invoke-static {}, Ldf/d;->b()[Ldf/d;

    move-result-object v0

    sput-object v0, Ldf/d;->$VALUES:[Ldf/d;

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

    iput p3, p0, Ldf/d;->number:I

    return-void
.end method

.method private static final synthetic b()[Ldf/d;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ldf/d;

    const/4 v1, 0x0

    sget-object v2, Ldf/d;->COLLECTION_UNKNOWN:Ldf/d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ldf/d;->COLLECTION_SDK_NOT_INSTALLED:Ldf/d;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ldf/d;->COLLECTION_ENABLED:Ldf/d;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ldf/d;->COLLECTION_DISABLED:Ldf/d;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Ldf/d;->COLLECTION_DISABLED_REMOTE:Ldf/d;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Ldf/d;->COLLECTION_SAMPLED:Ldf/d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldf/d;
    .locals 1

    const-class v0, Ldf/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldf/d;

    return-object p0
.end method

.method public static values()[Ldf/d;
    .locals 1

    sget-object v0, Ldf/d;->$VALUES:[Ldf/d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldf/d;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Ldf/d;->number:I

    return v0
.end method
