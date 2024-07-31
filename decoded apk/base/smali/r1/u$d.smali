.class public final enum Lr1/u$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr1/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lr1/u$d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lr1/u$d;

.field public static final enum AUTOMATIC:Lr1/u$d;

.field public static final enum TRUNCATE:Lr1/u$d;

.field public static final enum WRITE_AHEAD_LOGGING:Lr1/u$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr1/u$d;

    const-string v1, "AUTOMATIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr1/u$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr1/u$d;->AUTOMATIC:Lr1/u$d;

    new-instance v0, Lr1/u$d;

    const-string v1, "TRUNCATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lr1/u$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr1/u$d;->TRUNCATE:Lr1/u$d;

    new-instance v0, Lr1/u$d;

    const-string v1, "WRITE_AHEAD_LOGGING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lr1/u$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr1/u$d;->WRITE_AHEAD_LOGGING:Lr1/u$d;

    invoke-static {}, Lr1/u$d;->b()[Lr1/u$d;

    move-result-object v0

    sput-object v0, Lr1/u$d;->$VALUES:[Lr1/u$d;

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

.method private static final synthetic b()[Lr1/u$d;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lr1/u$d;

    const/4 v1, 0x0

    sget-object v2, Lr1/u$d;->AUTOMATIC:Lr1/u$d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lr1/u$d;->TRUNCATE:Lr1/u$d;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lr1/u$d;->WRITE_AHEAD_LOGGING:Lr1/u$d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method private final h(Landroid/app/ActivityManager;)Z
    .locals 0

    invoke-static {p1}, Lv1/c;->b(Landroid/app/ActivityManager;)Z

    move-result p1

    return p1
.end method

.method public static valueOf(Ljava/lang/String;)Lr1/u$d;
    .locals 1

    const-class v0, Lr1/u$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr1/u$d;

    return-object p0
.end method

.method public static values()[Lr1/u$d;
    .locals 1

    sget-object v0, Lr1/u$d;->$VALUES:[Lr1/u$d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr1/u$d;

    return-object v0
.end method


# virtual methods
.method public final i(Landroid/content/Context;)Lr1/u$d;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lr1/u$d;->AUTOMATIC:Lr1/u$d;

    if-eq p0, v0, :cond_0

    return-object p0

    :cond_0
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.app.ActivityManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/ActivityManager;

    invoke-direct {p0, p1}, Lr1/u$d;->h(Landroid/app/ActivityManager;)Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Lr1/u$d;->WRITE_AHEAD_LOGGING:Lr1/u$d;

    return-object p1

    :cond_1
    sget-object p1, Lr1/u$d;->TRUNCATE:Lr1/u$d;

    return-object p1
.end method
