.class public final enum Lcom/facebook/appevents/f0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/appevents/f0;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/appevents/f0;

.field public static final enum NO_CONNECTIVITY:Lcom/facebook/appevents/f0;

.field public static final enum SERVER_ERROR:Lcom/facebook/appevents/f0;

.field public static final enum SUCCESS:Lcom/facebook/appevents/f0;

.field public static final enum UNKNOWN_ERROR:Lcom/facebook/appevents/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/facebook/appevents/f0;

    const-string v1, "SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/appevents/f0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/appevents/f0;->SUCCESS:Lcom/facebook/appevents/f0;

    new-instance v0, Lcom/facebook/appevents/f0;

    const-string v1, "SERVER_ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/facebook/appevents/f0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/appevents/f0;->SERVER_ERROR:Lcom/facebook/appevents/f0;

    new-instance v0, Lcom/facebook/appevents/f0;

    const-string v1, "NO_CONNECTIVITY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/facebook/appevents/f0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/appevents/f0;->NO_CONNECTIVITY:Lcom/facebook/appevents/f0;

    new-instance v0, Lcom/facebook/appevents/f0;

    const-string v1, "UNKNOWN_ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/facebook/appevents/f0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/appevents/f0;->UNKNOWN_ERROR:Lcom/facebook/appevents/f0;

    invoke-static {}, Lcom/facebook/appevents/f0;->b()[Lcom/facebook/appevents/f0;

    move-result-object v0

    sput-object v0, Lcom/facebook/appevents/f0;->$VALUES:[Lcom/facebook/appevents/f0;

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

.method private static final synthetic b()[Lcom/facebook/appevents/f0;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/appevents/f0;

    const/4 v1, 0x0

    sget-object v2, Lcom/facebook/appevents/f0;->SUCCESS:Lcom/facebook/appevents/f0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/facebook/appevents/f0;->SERVER_ERROR:Lcom/facebook/appevents/f0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/facebook/appevents/f0;->NO_CONNECTIVITY:Lcom/facebook/appevents/f0;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/facebook/appevents/f0;->UNKNOWN_ERROR:Lcom/facebook/appevents/f0;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/appevents/f0;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/facebook/appevents/f0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/appevents/f0;

    return-object p0
.end method

.method public static values()[Lcom/facebook/appevents/f0;
    .locals 2

    sget-object v0, Lcom/facebook/appevents/f0;->$VALUES:[Lcom/facebook/appevents/f0;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/appevents/f0;

    return-object v0
.end method
