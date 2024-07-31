.class final enum Lcd/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcd/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcd/e;

.field public static final enum IGNORE_CACHE_EXPIRATION:Lcd/e;

.field public static final enum SKIP_CACHE_LOOKUP:Lcd/e;

.field public static final enum USE_CACHE:Lcd/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcd/e;

    const-string v1, "USE_CACHE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcd/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcd/e;->USE_CACHE:Lcd/e;

    new-instance v1, Lcd/e;

    const-string v3, "SKIP_CACHE_LOOKUP"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcd/e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcd/e;->SKIP_CACHE_LOOKUP:Lcd/e;

    new-instance v3, Lcd/e;

    const-string v5, "IGNORE_CACHE_EXPIRATION"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcd/e;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcd/e;->IGNORE_CACHE_EXPIRATION:Lcd/e;

    const/4 v5, 0x3

    new-array v5, v5, [Lcd/e;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcd/e;->$VALUES:[Lcd/e;

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

.method public static valueOf(Ljava/lang/String;)Lcd/e;
    .locals 1

    const-class v0, Lcd/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcd/e;

    return-object p0
.end method

.method public static values()[Lcd/e;
    .locals 1

    sget-object v0, Lcd/e;->$VALUES:[Lcd/e;

    invoke-virtual {v0}, [Lcd/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcd/e;

    return-object v0
.end method
