.class public final enum Lk4/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk4/n;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lk4/n;

.field public static final enum ACTION_SOURCE:Lk4/n;

.field public static final enum APP:Lk4/n;

.field public static final enum EVENT:Lk4/n;

.field public static final enum INSTALL_EVENT_TIME:Lk4/n;

.field public static final enum MOBILE_APP_INSTALL:Lk4/n;


# instance fields
.field private final rawValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk4/n;

    const/4 v1, 0x0

    const-string v2, "event"

    const-string v3, "EVENT"

    invoke-direct {v0, v3, v1, v2}, Lk4/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/n;->EVENT:Lk4/n;

    new-instance v0, Lk4/n;

    const/4 v1, 0x1

    const-string v2, "action_source"

    const-string v3, "ACTION_SOURCE"

    invoke-direct {v0, v3, v1, v2}, Lk4/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/n;->ACTION_SOURCE:Lk4/n;

    new-instance v0, Lk4/n;

    const/4 v1, 0x2

    const-string v2, "app"

    const-string v3, "APP"

    invoke-direct {v0, v3, v1, v2}, Lk4/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/n;->APP:Lk4/n;

    new-instance v0, Lk4/n;

    const/4 v1, 0x3

    const-string v2, "MobileAppInstall"

    const-string v3, "MOBILE_APP_INSTALL"

    invoke-direct {v0, v3, v1, v2}, Lk4/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/n;->MOBILE_APP_INSTALL:Lk4/n;

    new-instance v0, Lk4/n;

    const/4 v1, 0x4

    const-string v2, "install_timestamp"

    const-string v3, "INSTALL_EVENT_TIME"

    invoke-direct {v0, v3, v1, v2}, Lk4/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/n;->INSTALL_EVENT_TIME:Lk4/n;

    invoke-static {}, Lk4/n;->b()[Lk4/n;

    move-result-object v0

    sput-object v0, Lk4/n;->$VALUES:[Lk4/n;

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

    iput-object p3, p0, Lk4/n;->rawValue:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Lk4/n;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lk4/n;

    const/4 v1, 0x0

    sget-object v2, Lk4/n;->EVENT:Lk4/n;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lk4/n;->ACTION_SOURCE:Lk4/n;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lk4/n;->APP:Lk4/n;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lk4/n;->MOBILE_APP_INSTALL:Lk4/n;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lk4/n;->INSTALL_EVENT_TIME:Lk4/n;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk4/n;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lk4/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk4/n;

    return-object p0
.end method

.method public static values()[Lk4/n;
    .locals 2

    sget-object v0, Lk4/n;->$VALUES:[Lk4/n;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk4/n;

    return-object v0
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk4/n;->rawValue:Ljava/lang/String;

    return-object v0
.end method
