.class public final enum Lk4/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk4/k;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lk4/k;

.field public static final enum APP_DATA:Lk4/k;

.field public static final enum CUSTOM_DATA:Lk4/k;

.field public static final enum CUSTOM_EVENTS:Lk4/k;

.field public static final enum USER_DATA:Lk4/k;


# instance fields
.field private final rawValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk4/k;

    const/4 v1, 0x0

    const-string v2, "user_data"

    const-string v3, "USER_DATA"

    invoke-direct {v0, v3, v1, v2}, Lk4/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/k;->USER_DATA:Lk4/k;

    new-instance v0, Lk4/k;

    const/4 v1, 0x1

    const-string v2, "app_data"

    const-string v3, "APP_DATA"

    invoke-direct {v0, v3, v1, v2}, Lk4/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/k;->APP_DATA:Lk4/k;

    new-instance v0, Lk4/k;

    const/4 v1, 0x2

    const-string v2, "custom_data"

    const-string v3, "CUSTOM_DATA"

    invoke-direct {v0, v3, v1, v2}, Lk4/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/k;->CUSTOM_DATA:Lk4/k;

    new-instance v0, Lk4/k;

    const/4 v1, 0x3

    const-string v2, "custom_events"

    const-string v3, "CUSTOM_EVENTS"

    invoke-direct {v0, v3, v1, v2}, Lk4/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/k;->CUSTOM_EVENTS:Lk4/k;

    invoke-static {}, Lk4/k;->b()[Lk4/k;

    move-result-object v0

    sput-object v0, Lk4/k;->$VALUES:[Lk4/k;

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

    iput-object p3, p0, Lk4/k;->rawValue:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Lk4/k;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lk4/k;

    const/4 v1, 0x0

    sget-object v2, Lk4/k;->USER_DATA:Lk4/k;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lk4/k;->APP_DATA:Lk4/k;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lk4/k;->CUSTOM_DATA:Lk4/k;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lk4/k;->CUSTOM_EVENTS:Lk4/k;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk4/k;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lk4/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk4/k;

    return-object p0
.end method

.method public static values()[Lk4/k;
    .locals 2

    sget-object v0, Lk4/k;->$VALUES:[Lk4/k;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk4/k;

    return-object v0
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk4/k;->rawValue:Ljava/lang/String;

    return-object v0
.end method
